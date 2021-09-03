package com.carbontest.APIServer.User;

import com.alibaba.fastjson.JSONObject;
import com.carbontest.APIServer.BaseTest;
import com.carbontest.APIServer.Bean.User.RegiesterBean;
import com.carbontest.APIServer.Utils.JsonUtil;
import com.carbontest.APIServer.Utils.TestngListener;
import com.carbontest.APIServer.Utils.YamlDataHelper;
import com.carbontest.APIServer.entity.TUser;
import com.carbontest.APIServer.entity.TUserRole;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.*;

import java.io.IOException;



/**
 * 注册测试方法
 */

@Slf4j
@Listeners({TestngListener.class})
public class regiesterTest extends BaseTest {

    public static final String SERVER_GROUPS = "SERVER_GROUPS";
    public Long normalUserId;



    @AfterGroups(groups = {"normalreg"}, alwaysRun=true)
    public void setUserId(ITestContext ctx){
        ctx.setAttribute(SERVER_GROUPS, normalUserId);
        log.info("请求放置的用户id："+this.normalUserId);
    }


    @Test(dataProvider = "addnormal",description = "注册测试",groups = "normalreg")
    public TUser regiestertest(RegiesterBean regiesterBean, String result){


        //发送请求
        TUser tUser=new TUser();
        try{
            JSONObject response=this.regiesterservice.regiester(regiesterBean,result);
            log.info(JsonUtil.jsonobject2Jsonstring(response));
            //校验落库
            //查询user表
            tUser=tUserService.queryByUsername(regiesterBean.getUsername());
            Assert.assertEquals(tUser.getType(),2,"用户类型校验错误");
            this.normalUserId=tUser.getUserId();
            log.info("请求中获取的用户id："+this.normalUserId);


            //检查userrole
            TUserRole tUserRole=tUserRoleService.queryByUserId(tUser.getUserId());
            Assert.assertEquals(tUserRole.getRoleCode(),"seller","角色类型校验错误");

            //更改用户类型
            TUser updateuser=new TUser();
            updateuser.setId(tUser.getId());
            updateuser.setType(1);
            TUser updateuserflag=tUserService.update(updateuser);
            if((Integer)updateuserflag.getType()==1){
                log.info("用户表更新成功");
            }

            //更改角色表
            TUserRole updateuserrole=new TUserRole();
            updateuserrole.setId(tUserRole.getId());
            updateuserrole.setRoleCode("servicer");
            TUserRole updateroleflag=tUserRoleService.update(updateuserrole);
            if(updateroleflag.getRoleCode().equals("servicer")){
                log.info("角色表更新成功");
            }


        }catch (IOException e){
            e.printStackTrace();
        }

        return tUser;
    }


    @DataProvider(name = "addnormal")
    public Object[][] addparam()  {

        return getData("regiesternormal");

    }






    //获取yaml数据
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
