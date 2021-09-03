package com.carbontest.APIServer.Common;

import cn.hutool.core.util.ArrayUtil;
import com.carbontest.APIServer.BaseTest;
import com.carbontest.APIServer.entity.*;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
public class suiteCaseTest extends BaseTest {
    public Long serviceid;
    public Integer scompanyId;
    public Integer mcompanyId;
    public Integer transactionid;
    public List<Map<String,Integer>> projectidlist;
    public List<Map<String,Integer>> assetidlist;



    @BeforeClass(alwaysRun = true)
    public void setData(ITestContext ctx){
        this.serviceid=getUserid("17826830021");
        Assert.assertNotNull(this.serviceid,"获取为空");
        log.info("公共获取的服务商id："+this.serviceid);

        this.scompanyId=getCompanyid("17826830021");

        this.mcompanyId=getCompanyid("19155608659");

        this.projectidlist=getProjectidlist(this.mcompanyId);

        this.assetidlist=getAssetidlist("新增公司0001");

        this.transactionid=getTransactionId("新增公司0001","服务商公司0000");
    }


    @Test
    public void just() throws InterruptedException {
        //删除交易信息
        Boolean deltransc=delTransc(this.transactionid);
        log.info("清除交易flag："+deltransc.toString());
        Assert.assertTrue(deltransc,"交易信息清理异常");

        //删除资产信息
        Boolean delasset=delAsset(this.assetidlist);
        log.info("清除资产flag："+delasset.toString());
        Assert.assertTrue(delasset,"资产信息清理异常");

        Thread.sleep(3);

        //删除项目信息
        Boolean delproject=delProject(this.projectidlist);
        log.info("清除项目flag："+delproject.toString());
        Assert.assertTrue(delproject,"项目信息清理异常");

        Thread.sleep(3);

        //清理公司信息
        Boolean delCompflag=delCompany(this.serviceid);
        log.info("清除公司flag："+delCompflag.toString());

        Assert.assertTrue(delCompflag,"公司信息清理异常");

        Thread.sleep(3);

        //删除服务商账户信息
        Boolean delUserflag=delUserAndRole(this.serviceid);
        log.info("清除用户flag："+delUserflag.toString());

        Assert.assertTrue(delUserflag,"服务商用户信息清理异常");
    }

    //获取userId
    public Long getUserid(String username){
        Long userId = null;

        try {
            TUser tuser=tUserService.queryByUsername(username);
            userId= tuser.getUserId();
        }catch (Exception e){
            e.printStackTrace();
        }


        return userId;
    }

    //获取companyId
    public Integer getCompanyid(String phone){
        Integer companyId=null;

        try {
            TCompany query=new TCompany();
            query.setPhone(phone);

            TCompany tCompany=tCompanyService.queryAll(query);
            companyId= tCompany.getId();
        }catch (Exception e){
            e.printStackTrace();
        }


        return companyId;
    }

    public List<Map<String,Integer>> getProjectidlist(Integer companyId){
        List<Map<String,Integer>> projectlist = new ArrayList<Map<String,Integer>>();
        try{
            TProject queryp=new TProject();
            queryp.setCompanyId(companyId);
            List<TProject> tProjects=tProjectService.queryAll(queryp);
            Object[] tProjectlist=tProjects.toArray();
            for(int i=0;i<tProjectlist.length;i++){
                TProject tProject= ArrayUtil.get(tProjectlist,i);
                Map<String,Integer> map = new HashMap<String, Integer>();
                map.put("id",tProject.getId());
                map.put("type",tProject.getProjectType());
                projectlist.add(i, map);
            }

        }catch (Exception e){
            e.printStackTrace();
        }



        return projectlist;

    }

    public List<Map<String,Integer>> getAssetidlist(String companyname){
        List<Map<String,Integer>> assetlist=new ArrayList<Map<String,Integer>>();
        TAsset querya=new TAsset();
        querya.setCompanyName(companyname);
        List<TAsset> tAssets=tAssetService.queryAllList(querya);
        Object[] tassetlist=tAssets.toArray();
        for(int i=0;i<tassetlist.length;i++) {
            TAsset tAsset = ArrayUtil.get(tassetlist, i);
            Map<String, Integer> map = new HashMap<String, Integer>();
            map.put("id", tAsset.getId());
            map.put("type", tAsset.getProjectType());
            assetlist.add(i, map);
        }
        return assetlist;
    }

