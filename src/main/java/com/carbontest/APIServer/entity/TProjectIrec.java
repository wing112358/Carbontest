package com.carbontest.APIServer.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TProjectIrec)实体类
 *
 * @author makejava
 * @since 2021-08-26 16:11:37
 */
public class TProjectIrec implements Serializable {
    private static final long serialVersionUID = 955454627796285719L;
    
    private Long id;
    /**
    * 项目ID
    */
    private Integer projectId;
    /**
    * 项目并网时间
    */
    private Date projectConnectionTime;
    /**
    * 项目声明文件
    */
    private String declarationFile;
    /**
    * 电费清单
    */
    private String electricityFile;
    /**
    * 接线图
    */
    private String wiringDiagram;
    /**
    * 合同
    */
    private String contract;
    /**
    * 现场照片
    */
    private String picture;
    /**
    * 声明文件Hash
    */
    private String declarationHash;
    /**
    * 电费清单Hash
    */
    private String electricityHash;
    /**
    * 接线图Hash
    */
    private String wiringHash;
    /**
    * 合同Hash
    */
    private String contractHash;
    /**
    * 现场照片Hash
    */
    private String pictureHash;
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

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Date getProjectConnectionTime() {
        return projectConnectionTime;
    }

    public void setProjectConnectionTime(Date projectConnectionTime) {
        this.projectConnectionTime = projectConnectionTime;
    }

    public String getDeclarationFile() {
        return declarationFile;
    }

    public void setDeclarationFile(String declarationFile) {
        this.declarationFile = declarationFile;
    }

    public String getElectricityFile() {
        return electricityFile;
    }

    public void setElectricityFile(String electricityFile) {
        this.electricityFile = electricityFile;
    }

    public String getWiringDiagram() {
        return wiringDiagram;
    }

    public void setWiringDiagram(String wiringDiagram) {
        this.wiringDiagram = wiringDiagram;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getDeclarationHash() {
        return declarationHash;
    }

    public void setDeclarationHash(String declarationHash) {
        this.declarationHash = declarationHash;
    }

    public String getElectricityHash() {
        return electricityHash;
    }

    public void setElectricityHash(String electricityHash) {
        this.electricityHash = electricityHash;
    }

    public String getWiringHash() {
        return wiringHash;
    }

    public void setWiringHash(String wiringHash) {
        this.wiringHash = wiringHash;
    }

    public String getContractHash() {
        return contractHash;
    }

    public void setContractHash(String contractHash) {
        this.contractHash = contractHash;
    }

    public String getPictureHash() {
        return pictureHash;
    }

    public void setPictureHash(String pictureHash) {
        this.pictureHash = pictureHash;
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