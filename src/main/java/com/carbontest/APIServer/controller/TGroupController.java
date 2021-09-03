package com.carbontest.APIServer.controller;

import com.carbontest.APIServer.Service.TGroupService;
import com.carbontest.APIServer.entity.TGroup;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 服务商企业关系记录表(TGroup)表控制层
 *
 * @author makejava
 * @since 2021-07-15 10:11:37
 */
@RestController
@RequestMapping("tGroup")
public class TGroupController {
    /**
     * 服务对象
     */
    @Resource
    private TGroupService tGroupService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TGroup selectOne(Integer id) {
        return this.tGroupService.queryById(id);
    }

}