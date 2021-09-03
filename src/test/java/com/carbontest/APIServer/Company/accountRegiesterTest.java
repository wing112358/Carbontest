package com.carbontest.APIServer.Company;

import com.alibaba.fastjson.JSONObject;
import com.carbontest.APIServer.BaseLoginTest;
import com.carbontest.APIServer.BaseTest;
import com.carbontest.APIServer.Bean.Company.AccountRegiesterBean;
import com.carbontest.APIServer.User.regiesterTest;
import com.carbontest.APIServer.Utils.JsonUtil;
import com.carbontest.APIServer.Utils.TestngListener;
import com.carbontest.APIServer.Utils.YamlDataHelper;
import com.carbontest.APIServer.entity.TCompany;
import com.carbontest.APIServer.entity.TGroup;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.Header;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.*;

import java.io.IOException;

@Slf4j
@Listeners({TestngListener.class})
public class accountRegiesterTest extends BaseTest {
    public static final String SERVER_GROUPS = "SERVER_GROUPS";
    public Integer CompanyId;
    public Long userId;
    public Header[] headers;

    @BeforeClass(alwaysRun = true)
    public void setHeaderAnduserId(ITestContext ctx){
        //获取header
        this.headers= new BaseLoginTest().loginnormaltest("17826830021","123456");
        //获取userId
        this.userId= (long)ctx.getAttribute(regiesterTest.SERVER_GROUPS);

    }

//    @BeforeGroups(groups = {"normalacregie"},alwaysRun = true)
//    public Long setUserId(ITestContext ctx){
//        //获取header
//        this.userId= (long)ctx.getAttribute(regiesterTest.SERVER_GROUPS);
//        return this.userId;
//    }

    @AfterGroups(groups = {"normalacregie"}, alwaysRun=true)
    public void setCompanyId(ITestContext ctx){
        ctx.setAttribute(SERVER_GROUPS, this.CompanyId);
        log.info("请求放置的公司id："+this.CompanyId);
    }



    @Test(dataProvider = "addparam",description = "完善账户信息测试" ,groups = "normalacregie")
    public TCompany accountRegiesterTest(AccountRegiesterBean accountRegiesterBean, String result){

        TCompany tCompany=new TCompany();
        log.info("开始执行---------");

        try{

            log.info("准备开始---------");
            JSONObject response=this.accountRegiesterservice.accountregiester(accountRegiesterBean,result,this.headers);
            log.info(JsonUtil.jsonobject2Jsonstring(response));
        }catch (IOException e){
            log.info("开始执行---------");
            e.printStackTrace();
        }

        //检查公司表落库
        TCompany querycompany=new TCompany();
        querycompany.setUserId(this.userId);
        tCompany=tCompanyService.queryAll(querycompany);

        Assert.assertNotNull(tCompany,"Company落库存在问题");
        this.CompanyId=tCompany.getId();

        //检查公司组表落库
        TGroup querygroup=new TGroup();
        querygroup.setServicerId(this.userId);
        TGroup tGroup=tGroupService.queryAll(querygroup);

        Assert.assertNotNull(tGroup,"Group落库存在问题");

        //更改公司类型

        TCompany updatecompany=new TCompany();
        updatecompany.setUserId(this.userId);
        updatecompany.setRatio(15);
        updatecompany.setType(1);
        int update=tCompanyService.update(updatecompany);
        log.info("更改类型："+update);

        Assert.assertEquals(update,1,"更新公司类型存在问题");


        return tCompany;
    }


    @DataProvider(name = "addparam")
    public Object[][] addparam()  {

        return getData("accountregiesternormal");

    }


    public  Object[][] getData(String casename){
        JSONObject jsonresult=new YamlDataHelper().getYamlDataByCase("Company","accountRegiesterData",casename);


        String expectedresult=jsonresult.getString("expectedresult");

        JSONObject param=jsonresult.getJSONObject("params");

        AccountRegiesterBean accountRegiesterBean=param.toJavaObject(AccountRegiesterBean.class);
        accountRegiesterBean.setServicerId(this.userId.toString());



        return new Object[][]{{
                accountRegiesterBean,
          expectedresult
        },};

    }



}
