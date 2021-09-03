package com.carbontest.APIServer.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 系统菜单表(TMenu)实体类
 *
 * @author makejava
 * @since 2021-07-15 10:11:30
 */
public class TMenu implements Serializable {
    private static final long serialVersionUID = -50736185314137188L;
    
    private Long id;
    
    private String menuCode;
    /**
    * 菜单项名称
    */
    private String menuItem;
    /**
    * 上级菜单序号
    */
    private String topMenuItemCode;
    
    private Integer level;
    
    private Integer ordinal;
    
    private String permissionCode;
    
    private Object status;
    
    private Date createTime;
    
    private Date updateTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    public String getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(String menuItem) {
        this.menuItem = menuItem;
    }

    public String getTopMenuItemCode() {
        return topMenuItemCode;
    }

    public void setTopMenuItemCode(String topMenuItemCode) {
        this.topMenuItemCode = topMenuItemCode;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(Integer ordinal) {
        this.ordinal = ordinal;
    }

    public String getPermissionCode() {
        return permissionCode;
    }

    public void setPermissionCode(String permissionCode) {
        this.permissionCode = permissionCode;
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