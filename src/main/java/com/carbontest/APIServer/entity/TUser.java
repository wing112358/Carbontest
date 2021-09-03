package com.carbontest.APIServer.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户表(TUser)实体类
 *
 * @author makejava
 * @since 2021-07-15 10:10:36
 */
public class TUser implements Serializable {
    private static final long serialVersionUID = 511653667621673008L;
    
    private Long id;
    /**
    * 用户ID
    */
    private Long userId;
    /**
    * 关联的账户Id
    */
    private Long accountId;
    /**
    * 用户账号即手机号
    */
    private String username;
    /**
    * 用户密码
    */
    private String password;
    /**
    * 角色类型：0 主管单位 1 碳聚合服务商 2 减排项目方（卖家）
    */
    private Object type;


    /**
    * 上链状态：0(上链中) 1(上链成功) 2(上链失败)
    */
    private Object chainStatus;
    /**
    * 用户公钥地址
    */
    private String publicKeyAddress;
    /**
    * 用户链上地址
    */
    private String chainAddress;
    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 更新时间
    */
    private Date updateTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public Object getChainStatus() {
        return chainStatus;
    }

    public void setChainStatus(Object chainStatus) {
        this.chainStatus = chainStatus;
    }

    public String getPublicKeyAddress() {
        return publicKeyAddress;
    }

    public void setPublicKeyAddress(String publicKeyAddress) {
        this.publicKeyAddress = publicKeyAddress;
    }


    public String getChainAddress() {
        return chainAddress;
    }

    public void setChainAddress(String chainAddress) {
        this.chainAddress = chainAddress;
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

    public void TUser(Long id,Long userId,Long accountId,String username,String password,Object type,Object chainStatus,String publicKeyAddress,String chainAddress,Date createTime,Date updateTime){
        this.id=id;
        this.userId=userId;
        this.accountId=accountId;
        this.username=username;
        this.password=password;
        this.type=type;
        this.chainStatus=chainStatus;
        this.publicKeyAddress=publicKeyAddress;
        this.chainAddress=chainAddress;
        this.createTime=createTime;
        this.updateTime=updateTime;

    }

}