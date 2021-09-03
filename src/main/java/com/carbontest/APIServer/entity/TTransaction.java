package com.carbontest.APIServer.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 交易记录表(TTransaction)实体类
 *
 * @author makejava
 * @since 2021-09-03 14:37:47
 */
public class TTransaction implements Serializable {
    private static final long serialVersionUID = 465647240108219412L;
    
    private Integer id;
    /**
    * 用户id
    */
    private Long userId;
    /**
    * 审核记录id
    */
    private String businessId;
    /**
    * 流水号
    */
    private Long serialNumber;
    /**
    * 录入交易账户名
    */
    private String companyName;
    /**
    * 买方名称
    */
    private String buyerName;
    /**
    * 卖方名称
    */
    private String sellerName;
    /**
    * 项目名称
    */
    private String projectName;
    /**
    * 项目类型
    */
    private Integer projectType;
    /**
    * 数量
    */
    private Integer quantity;
    /**
    * 单价
    */
    private Double price;
    /**
    * 总价
    */
    private Double totalPrice;
    /**
    * 交易时间
    */
    private Date transactionTime;
    /**
    * 数据类型 0 线下交易 1 线上交易
    */
    private Integer dataType;
    /**
    * 合同
    */
    private String contract;
    /**
    * 状态: 0(审核中)，1(审核通过)，2(审核失败)
    */
    private Integer status;
    /**
    * 录入类型
    */
    private Integer entryType;
    /**
    * 分佣比例
    */
    private Integer ratio;
    /**
    * 佣金
    */
    private Double commission;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Integer getProjectType() {
        return projectType;
    }

    public void setProjectType(Integer projectType) {
        this.projectType = projectType;
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

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(Date transactionTime) {
        this.transactionTime = transactionTime;
    }

    public Integer getDataType() {
        return dataType;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getEntryType() {
        return entryType;
    }

    public void setEntryType(Integer entryType) {
        this.entryType = entryType;
    }

    public Integer getRatio() {
        return ratio;
    }

    public void setRatio(Integer ratio) {
        this.ratio = ratio;
    }

    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }

}