package com.carbontest.APIServer.Transaction;

import com.alibaba.fastjson.JSONObject;
import com.carbontest.APIServer.BaseLoginTest;
import com.carbontest.APIServer.BaseTest;
import com.carbontest.APIServer.Bean.Transaction.checkTransactionBean;
import com.carbontest.APIServer.Utils.JsonUtil;
import com.carbontest.APIServer.Utils.TestngListener;
import com.carbontest.APIServer.Utils.YamlDataHelper;
import com.carbontest.APIServer.entity.TTransaction;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.Header;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

@Slf4j
@Listeners({TestngListener.class})
public class checkTransactionTest extends BaseTest {


    public Integer transactionid;
    public Header[] headers;

    @BeforeClass(alwaysRun = true)
    public void setHeaderAnduserId(){
        //获取header
        this.headers= new BaseLoginTest().loginnormaltest("admin","Shumei123");

        //获取资产id
        TTransaction query=new TTransaction();
        query.setSellerName("新增公司0001");
        query.setBuyerName("服务商公司0000");

        List<TTransaction> transactionidlist=tTransactionService.queryAll(query);

        TTransaction tTransaction= transactionidlist.get(0);
        this.transactionid=tTransaction.getId();

    }

    @Test(dataProvider = "addparam",description = "交易审核测试")
    public Integer checktransactiontest(checkTransactionBean checkTransactionBean, String result){

        Integer i=0;
        log.info("开始执行---------");

        try{

            log.info("准备开始---------");
            JSONObject response=this.checkTransactionService.checktransaction(checkTransactionBean,result,this.headers);
            log.info(JsonUtil.jsonobject2Jsonstring(response));
            i=1;
        }catch (IOException e){
            log.info("开始执行---------");
            e.printStackTrace();
        }

        //核对审核状态
        TTransaction query=new TTransaction();
        query.setSellerName("新增公司0001");
        query.setBuyerName("服务商公司0000");

        List<TTransaction> transactionidlist=tTransactionService.queryAll(query);

        TTransaction tTransaction= transactionidlist.get(0);

        int status=tTransaction.getStatus();
        log.info("获取状态："+status);

        Assert.assertEquals(status,1,"状态校验正常");


        return i;
    }


    @DataProvider(name = "addparam")
    public Object[][] addparam()  {

        return getData("checktransactionnormal");

    }

    public  Object[][] getData(String casename){
        JSONObject jsonresult=new YamlDataHelper().getYamlDataByCase("Transaction","checkTransactionData",casename);


        String expectedresult=jsonresult.getString("expectedresult");

        JSONObject param=jsonresult.getJSONObject("params");

        checkTransactionBean checkTransactionBean=param.toJavaObject(checkTransactionBean.class);

        checkTransactionBean.setId(this.transactionid);



        return new Object[][]{{
                checkTransactionBean,
                expectedresult
        },};

    }



}
