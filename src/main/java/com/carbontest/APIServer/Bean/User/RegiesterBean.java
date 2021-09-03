package com.carbontest.APIServer.Bean.User;


import com.carbontest.APIServer.Bean.common.Request;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *注册参数实体
 */

@Data
@AllArgsConstructor
public class RegiesterBean extends Request {

    /**
     *用户名
     */
    private String username;

    /**
     *验证码
     */
    private String code;

    /**
     *登录密码
     */
    private String password;

    /**
     *地址
     */
    private String address;

    /**
     *营业执照
     */
    private String businessLicense;

    /**
     *公司名称
     */
    private String companyName;

    /**
     *联系方式
     */
    private String contact;

    /**
     *法人姓名
     */
    private String legalPerson;

    /**
     *法人身份证
     */
    private String legalPersonIdCard;

    /**
     *邮箱
     */
    private String mail;

    /**
     *手机号
     */
    private String phone;

    /**
     *设备id
     */
    private Integer servicerId;

    /**
     *社会信用代码
     */
    private String socialCreditCode;


}
