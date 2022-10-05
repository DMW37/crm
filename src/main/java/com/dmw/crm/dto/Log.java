package com.dmw.crm.dto;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName t_log
 */
@Data
public class Log implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String description;

    /**
     * 
     */
    private String method;

    /**
     * 
     */
    private String type;

    /**
     * 
     */
    private String requestIp;

    /**
     * 
     */
    private String exceptionCode;

    /**
     * 
     */
    private String exceptionDetail;

    /**
     * 
     */
    private String params;

    /**
     * 
     */
    private Date createDate;

    /**
     * 
     */
    private Integer executeTime;

    /**
     * 
     */
    private String createMan;

    /**
     * 
     */
    private String result;

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
        Log other = (Log) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getMethod() == null ? other.getMethod() == null : this.getMethod().equals(other.getMethod()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getRequestIp() == null ? other.getRequestIp() == null : this.getRequestIp().equals(other.getRequestIp()))
            && (this.getExceptionCode() == null ? other.getExceptionCode() == null : this.getExceptionCode().equals(other.getExceptionCode()))
            && (this.getExceptionDetail() == null ? other.getExceptionDetail() == null : this.getExceptionDetail().equals(other.getExceptionDetail()))
            && (this.getParams() == null ? other.getParams() == null : this.getParams().equals(other.getParams()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getExecuteTime() == null ? other.getExecuteTime() == null : this.getExecuteTime().equals(other.getExecuteTime()))
            && (this.getCreateMan() == null ? other.getCreateMan() == null : this.getCreateMan().equals(other.getCreateMan()))
            && (this.getResult() == null ? other.getResult() == null : this.getResult().equals(other.getResult()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getMethod() == null) ? 0 : getMethod().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getRequestIp() == null) ? 0 : getRequestIp().hashCode());
        result = prime * result + ((getExceptionCode() == null) ? 0 : getExceptionCode().hashCode());
        result = prime * result + ((getExceptionDetail() == null) ? 0 : getExceptionDetail().hashCode());
        result = prime * result + ((getParams() == null) ? 0 : getParams().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getExecuteTime() == null) ? 0 : getExecuteTime().hashCode());
        result = prime * result + ((getCreateMan() == null) ? 0 : getCreateMan().hashCode());
        result = prime * result + ((getResult() == null) ? 0 : getResult().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", description=").append(description);
        sb.append(", method=").append(method);
        sb.append(", type=").append(type);
        sb.append(", requestIp=").append(requestIp);
        sb.append(", exceptionCode=").append(exceptionCode);
        sb.append(", exceptionDetail=").append(exceptionDetail);
        sb.append(", params=").append(params);
        sb.append(", createDate=").append(createDate);
        sb.append(", executeTime=").append(executeTime);
        sb.append(", createMan=").append(createMan);
        sb.append(", result=").append(result);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}