package com.carbontest.APIServer.controller;

import com.carbontest.APIServer.Service.TAssetService;
import com.carbontest.APIServer.entity.TAsset;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 资产表(TAsset)表控制层
 *
 * @author makejava
 * @since 2021-07-15 10:12:16
 */
@RestController
@RequestMapping("tAsset")
public class TAssetController {
    /**
     * 服务对象
     */
    @Resource
    private TAssetService tAssetService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TAsset selectOne(Integer id) {
        return this.tAssetService.queryById(id);
    }

}