$(function () {
    // 首先销毁表格
    $('#basicTable').bootstrapTable('destroy');
    // 初始化表格,动态从服务器加载数据
    $('#basicTable').bootstrapTable({
        url: "/basic/",
        method: 'get',
        sidePagination: 'server', //表示服务端请求
        pagination: true,   //启动分页
        striped: true,    //设置为 true 会有隔行变色效果
        cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        pageSize: 10,//初始页记录数
        sortable: true,    //排序
        //记录数可选列表
        pageList: [1, 5, 10],
        smartDisplay: true,    //程序自动判断显示分页信息
        columns: [{
            title: 'ID',
            field: 'id',
            align: 'center',
            halign: 'center',
            visible: false,
            formatter: function (value, row, index) {
                return index + 1;
            }
        }, {
            field: 'id',
            title: 'ID',
            align: 'center'
            //sortable: true    //排序
        }, {
            field: 'realName',
            title: '姓名',
            align: 'center'
            //sortable: true    //排序
        }, {
            field: 'birthDay',
            title: '生日',
            align: 'center'
        }, {
            field: 'idCard',
            title: '身份证号',
            align: 'center'
        }, {
            field: 'phoneNum',
            title: '电话',
            align: 'center'
        },{
            field: 'agedInfo.address',
            title: '地址',
            align: 'center'
        }]
    });
});