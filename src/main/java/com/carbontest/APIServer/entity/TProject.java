package com.carbontest.APIServer.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 项目表(TProject)实体类
 *
 * @author makejava
 * @since 2021-07-15 10:11:14
 */
public class TProject implements Serializable {
    private static final long serialVersionUID = -57220005295881102L;
    
    private Integer id;
    /**
    * 项目名称
    */
    private String projectName;
    /**
    * 项目编号
    */
    private String projectCode;
    /**
    * 项目所属方
    */
    private Long userId;
    /**
    * 项目所属方
    */
    private Integer companyId;
    /**
    * 审核记录id
    */
    private String businessId;
    /**
    * 项目地区
    */
    private String projectArea;
    /**
    * 项目类型： 0(CCER)  1(碳普惠) 2(IREC)
    */
    private Integer projectType;

    /**
    * 预计总量，单位tCO2e
    */
    private Integer estimatedTotal;
    /**
    * 项目周期开始时间
    */
    private Date periodTimeStart;
    /**
    * 项目周期结束时间
    */
    private Date periodTimeEnd;
    /**
    * 申请签发量
    */
    private Integer applicationIssuance;
    /**
    * 状态: 0(审核中)，1(审核通过)，2(审核失败)
    */
    private Integer status;
    /**
    * 项目简介
    */
    private String projectBrief;
    /**
    * 项目文件
    */
    private String projectFiles;
    /**
    * 审定文件
    */
    private String validationFiles;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 更新时间
    */
    private Date updateTime;
    /**
    * 项目地址
    */
    private String address;
    /**
    * 项目文件存证Hash
    */
    private String pddHash;
    /**
    * 其他附件
    */
    private String accessories;
    /**
    * 上链状态 0 上链中 1上链成功 2 上链失败 3 等待上链
    */
    private Integer chainStatus;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public String getProjectArea() {
        return projectArea;
    }

    public void setProjectArea(String projectArea) {
        this.projectArea = projectArea;
    }

    public Integer getProjectType() {
        return projectType;
    }

    public void setProjectType(Integer projectType) {
        this.projectType = projectType;
    }

    public Integer getEstimatedTotal() {
        return estimatedTotal;
    }

    public void setEstimatedTotal(Integer estimatedTotal) {
        this.estimatedTotal = estimatedTotal;
    }

    public Date getPeriodTimeStart() {
        return periodTimeStart;
    }

    public void setPeriodTimeStart(Date periodTimeStart) {
        this.periodTimeStart = periodTimeStart;
    }

    public Date getPeriodTimeEnd() {
        return periodTimeEnd;
    }

    public void setPeriodTimeEnd(Date periodTimeEnd) {
        this.periodTimeEnd = periodTimeEnd;
    }

    public Integer getApplicationIssuance() {
        return applicationIssuance;
    }

    public void setApplicationIssuance(Integer applicationIssuance) {
        this.applicationIssuance = applicationIssuance;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getProjectBrief() {
        return projectBrief;
    }

    public void setProjectBrief(String projectBrief) {
        this.projectBrief = projectBrief;
    }

    public String getProjectFiles() {
        return projectFiles;
    }

    public void setProjectFiles(String projectFiles) {
        this.projectFiles = projectFiles;
    }

    public String getValidationFiles() {
        return validationFiles;
    }

    public void setValidationFiles(String validationFiles) {
        this.validationFiles = validationFiles;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPddHash() {
        return pddHash;
    }

    public void setPddHash(String pddHash) {
        this.pddHash = pddHash;
    }

    public String getAccessories() {
        return accessories;
    }

    public void setAccessories(String accessories) {
        this.accessories = accessories;
    }

    public Integer getChainStatus() {
        return chainStatus;
    }

    public void setChainStatus(Integer chainStatus) {
        this.chainStatus = chainStatus;
    }

}