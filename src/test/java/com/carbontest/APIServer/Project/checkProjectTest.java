package com.carbontest.APIServer.Project;

import cn.hutool.core.util.ArrayUtil;
import com.alibaba.fastjson.JSONObject;
import com.carbontest.APIServer.BaseLoginTest;
import com.carbontest.APIServer.BaseTest;
import com.carbontest.APIServer.Bean.Project.ProjectCheckBean;
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
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Listeners({TestngListener.class})
public class checkProjectTest extends BaseTest {


    public Integer CompanyId;
    public List<Integer> projectlist;
    public Header[] headers;

    @BeforeClass(alwaysRun = true)
    public void setHeaderAnduserId(){
        //获取header
        this.headers= new BaseLoginTest().loginnormaltest("admin","Shumei123");

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
        this.projectlist=new ArrayList<Integer>();
        for(int i=0;i<tProjectlist.length;i++){
            TProject tProject=ArrayUtil.get(tProjectlist,i);
            this.projectlist.add(i, tProject.getId());
        }

    }

    @Test(dataProvider = "addparam",description = "项目审核测试")
    public Integer checkprojecttest(ProjectCheckBean projectCheckBean, String result){

        Integer i=0;
        log.info("开始执行---------");

        try{

            log.info("准备开始---------");
            JSONObject response=this.checkProjectservice.projectcheck(projectCheckBean,result,this.headers);
            log.info(JsonUtil.jsonobject2Jsonstring(response));
            i=1;
        }catch (IOException e){
            log.info("开始执行---------");
            e.printStackTrace();
        }

        //核对审核状态
        TProject query=new TProject();
        query.setId(projectCheckBean.getId());

        List<TProject> tProjectlist=tProjectService.queryAll(query);

        TProject tProject= tProjectlist.get(0);

        int status=tProject.getStatus();
        log.info("获取状态："+status);
        String projectname=tProject.getProjectName();
        Boolean flag=projectname.contains("新增项目00");

        Assert.assertEquals(status,1,"状态校验正常");

        Assert.assertTrue(flag,"项目名称校验成功");

        return i;
    }


    @DataProvider(name = "addparam")
    public Object[][] addparam()  {

        return getData("checkprojectnormal");

    }

    public  Object[][] getData(String casename){
        Object[][] result=new Object[3][];
        JSONObject jsonresult=new YamlDataHelper().getYamlDataByCase("Project","checkProjectData",casename);


        String expectedresult=jsonresult.getString("expectedresult");

        JSONObject param=jsonresult.getJSONObject("params");



        for(int i=0;i<this.projectlist.size();i++){
            Integer id=this.projectlist.get(i);
            ProjectCheckBean projectCheckBean=param.toJavaObject(ProjectCheckBean.class);
            projectCheckBean.setId(id);
            result[i]=new Object[]{projectCheckBean, expectedresult};
        }



        return result;

    }



}
