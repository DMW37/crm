package com.dmw.crm.controller;

import com.dmw.crm.exceptions.ParamsException;
import com.dmw.crm.model.UserModel;
import com.dmw.crm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author: 邓明维
 * @date: 2022/10/5
 * @description:
 */
@Controller
@RequestMapping("/user")
public class UserController extends com.dmw.crm.base.BaseController {
    @Resource
    private UserService userService;

    @PostMapping("/login")
    @ResponseBody
    public com.dmw.crm.base.ResultInfo login(String userName, String userPwd) {
        com.dmw.crm.base.ResultInfo resultInfo = new com.dmw.crm.base.ResultInfo();
        try {
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
        }
        return resultInfo;
    }

}
