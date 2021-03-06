$(document).ready(function () {
    getList(1,"dva");
    pageTools(1, 30);//tools里的方法
});

function getList(pageNo,heroType) {
    var param = {
        pageNo:pageNo,
        heroType:heroType
    };
    $.ajax({
        url: "/main/getList",
        type: "GET",
        data: param,
        async: false,
        success: function (data) {
            console.log(data);
            if(data.statusCode == "200"){
                var str = ' <tr style="border-bottom: 1px solid #919191;line-height: 35px;">\n' +
                    '            <th style="text-align: center;">序号</th>\n' +
                    '            <th style="text-align: center;">玩家ID</th>\n' +
                    '            <th style="text-align: center;">英雄熟练度</th>\n' +
                    '            <th style="text-align: center;">排名</th>\n' +
                    '            <th></th>\n' +
                    '        </tr>';

                var jsonData = JSON.parse(data.data);
                for (var i = 0; i < jsonData.list.length; i++) {
                    var num = i + 1;
                    str +='<tr>'
                        + '<td  style="padding: 14px;border-bottom: 1px solid #eee;width: 600px;text-align: center;">'+num+'</td>'
                        + '<td  style="padding: 14px;border-bottom: 1px solid #eee;width: 600px;text-align: center;">'+jsonData.list[i].playerid+'</td>'
                        + '<td  style="padding: 14px;border-bottom: 1px solid #eee;width: 600px;text-align: center;">'+jsonData.list[i].playerdop+'</td>'
                        + '<td  style="padding: 14px;border-bottom: 1px solid #eee;width: 600px;text-align: center;">'+jsonData.list[i].playerrank+'</td>'
                        + '</tr>';
                    $('table').html(str);
                }
            }else{
                alert("无相关信息");
            }
        }
    })
}




