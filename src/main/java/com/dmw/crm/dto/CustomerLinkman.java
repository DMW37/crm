package com.dmw.crm.dto;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName t_customer_linkman
 */
@Data
public class CustomerLinkman implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private Integer cusId;

    /**
     * 
     */
    private String linkName;

    /**
     * 
     */
    private String sex;

    /**
     * 
     */
    private String zhiwei;

    /**
     * 
     */
    private String officePhone;

    /**
     * 
     */
    private String phone;

    /**
     * 
     */
    private Integer isValid;

    /**
     * 
     */
    private Date ceateDate;

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
        CustomerLinkman other = (CustomerLinkman) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCusId() == null ? other.getCusId() == null : this.getCusId().equals(other.getCusId()))
            && (this.getLinkName() == null ? other.getLinkName() == null : this.getLinkName().equals(other.getLinkName()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getZhiwei() == null ? other.getZhiwei() == null : this.getZhiwei().equals(other.getZhiwei()))
            && (this.getOfficePhone() == null ? other.getOfficePhone() == null : this.getOfficePhone().equals(other.getOfficePhone()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getIsValid() == null ? other.getIsValid() == null : this.getIsValid().equals(other.getIsValid()))
            && (this.getCeateDate() == null ? other.getCeateDate() == null : this.getCeateDate().equals(other.getCeateDate()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCusId() == null) ? 0 : getCusId().hashCode());
        result = prime * result + ((getLinkName() == null) ? 0 : getLinkName().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getZhiwei() == null) ? 0 : getZhiwei().hashCode());
        result = prime * result + ((getOfficePhone() == null) ? 0 : getOfficePhone().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getIsValid() == null) ? 0 : getIsValid().hashCode());
        result = prime * result + ((getCeateDate() == null) ? 0 : getCeateDate().hashCode());
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
        sb.append(", cusId=").append(cusId);
        sb.append(", linkName=").append(linkName);
        sb.append(", sex=").append(sex);
        sb.append(", zhiwei=").append(zhiwei);
        sb.append(", officePhone=").append(officePhone);
        sb.append(", phone=").append(phone);
        sb.append(", isValid=").append(isValid);
        sb.append(", ceateDate=").append(ceateDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}