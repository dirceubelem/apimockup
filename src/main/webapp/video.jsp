<title>WebAssembly Recorder using RecordRTC</title>
<style type="text/css">
    body {
        text-align: center;
    }

    video {
        border-radius: 5px;
        border: 1px solid black;
    }
</style>

<h1>WebAssembly Recorder using RecordRTC <span id="version"></span></h1>
<button id="start">Start Recording</button>
<button id="stop" disabled>Stop Recording</button>
<br><br>
<video id="video" controls autoplay playsinline></video>

<!-- web streams API polyfill to support Firefox -->
<script src="js/polyfill.js"></script>

<script src="js/RecordRTC.js"></script>

<script>
    document.getElementById('version').innerHTML = RecordRTC.version;

    var recorder;

    document.getElementById('start').onclick = function () {
        this.disabled = true;
        navigator.mediaDevices.getUserMedia({
            video: {
                width: {
                    ideal: 640
                },
                height: {
                    ideal: 480
                }
            },
            audio: true
        }).then(function (stream) {
            document.getElementById('video').srcObject = stream;

            recorder = RecordRTC(stream, {
                recorderType: WebAssemblyRecorder,
                // workerPath: '../libs/webm-worker.js',
                // webAssemblyPath: '../libs/webm-wasm.wasm',
                width: 640,
                height: 480,
                frameRate: 30
            });
            recorder.startRecording();

            document.getElementById('stop').disabled = false;
        });
    };

    document.getElementById('stop').onclick = function () {
        document.getElementById('video').srcObject = null;

        this.disabled = true;
        recorder.stopRecording(function (blob) {
            document.getElementById('gravou').innerHTML = '<a href="' + URL.createObjectURL(recorder.getBlob()) + '">baixar</a>';
            console.log(document.getElementById('gravou').innerHTML);
            document.getElementById('start').disabled = false;
        });
    }
</script>

<footer style="margin-top: 20px;"><small id="send-message"></small></footer>
<script src="js/common.js"></script>
<div id="gravou"></div>
