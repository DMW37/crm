package com.dmw.crm.dto;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName t_customer
 */
@Data
public class Customer implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String khno;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String area;

    /**
     * 
     */
    private String cusManager;

    /**
     * 
     */
    private String level;

    /**
     * 
     */
    private String myd;

    /**
     * 
     */
    private String xyd;

    /**
     * 
     */
    private String address;

    /**
     * 
     */
    private String postCode;

    /**
     * 
     */
    private String phone;

    /**
     * 
     */
    private String fax;

    /**
     * 
     */
    private String webSite;

    /**
     * 
     */
    private String yyzzzch;

    /**
     * 
     */
    private String fr;

    /**
     * 
     */
    private String zczj;

    /**
     * 
     */
    private String nyye;

    /**
     * 
     */
    private String khyh;

    /**
     * 
     */
    private String khzh;

    /**
     * 
     */
    private String dsdjh;

    /**
     * 
     */
    private String gsdjh;

    /**
     * 
     */
    private Integer state;

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
        Customer other = (Customer) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getKhno() == null ? other.getKhno() == null : this.getKhno().equals(other.getKhno()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getCusManager() == null ? other.getCusManager() == null : this.getCusManager().equals(other.getCusManager()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()))
            && (this.getMyd() == null ? other.getMyd() == null : this.getMyd().equals(other.getMyd()))
            && (this.getXyd() == null ? other.getXyd() == null : this.getXyd().equals(other.getXyd()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getPostCode() == null ? other.getPostCode() == null : this.getPostCode().equals(other.getPostCode()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getFax() == null ? other.getFax() == null : this.getFax().equals(other.getFax()))
            && (this.getWebSite() == null ? other.getWebSite() == null : this.getWebSite().equals(other.getWebSite()))
            && (this.getYyzzzch() == null ? other.getYyzzzch() == null : this.getYyzzzch().equals(other.getYyzzzch()))
            && (this.getFr() == null ? other.getFr() == null : this.getFr().equals(other.getFr()))
            && (this.getZczj() == null ? other.getZczj() == null : this.getZczj().equals(other.getZczj()))
            && (this.getNyye() == null ? other.getNyye() == null : this.getNyye().equals(other.getNyye()))
            && (this.getKhyh() == null ? other.getKhyh() == null : this.getKhyh().equals(other.getKhyh()))
            && (this.getKhzh() == null ? other.getKhzh() == null : this.getKhzh().equals(other.getKhzh()))
            && (this.getDsdjh() == null ? other.getDsdjh() == null : this.getDsdjh().equals(other.getDsdjh()))
            && (this.getGsdjh() == null ? other.getGsdjh() == null : this.getGsdjh().equals(other.getGsdjh()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getIsValid() == null ? other.getIsValid() == null : this.getIsValid().equals(other.getIsValid()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getKhno() == null) ? 0 : getKhno().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getCusManager() == null) ? 0 : getCusManager().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        result = prime * result + ((getMyd() == null) ? 0 : getMyd().hashCode());
        result = prime * result + ((getXyd() == null) ? 0 : getXyd().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getPostCode() == null) ? 0 : getPostCode().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getFax() == null) ? 0 : getFax().hashCode());
        result = prime * result + ((getWebSite() == null) ? 0 : getWebSite().hashCode());
        result = prime * result + ((getYyzzzch() == null) ? 0 : getYyzzzch().hashCode());
        result = prime * result + ((getFr() == null) ? 0 : getFr().hashCode());
        result = prime * result + ((getZczj() == null) ? 0 : getZczj().hashCode());
        result = prime * result + ((getNyye() == null) ? 0 : getNyye().hashCode());
        result = prime * result + ((getKhyh() == null) ? 0 : getKhyh().hashCode());
        result = prime * result + ((getKhzh() == null) ? 0 : getKhzh().hashCode());
        result = prime * result + ((getDsdjh() == null) ? 0 : getDsdjh().hashCode());
        result = prime * result + ((getGsdjh() == null) ? 0 : getGsdjh().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
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
        sb.append(", khno=").append(khno);
        sb.append(", name=").append(name);
        sb.append(", area=").append(area);
        sb.append(", cusManager=").append(cusManager);
        sb.append(", level=").append(level);
        sb.append(", myd=").append(myd);
        sb.append(", xyd=").append(xyd);
        sb.append(", address=").append(address);
        sb.append(", postCode=").append(postCode);
        sb.append(", phone=").append(phone);
        sb.append(", fax=").append(fax);
        sb.append(", webSite=").append(webSite);
        sb.append(", yyzzzch=").append(yyzzzch);
        sb.append(", fr=").append(fr);
        sb.append(", zczj=").append(zczj);
        sb.append(", nyye=").append(nyye);
        sb.append(", khyh=").append(khyh);
        sb.append(", khzh=").append(khzh);
        sb.append(", dsdjh=").append(dsdjh);
        sb.append(", gsdjh=").append(gsdjh);
        sb.append(", state=").append(state);
        sb.append(", isValid=").append(isValid);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}