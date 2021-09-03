package com.carbontest.APIServer.Project;

import com.alibaba.fastjson.JSONObject;
import com.carbontest.APIServer.BaseLoginTest;
import com.carbontest.APIServer.BaseTest;
import com.carbontest.APIServer.Bean.Project.ProjectApplyBean;
import com.carbontest.APIServer.Utils.JsonUtil;
import com.carbontest.APIServer.Utils.TestngListener;
import com.carbontest.APIServer.Utils.YamlDataHelper;
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
import java.util.List;
import java.util.Set;

@Slf4j
@Listeners({TestngListener.class})
public class projectApplyTest extends BaseTest {

    public Integer CompanyId;
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

    }


    @Test(dataProvider = "addparam",description = "新建项目测试")
    public Integer projectapplytest(ProjectApplyBean projectApplyBean, String result){

        Integer i=0;
        log.info("开始执行---------");

        try{

            log.info("准备开始---------");
            JSONObject response=this.applyProjectservice.projectapply(projectApplyBean,result,this.headers);
            log.info(JsonUtil.jsonobject2Jsonstring(response));
            i=1;
        }catch (IOException e){
            log.info("开始执行---------");
            e.printStackTrace();
        }

        //校验数据插入
        TProject query=new TProject();
        query.setCompanyId(projectApplyBean.getCompanyId());

        List<TProject> tProjectlist=tProjectService.queryAll(query);

        TProject tProject= tProjectlist.get(0);

        int status=tProject.getStatus();
        String projectname=tProject.getProjectName();
        Boolean flag=projectname.contains("新增项目00");

        Assert.assertEquals(status,0,"状态校验正常");

        Assert.assertTrue(flag,"项目名称校验成功");



        return i;
    }


    @DataProvider(name = "addparam")
    public Object[][] addparam()  {

        return getDataList();

    }

    public  Object[][] getData(String casename){
        JSONObject jsonresult=new YamlDataHelper().getYamlDataByCase("Project","projectApplyData",casename);


        String expectedresult=jsonresult.getString("expectedresult");

        JSONObject param=jsonresult.getJSONObject("params");

        ProjectApplyBean projectApplyBean=param.toJavaObject(ProjectApplyBean.class);



        return new Object[][]{{
            projectApplyBean,
            expectedresult
        },};

    }

    public  Object[][] getDataList(){
        //初始化以及获取值
        Object[][] list=new Object[3][];
        JSONObject jsonresult=new YamlDataHelper().getYamlDataByFilename("Project","projectApplyData");

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

            ProjectApplyBean projectApplyBean=param.toJavaObject(ProjectApplyBean.class);
            projectApplyBean.setCompanyId(this.CompanyId);

            list[i]= new Object[]{projectApplyBean, expectedresult};
            }

        return list;

    }



}
