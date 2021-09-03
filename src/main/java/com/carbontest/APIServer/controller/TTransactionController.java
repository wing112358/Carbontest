package com.carbontest.APIServer.controller;

import com.carbontest.APIServer.entity.TTransaction;
import com.carbontest.APIServer.Service.TTransactionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 交易记录表(TTransaction)表控制层
 *
 * @author makejava
 * @since 2021-09-03 14:37:47
 */
@RestController
@RequestMapping("tTransaction")
public class TTransactionController {
    /**
     * 服务对象
     */
    @Resource
    private TTransactionService tTransactionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TTransaction selectOne(Integer id) {
        return this.tTransactionService.queryById(id);
    }

}