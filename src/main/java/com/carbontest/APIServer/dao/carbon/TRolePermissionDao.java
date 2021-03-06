package com.carbontest.APIServer.dao.carbon;

import com.carbontest.APIServer.entity.TRolePermission;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 角色权限关联表(TRolePermission)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-15 10:10:57
 */
public interface TRolePermissionDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TRolePermission queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TRolePermission> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tRolePermission 实例对象
     * @return 对象列表
     */
    List<TRolePermission> queryAll(TRolePermission tRolePermission);

    /**
     * 新增数据
     *
     * @param tRolePermission 实例对象
     * @return 影响行数
     */
    int insert(TRolePermission tRolePermission);

    /**
     * 修改数据
     *
     * @param tRolePermission 实例对象
     * @return 影响行数
     */
    int update(TRolePermission tRolePermission);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}