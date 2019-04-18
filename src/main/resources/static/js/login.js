$(document).ready(function () {
});

function register() {
    window.location.href="http://localhost:8088/register";
}


function submitLogin() {
    var user = $("#login_username").val();
    var password = $("#login_password").val();
    var param = {
        user :user,
        password : password
    }
    $.ajax({
        url:"/main",
        method:"POST",
        data:param,
        success:function (data) {
            if(data == "success"){
                alert("登录成功");
                window.location.href="http://localhost:8088/loginIn";
            }else if(data == "fail"){
                alert("登录失败")
            }
        }
    })
}