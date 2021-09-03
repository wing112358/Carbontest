package com.carbontest.APIServer.Service.User;

import com.carbontest.APIServer.Bean.User.RegiesterBean;
import com.carbontest.APIServer.Bean.common.Response;
import com.carbontest.APIServer.Service.BaseService;
import com.carbontest.APIServer.Utils.HttprequestUtil;
import com.carbontest.APIServer.Utils.JsonUtil;
import com.carbontest.APIServer.Utils.ToolsUtil;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;
import org.testng.Assert;

import java.io.IOException;

/**
 *注册服务
 */

@Service
public class regiesterService extends BaseService {

    String REGIESTER_URL="/api/user/registered";

    public JSONObject regiester(RegiesterBean regiesterBean, String result) throws IOException {

        //初始化结果
        JSONObject jsonresult=new JSONObject();

        //发送请求
        Response response=new HttprequestUtil().postJson(CarbonBaseurl+REGIESTER_URL, regiesterBean,null,null);

        //判断返回
        if(response.getStatusCode().equals(200)){
            jsonresult= JsonUtil.jsonstring2Jsonobject(response.getResponseContent());
            ToolsUtil.assertMsgAndData(jsonresult,result);
        }
        else{
            //失败则打印失败状态码
            Assert.fail("regiester-正常接口失败，响应为:" + response.getStatusCode());
        }



        return jsonresult;
    }
}
