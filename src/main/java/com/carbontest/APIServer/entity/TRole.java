package com.carbontest.APIServer.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 角色表(TRole)实体类
 *
 * @author makejava
 * @since 2021-07-15 10:11:06
 */
public class TRole implements Serializable {
    private static final long serialVersionUID = 926771211562714042L;
    
    private Long id;
    
    private String roleCode;
    
    private String roleName;
    /**
    * 角色状态 0 停用 1 启用
    */
    private Object status;
    
    private Date createTime;
    
    private Date updateTime;
    /**
    * 角色类型：0 超级管理员 1 服务商 2 企业
    */
    private Object roleType;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
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

    public Object getRoleType() {
        return roleType;
    }

    public void setRoleType(Object roleType) {
        this.roleType = roleType;
    }

}