package com.carbontest.APIServer.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TProjectCcer)实体类
 *
 * @author makejava
 * @since 2021-08-26 16:11:25
 */
public class TProjectCcer implements Serializable {
    private static final long serialVersionUID = -42997314892737819L;
    
    private Long id;
    /**
    * 项目ID
    */
    private Integer projectId;
    /**
    * 方法学 0（分布式光伏发电系统碳普惠） 1（CMS-002-V01联网的可再生能源发电）
    */
    private Integer methodology;
    /**
    * 项目文件
    */
    private String projectFiles;
    /**
    * 审定文件
    */
    private String validationFiles;
    /**
    * 其他附件
    */
    private String accessories;
    /**
    * 项目文件Hash
    */
    private String pddHash;
    /**
    * 项目周期开始时间
    */
    private Date periodTimeStart;
    /**
    * 项目周期结束时间
    */
    private Date periodTimeEnd;
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

    public Integer getMethodology() {
        return methodology;
    }

    public void setMethodology(Integer methodology) {
        this.methodology = methodology;
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

    public String getAccessories() {
        return accessories;
    }

    public void setAccessories(String accessories) {
        this.accessories = accessories;
    }

    public String getPddHash() {
        return pddHash;
    }

    public void setPddHash(String pddHash) {
        this.pddHash = pddHash;
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