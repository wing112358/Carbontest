package com.carbontest.APIServer.Asset;

import cn.hutool.core.util.ArrayUtil;
import com.alibaba.fastjson.JSONObject;
import com.carbontest.APIServer.BaseLoginTest;
import com.carbontest.APIServer.BaseTest;
import com.carbontest.APIServer.Bean.Asset.IssueCheckBean;
import com.carbontest.APIServer.Utils.JsonUtil;
import com.carbontest.APIServer.Utils.TestngListener;
import com.carbontest.APIServer.Utils.YamlDataHelper;
import com.carbontest.APIServer.entity.TAsset;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.Header;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.*;

@Slf4j
@Listeners({TestngListener.class})
public class checkIssueTest extends BaseTest {

    public List<Map<String,Integer>> assetlist= new ArrayList<Map<String,Integer>>();
    public Header[] headers;

    @BeforeClass(alwaysRun = true)
    public void setHeaderAnduserId(){
        //获取header
        this.headers= new BaseLoginTest().loginnormaltest("admin","Shumei123");

        //获取资产Id列表
        TAsset querya=new TAsset();
        querya.setCompanyName("新增公司0001");
        List<TAsset> tAssets=tAssetService.queryAllList(querya);
        Object[] tassetlist=tAssets.toArray();
        for(int i=0;i<tassetlist.length;i++) {
            TAsset tAsset = ArrayUtil.get(tassetlist, i);
            Map<String, Integer> map = new HashMap<String, Integer>();
            map.put("id", tAsset.getId());
            map.put("type", tAsset.getProjectType());
            this.assetlist.add(i, map);
        }

    }

    @Test(dataProvider = "addparam",description = "资产审核测试")
    public Integer checkassettest(IssueCheckBean issueCheckBean, String result){

        Integer i=0;
        log.info("开始执行---------");

        try{

            log.info("准备开始---------");
            JSONObject response=this.issueCheckservice.issuecheck(issueCheckBean,result,this.headers);
            log.info(JsonUtil.jsonobject2Jsonstring(response));
            i=1;
        }catch (IOException e){
            log.info("开始执行---------");
            e.printStackTrace();
        }

        //校验资产表

        TAsset query=new TAsset();
        query.setId(issueCheckBean.getId());
        query.setQuantity(issueCheckBean.getApplicationIssuance());

        TAsset tAsset=tAssetService.queryAll(query);
        Assert.assertEquals((int)tAsset.getStatus(),1,"状态校验不一致");

        return i;
    }


    @DataProvider(name = "addparam")
    public Object[][] addparam()  {

        return getData();

    }

    public  Object[][] getData(){
        Object[][] result=new Object[3][];

        JSONObject jsonresult=new YamlDataHelper().getYamlDataByFilename("Asset","checkIssueData");

        JSONObject value;

        //获取第一层key值
        Set<String> keys=jsonresult.keySet();
        Object[] keysa=keys.toArray();

        for(int i=0;i<keysa.length;i++){
            String key=keysa[i].toString();
            value=(JSONObject) jsonresult.get(key);
            log.info("循环i值："+i);
            log.info("当前key值："+key);

            String expectedresult=value.getString("expectedresult");

            JSONObject param=value.getJSONObject("params");

            IssueCheckBean issueCheckBean=param.toJavaObject(IssueCheckBean.class);

            for(int j=0;j<3;j++){
                Integer type= this.assetlist.get(j).get("type");
                switch (keysa[i].toString()){
                    case "ccerapplynormal" :
                        //语句
                        if(type==0){
                            issueCheckBean.setId(this.assetlist.get(j).get("id"));
                        }
                        break; //可选
                    case "irecapplynormal" :
                        //语句
                        if(type==2){
                            issueCheckBean.setId(this.assetlist.get(j).get("id"));
                        }
                        break; //可选
                    case "tphapplynormal" :
                        //语句
                        if(type==1){
                            issueCheckBean.setId(this.assetlist.get(j).get("id"));
                        }
                        break; //可选
                    default :
                        log.info("错误用例名称");
                }
            }

            result[i]= new Object[]{issueCheckBean, expectedresult};
        }



        return result;

    }



}
