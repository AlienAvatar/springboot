$(document).ready(function () {
    console.log("main.js")
})
function changeVideo1() {
    document.getElementById("main-source").src = "http://localhost:8088/video/dva1.mp4";
    document.getElementById("main-video").load();
    $(".spotlight-image")[0].style.cssText = 'background-image: url("http://overwatch.nos.netease.com/1/images/v2/home/overlay/dva.png");';

}

function changeVideo2() {
    document.getElementById("main-source").src = "http://localhost:8088/video/banzang2.mp4";
    document.getElementById("main-video").load();
    $(".spotlight-image")[0].style.cssText = 'background-image: url("http://overwatch.nos.netease.com/1/images/v2/home/overlay/hanzo.png");';
}

function changeVideo3() {
    document.getElementById("main-source").src = "http://localhost:8088/video/mcrae1.mp4";
    document.getElementById("main-video").load();
    $(".spotlight-image")[0].style.cssText = 'background-image: url("http://overwatch.nos.netease.com/1/images/v2/home/overlay/mccree.png");';
}

function changeVideo4() {
    document.getElementById("main-source").src = "http://localhost:8088/video/reaper.mp4";
    document.getElementById("main-video").load();
    $(".spotlight-image")[0].style.cssText = 'background-image: url("http://overwatch.nos.netease.com/1/images/v2/home/overlay/reaper.png");';
}
function logOut() {
    window.location.href="http://localhost:8088/test";

}

var availableTags = [
    "ActionScript",
    "AppleScript",
    "Asp",
    "BASIC",
    "C",
    "C++",
    "Clojure",
    "COBOL",
    "ColdFusion",
    "Erlang",
    "Fortran",
    "Groovy",
    "Haskell",
    "Java",
    "JavaScript",
    "Lisp",
    "Perl",
    "PHP",
    "Python",
    "Ruby",
    "Scala",
    "Scheme"
];

$( "#autocomplete" ).autocomplete({
    source: availableTags
});
