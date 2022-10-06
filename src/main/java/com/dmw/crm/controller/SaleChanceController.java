package com.dmw.crm.controller;

import com.dmw.base.BaseController;
import com.dmw.crm.query.SaleChanceQuery;
import com.dmw.crm.service.SaleChanceService;
import com.dmw.crm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author: 邓明维
 * @date: 2022/10/6
 * @description:
 */
@Controller
@RequestMapping("/sale_chance")
public class SaleChanceController extends BaseController {

    @Resource
    private SaleChanceService saleChanceService;
    @Resource
    private UserService userService;



    @RequestMapping("index")
    public String index(){
        return "saleChance/sale_chance";
    }


    @RequestMapping("/list")
    @ResponseBody
    public Map<String,Object> selectByPage(SaleChanceQuery saleChanceQuery){
        Map<String,Object> result =  saleChanceService.selectByPage(saleChanceQuery);
        return  result;
    }

}
