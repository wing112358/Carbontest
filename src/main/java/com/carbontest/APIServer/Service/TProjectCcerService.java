package com.carbontest.APIServer.Service;

import com.carbontest.APIServer.entity.TProjectCcer;
import java.util.List;

/**
 * (TProjectCcer)表服务接口
 *
 * @author makejava
 * @since 2021-08-26 16:11:25
 */
public interface TProjectCcerService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TProjectCcer queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TProjectCcer> queryAllByLimit(int offset, int limit);

    TProjectCcer queryAll(TProjectCcer tProjectCcer);

    /**
     * 新增数据
     *
     * @param tProjectCcer 实例对象
     * @return 实例对象
     */
    TProjectCcer insert(TProjectCcer tProjectCcer);

    /**
     * 修改数据
     *
     * @param tProjectCcer 实例对象
     * @return 实例对象
     */
    TProjectCcer update(TProjectCcer tProjectCcer);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}