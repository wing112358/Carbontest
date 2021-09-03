package com.carbontest.APIServer.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 权限表(TPermission)实体类
 *
 * @author makejava
 * @since 2021-07-15 10:11:21
 */
public class TPermission implements Serializable {
    private static final long serialVersionUID = -34172346701624883L;
    
    private Long id;
    
    private String permissionUrl;
    
    private String permissionName;
    /**
    * 权限类型 1 菜单权限 0 菜单按钮权限
    */
    private String permissionType;
    
    private Object status;
    
    private Date createTime;
    
    private Date updateTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPermissionUrl() {
        return permissionUrl;
    }

    public void setPermissionUrl(String permissionUrl) {
        this.permissionUrl = permissionUrl;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(String permissionType) {
        this.permissionType = permissionType;
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

}