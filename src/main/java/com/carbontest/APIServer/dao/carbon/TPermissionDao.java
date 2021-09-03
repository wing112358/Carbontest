package com.carbontest.APIServer.dao.carbon;

import com.carbontest.APIServer.entity.TPermission;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 权限表(TPermission)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-15 10:11:21
 */
public interface TPermissionDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TPermission queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TPermission> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tPermission 实例对象
     * @return 对象列表
     */
    List<TPermission> queryAll(TPermission tPermission);

    /**
     * 新增数据
     *
     * @param tPermission 实例对象
     * @return 影响行数
     */
    int insert(TPermission tPermission);

    /**
     * 修改数据
     *
     * @param tPermission 实例对象
     * @return 影响行数
     */
    int update(TPermission tPermission);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}