package com.carbontest.APIServer.User;

import com.alibaba.fastjson.JSONObject;
import com.carbontest.APIServer.BaseTest;
import com.carbontest.APIServer.Bean.User.RegiesterBean;
import com.carbontest.APIServer.Utils.JsonUtil;
import com.carbontest.APIServer.Utils.TestngListener;
import com.carbontest.APIServer.Utils.YamlDataHelper;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

@Slf4j
@Listeners({TestngListener.class})
public class logoutTest extends BaseTest {

    @Test(dataProvider = "addparam",description = "注册测试")
    public Integer regiestertest(RegiesterBean regiesterBean, String result){

        Integer i=0;
        log.info("开始执行---------");

        try{

            log.info("准备开始---------");
            JSONObject response=this.regiesterservice.regiester(regiesterBean,result);
            log.info(JsonUtil.jsonobject2Jsonstring(response));
            i=1;
        }catch (IOException e){
            log.info("开始执行---------");
            e.printStackTrace();
        }

        return i;
    }


    @DataProvider(name = "addparam")
    public Object[][] addparam()  {

        return getData("");

    }

    public  Object[][] getData(String casename){
        JSONObject jsonresult=new YamlDataHelper().getYamlDataByCase("User","regiesterData",casename);


        String expectedresult=jsonresult.getString("expectedresult");

        JSONObject param=jsonresult.getJSONObject("params");

        RegiesterBean regiesterBean=param.toJavaObject(RegiesterBean.class);



        return new Object[][]{{
          regiesterBean,
          expectedresult
        },};

    }



}
