package com.carbontest.APIServer.controller;

import com.carbontest.APIServer.entity.TProjectIrec;
import com.carbontest.APIServer.Service.TProjectIrecService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TProjectIrec)表控制层
 *
 * @author makejava
 * @since 2021-08-26 16:11:37
 */
@RestController
@RequestMapping("tProjectIrec")
public class TProjectIrecController {
    /**
     * 服务对象
     */
    @Resource
    private TProjectIrecService tProjectIrecService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TProjectIrec selectOne(Long id) {
        return this.tProjectIrecService.queryById(id);
    }

}