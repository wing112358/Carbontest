package com.carbontest.APIServer.controller;

import com.carbontest.APIServer.entity.TProjectCcer;
import com.carbontest.APIServer.Service.TProjectCcerService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TProjectCcer)表控制层
 *
 * @author makejava
 * @since 2021-08-26 16:11:25
 */
@RestController
@RequestMapping("tProjectCcer")
public class TProjectCcerController {
    /**
     * 服务对象
     */
    @Resource
    private TProjectCcerService tProjectCcerService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TProjectCcer selectOne(Long id) {
        return this.tProjectCcerService.queryById(id);
    }

}