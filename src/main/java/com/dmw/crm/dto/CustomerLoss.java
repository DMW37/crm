package com.dmw.crm.dto;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName t_customer_loss
 */
@Data
public class CustomerLoss implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String cusNo;

    /**
     * 
     */
    private String cusName;

    /**
     * 
     */
    private String cusManager;

    /**
     * 
     */
    private Date lastOrderTime;

    /**
     * 
     */
    private Date confirmLossTime;

    /**
     * 
     */
    private Integer state;

    /**
     * 
     */
    private String lossReason;

    /**
     * 
     */
    private Integer isValid;

    /**
     * 
     */
    private Date createDate;

    /**
     * 
     */
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
        CustomerLoss other = (CustomerLoss) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCusNo() == null ? other.getCusNo() == null : this.getCusNo().equals(other.getCusNo()))
            && (this.getCusName() == null ? other.getCusName() == null : this.getCusName().equals(other.getCusName()))
            && (this.getCusManager() == null ? other.getCusManager() == null : this.getCusManager().equals(other.getCusManager()))
            && (this.getLastOrderTime() == null ? other.getLastOrderTime() == null : this.getLastOrderTime().equals(other.getLastOrderTime()))
            && (this.getConfirmLossTime() == null ? other.getConfirmLossTime() == null : this.getConfirmLossTime().equals(other.getConfirmLossTime()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getLossReason() == null ? other.getLossReason() == null : this.getLossReason().equals(other.getLossReason()))
            && (this.getIsValid() == null ? other.getIsValid() == null : this.getIsValid().equals(other.getIsValid()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCusNo() == null) ? 0 : getCusNo().hashCode());
        result = prime * result + ((getCusName() == null) ? 0 : getCusName().hashCode());
        result = prime * result + ((getCusManager() == null) ? 0 : getCusManager().hashCode());
        result = prime * result + ((getLastOrderTime() == null) ? 0 : getLastOrderTime().hashCode());
        result = prime * result + ((getConfirmLossTime() == null) ? 0 : getConfirmLossTime().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getLossReason() == null) ? 0 : getLossReason().hashCode());
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
        sb.append(", cusNo=").append(cusNo);
        sb.append(", cusName=").append(cusName);
        sb.append(", cusManager=").append(cusManager);
        sb.append(", lastOrderTime=").append(lastOrderTime);
        sb.append(", confirmLossTime=").append(confirmLossTime);
        sb.append(", state=").append(state);
        sb.append(", lossReason=").append(lossReason);
        sb.append(", isValid=").append(isValid);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}