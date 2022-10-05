package com.dmw.crm.controller;

import com.dmw.crm.base.BaseController;
import com.dmw.crm.dto.User;
import com.dmw.crm.service.impl.UserServiceImpl;
import com.dmw.crm.utils.LoginUserUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author: 邓明维
 * @date: 2022/10/5
 * @description:
 */
@Controller
public class IndexController extends BaseController {

    @Resource
    private UserServiceImpl userService;
    /**
     * 系统登录页
     *
     * @return
     */
    @RequestMapping("index")
    public String index() {
        return "index";
    }

    /**
     * 系统界面欢迎页
     * @return
     */
    @RequestMapping("welcome")
    public String welcome() {
        return "welcome";
    }

    /**
     * 后端管理主页面
     *
     * @return
     */
    @RequestMapping("main")
    public String main(HttpServletRequest request) {
        Integer userId = LoginUserUtil.releaseUserIdFromCookie(request);
        //httpSession.setAttribute("user","");
        User user = userService.selectByPrimaryKey(userId);
        request.getSession().setAttribute("user",user);
        return "main";
    }

}
