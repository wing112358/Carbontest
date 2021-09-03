package com.carbontest.APIServer.Service;

import com.carbontest.APIServer.entity.TTransaction;
import java.util.List;

/**
 * 交易记录表(TTransaction)表服务接口
 *
 * @author makejava
 * @since 2021-09-03 14:37:47
 */
public interface TTransactionService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TTransaction queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @return 对象列表
     */
    List<TTransaction> queryAll(TTransaction tTransaction);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TTransaction> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tTransaction 实例对象
     * @return 实例对象
     */
    TTransaction insert(TTransaction tTransaction);

    /**
     * 修改数据
     *
     * @param tTransaction 实例对象
     * @return 实例对象
     */
    TTransaction update(TTransaction tTransaction);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}