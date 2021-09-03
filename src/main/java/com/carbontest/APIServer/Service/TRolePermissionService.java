package com.carbontest.APIServer.Service;

import com.carbontest.APIServer.entity.TRolePermission;
import java.util.List;

/**
 * 角色权限关联表(TRolePermission)表服务接口
 *
 * @author makejava
 * @since 2021-07-15 10:10:57
 */
public interface TRolePermissionService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TRolePermission queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TRolePermission> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tRolePermission 实例对象
     * @return 实例对象
     */
    TRolePermission insert(TRolePermission tRolePermission);

    /**
     * 修改数据
     *
     * @param tRolePermission 实例对象
     * @return 实例对象
     */
    TRolePermission update(TRolePermission tRolePermission);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}