package com.carbontest.APIServer.controller;

import com.carbontest.APIServer.Service.TRoleService;
import com.carbontest.APIServer.entity.TRole;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 角色表(TRole)表控制层
 *
 * @author makejava
 * @since 2021-07-15 10:11:06
 */
@RestController
@RequestMapping("tRole")
public class TRoleController {
    /**
     * 服务对象
     */
    @Resource
    private TRoleService tRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TRole selectOne(Long id) {
        return this.tRoleService.queryById(id);
    }

}