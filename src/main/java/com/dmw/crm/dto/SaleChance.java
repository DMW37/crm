package com.dmw.crm.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName t_sale_chance
 */
@Data
public class SaleChance implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 机会来源
     */
    private String chanceSource;

    /**
     * 
     */
    private String customerName;

    /**
     * 
     */
    private Integer cgjl;

    /**
     * 
     */
    private String overview;

    /**
     * 
     */
    private String linkMan;

    /**
     * 
     */
    private String linkPhone;

    /**
     * 
     */
    private String description;

    /**
     * 
     */
    private String createMan;

    /**
     * 
     */
    private String assignMan;

    /**
     * 
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date assignTime;

    /**
     * 
     */
    private Integer state;

    /**
     * 
     */
    private Integer devResult;

    /**
     * 
     */

    private Integer isValid;

    /**
     * 
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createDate;

    /**
     * 
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updateDate;

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
        SaleChance other = (SaleChance) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getChanceSource() == null ? other.getChanceSource() == null : this.getChanceSource().equals(other.getChanceSource()))
            && (this.getCustomerName() == null ? other.getCustomerName() == null : this.getCustomerName().equals(other.getCustomerName()))
            && (this.getCgjl() == null ? other.getCgjl() == null : this.getCgjl().equals(other.getCgjl()))
            && (this.getOverview() == null ? other.getOverview() == null : this.getOverview().equals(other.getOverview()))
            && (this.getLinkMan() == null ? other.getLinkMan() == null : this.getLinkMan().equals(other.getLinkMan()))
            && (this.getLinkPhone() == null ? other.getLinkPhone() == null : this.getLinkPhone().equals(other.getLinkPhone()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getCreateMan() == null ? other.getCreateMan() == null : this.getCreateMan().equals(other.getCreateMan()))
            && (this.getAssignMan() == null ? other.getAssignMan() == null : this.getAssignMan().equals(other.getAssignMan()))
            && (this.getAssignTime() == null ? other.getAssignTime() == null : this.getAssignTime().equals(other.getAssignTime()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getDevResult() == null ? other.getDevResult() == null : this.getDevResult().equals(other.getDevResult()))
            && (this.getIsValid() == null ? other.getIsValid() == null : this.getIsValid().equals(other.getIsValid()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getChanceSource() == null) ? 0 : getChanceSource().hashCode());
        result = prime * result + ((getCustomerName() == null) ? 0 : getCustomerName().hashCode());
        result = prime * result + ((getCgjl() == null) ? 0 : getCgjl().hashCode());
        result = prime * result + ((getOverview() == null) ? 0 : getOverview().hashCode());
        result = prime * result + ((getLinkMan() == null) ? 0 : getLinkMan().hashCode());
        result = prime * result + ((getLinkPhone() == null) ? 0 : getLinkPhone().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getCreateMan() == null) ? 0 : getCreateMan().hashCode());
        result = prime * result + ((getAssignMan() == null) ? 0 : getAssignMan().hashCode());
        result = prime * result + ((getAssignTime() == null) ? 0 : getAssignTime().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getDevResult() == null) ? 0 : getDevResult().hashCode());
        result = prime * result + ((getIsValid() == null) ? 0 : getIsValid().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", chanceSource=").append(chanceSource);
        sb.append(", customerName=").append(customerName);
        sb.append(", cgjl=").append(cgjl);
        sb.append(", overview=").append(overview);
        sb.append(", linkMan=").append(linkMan);
        sb.append(", linkPhone=").append(linkPhone);
        sb.append(", description=").append(description);
        sb.append(", createMan=").append(createMan);
        sb.append(", assignMan=").append(assignMan);
        sb.append(", assignTime=").append(assignTime);
        sb.append(", state=").append(state);
        sb.append(", devResult=").append(devResult);
        sb.append(", isValid=").append(isValid);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}