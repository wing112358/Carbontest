package com.carbontest.APIServer.controller;

import com.carbontest.APIServer.Service.TPermissionService;
import com.carbontest.APIServer.entity.TPermission;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 权限表(TPermission)表控制层
 *
 * @author makejava
 * @since 2021-07-15 10:11:21
 */
@RestController
@RequestMapping("tPermission")
public class TPermissionController {
    /**
     * 服务对象
     */
    @Resource
    private TPermissionService tPermissionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TPermission selectOne(Long id) {
        return this.tPermissionService.queryById(id);
    }

}