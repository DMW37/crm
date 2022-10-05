package com.dmw.crm.controller;

import com.dmw.base.BaseController;
import com.dmw.base.ResultInfo;
import com.dmw.crm.model.UserModel;
import com.dmw.crm.service.UserService;
import com.dmw.crm.utils.LoginUserUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author: 邓明维
 * @date: 2022/10/5
 * @description:
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
    @Resource
    private UserService userService;

    @PostMapping("/login")
    @ResponseBody
    public ResultInfo login(String userName, String userPwd) {
        ResultInfo resultInfo = new ResultInfo();
        UserModel userModel = userService.login(userName, userPwd);
        resultInfo.setResult(userModel);
        /*try {
            UserModel userModel =
                    userService.login(userName, userPwd);
            resultInfo.setResult(userModel);
        } catch (ParamsException e) {
            e.printStackTrace();
            resultInfo.setMsg(e.getMsg());
            resultInfo.setCode(e.getCode());
        } catch (Exception e) {
            e.printStackTrace();
            resultInfo.setMsg("failed");
            resultInfo.setCode(500);
        }*/
        return resultInfo;
    }


    /**
     * 进入用户修改页面
     *
     * @return
     */
    @RequestMapping("toPasswordPage")
    public String toPasswordPage() {
        return "user/password";
    }


    @PostMapping("/updatePassword")
    @ResponseBody
    public ResultInfo updatePassword(HttpServletRequest request, String oldPassword, String newPassword, String confirmPassword) {
        ResultInfo resultInfo = new ResultInfo();
        userService.updateUserPassword(LoginUserUtil.releaseUserIdFromCookie(request), oldPassword, newPassword, confirmPassword);
       /* try {
            userService.updateUserPassword(LoginUserUtil.releaseUserIdFromCookie(request), oldPassword, newPassword, confirmPassword);
        } catch (ParamsException e) {
            e.printStackTrace();
            resultInfo.setMsg(e.getMsg());
            resultInfo.setCode(e.getCode());
        } catch (Exception e) {
            e.printStackTrace();
            resultInfo.setMsg("failed");
            resultInfo.setCode(500);
        }*/
        return resultInfo;
    }


}
