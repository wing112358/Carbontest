package com.carbontest.APIServer.User;

import com.alibaba.fastjson.JSONObject;
import com.carbontest.APIServer.BaseTest;
import com.carbontest.APIServer.Bean.User.LoginBean;
import com.carbontest.APIServer.Utils.JsonUtil;
import com.carbontest.APIServer.Utils.TestngListener;
import com.carbontest.APIServer.Utils.YamlDataHelper;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

@Slf4j
@Listeners({TestngListener.class})
public class loginTest extends BaseTest {


    @Test(dataProvider = "addparam",description = "登录测试")
    public Header[] logintest(LoginBean loginBean, String result){

        JSONObject response=null;

        try{

            log.info("准备开始---------");
            response=this.loginservice.login(loginBean,result);
            log.info(JsonUtil.jsonobject2Jsonstring(response));



        }catch (IOException e){
            log.info("开始执行---------");
            e.printStackTrace();
        }

        //获取
        JSONObject data=response.getJSONObject("data");

        log.info("此处为返回的data:"+ data.toString());
        String tokenHead = data.getString("tokenHead");
        String cookievalue = data.getString("token");

        String Authorization = tokenHead + cookievalue;
        log.info("token:"+Authorization);
        Header[] headers = {new BasicHeader("Authorization", Authorization)};
        return headers;
    }



    @DataProvider(name = "addparam")
    public Object[][] addparam()  {

        return getData("loginnormal");

    }

    public  Object[][] getData(String casename){
        JSONObject jsonresult=new YamlDataHelper().getYamlDataByCase("User","loginData",casename);


        String expectedresult=jsonresult.getString("expectedresult");

        JSONObject param=jsonresult.getJSONObject("params");

        LoginBean loginBean=param.toJavaObject(LoginBean.class);



        return new Object[][]{{
            loginBean,
            expectedresult
        },};

    }



}
