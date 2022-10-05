package com.dmw.crm.base;


import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;

public class BaseController {


    @ModelAttribute
    public void preHandler(HttpServletRequest request) {
        request.setAttribute("ctx", request.getContextPath());
    }


    public com.dmw.crm.base.ResultInfo success() {
        return new com.dmw.crm.base.ResultInfo();
    }

    public com.dmw.crm.base.ResultInfo success(String msg) {
        com.dmw.crm.base.ResultInfo resultInfo = new com.dmw.crm.base.ResultInfo();
        resultInfo.setMsg(msg);
        return resultInfo;
    }

    public com.dmw.crm.base.ResultInfo success(String msg, Object result) {
        com.dmw.crm.base.ResultInfo resultInfo = new com.dmw.crm.base.ResultInfo();
        resultInfo.setMsg(msg);
        resultInfo.setResult(result);
        return resultInfo;
    }

}
