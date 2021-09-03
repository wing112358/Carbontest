package com.carbontest.APIServer.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 角色权限关联表(TRolePermission)实体类
 *
 * @author makejava
 * @since 2021-07-15 10:10:57
 */
public class TRolePermission implements Serializable {
    private static final long serialVersionUID = 130491362218063050L;
    
    private Long id;
    
    private String roleCode;
    
    private String permissionUrl;
    
    private Date createTime;
    
    private Date updateTime;


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

    public String getPermissionUrl() {
        return permissionUrl;
    }

    public void setPermissionUrl(String permissionUrl) {
        this.permissionUrl = permissionUrl;
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