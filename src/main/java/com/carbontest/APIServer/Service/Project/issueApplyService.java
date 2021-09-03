package com.carbontest.APIServer.Service.Project;

import com.alibaba.fastjson.JSONObject;
import com.carbontest.APIServer.Bean.Project.IssueApplyBean;
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
 *签发申请服务
 */

@Service
public class issueApplyService extends BaseService {

    String ISSUEAPPLY_URL="/api/project/issueAppliciation";

    public JSONObject issueapply(IssueApplyBean issueApplyBean, String result, Header[] headers) throws IOException {

        //初始化结果
        JSONObject jsonresult=new JSONObject();

        //发送请求
        Response response=new HttprequestUtil().postJson(CarbonBaseurl+ISSUEAPPLY_URL, issueApplyBean,null,headers);

        //判断返回
        if(response.getStatusCode().equals(200)){
            jsonresult= JsonUtil.jsonstring2Jsonobject(response.getResponseContent());
            ToolsUtil.assertMsgAndData(jsonresult,result);
        }else{
            //失败则打印失败状态码
            Assert.fail("projectcheck-正常接口失败，响应为:" + response.getStatusCode());

        }

        return jsonresult;
    }
}
