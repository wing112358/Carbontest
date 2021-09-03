package com.carbontest.APIServer.controller;

import com.carbontest.APIServer.Service.TApproveRecordService;
import com.carbontest.APIServer.entity.TApproveRecord;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 审核记录表(TApproveRecord)表控制层
 *
 * @author makejava
 * @since 2021-07-15 10:12:25
 */
@RestController
@RequestMapping("tApproveRecord")
public class TApproveRecordController {
    /**
     * 服务对象
     */
    @Resource
    private TApproveRecordService tApproveRecordService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TApproveRecord selectOne(Long id) {
        return this.tApproveRecordService.queryById(id);
    }

}