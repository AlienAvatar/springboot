$(document).ready(function () {
    console.log("main.js")
})
function changeVideo1() {
    $(".video-fluid")[0].src="/video/super.mp4"
}

function changeVideo2() {
    $(".video-fluid")[0].src="/video/motivation.mp4"
}

function changeVideo3() {
    $(".video-fluid")[0].src="/video/life.mp4"
}

function changeVideo4() {
    $(".video-fluid")[0].src="/video/star.mp4"
}
function logOut() {
    window.location.href="http://localhost:8088/test";
}