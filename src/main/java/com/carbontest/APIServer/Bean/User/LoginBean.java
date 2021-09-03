package com.carbontest.APIServer.Bean.User;


import com.carbontest.APIServer.Bean.common.Request;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 登录参数实体
 */

@Data
@AllArgsConstructor
public class LoginBean extends Request {

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


}
