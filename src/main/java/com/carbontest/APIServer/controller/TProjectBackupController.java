package com.carbontest.APIServer.controller;

import com.carbontest.APIServer.entity.TProjectBackup;
import com.carbontest.APIServer.service.TProjectBackupService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 项目表(TProjectBackup)表控制层
 *
 * @author makejava
 * @since 2021-08-26 16:10:26
 */
@RestController
@RequestMapping("tProjectBackup")
public class TProjectBackupController {
    /**
     * 服务对象
     */
    @Resource
    private TProjectBackupService tProjectBackupService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TProjectBackup selectOne(Long id) {
        return this.tProjectBackupService.queryById(id);
    }

}