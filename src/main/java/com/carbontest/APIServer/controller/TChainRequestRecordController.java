package com.carbontest.APIServer.controller;

import com.carbontest.APIServer.Service.TChainRequestRecordService;
import com.carbontest.APIServer.entity.TChainRequestRecord;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 区块链请求记录表(TChainRequestRecord)表控制层
 *
 * @author makejava
 * @since 2021-07-15 10:11:58
 */
@RestController
@RequestMapping("tChainRequestRecord")
public class TChainRequestRecordController {
    /**
     * 服务对象
     */
    @Resource
    private TChainRequestRecordService tChainRequestRecordService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TChainRequestRecord selectOne(Long id) {
        return this.tChainRequestRecordService.queryById(id);
    }

}