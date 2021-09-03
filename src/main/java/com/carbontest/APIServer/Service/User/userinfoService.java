package com.carbontest.APIServer.Service.User;

import com.alibaba.fastjson.JSONObject;
import com.carbontest.APIServer.Bean.User.UserinfoBean;
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
 *获取用户信息服务
 */

@Service
public class userinfoService extends BaseService {

    String USERINFO_URL="\n" + "/api/user/getUserByToken";

    public JSONObject userinfo(UserinfoBean userinfoBean, String result, Header[] headers) throws IOException {

        //初始化结果
        JSONObject jsonresult=new JSONObject();

        //发送请求
        Response response=new HttprequestUtil().get(CarbonBaseurl+USERINFO_URL, userinfoBean,null,headers);

        //判断返回
        if(response.getStatusCode().equals(200)){
            jsonresult= JsonUtil.jsonstring2Jsonobject(response.getResponseContent());
            ToolsUtil.assertMsgAndData(jsonresult,result);
        }
        else{
            //失败则打印失败状态码
            Assert.fail("userinfo-正常接口失败，响应为:" + response.getStatusCode());
        }



        return jsonresult;
    }
}
