package com.dmw.crm.dto;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName t_customer_reprieve
 */
@Data
public class CustomerReprieve implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer lossId;

    /**
     * 
     */
    private String measure;

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
        CustomerReprieve other = (CustomerReprieve) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLossId() == null ? other.getLossId() == null : this.getLossId().equals(other.getLossId()))
            && (this.getMeasure() == null ? other.getMeasure() == null : this.getMeasure().equals(other.getMeasure()))
            && (this.getIsValid() == null ? other.getIsValid() == null : this.getIsValid().equals(other.getIsValid()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLossId() == null) ? 0 : getLossId().hashCode());
        result = prime * result + ((getMeasure() == null) ? 0 : getMeasure().hashCode());
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
        sb.append(", lossId=").append(lossId);
        sb.append(", measure=").append(measure);
        sb.append(", isValid=").append(isValid);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}