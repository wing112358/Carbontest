package com.carbontest.APIServer.Service.impl;

import com.carbontest.APIServer.entity.TProjectIrec;
import com.carbontest.APIServer.dao.carbon.TProjectIrecDao;
import com.carbontest.APIServer.Service.TProjectIrecService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TProjectIrec)表服务实现类
 *
 * @author makejava
 * @since 2021-08-26 16:11:37
 */
@Service("tProjectIrecService")
public class TProjectIrecServiceImpl implements TProjectIrecService {
    @Resource
    private TProjectIrecDao tProjectIrecDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TProjectIrec queryById(Long id) {
        return this.tProjectIrecDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TProjectIrec> queryAllByLimit(int offset, int limit) {
        return this.tProjectIrecDao.queryAllByLimit(offset, limit);
    }

    /**
     * 查询多条数据
     *

     * @return 对象列表
     */
    @Override
    public TProjectIrec queryAll(TProjectIrec tProjectIrec) {
        return this.tProjectIrecDao.queryAll(tProjectIrec);
    }

    /**
     * 新增数据
     *
     * @param tProjectIrec 实例对象
     * @return 实例对象
     */
    @Override
    public TProjectIrec insert(TProjectIrec tProjectIrec) {
        this.tProjectIrecDao.insert(tProjectIrec);
        return tProjectIrec;
    }

    /**
     * 修改数据
     *
     * @param tProjectIrec 实例对象
     * @return 实例对象
     */
    @Override
    public TProjectIrec update(TProjectIrec tProjectIrec) {
        this.tProjectIrecDao.update(tProjectIrec);
        return this.queryById(tProjectIrec.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tProjectIrecDao.deleteById(id) > 0;
    }
}