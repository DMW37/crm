package com.dmw.crm.dto;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName t_customer_serve
 */
@Data
public class CustomerServe implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String serveType;

    /**
     * 
     */
    private String overview;

    /**
     * 
     */
    private String customer;

    /**
     * 
     */
    private String state;

    /**
     * 
     */
    private String serviceRequest;

    /**
     * 
     */
    private String createPeople;

    /**
     * 
     */
    private String assigner;

    /**
     * 
     */
    private Date assignTime;

    /**
     * 
     */
    private String serviceProce;

    /**
     * 
     */
    private String serviceProcePeople;

    /**
     * 
     */
    private Date serviceProceTime;

    /**
     * 
     */
    private String serviceProceResult;

    /**
     * 
     */
    private String myd;

    /**
     * 
     */
    private Integer isValid;

    /**
     * 
     */
    private Date updateDate;

    /**
     * 
     */
    private Date createDate;

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
        CustomerServe other = (CustomerServe) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getServeType() == null ? other.getServeType() == null : this.getServeType().equals(other.getServeType()))
            && (this.getOverview() == null ? other.getOverview() == null : this.getOverview().equals(other.getOverview()))
            && (this.getCustomer() == null ? other.getCustomer() == null : this.getCustomer().equals(other.getCustomer()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getServiceRequest() == null ? other.getServiceRequest() == null : this.getServiceRequest().equals(other.getServiceRequest()))
            && (this.getCreatePeople() == null ? other.getCreatePeople() == null : this.getCreatePeople().equals(other.getCreatePeople()))
            && (this.getAssigner() == null ? other.getAssigner() == null : this.getAssigner().equals(other.getAssigner()))
            && (this.getAssignTime() == null ? other.getAssignTime() == null : this.getAssignTime().equals(other.getAssignTime()))
            && (this.getServiceProce() == null ? other.getServiceProce() == null : this.getServiceProce().equals(other.getServiceProce()))
            && (this.getServiceProcePeople() == null ? other.getServiceProcePeople() == null : this.getServiceProcePeople().equals(other.getServiceProcePeople()))
            && (this.getServiceProceTime() == null ? other.getServiceProceTime() == null : this.getServiceProceTime().equals(other.getServiceProceTime()))
            && (this.getServiceProceResult() == null ? other.getServiceProceResult() == null : this.getServiceProceResult().equals(other.getServiceProceResult()))
            && (this.getMyd() == null ? other.getMyd() == null : this.getMyd().equals(other.getMyd()))
            && (this.getIsValid() == null ? other.getIsValid() == null : this.getIsValid().equals(other.getIsValid()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getServeType() == null) ? 0 : getServeType().hashCode());
        result = prime * result + ((getOverview() == null) ? 0 : getOverview().hashCode());
        result = prime * result + ((getCustomer() == null) ? 0 : getCustomer().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getServiceRequest() == null) ? 0 : getServiceRequest().hashCode());
        result = prime * result + ((getCreatePeople() == null) ? 0 : getCreatePeople().hashCode());
        result = prime * result + ((getAssigner() == null) ? 0 : getAssigner().hashCode());
        result = prime * result + ((getAssignTime() == null) ? 0 : getAssignTime().hashCode());
        result = prime * result + ((getServiceProce() == null) ? 0 : getServiceProce().hashCode());
        result = prime * result + ((getServiceProcePeople() == null) ? 0 : getServiceProcePeople().hashCode());
        result = prime * result + ((getServiceProceTime() == null) ? 0 : getServiceProceTime().hashCode());
        result = prime * result + ((getServiceProceResult() == null) ? 0 : getServiceProceResult().hashCode());
        result = prime * result + ((getMyd() == null) ? 0 : getMyd().hashCode());
        result = prime * result + ((getIsValid() == null) ? 0 : getIsValid().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", serveType=").append(serveType);
        sb.append(", overview=").append(overview);
        sb.append(", customer=").append(customer);
        sb.append(", state=").append(state);
        sb.append(", serviceRequest=").append(serviceRequest);
        sb.append(", createPeople=").append(createPeople);
        sb.append(", assigner=").append(assigner);
        sb.append(", assignTime=").append(assignTime);
        sb.append(", serviceProce=").append(serviceProce);
        sb.append(", serviceProcePeople=").append(serviceProcePeople);
        sb.append(", serviceProceTime=").append(serviceProceTime);
        sb.append(", serviceProceResult=").append(serviceProceResult);
        sb.append(", myd=").append(myd);
        sb.append(", isValid=").append(isValid);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", createDate=").append(createDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}