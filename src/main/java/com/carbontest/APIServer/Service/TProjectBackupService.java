package com.carbontest.APIServer.service;

import com.carbontest.APIServer.entity.TProjectBackup;
import java.util.List;

/**
 * 项目表(TProjectBackup)表服务接口
 *
 * @author makejava
 * @since 2021-08-26 16:10:26
 */
public interface TProjectBackupService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TProjectBackup queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TProjectBackup> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tProjectBackup 实例对象
     * @return 实例对象
     */
    TProjectBackup insert(TProjectBackup tProjectBackup);

    /**
     * 修改数据
     *
     * @param tProjectBackup 实例对象
     * @return 实例对象
     */
    TProjectBackup update(TProjectBackup tProjectBackup);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}