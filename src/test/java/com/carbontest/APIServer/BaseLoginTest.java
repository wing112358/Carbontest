package com.carbontest.APIServer;

import com.alibaba.fastjson.JSONObject;
import com.carbontest.APIServer.Service.User.loginService;
import com.carbontest.APIServer.Utils.JsonUtil;
import com.carbontest.APIServer.Utils.TestngListener;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Slf4j
@Listeners({TestngListener.class})
public class BaseLoginTest extends BaseTest {


    @Test
    public Header[] loginnormaltest(String username,String password){

        JSONObject response=null;

        try{

            log.info("准备开始---------");
            response=new loginService().loginByParam(username,"",password,"操作成功");
            log.info(JsonUtil.jsonobject2Jsonstring(response));



        }catch (Exception e){
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



}
