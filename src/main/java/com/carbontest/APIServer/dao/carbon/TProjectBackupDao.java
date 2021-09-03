package com.carbontest.APIServer.dao.carbon;

import com.carbontest.APIServer.entity.TProjectBackup;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 项目表(TProjectBackup)表数据库访问层
 *
 * @author makejava
 * @since 2021-08-26 16:10:26
 */
public interface TProjectBackupDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TProjectBackup queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TProjectBackup> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tProjectBackup 实例对象
     * @return 对象列表
     */
    List<TProjectBackup> queryAll(TProjectBackup tProjectBackup);

    /**
     * 新增数据
     *
     * @param tProjectBackup 实例对象
     * @return 影响行数
     */
    int insert(TProjectBackup tProjectBackup);

    /**
     * 修改数据
     *
     * @param tProjectBackup 实例对象
     * @return 影响行数
     */
    int update(TProjectBackup tProjectBackup);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}