package com.carbontest.APIServer.entity;

import java.io.Serializable;

/**
 * 服务商企业关系记录表(TGroup)实体类
 *
 * @author makejava
 * @since 2021-07-15 10:11:37
 */
public class TGroup implements Serializable {
    private static final long serialVersionUID = 381497192237837994L;
    
    private Integer id;
    /**
    * 企业ID
    */
    private Long userId;
    /**
    * 服务商ID
    */
    private Long servicerId;


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

    public Long getServicerId() {
        return servicerId;
    }

    public void setServicerId(Long servicerId) {
        this.servicerId = servicerId;
    }

}