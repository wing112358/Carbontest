package com.carbontest.APIServer.Bean.common;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.Header;
import org.apache.http.client.CookieStore;

import java.util.Arrays;

/**
 * 接口返回实体
 * @author wing
 */

@Data
@Slf4j
public class Response {
    /**
     * 状态码
     */
    private Integer statusCode;

    /**
     * 返回体内容
     */
    private String responseContent;

    /**
     * 返回cookie
     */
    private CookieStore cookies;

    /**
     * 返回header
     */
    private Header[] headers;

    /**
     * 赋值方法及打印
     */
    public Response(int statusCode,String responseContent,CookieStore cookies,Header[] headers){
        this.statusCode=statusCode;
        this.responseContent=responseContent;
        this.cookies=cookies;
        this.headers=headers;
        log.info("返回的状态码statusCode:" + statusCode);
        log.info("返回内容responseContent:" + responseContent);
        log.info("返回cookies:" + cookies.toString());
        log.info("返回headers:" + Arrays.deepToString(headers));
    }

}
