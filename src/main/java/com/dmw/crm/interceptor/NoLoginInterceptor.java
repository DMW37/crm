package com.dmw.crm.interceptor;

import com.dmw.crm.exceptions.NoLoginException;
import com.dmw.crm.service.impl.UserServiceImpl;
import com.dmw.crm.utils.LoginUserUtil;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: 邓明维
 * @date: 2022/10/5
 * @description:
 */
@Component
public class NoLoginInterceptor extends HandlerInterceptorAdapter {

    @Resource
    private UserServiceImpl userService;
    /**
     *   获取cookie 解析用户id
     *     如果用户id存在 并且 数据库存在对应用户记录放行 否则进行拦截 重定向到登录
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        int userId = LoginUserUtil.releaseUserIdFromCookie(request);
        if(userId==0 || null==userService.selectByPrimaryKey(userId)){
            throw new NoLoginException();
        }
        return true;
    }
}
