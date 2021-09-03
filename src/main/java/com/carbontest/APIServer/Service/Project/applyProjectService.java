package com.carbontest.APIServer.Service.Project;

import com.alibaba.fastjson.JSONObject;
import com.carbontest.APIServer.Bean.Project.ProjectApplyBean;
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
 *项目申请服务
 */

@Service
public class applyProjectService extends BaseService {

    String PROJECTAPPLY_URL="/api/project/projectApply";

    public JSONObject projectapply(ProjectApplyBean projectApplyBean, String result, Header[] headers) throws IOException {

        //初始化结果
        JSONObject jsonresult=new JSONObject();

        //发送请求
        Response response=new HttprequestUtil().postJson(CarbonBaseurl+PROJECTAPPLY_URL, projectApplyBean,null,headers);

        //判断返回
        if(response.getStatusCode().equals(200)){
            jsonresult= JsonUtil.jsonstring2Jsonobject(response.getResponseContent());
            ToolsUtil.assertMsgAndData(jsonresult,result);
        }else{
            //失败则打印失败状态码
            Assert.fail("projectapply-正常接口失败，响应为:" + response.getStatusCode());

        }




        return jsonresult;
    }
}
