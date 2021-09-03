package com.carbontest.APIServer.Company;

import com.alibaba.fastjson.JSONObject;
import com.carbontest.APIServer.BaseLoginTest;
import com.carbontest.APIServer.BaseTest;
import com.carbontest.APIServer.Bean.Company.AddCompanyBean;
import com.carbontest.APIServer.Utils.JsonUtil;
import com.carbontest.APIServer.Utils.TestngListener;
import com.carbontest.APIServer.Utils.YamlDataHelper;
import com.carbontest.APIServer.entity.TCompany;
import com.carbontest.APIServer.entity.TUser;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.Header;
import org.testng.ITestContext;
import org.testng.annotations.*;

import java.io.IOException;

@Slf4j
@Listeners({TestngListener.class})
public class addCompanyTest extends BaseTest {
    public static final String SERVER_GROUPS = "SERVER_GROUPS";
    public Long CompanyId;
    public Long ServiceId;
    public Header[] headers;

    @BeforeClass(alwaysRun = true)
    public void setHeader(){
        //获取header
        this.headers= new BaseLoginTest().loginnormaltest("17826830021","123456");
        //获取服务商id
        TUser tuser=tUserService.queryByUsername("17826830021");
        this.ServiceId= tuser.getUserId();
    }

    @AfterGroups(groups = {"normaladdc"}, alwaysRun=true)
    public void setCompanyId(ITestContext ctx){
        ctx.setAttribute(SERVER_GROUPS, this.CompanyId);
        log.info("请求放置的公司id："+this.CompanyId);
    }



    @Test(dataProvider = "addparam",description = "新增公司测试" ,groups = "normaladdc")
    public TCompany addcompanytest(AddCompanyBean addCompanyBean, String result){

        TCompany tCompany=new TCompany();
        log.info("开始执行---------");

        try{

            log.info("准备开始---------");
            JSONObject response=this.addCompanyservice.addcompany(addCompanyBean,result,this.headers);
            log.info(JsonUtil.jsonobject2Jsonstring(response));
        }catch (IOException e){
            log.info("开始执行---------");
            e.printStackTrace();
        }

        return tCompany;
    }


    @DataProvider(name = "addparam")
    public Object[][] addparam()  {

        return getData("addcompanyrnormal");

    }

    public  Object[][] getData(String casename){
        JSONObject jsonresult=new YamlDataHelper().getYamlDataByCase("Company","addCompanyData",casename);


        String expectedresult=jsonresult.getString("expectedresult");

        JSONObject param=jsonresult.getJSONObject("params");

        AddCompanyBean addCompanyBean=param.toJavaObject(AddCompanyBean.class);
        addCompanyBean.setServicerId(this.ServiceId.toString());



        return new Object[][]{{
                addCompanyBean,
          expectedresult
        },};

    }



}
