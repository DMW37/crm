layui.use(['form','jquery','jquery_cookie'], function () {
    var form = layui.form,
        layer = layui.layer,
        $ = layui.jquery,
        $ = layui.jquery_cookie($);

    form.on('submit(saveBtn)',function (data) {
        $.ajax({
            url:ctx+"/user/updatePassword",
            method:'post',
            data:{
                oldPassword:data.field.old_password,
                newPassword:data.field.new_password,
                confirmPassword:data.field.again_password
            },
            success:function (result) {
                if(result.code==200){
                    layer.msg('修改密码成功,5s后退出系统...', function () {
                       $.removeCookie("userIdStr",{domain:'localhost',path:"/crm"})
                       $.removeCookie("userName",{domain:'localhost',path:"/crm"})
                       $.removeCookie("trueName",{domain:'localhost',path:"/crm"})
                       // 父窗口跳转
                       window.parent.location.href=ctx+"/index"
                    });
                }
            }
        })
    })

})