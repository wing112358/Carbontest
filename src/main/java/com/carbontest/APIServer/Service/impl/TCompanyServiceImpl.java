package com.carbontest.APIServer.Service.impl;

import com.carbontest.APIServer.Service.TCompanyService;
import com.carbontest.APIServer.dao.carbon.TCompanyDao;
import com.carbontest.APIServer.entity.TCompany;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 公司表(TCompany)表服务实现类
 *
 * @author makejava
 * @since 2021-07-15 10:11:46
 */
@Service("tCompanyService")
public class TCompanyServiceImpl implements TCompanyService {
    @Resource
    private TCompanyDao tCompanyDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TCompany queryById(Long id) {
        return this.tCompanyDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    @Override
    public TCompany queryAll(TCompany tCompany) {
        return this.tCompanyDao.queryAll(tCompany);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TCompany> queryAllByLimit(int offset, int limit) {
        return this.tCompanyDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tCompany 实例对象
     * @return 实例对象
     */
    @Override
    public TCompany insert(TCompany tCompany) {
        this.tCompanyDao.insert(tCompany);
        return tCompany;
    }

    /**
     * 修改数据
     *
     * @param tCompany 实例对象
     * @return 实例对象
     */
    @Override
    public int update(TCompany tCompany) {
        int update=this.tCompanyDao.update(tCompany);
        return update;
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tCompanyDao.deleteById(id) > 0;
    }

    @Override
    public boolean deleteByUserId(Long userId) {
        return this.tCompanyDao.deleteByUserId(userId) > 0;
    }
}