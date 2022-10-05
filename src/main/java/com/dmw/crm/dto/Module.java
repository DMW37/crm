package com.dmw.crm.dto;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName t_module
 */
@Data
public class Module implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 资源名称
     */
    private String moduleName;

    /**
     * 模块样式
     */
    private String moduleStyle;

    /**
     * 地址
     */
    private String url;

    /**
     * 
     */
    private Integer parentId;

    /**
     * 
     */
    private String parentOptValue;

    /**
     * 等级
     */
    private Integer grade;

    /**
     * 权限值
     */
    private String optValue;

    /**
     * 
     */
    private Integer orders;

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
        Module other = (Module) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getModuleName() == null ? other.getModuleName() == null : this.getModuleName().equals(other.getModuleName()))
            && (this.getModuleStyle() == null ? other.getModuleStyle() == null : this.getModuleStyle().equals(other.getModuleStyle()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
            && (this.getParentOptValue() == null ? other.getParentOptValue() == null : this.getParentOptValue().equals(other.getParentOptValue()))
            && (this.getGrade() == null ? other.getGrade() == null : this.getGrade().equals(other.getGrade()))
            && (this.getOptValue() == null ? other.getOptValue() == null : this.getOptValue().equals(other.getOptValue()))
            && (this.getOrders() == null ? other.getOrders() == null : this.getOrders().equals(other.getOrders()))
            && (this.getIsValid() == null ? other.getIsValid() == null : this.getIsValid().equals(other.getIsValid()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getModuleName() == null) ? 0 : getModuleName().hashCode());
        result = prime * result + ((getModuleStyle() == null) ? 0 : getModuleStyle().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getParentOptValue() == null) ? 0 : getParentOptValue().hashCode());
        result = prime * result + ((getGrade() == null) ? 0 : getGrade().hashCode());
        result = prime * result + ((getOptValue() == null) ? 0 : getOptValue().hashCode());
        result = prime * result + ((getOrders() == null) ? 0 : getOrders().hashCode());
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
        sb.append(", moduleName=").append(moduleName);
        sb.append(", moduleStyle=").append(moduleStyle);
        sb.append(", url=").append(url);
        sb.append(", parentId=").append(parentId);
        sb.append(", parentOptValue=").append(parentOptValue);
        sb.append(", grade=").append(grade);
        sb.append(", optValue=").append(optValue);
        sb.append(", orders=").append(orders);
        sb.append(", isValid=").append(isValid);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}