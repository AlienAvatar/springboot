
$(document).ready(function () {
    pageTools(1, 30);//tools里的方法
    getList(1);
});

function getList(pageNo) {
    $.ajax({
        url: "/main/getList",
        type: "POST",
        data: "pageNo=" + pageNo,
        success: function (data) {

        }
    })
}



