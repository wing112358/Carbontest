package com.carbontest.APIServer.controller;

import com.carbontest.APIServer.Service.TUserRoleService;
import com.carbontest.APIServer.entity.TUserRole;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 用户角色关联表(TUserRole)表控制层
 *
 * @author makejava
 * @since 2021-07-15 10:07:19
 */
@RestController
@RequestMapping("tUserRole")
public class TUserRoleController {
    /**
     * 服务对象
     */
    @Resource
    private TUserRoleService tUserRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TUserRole selectOne(Long id) {
        return this.tUserRoleService.queryById(id);
    }

}