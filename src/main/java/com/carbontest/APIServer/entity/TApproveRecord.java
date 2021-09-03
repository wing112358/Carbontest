package com.carbontest.APIServer.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 审核记录表(TApproveRecord)实体类
 *
 * @author makejava
 * @since 2021-07-15 10:12:25
 */
public class TApproveRecord implements Serializable {
    private static final long serialVersionUID = -84905001446670271L;
    /**
    * 主键
    */
    private Long id;
    /**
    * 业务id
    */
    private String businessId;
    /**
    * 申请签发量
    */
    private Integer applicationIssuance;
    /**
    * 0 驳回 1 通过
    */
    private Object approveResult;
    /**
    * 审核备注
    */
    private Object approveRemark;
    /**
    * 审核类型 0 账户审核 1 项目审核 2 签发审核
    */
    private Object approveType;
    /**
    * 审核人
    */
    private String approveUser;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 修改时间
    */
    private Date updateTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public Integer getApplicationIssuance() {
        return applicationIssuance;
    }

    public void setApplicationIssuance(Integer applicationIssuance) {
        this.applicationIssuance = applicationIssuance;
    }

    public Object getApproveResult() {
        return approveResult;
    }

    public void setApproveResult(Object approveResult) {
        this.approveResult = approveResult;
    }

    public Object getApproveRemark() {
        return approveRemark;
    }

    public void setApproveRemark(Object approveRemark) {
        this.approveRemark = approveRemark;
    }

    public Object getApproveType() {
        return approveType;
    }

    public void setApproveType(Object approveType) {
        this.approveType = approveType;
    }

    public String getApproveUser() {
        return approveUser;
    }

    public void setApproveUser(String approveUser) {
        this.approveUser = approveUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}