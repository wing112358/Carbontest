package com.carbontest.APIServer.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 资产表(TAsset)实体类
 *
 * @author makejava
 * @since 2021-07-15 10:12:16
 */
public class TAsset implements Serializable {
    private static final long serialVersionUID = -13552873197098043L;
    
    private Integer id;
    /**
    * 所属项目id
    */
    private Integer projectId;
    /**
    * 审核记录id
    */
    private String businessId;
    /**
    * 流水号
    */
    private Long serialNumber;
    /**
    * 单位名称
    */
    private String companyName;
    /**
    * 类型
    */
    private Integer projectType;
    /**
    * 资产来源
    */
    private Integer sourceAssets;
    /**
    * 数量
    */
    private Integer quantity;
    /**
    * 价格
    */
    private Double price;
    /**
    * 状态: 0(审核中)，1(审核通过)，2(审核失败)
    */
    private Integer status;
    /**
    * 监测文件
    */
    private String monitoringFiles;
    /**
    * 核查文件
    */
    private String verificationFile;
    /**
    * 签发项目周期开始时间
    */
    private Date issuancePeriodTimeStart;
    /**
    * 签发项目周期结束时间
    */
    private Date issuancePeriodTimeEnd;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 修改时间
    */
    private Date updateTime;
    /**
    * 监测文件存证Hash
    */
    private String mrHash;
    /**
    * 其他附件
    */
    private String accessories;
    /**
    * 上链状态
    */
    private Integer chainStatus;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public Long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getProjectType() {
        return projectType;
    }

    public void setProjectType(Integer projectType) {
        this.projectType = projectType;
    }

    public Integer getSourceAssets() {
        return sourceAssets;
    }

    public void setSourceAssets(Integer sourceAssets) {
        this.sourceAssets = sourceAssets;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMonitoringFiles() {
        return monitoringFiles;
    }

    public void setMonitoringFiles(String monitoringFiles) {
        this.monitoringFiles = monitoringFiles;
    }

    public String getVerificationFile() {
        return verificationFile;
    }

    public void setVerificationFile(String verificationFile) {
        this.verificationFile = verificationFile;
    }

    public Date getIssuancePeriodTimeStart() {
        return issuancePeriodTimeStart;
    }

    public void setIssuancePeriodTimeStart(Date issuancePeriodTimeStart) {
        this.issuancePeriodTimeStart = issuancePeriodTimeStart;
    }

    public Date getIssuancePeriodTimeEnd() {
        return issuancePeriodTimeEnd;
    }

    public void setIssuancePeriodTimeEnd(Date issuancePeriodTimeEnd) {
        this.issuancePeriodTimeEnd = issuancePeriodTimeEnd;
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

    public String getMrHash() {
        return mrHash;
    }

    public void setMrHash(String mrHash) {
        this.mrHash = mrHash;
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