package com.carbontest.APIServer.Project;

import cn.hutool.core.util.ArrayUtil;
import com.alibaba.fastjson.JSONObject;
import com.carbontest.APIServer.BaseLoginTest;
import com.carbontest.APIServer.BaseTest;
import com.carbontest.APIServer.Bean.Project.IssueApplyBean;
import com.carbontest.APIServer.Utils.JsonUtil;
import com.carbontest.APIServer.Utils.TestngListener;
import com.carbontest.APIServer.Utils.YamlDataHelper;
import com.carbontest.APIServer.entity.TAsset;
import com.carbontest.APIServer.entity.TCompany;
import com.carbontest.APIServer.entity.TProject;
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
public class issueApplyTest extends BaseTest {

    public Integer CompanyId;
    public List<Map<String,Integer>> projectlist= new ArrayList<Map<String,Integer>>();
    public Header[] headers;

    @BeforeClass(alwaysRun = true)
    public void setHeaderAnduserId(){
        //获取header
        this.headers= new BaseLoginTest().loginnormaltest("17826830021","123456");

        //获取CompanyId
        TCompany query=new TCompany();
        query.setPhone("19155608659");
        TCompany tCompany=tCompanyService.queryAll(query);
        this.CompanyId=tCompany.getId();

        //获取项目Id列表
        TProject queryp=new TProject();
        queryp.setCompanyId(this.CompanyId);
        List<TProject> tProjects=tProjectService.queryAll(queryp);
        Object[] tProjectlist=tProjects.toArray();
        for(int i=0;i<tProjectlist.length;i++) {
            TProject tProject = ArrayUtil.get(tProjectlist, i);
            Map<String, Integer> map = new HashMap<String, Integer>();
            map.put("id", tProject.getId());
            map.put("type", tProject.getProjectType());
            this.projectlist.add(i, map);
        }

    }

    @Test(dataProvider = "addparam",description = "签发申请测试")
    public Integer issueapplytest(IssueApplyBean issueApplyBean, String result){

        Integer i=0;
        log.info("开始执行---------");

        try{

            log.info("准备开始---------");
            JSONObject response=this.issueApplyservice.issueapply(issueApplyBean,result,this.headers);
            log.info(JsonUtil.jsonobject2Jsonstring(response));
            i=1;
        }catch (IOException e){
            log.info("开始执行---------");
            e.printStackTrace();
        }

        //校验资产表

            TAsset query=new TAsset();
            query.setProjectId(issueApplyBean.getId());
            query.setQuantity(issueApplyBean.getApplicationIssuance());

            TAsset tAsset=tAssetService.queryAll(query);
            Assert.assertEquals((int)tAsset.getStatus(),0,"状态校验不一致");


        return i;
    }


    @DataProvider(name = "addparam")
    public Object[][] addparam()  {

        return getData();

    }

    public  Object[][] getData(){
        Object[][] result=new Object[3][];

        JSONObject jsonresult=new YamlDataHelper().getYamlDataByFilename("Project","issueApplyData");

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

            IssueApplyBean issueApplyBean=param.toJavaObject(IssueApplyBean.class);

            for(int j=0;j<3;j++){
                Integer type= this.projectlist.get(j).get("type");
                switch (keysa[i].toString()){
                    case "ccerapplynormal" :
                        //语句
                        if(type==0){
                            issueApplyBean.setId(this.projectlist.get(j).get("id"));
                        }
                        break; //可选
                    case "irecapplynormal" :
                        //语句
                        if(type==2){
                            issueApplyBean.setId(this.projectlist.get(j).get("id"));
                        }
                        break; //可选
                    case "tphapplynormal" :
                        //语句
                        if(type==1){
                            issueApplyBean.setId(this.projectlist.get(j).get("id"));
                        }
                        break; //可选
                    default :
                        log.info("错误用例名称");
            }
            }

            result[i]= new Object[]{issueApplyBean, expectedresult};
        }



        return result;

    }



}
