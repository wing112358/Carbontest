package com.carbontest.APIServer.Service.User;

import com.alibaba.fastjson.JSONObject;
import com.carbontest.APIServer.Bean.User.LoginBean;
import com.carbontest.APIServer.Bean.common.Response;
import com.carbontest.APIServer.Service.BaseService;
import com.carbontest.APIServer.Utils.HttprequestUtil;
import com.carbontest.APIServer.Utils.JsonUtil;
import com.carbontest.APIServer.Utils.ToolsUtil;
import org.springframework.stereotype.Service;
import org.testng.Assert;

import java.io.IOException;

/**
 *登录服务
 */

@Service
public class loginService extends BaseService {

    String LOGIN_URL="/api/user/login";

    public JSONObject login(LoginBean loginBean, String result) throws IOException {

        //初始化结果
        JSONObject jsonresult=new JSONObject();

        //发送请求
        Response response=new HttprequestUtil().postJson(CarbonBaseurl+LOGIN_URL, loginBean,null,null);

        //判断返回
        if(response.getStatusCode().equals(200)){
            jsonresult= JsonUtil.jsonstring2Jsonobject(response.getResponseContent());
            ToolsUtil.assertMsgAndData(jsonresult,result);
        }
        else{
            //失败则打印失败状态码
            Assert.fail("login-正常接口失败，响应为:" + response.getStatusCode());

        }



        return jsonresult;
    }

    public JSONObject loginByParam(String username,String code,String password, String result) throws IOException {

        //初始化结果
        JSONObject jsonresult=new JSONObject();

        LoginBean loginBean=new LoginBean(username,code,password);

        //发送请求
        Response response=new HttprequestUtil().postJson(CarbonBaseurl+LOGIN_URL, loginBean,null,null);

        //判断返回
        if(response.getStatusCode().equals(200)){
            jsonresult= JsonUtil.jsonstring2Jsonobject(response.getResponseContent());
            ToolsUtil.assertMsgAndData(jsonresult,result);
        }
        else{
            //失败则打印失败状态码
            Assert.fail("login-正常接口失败，响应为:" + response.getStatusCode());

        }



        return jsonresult;
    }
}
