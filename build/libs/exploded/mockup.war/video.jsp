<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link rel="shortcut icon" href="https://ws.onthego.chat/img/kurento.png" type="image/png"/>

    <link rel="stylesheet"
          href="https://ws.onthego.chat/webjars/bootstrap/dist/css/bootstrap.min.css">
    <link rel="stylesheet"
          href="https://ws.onthego.chat/webjars/ekko-lightbox/dist/ekko-lightbox.min.css">
    <link rel="stylesheet" href="https://ws.onthego.chat/webjars/demo-console/index.css">
    <link rel="stylesheet" href="https://ws.onthego.chat/css/kurento.css">

    <script src="https://ws.onthego.chat/webjars/jquery/dist/jquery.min.js"></script>
    <script src="https://ws.onthego.chat/webjars/bootstrap/dist/js/bootstrap.min.js"></script>
    <script src="https://ws.onthego.chat/webjars/ekko-lightbox/dist/ekko-lightbox.min.js"></script>
    <script src="https://ws.onthego.chat/webjars/webrtc-adapter/release/adapter.js"></script>
    <script src="https://ws.onthego.chat/webjars/demo-console/index.js"></script>

    <script src="https://ws.onthego.chat/js/kurento-utils.js"></script>
    <script src="js/index.js"></script>

    <title>OnTheGo</title>
</head>

<body>
<div class="container">
    <video id="videoInput" autoplay width="480px" height="360px"
           poster="img/webrtc.png"></video>
    <a id="start" href="#" class="btn btn-success"
       onclick="start(); return false;"><span
            class="glyphicon glyphicon-play"></span> Start</a><br> <br> <a
        id="stop" href="#" class="btn btn-danger"
        onclick="stop(); return false;"><span
        class="glyphicon glyphicon-stop"></span> Stop</a><br> <br> <a
        id="play" href="#" class="btn btn-warning"
        onclick="play(); return false;"><span
        class="glyphicon glyphicon-play-circle"></span> Play</a>
</div>

</body>
</html>
