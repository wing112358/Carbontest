package com.carbontest.APIServer.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 公司表(TCompany)实体类
 *
 * @author makejava
 * @since 2021-07-15 10:11:46
 */
public class TCompany implements Serializable {
    private static final long serialVersionUID = -60899940974876215L;
    
    private Integer id;
    /**
    * 关联的用户ID
    */
    private Long userId;
    /**
    * 审核记录id
    */
    private String businessId;
    /**
    * 公司名称
    */
    private String companyName;
    /**
    * 统一社会信用证代码
    */
    private String socialCreditCode;
    /**
    * 公司地址
    */
    private String address;
    /**
    * 法人姓名
    */
    private String legalPerson;
    /**
    * 法人证件号码
    */
    private String legalPersonIdCard;
    /**
    * 邮箱
    */
    private String mail;
    /**
    * 联系人
    */
    private String contact;
    /**
    * 公司联系电话
    */
    private String phone;
    /**
    * 营业执照
    */
    private String businessLicense;

    /**
     * 分佣比例
     */
    private Integer ratio;

    /**
     * 角色类型：0 主管单位 1 碳聚合服务商 2 减排项目方（卖家）'
     */
    private Integer type;
    /**
    * 状态: 0(审核中)，1(审核通过)，2(审核失败)
    */
    private Integer status;
    
    private Date createTime;
    
    private Date updateTime;


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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getSocialCreditCode() {
        return socialCreditCode;
    }

    public void setSocialCreditCode(String socialCreditCode) {
        this.socialCreditCode = socialCreditCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    public String getLegalPersonIdCard() {
        return legalPersonIdCard;
    }

    public void setLegalPersonIdCard(String legalPersonIdCard) {
        this.legalPersonIdCard = legalPersonIdCard;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getRatio() {
        return ratio;
    }

    public void setRatio(Integer ratio) {
        this.ratio = ratio;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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