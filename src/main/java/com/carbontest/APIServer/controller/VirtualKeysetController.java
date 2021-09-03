package com.carbontest.APIServer.controller;

import com.carbontest.APIServer.Service.VirtualKeysetService;
import com.carbontest.APIServer.entity.VirtualKeyset;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (VirtualKeyset)表控制层
 *
 * @author makejava
 * @since 2021-07-15 10:08:26
 */
@RestController
@RequestMapping("virtualKeyset")
public class VirtualKeysetController {
    /**
     * 服务对象
     */
    @Resource
    private VirtualKeysetService virtualKeysetService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public VirtualKeyset selectOne(Integer id) {
        return this.virtualKeysetService.queryById(id);
    }

}