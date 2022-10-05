package com.dmw.crm.dto;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName t_cus_dev_plan
 */
@Data
public class CusDevPlan implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer saleChanceId;

    /**
     * 
     */
    private String planItem;

    /**
     * 
     */
    private Date planDate;

    /**
     * 
     */
    private String exeAffect;

    /**
     * 
     */
    private Date createDate;

    /**
     * 
     */
    private Date updateDate;

    /**
     * 
     */
    private Integer isValid;

    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CusDevPlan other = (CusDevPlan) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSaleChanceId() == null ? other.getSaleChanceId() == null : this.getSaleChanceId().equals(other.getSaleChanceId()))
            && (this.getPlanItem() == null ? other.getPlanItem() == null : this.getPlanItem().equals(other.getPlanItem()))
            && (this.getPlanDate() == null ? other.getPlanDate() == null : this.getPlanDate().equals(other.getPlanDate()))
            && (this.getExeAffect() == null ? other.getExeAffect() == null : this.getExeAffect().equals(other.getExeAffect()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
            && (this.getIsValid() == null ? other.getIsValid() == null : this.getIsValid().equals(other.getIsValid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSaleChanceId() == null) ? 0 : getSaleChanceId().hashCode());
        result = prime * result + ((getPlanItem() == null) ? 0 : getPlanItem().hashCode());
        result = prime * result + ((getPlanDate() == null) ? 0 : getPlanDate().hashCode());
        result = prime * result + ((getExeAffect() == null) ? 0 : getExeAffect().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getIsValid() == null) ? 0 : getIsValid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", saleChanceId=").append(saleChanceId);
        sb.append(", planItem=").append(planItem);
        sb.append(", planDate=").append(planDate);
        sb.append(", exeAffect=").append(exeAffect);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", isValid=").append(isValid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}