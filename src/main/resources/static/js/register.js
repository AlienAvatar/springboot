$(document).ready(function () {
});

function submitRegister(){
    var user = $("#login_username").val();
    var password = $("#login_password").val();
    var email = $("#login_email").val();
    var param = {
        user : user,
        password : password,
        email : email
    };

    $.ajax({
        url:"/login",
        data:param,
        method: "POST",
        success:function (data) {
            if(data === "success") {
                debugger;
                alert("注册成功");
                window.location.href = "http://localhost:8088/test";
            }else if(data === "user"){
                alert("用户名重复");
                $("#login_username").val("");
            }
        },
        fail:function (data) {
            alert("注册失败");
            $("#login_username").val("");
            $("#login_password").val("");
            $("#login_email").val("");
        }
    })
}

function resetRegister() {
    $("#login_username").val("");
    $("#login_password").val("");
    $("#login_email").val("");
}