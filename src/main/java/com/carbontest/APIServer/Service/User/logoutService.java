package com.carbontest.APIServer.Service.User;

import com.alibaba.fastjson.JSONObject;
import com.carbontest.APIServer.Bean.User.LogoutBean;
import com.carbontest.APIServer.Bean.common.Response;
import com.carbontest.APIServer.Service.BaseService;
import com.carbontest.APIServer.Utils.HttprequestUtil;
import com.carbontest.APIServer.Utils.JsonUtil;
import com.carbontest.APIServer.Utils.ToolsUtil;
import org.apache.http.Header;
import org.springframework.stereotype.Service;
import org.testng.Assert;

import java.io.IOException;

/**
 *登出服务
 */

@Service
public class logoutService extends BaseService {

    String LOGOUT_URL="/api/user/logout";

    public JSONObject logout(LogoutBean logoutBean, String result, Header[] headers) throws IOException {

        //初始化结果
        JSONObject jsonresult=new JSONObject();

        //发送请求
        Response response=new HttprequestUtil().postJson(CarbonBaseurl+LOGOUT_URL, logoutBean,null,headers);

        //判断返回
        if(response.getStatusCode().equals(200)){
            jsonresult= JsonUtil.jsonstring2Jsonobject(response.getResponseContent());
            ToolsUtil.assertMsgAndData(jsonresult,result);
        }
        else{
            //失败则打印失败状态码
            Assert.fail("logout-正常接口失败，响应为:" + response.getStatusCode());
        }



        return jsonresult;
    }
}
