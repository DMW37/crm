package com.dmw.crm.exception;

import com.alibaba.fastjson.JSON;
import com.dmw.base.ResultInfo;
import com.dmw.crm.exceptions.ParamsException;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * @author: 邓明维
 * @date: 2022/10/5
 * @description:
 */
@Component
public class GlobalExceptionResolver implements HandlerExceptionResolver {
    /**
     * 方
     * 法返回值类型判断:
     * 如果方法级别存在@ResponseBody 方法响应内容为json 否则视图
     * handler 参数类型为HandlerMethod
     * 返回值
     * 视图:默认错误页面
     * json:错误的json信息
     */

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("code", 500);
        modelAndView.addObject("msg", "发生异常，请重试...");
        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            ResponseBody declaredAnnotation = handlerMethod.getMethod().getDeclaredAnnotation(ResponseBody.class);
            if (declaredAnnotation == null) {
                // 返回视图
                if (ex instanceof ParamsException) {
                    ParamsException pe = (ParamsException) ex;
                    modelAndView.addObject("code", pe.getCode());
                    modelAndView.addObject("msg", pe.getMsg());
                }
                return modelAndView;

            } else {
                // 返回json数据
                ResultInfo resultInfo = new ResultInfo();
                resultInfo.setCode(500);
                resultInfo.setMsg("出现异常，请重试...");
                if (ex instanceof ParamsException) {
                    ParamsException pe = (ParamsException) ex;
                    resultInfo.setCode(pe.getCode());
                    resultInfo.setMsg(pe.getMsg());
                }
                response.setCharacterEncoding("utf-8");
                response.setContentType("application/json;charset=utf-8");
                PrintWriter pw = null;
                try {
                    pw = response.getWriter();
                    pw.write(JSON.toJSONString(resultInfo));
                    pw.flush();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (null != pw) {
                        pw.close();
                    }
                }
                return null;
            }


        }
        return modelAndView;
    }
}
