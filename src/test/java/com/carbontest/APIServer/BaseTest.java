package com.carbontest.APIServer;

import com.carbontest.APIServer.Service.Asset.issueCheckService;
import com.carbontest.APIServer.Service.Company.accountRegiesterService;
import com.carbontest.APIServer.Service.Company.addCompanyService;
import com.carbontest.APIServer.Service.Company.checkCompanyService;
import com.carbontest.APIServer.Service.Project.applyProjectService;
import com.carbontest.APIServer.Service.Project.checkProjectService;
import com.carbontest.APIServer.Service.Project.issueApplyService;
import com.carbontest.APIServer.Service.*;
import com.carbontest.APIServer.Service.Transaction.addTransactionService;
import com.carbontest.APIServer.Service.Transaction.checkTransactionService;
import com.carbontest.APIServer.Service.User.loginService;
import com.carbontest.APIServer.Service.User.logoutService;
import com.carbontest.APIServer.Service.User.regiesterService;
import com.carbontest.APIServer.Service.User.userinfoService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

import javax.annotation.Resource;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseTest extends AbstractTestNGSpringContextTests {

    /**
     * 重写服务
     */
    @Autowired
    public regiesterService regiesterservice;

    @Autowired
    public loginService loginservice;

    @Autowired
    public logoutService logoutservice;

    @Autowired
    public userinfoService userinfoservice;

    @Autowired
    public accountRegiesterService accountRegiesterservice;

    @Autowired
    public addCompanyService addCompanyservice;

    @Autowired
    public checkCompanyService checkCompanyservice;

    @Autowired
    public applyProjectService applyProjectservice;

    @Autowired
    public checkProjectService checkProjectservice;

    @Autowired
    public issueApplyService issueApplyservice;

    @Autowired
    public issueCheckService issueCheckservice;

    @Autowired
    public addTransactionService addTransactionService;

    @Autowired
    public checkTransactionService checkTransactionService;

    @Resource
    public TApproveRecordService tApproveRecordService;

    @Resource
    public TAssetService tAssetService;

    @Resource
    public TChainRequestRecordService tChainRequestRecordService;

    @Resource
    public TCompanyService tCompanyService;

    @Resource
    public TGroupService tGroupService;

    @Resource
    public TMenuService tMenuService;

    @Resource
    public TPermissionService tPermissionService;

    @Resource
    public TProjectService tProjectService;

    @Resource
    public TProjectCcerService tProjectCcerService;

    @Resource
    public TProjectIrecService tProjectIrecService;
    @Resource
    public TTransactionService tTransactionService;

    @Resource
    public TRolePermissionService tRolePermissionService;

    @Resource
    public TRoleService tRoleService;

    @Resource
    public TUserRoleService tUserRoleService;

    @Resource
    public TUserService tUserService;

    @Resource
    public VirtualKeysetService virtualKeysetService;



}
