package com.carbontest.APIServer.entity;

import java.io.Serializable;

/**
 * 用户角色关联表(TUserRole)实体类
 *
 * @author makejava
 * @since 2021-07-15 10:07:15
 */
public class TUserRole implements Serializable {
    private static final long serialVersionUID = 908273983093641883L;
    
    private Long id;
    /**
    * 用户ID
    */
    private Long userId;
    /**
    * 角色编码
    */
    private String roleCode;


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

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

}