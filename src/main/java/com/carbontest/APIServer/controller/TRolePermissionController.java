package com.carbontest.APIServer.controller;

import com.carbontest.APIServer.entity.TRolePermission;
import com.carbontest.APIServer.Service.TRolePermissionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 角色权限关联表(TRolePermission)表控制层
 *
 * @author makejava
 * @since 2021-07-15 10:10:57
 */
@RestController
@RequestMapping("tRolePermission")
public class TRolePermissionController {
    /**
     * 服务对象
     */
    @Resource
    private TRolePermissionService tRolePermissionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TRolePermission selectOne(Long id) {
        return this.tRolePermissionService.queryById(id);
    }

}