package com.carbontest.APIServer.entity;

import java.io.Serializable;

/**
 * (VirtualKeyset)实体类
 *
 * @author makejava
 * @since 2021-07-15 10:08:26
 */
public class VirtualKeyset implements Serializable {
    private static final long serialVersionUID = -68016666940435669L;
    
    private Integer id;
    
    private String userId;
    
    private String privateKey;
    
    private String publicKey;
    
    private String address;
    
    private String type;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}