package com.carbontest.APIServer.Service.impl;

import com.carbontest.APIServer.entity.TProjectCcer;
import com.carbontest.APIServer.dao.carbon.TProjectCcerDao;
import com.carbontest.APIServer.Service.TProjectCcerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TProjectCcer)表服务实现类
 *
 * @author makejava
 * @since 2021-08-26 16:11:25
 */
@Service("tProjectCcerService")
public class TProjectCcerServiceImpl implements TProjectCcerService {
    @Resource
    private TProjectCcerDao tProjectCcerDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TProjectCcer queryById(Long id) {
        return this.tProjectCcerDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TProjectCcer> queryAllByLimit(int offset, int limit) {
        return this.tProjectCcerDao.queryAllByLimit(offset, limit);
    }

    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    @Override
    public TProjectCcer queryAll(TProjectCcer tProjectCcer) {
        return this.tProjectCcerDao.queryAll(tProjectCcer);
    }

    /**
     * 新增数据
     *
     * @param tProjectCcer 实例对象
     * @return 实例对象
     */
    @Override
    public TProjectCcer insert(TProjectCcer tProjectCcer) {
        this.tProjectCcerDao.insert(tProjectCcer);
        return tProjectCcer;
    }

    /**
     * 修改数据
     *
     * @param tProjectCcer 实例对象
     * @return 实例对象
     */
    @Override
    public TProjectCcer update(TProjectCcer tProjectCcer) {
        this.tProjectCcerDao.update(tProjectCcer);
        return this.queryById(tProjectCcer.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tProjectCcerDao.deleteById(id) > 0;
    }
}