    public Integer getTransactionId(String sellername,String buyername){
        Integer id;
        TTransaction query=new TTransaction();
        query.setSellerName(sellername);
        query.setBuyerName(buyername);
        query.setStatus(1);

        List<TTransaction> transactionidlist=tTransactionService.queryAll(query);

        TTransaction tTransaction= transactionidlist.get(0);
        return  id=tTransaction.getId();
    }


    //清理账户数据
    public Boolean delUserAndRole(Long userid){
        Boolean delflag=false;
        try {

            //删除角色
            Boolean delrole=tUserRoleService.deleteByUserId(userid);
            log.info("清除角色关联："+delrole.toString());


            //删除用户
            Boolean deluser=tUserService.deleteByUserId(userid);
            log.info("清除用户："+deluser.toString());


            if(deluser&&delrole){
                delflag=true;
                log.info("用户信息清理成功");
            }

        }catch (Exception e){
            log.info("删除执行异常"+e);
        }

        return delflag;
    }

    //清理公司数据
    public Boolean delCompany(Long userid){
        Boolean delflag=false;
        try {

            //删除company
            Boolean delcomp=tCompanyService.deleteByUserId(userid);
            log.info("清除company："+delcomp.toString());

            //清除groups
            Boolean delgroup=tGroupService.deleteByUserId(userid);
            log.info("清除group："+delgroup.toString());

            if(delcomp&&delgroup){
                delflag=true;
                log.info("公司信息清理成功");
            }

        }catch (Exception e){
            log.info("删除执行异常"+e);
        }

        return delflag;
    }

    //清理项目数据
    public Boolean delProject(List<Map<String,Integer>> list){
        Boolean flag=false;
        for(int i=0;i<3;i++){
            Integer type= list.get(i).get("type");
            switch(type){
                case 0 :
                    //清除project表和CCER表
                    Boolean delpro=tProjectService.deleteById(list.get(i).get("id"));
                    log.info("清除project0："+delpro.toString());
                    Assert.assertTrue(delpro,"普通项目信息清理异常");
                    TProjectCcer queryc=new TProjectCcer();
                    queryc.setProjectId(list.get(i).get("id"));
                    TProjectCcer tProjectCcer=tProjectCcerService.queryAll(queryc);
                    Long projectid=tProjectCcer.getId();
                    Boolean delccer=tProjectCcerService.deleteById(projectid);
                    log.info("清除ccerproject："+delccer.toString());
                    Assert.assertTrue(delccer,"CCER项目信息清理异常");
                    flag=true;
                    break; //可选
                case 1 :
                    //清除project表和backup表
                    Boolean delpro1=tProjectService.deleteById(list.get(i).get("id"));
                    log.info("清除project1："+delpro1.toString());
                    Assert.assertTrue(delpro1,"普通项目信息清理异常");
                    flag=true;
                    break; //可选
                case 2 :
                    //清除project表和IREC表
                    Boolean delpro2=tProjectService.deleteById(list.get(i).get("id"));
                    log.info("清除project2："+delpro2.toString());
                    Assert.assertTrue(delpro2,"普通项目信息清理异常");
                    TProjectIrec queryi=new TProjectIrec();
                    queryi.setProjectId(list.get(i).get("id"));
                    TProjectIrec tProjectIrec=tProjectIrecService.queryAll(queryi);
                    Long projectid1=tProjectIrec.getId();
                    Boolean delirec=tProjectIrecService.deleteById(projectid1);
                    log.info("清除irecproject："+delirec.toString());
                    Assert.assertTrue(delirec,"CCER项目信息清理异常");
                    flag=true;
                    break;
                default : //可选
                    log.info("项目类型错误");
            }
        }
        return flag;

    }

    //清理资产数据
    public Boolean delAsset(List<Map<String,Integer>> list){
        Boolean flag=false;
        for(int i=0;i<3;i++) {

            Boolean delAst=tAssetService.deleteById(list.get(i).get("id"));
            log.info("清除Asset："+delAst.toString());
            Assert.assertTrue(delAst,"资产信息清理异常");
            flag=true;
        }
        return flag;
    }

    public Boolean delTransc(Integer id){
        Boolean flag=false;

        Boolean delTransc=tTransactionService.deleteById(id);
        log.info("清除Transc："+delTransc.toString());
        Assert.assertTrue(delTransc,"交易信息清理异常");
        if(delTransc){
            flag=true;
        }

        return flag;
    }


}
