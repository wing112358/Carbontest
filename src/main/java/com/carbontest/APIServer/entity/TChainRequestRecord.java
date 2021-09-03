package com.carbontest.APIServer.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 区块链请求记录表(TChainRequestRecord)实体类
 *
 * @author makejava
 * @since 2021-07-15 10:11:58
 */
public class TChainRequestRecord implements Serializable {
    private static final long serialVersionUID = -26742394403361199L;
    
    private Long id;
    /**
    * 交易流水Id 不可重复
    */
    private String bizId;
    /**
    * 业务流水Id
    */
    private Long businessId;
    /**
    * 业务类型 1.用户注册上链
    */
    private Object businessType;
    /**
    * 交易Hash
    */
    private String txHash;
    /**
    * 超时区块
    */
    private Long blockLimit;
    /**
    * 内部业务关联Id
    */
    private Long linkId;
    /**
    * 请求系统名
    */
    private String system;
    /**
    * 请求地址
    */
    private String url;
    /**
    * 请求参数
    */
    private String param;
    /**
    * 响应状态
    */
    private Object respStatus;
    /**
    * 返回消息信息记录
    */
    private String respMessage;
    /**
    * 重试次数
    */
    private Object retryTime;
    /**
    * 更新时间
    */
    private Date updateTime;
    /**
    * 创建时间
    */
    private Date createTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public Long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    public Object getBusinessType() {
        return businessType;
    }

    public void setBusinessType(Object businessType) {
        this.businessType = businessType;
    }

    public String getTxHash() {
        return txHash;
    }

    public void setTxHash(String txHash) {
        this.txHash = txHash;
    }

    public Long getBlockLimit() {
        return blockLimit;
    }

    public void setBlockLimit(Long blockLimit) {
        this.blockLimit = blockLimit;
    }

    public Long getLinkId() {
        return linkId;
    }

    public void setLinkId(Long linkId) {
        this.linkId = linkId;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public Object getRespStatus() {
        return respStatus;
    }

    public void setRespStatus(Object respStatus) {
        this.respStatus = respStatus;
    }

    public String getRespMessage() {
        return respMessage;
    }

    public void setRespMessage(String respMessage) {
        this.respMessage = respMessage;
    }

    public Object getRetryTime() {
        return retryTime;
    }

    public void setRetryTime(Object retryTime) {
        this.retryTime = retryTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}