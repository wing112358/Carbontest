package com.carbontest.APIServer.controller;

import com.carbontest.APIServer.Service.TProjectService;
import com.carbontest.APIServer.entity.TProject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 项目表(TProject)表控制层
 *
 * @author makejava
 * @since 2021-07-15 10:11:14
 */
@RestController
@RequestMapping("tProject")
public class TProjectController {
    /**
     * 服务对象
     */
    @Resource
    private TProjectService tProjectService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TProject selectOne(Integer id) {
        return this.tProjectService.queryById(id);
    }

}