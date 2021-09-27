<style>
    html, body {
        margin: 0 !important;
        padding: 0 !important;
    }
</style>

<title>Audio Recording | RecordRTC</title>
<h1>Simple Audio Recording using RecordRTC</h1>
<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0">

<br>

<button id="btn-start-recording">Start Recording</button>
<button id="btn-stop-recording" disabled>Stop Recording</button>
<button id="btn-release-microphone" disabled>Release Microphone</button>
<button id="btn-download-recording" disabled>Download</button>
<button id="btn-send-file">Enviar</button>

<hr>
<div>
    <audio controls autoplay playsinline></audio>
</div>

<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script src="js/RecordRTC.js"></script>
<script>
    var audio = document.querySelector('audio');

    function captureMicrophone(callback) {
        btnReleaseMicrophone.disabled = false;

        if (microphone) {
            callback(microphone);
            return;
        }

        if (typeof navigator.mediaDevices === 'undefined' || !navigator.mediaDevices.getUserMedia) {
            alert('This browser does not supports WebRTC getUserMedia API.');

            if (!!navigator.getUserMedia) {
                alert('This browser seems supporting deprecated getUserMedia API.');
            }
        }

        navigator.mediaDevices.getUserMedia({
            audio: isEdge ? true : {
                echoCancellation: false
            }
        }).then(function (mic) {
            callback(mic);
        }).catch(function (error) {
            alert('Unable to capture your microphone. Please check console logs.');
            console.error(error);
        });
    }

    function replaceAudio(src) {
        var newAudio = document.createElement('audio');
        newAudio.controls = true;
        newAudio.autoplay = true;

        if (src) {
            newAudio.src = src;
        }

        var parentNode = audio.parentNode;
        parentNode.innerHTML = '';
        parentNode.appendChild(newAudio);

        audio = newAudio;
    }

    function stopRecordingCallback() {
        replaceAudio(URL.createObjectURL(recorder.getBlob()));

        btnStartRecording.disabled = false;

        setTimeout(function () {
            if (!audio.paused) return;

            setTimeout(function () {
                if (!audio.paused) return;
                audio.play();
            }, 1000);

            audio.play();
        }, 300);

        audio.play();

        btnDownloadRecording.disabled = false;

        if (isSafari) {
            click(btnReleaseMicrophone);
        }
    }

    var isEdge = navigator.userAgent.indexOf('Edge') !== -1 && (!!navigator.msSaveOrOpenBlob || !!navigator.msSaveBlob);
    var isSafari = /^((?!chrome|android).)*safari/i.test(navigator.userAgent);

    var recorder; // globally accessible
    var microphone;

    var btnStartRecording = document.getElementById('btn-start-recording');
    var btnStopRecording = document.getElementById('btn-stop-recording');
    var btnReleaseMicrophone = document.querySelector('#btn-release-microphone');
    var btnDownloadRecording = document.getElementById('btn-download-recording');
    var btnSendFile = document.getElementById('btn-send-file');

    btnStartRecording.onclick = function () {
        this.disabled = true;
        this.style.border = '';
        this.style.fontSize = '';

        if (!microphone) {
            captureMicrophone(function (mic) {
                microphone = mic;

                if (isSafari) {
                    replaceAudio();

                    audio.muted = true;
                    audio.srcObject = microphone;

                    btnStartRecording.disabled = false;
                    btnStartRecording.style.border = '1px solid red';
                    btnStartRecording.style.fontSize = '150%';

                    alert('Please click startRecording button again. First time we tried to access your microphone. Now we will record it.');
                    return;
                }

                click(btnStartRecording);
            });
            return;
        }

        replaceAudio();

        audio.muted = true;
        audio.srcObject = microphone;

        var options = {
            type: 'audio',
            numberOfAudioChannels: isEdge ? 1 : 2,
            checkForInactiveTracks: true,
            bufferSize: 16384
        };

        if (isSafari || isEdge) {
            options.recorderType = StereoAudioRecorder;
        }

        if (navigator.platform && navigator.platform.toString().toLowerCase().indexOf('win') === -1) {
            options.sampleRate = 48000; // or 44100 or remove this line for default
        }

        if (isSafari) {
            options.sampleRate = 44100;
            options.bufferSize = 4096;
            options.numberOfAudioChannels = 2;
        }

        if (recorder) {
            recorder.destroy();
            recorder = null;
        }

        recorder = RecordRTC(microphone, options);

        recorder.startRecording();

        btnStopRecording.disabled = false;
        btnDownloadRecording.disabled = true;
    };

    btnStopRecording.onclick = function () {
        this.disabled = true;
        recorder.stopRecording(stopRecordingCallback);
    };

    btnReleaseMicrophone.onclick = function () {
        this.disabled = true;
        btnStartRecording.disabled = false;

        if (microphone) {
            microphone.stop();
            microphone = null;
        }

        if (recorder) {
            // click(btnStopRecording);
        }
    };

    btnDownloadRecording.onclick = function () {
        this.disabled = true;
        if (!recorder || !recorder.getBlob()) return;

        if (isSafari) {
            recorder.getDataURL(function (dataURL) {
                SaveToDisk(dataURL, getFileName('mp3'));
            });
            return;
        }

        var blob = recorder.getBlob();
        var file = new File([blob], getFileName('mp3'), {
            type: 'audio/mp3'
        });
        invokeSaveAsDialog(file);
    };

    btnSendFile.onclick = function () {
        sendFile();
    };

    function click(el) {
        el.disabled = false; // make sure that element is not disabled
        var evt = document.createEvent('Event');
        evt.initEvent('click', true, true);
        el.dispatchEvent(evt);
    }

    function getRandomString() {
        if (window.crypto && window.crypto.getRandomValues && navigator.userAgent.indexOf('Safari') === -1) {
            var a = window.crypto.getRandomValues(new Uint32Array(3)),
                token = '';
            for (var i = 0, l = a.length; i < l; i++) {
                token += a[i].toString(36);
            }
            return token;
        } else {
            return (Math.random() * new Date().getTime()).toString(36).replace(/\./g, '');
        }
    }

    function getFileName(fileExtension) {
        var d = new Date();
        var year = d.getFullYear();
        var month = d.getMonth();
        var date = d.getDate();
        return 'RecordRTC-' + year + month + date + '-' + getRandomString() + '.' + fileExtension;
    }

    function sendFile() {
        // get recorded blob
        var blob = recorder.getBlob();

        // generating a random file name
        var fileName = getFileName('mp3');

        // we need to upload "File" --- not "Blob"
        var fileObject = new File([blob], fileName, {
            type: 'audio/mp3'
        });

        var formData = new FormData();

        // recorded data
        formData.append('audio', fileObject);

        // file name
        formData.append('audio-filename', fileObject.name);

        // document.getElementById('header').innerHTML = 'Uploading to PHP using jQuery.... file size: (' + bytesToSize(fileObject.size) + ')';

        var upload_url = 'https://wh.onthego.chat/backend/v1/webchat/sendfile';
        // var upload_url = 'RecordRTC-to-PHP/save.php';

        var upload_directory = upload_url;
        // var upload_directory = 'RecordRTC-to-PHP/uploads/';

        // upload using jQuery
        $.ajax({
            url: upload_url, // replace with your own server URL
            data: formData,
            cache: false,
            headers: {
                token: '5d2qjji0bt5cn1epjj3h70'
            },
            contentType: false,
            processData: false,
            type: 'POST',
            success: function (response) {
                console.log(response);
                if (response === 'success') {
                    alert('successfully uploaded recorded blob');

                    // file path on server
                    var fileDownloadURL = upload_directory + fileObject.name;

                    // preview the uploaded file URL
                    document.getElementById('header').innerHTML = '<a href="' + fileDownloadURL + '" target="_blank">' + fileDownloadURL + '</a>';

                    // preview uploaded file in a VIDEO element
                    // document.getElementById('your-video-id').srcObject = null;
                    // document.getElementById('your-video-id').src = fileDownloadURL;

                    // open uploaded file in a new tab
                    window.open(fileDownloadURL);
                } else {
                    alert(response); // error/failure
                }
            },
            error: function (response) {
                console.log(response);
            }
        });

    }

    function SaveToDisk(fileURL, fileName) {
        // for non-IE
        if (!window.ActiveXObject) {
            var save = document.createElement('a');
            save.href = fileURL;
            save.download = fileName || 'unknown';
            save.style = 'display:none;opacity:0;color:transparent;';
            (document.body || document.documentElement).appendChild(save);

            if (typeof save.click === 'function') {
                save.click();
            } else {
                save.target = '_blank';
                var event = document.createEvent('Event');
                event.initEvent('click', true, true);
                save.dispatchEvent(event);
            }

            (window.URL || window.webkitURL).revokeObjectURL(save.href);
        }

        // for IE
        else if (!!window.ActiveXObject && document.execCommand) {
            var _window = window.open(fileURL, '_blank');
            _window.document.close();
            _window.document.execCommand('SaveAs', true, fileName || fileURL)
            _window.close();
        }
    }
</script>

<footer style="margin-top: 20px;"><small id="send-message"></small></footer>
<script src="js/common.js"></script>
