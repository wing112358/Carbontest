package com.carbontest.APIServer.Company;

import com.alibaba.fastjson.JSONObject;
import com.carbontest.APIServer.BaseLoginTest;
import com.carbontest.APIServer.BaseTest;
import com.carbontest.APIServer.Bean.Company.CheckCompanyBean;
import com.carbontest.APIServer.Utils.JsonUtil;
import com.carbontest.APIServer.Utils.TestngListener;
import com.carbontest.APIServer.Utils.YamlDataHelper;
import com.carbontest.APIServer.entity.TCompany;
import com.carbontest.APIServer.entity.TUser;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.Header;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

import static java.sql.Types.NULL;

@Slf4j
@Listeners({TestngListener.class})
public class checkCompanyTest extends BaseTest {

    public static final String SERVER_GROUPS = "SERVER_GROUPS";
    public Integer SCompanyId;
    public Integer CompanyId;
    public Long ServiceId;
    public Header[] headers;

    @BeforeClass(alwaysRun = true)
    public void setHeaderAnduserId(ITestContext ctx){
        //获取header
        this.headers= new BaseLoginTest().loginnormaltest("admin","Shumei123");
        //获取ServiceId
        TUser tuser=tUserService.queryByUsername("17826830021");
        this.ServiceId= tuser.getUserId();

        //获取CompanyId
//        this.CompanyId= (Integer) ctx.getAttribute(accountRegiesterTest.SERVER_GROUPS);
        TCompany querys=new TCompany();
        querys.setPhone("17826830021");
        TCompany tCompany=tCompanyService.queryAll(querys);
        this.SCompanyId=tCompany.getId();

        TCompany querym=new TCompany();
        querym.setPhone("19155608659");
        TCompany tCompany1=tCompanyService.queryAll(querym);
        this.CompanyId=tCompany1.getId();

    }



    @Test(dataProvider = "addparams",description = "服务商公司审核测试" ,groups = "normalchec")
    public Integer checkcompanystest(CheckCompanyBean checkCompanyBean, String result) throws InterruptedException {

        Integer i=0;
        log.info("开始执行---------");

        try{

            log.info("准备开始---------");
            JSONObject response=this.checkCompanyservice.checkcompany(checkCompanyBean,result,this.headers);
            log.info(JsonUtil.jsonobject2Jsonstring(response));
            i=1;
        }catch (IOException e){
            log.info("开始执行---------");
            e.printStackTrace();
        }

        //校验是否已审核完成
        TCompany query=new TCompany();
        query.setPhone("17826830021");
        TCompany tCompany=tCompanyService.queryAll(query);


        String businessId=tCompany.getBusinessId();
        int status=tCompany.getStatus();
        log.info("获取的审核id："+businessId+"-------"+"获取的状态："+status);

        Assert.assertNotNull(businessId,"审核记录写入异常");
        Assert.assertEquals(status, 1,"状态更改异常");

        return i;
    }

    @Test(dataProvider = "addparamm",description = "卖家公司审核测试" ,groups = "normalchec")
    public Integer checkcompanymtest(CheckCompanyBean checkCompanyBean, String result) throws InterruptedException {

        Integer i=0;
        log.info("开始执行---------");

        try{

            log.info("准备开始---------");
            JSONObject response=this.checkCompanyservice.checkcompany(checkCompanyBean,result,this.headers);
            log.info(JsonUtil.jsonobject2Jsonstring(response));
            i=1;
        }catch (IOException e){
            log.info("开始执行---------");
            e.printStackTrace();
        }

        //校验是否已审核完成
        TCompany query=new TCompany();
        query.setPhone("19155608659");
        TCompany tCompany=tCompanyService.queryAll(query);

        String businessId=tCompany.getBusinessId();
        int status=tCompany.getStatus();
        log.info("获取的审核id："+businessId+"------"+"获取的状态："+status);


        Assert.assertNotNull(businessId,"审核记录写入异常");
        Assert.assertEquals(status, 1,"状态更改异常");

        return i;
    }


    @DataProvider(name = "addparams")
    public Object[][] addparams()  {

        return getData("checkcompanysnormal");

    }
    @DataProvider(name = "addparamm")
    public Object[][] addparamm()  {

        return getDatam("checkcompanymnormal");

    }

    public  Object[][] getData(String casename){
        JSONObject jsonresult=new YamlDataHelper().getYamlDataByCase("Company","checkCompanyData",casename);


        String expectedresult=jsonresult.getString("expectedresult");

        JSONObject param=jsonresult.getJSONObject("params");

        CheckCompanyBean checkCompanyBean=param.toJavaObject(CheckCompanyBean.class);

        checkCompanyBean.setId(this.SCompanyId);

        checkCompanyBean.setServicerId(this.ServiceId.toString());



        return new Object[][]{{
            checkCompanyBean,
            expectedresult
        },};

    }

    public  Object[][] getDatam(String casename){
        JSONObject jsonresult=new YamlDataHelper().getYamlDataByCase("Company","checkCompanyData",casename);


        String expectedresult=jsonresult.getString("expectedresult");

        JSONObject param=jsonresult.getJSONObject("params");

        CheckCompanyBean checkCompanyBean=param.toJavaObject(CheckCompanyBean.class);

        checkCompanyBean.setId(this.CompanyId);

        checkCompanyBean.setRatio(NULL);

        checkCompanyBean.setServicerId(this.ServiceId.toString());



        return new Object[][]{{
                checkCompanyBean,
                expectedresult
        },};

    }



}
