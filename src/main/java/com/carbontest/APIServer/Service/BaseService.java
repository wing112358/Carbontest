package com.carbontest.APIServer.Service;

import com.carbontest.APIServer.Bean.common.Environment;
import com.carbontest.APIServer.Utils.EnvironmentUtil;

/**
 * 服务基类
 */
public class BaseService {

    /**
     *
     */
//    @Resource
//    public EnvironmentUtil environmentUtil;

    /**
     *设置环境方法
     */

    public String setUrl( String servicename){

        String BASEURL=new EnvironmentUtil().getUrl(Environment.Test,servicename);
        return BASEURL;
    }
    /**
     *获取请求基础域名
     */
    public String CarbonBaseurl=this.setUrl("carbon");
}
