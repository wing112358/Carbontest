package com.carbontest.APIServer.controller;

import com.carbontest.APIServer.Service.TCompanyService;
import com.carbontest.APIServer.entity.TCompany;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 公司表(TCompany)表控制层
 *
 * @author makejava
 * @since 2021-07-15 10:11:46
 */
@RestController
@RequestMapping("tCompany")
public class TCompanyController {
    /**
     * 服务对象
     */
    @Resource
    private TCompanyService tCompanyService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TCompany selectOne(Long id) {
        return this.tCompanyService.queryById(id);
    }

}