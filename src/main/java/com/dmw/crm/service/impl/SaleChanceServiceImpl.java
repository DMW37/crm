package com.dmw.crm.service.impl;

import com.dmw.base.BaseService;
import com.dmw.crm.dao.SaleChanceMapper;
import com.dmw.crm.dto.SaleChance;
import com.dmw.crm.query.SaleChanceQuery;
import com.dmw.crm.service.SaleChanceService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author woaixiejuan
 * @description 针对表【t_sale_chance】的数据库操作Service实现
 * @createDate 2022-10-05 09:55:29
 */
@Service
public class SaleChanceServiceImpl extends BaseService<SaleChance, Integer> implements SaleChanceService {

    @Resource
    private SaleChanceMapper saleChanceMapper;

    @Override
    public Map<String, Object> selectByPage(SaleChanceQuery saleChanceQuery) {
        Map<String, Object> result = new HashMap<>();
        PageHelper.startPage(saleChanceQuery.getPage(), saleChanceQuery.getLimit());
        List<SaleChance> saleChances = saleChanceMapper.selectByParams(saleChanceQuery);
        PageInfo<SaleChance> pageInfo = new PageInfo<>(saleChances);
        result.put("code",0);
        result.put("msg","");
        result.put("count",pageInfo.getTotal());
        result.put("data",pageInfo.getList());
        return result;
    }
}
