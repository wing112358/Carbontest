package com.carbontest.APIServer.Service.impl;

import com.carbontest.APIServer.Service.TRolePermissionService;
import com.carbontest.APIServer.dao.carbon.TRolePermissionDao;
import com.carbontest.APIServer.entity.TRolePermission;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 角色权限关联表(TRolePermission)表服务实现类
 *
 * @author makejava
 * @since 2021-07-15 10:10:57
 */
@Service("tRolePermissionService")
public class TRolePermissionServiceImpl implements TRolePermissionService {
    @Resource
    private TRolePermissionDao tRolePermissionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TRolePermission queryById(Long id) {
        return this.tRolePermissionDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TRolePermission> queryAllByLimit(int offset, int limit) {
        return this.tRolePermissionDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tRolePermission 实例对象
     * @return 实例对象
     */
    @Override
    public TRolePermission insert(TRolePermission tRolePermission) {
        this.tRolePermissionDao.insert(tRolePermission);
        return tRolePermission;
    }

    /**
     * 修改数据
     *
     * @param tRolePermission 实例对象
     * @return 实例对象
     */
    @Override
    public TRolePermission update(TRolePermission tRolePermission) {
        this.tRolePermissionDao.update(tRolePermission);
        return this.queryById(tRolePermission.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tRolePermissionDao.deleteById(id) > 0;
    }
}