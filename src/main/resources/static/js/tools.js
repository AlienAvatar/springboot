/**
 *
 * @param curtpage 首页
 * @param tpage 尾页
 */
function pageTools(curtpage,tpage) {
    var options = {
        bootstrapMajorVersion: 3, //版本
        currentPage: curtpage, //当前页数
        numberOfPages: 5, //设置显示的页码数
        totalPages: tpage, //总页数
        alignment: "center", // 居中显示
        itemTexts: function (type, page, current) {
            switch (type) {
                case "first":
                    return "首页";
                case "prev":
                    return "上一页";
                case "next":
                    return "下一页";
                case "last":
                    return "末页";
                case "page":
                    return page;
            }
        },
        onPageClicked:function (event,originalEvent,type,page) {
            getList();
        }
    }
    $("#pagintor").bootstrapPaginator(options);
}