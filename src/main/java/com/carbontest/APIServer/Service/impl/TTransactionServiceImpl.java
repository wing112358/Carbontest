package com.carbontest.APIServer.Service.impl;

import com.carbontest.APIServer.entity.TTransaction;
import com.carbontest.APIServer.dao.carbon.TTransactionDao;
import com.carbontest.APIServer.Service.TTransactionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 交易记录表(TTransaction)表服务实现类
 *
 * @author makejava
 * @since 2021-09-03 14:37:47
 */
@Service("tTransactionService")
public class TTransactionServiceImpl implements TTransactionService {
    @Resource
    private TTransactionDao tTransactionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TTransaction queryById(Integer id) {
        return this.tTransactionDao.queryById(id);
    }

    @Override
    public List<TTransaction> queryAll(TTransaction tTransaction) {
        return this.tTransactionDao.queryAll(tTransaction);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TTransaction> queryAllByLimit(int offset, int limit) {
        return this.tTransactionDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tTransaction 实例对象
     * @return 实例对象
     */
    @Override
    public TTransaction insert(TTransaction tTransaction) {
        this.tTransactionDao.insert(tTransaction);
        return tTransaction;
    }

    /**
     * 修改数据
     *
     * @param tTransaction 实例对象
     * @return 实例对象
     */
    @Override
    public TTransaction update(TTransaction tTransaction) {
        this.tTransactionDao.update(tTransaction);
        return this.queryById(tTransaction.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tTransactionDao.deleteById(id) > 0;
    }
}