package com.carbontest.APIServer.Service;

import com.carbontest.APIServer.entity.TProjectIrec;
import java.util.List;

/**
 * (TProjectIrec)表服务接口
 *
 * @author makejava
 * @since 2021-08-26 16:11:37
 */
public interface TProjectIrecService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TProjectIrec queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TProjectIrec> queryAllByLimit(int offset, int limit);

    TProjectIrec queryAll(TProjectIrec tProjectIrec);

    /**
     * 新增数据
     *
     * @param tProjectIrec 实例对象
     * @return 实例对象
     */
    TProjectIrec insert(TProjectIrec tProjectIrec);

    /**
     * 修改数据
     *
     * @param tProjectIrec 实例对象
     * @return 实例对象
     */
    TProjectIrec update(TProjectIrec tProjectIrec);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}