package com.dmw.crm.service;

import com.dmw.crm.query.SaleChanceQuery;

import java.util.Map;

/**
* @author woaixiejuan
* @description 针对表【t_sale_chance】的数据库操作Service
* @createDate 2022-10-05 09:55:29
*/
public interface SaleChanceService  {

    Map<String, Object> selectByPage(SaleChanceQuery saleChanceQuery);
}
