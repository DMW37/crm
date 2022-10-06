package com.dmw.crm.query;

import com.dmw.base.BaseQuery;
import lombok.Data;

/**
 * @author: 邓明维
 * @date: 2022/10/6
 * @description:
 */
@Data
public class SaleChanceQuery extends BaseQuery {
    private String customerName;
    private String createMan;
    /**
     * 分配状态0 未分配 ；1 分配
     */
    private Integer state;
}
