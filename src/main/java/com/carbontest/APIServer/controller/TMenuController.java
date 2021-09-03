package com.carbontest.APIServer.controller;

import com.carbontest.APIServer.Service.TMenuService;
import com.carbontest.APIServer.entity.TMenu;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 系统菜单表(TMenu)表控制层
 *
 * @author makejava
 * @since 2021-07-15 10:11:30
 */
@RestController
@RequestMapping("tMenu")
public class TMenuController {
    /**
     * 服务对象
     */
    @Resource
    private TMenuService tMenuService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TMenu selectOne(Long id) {
        return this.tMenuService.queryById(id);
    }

}