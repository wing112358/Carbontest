package com.carbontest.APIServer.Service.impl;

import com.carbontest.APIServer.Service.TPermissionService;
import com.carbontest.APIServer.dao.carbon.TPermissionDao;
import com.carbontest.APIServer.entity.TPermission;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 权限表(TPermission)表服务实现类
 *
 * @author makejava
 * @since 2021-07-15 10:11:21
 */
@Service("tPermissionService")
public class TPermissionServiceImpl implements TPermissionService {
    @Resource
    private TPermissionDao tPermissionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TPermission queryById(Long id) {
        return this.tPermissionDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TPermission> queryAllByLimit(int offset, int limit) {
        return this.tPermissionDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tPermission 实例对象
     * @return 实例对象
     */
    @Override
    public TPermission insert(TPermission tPermission) {
        this.tPermissionDao.insert(tPermission);
        return tPermission;
    }

    /**
     * 修改数据
     *
     * @param tPermission 实例对象
     * @return 实例对象
     */
    @Override
    public TPermission update(TPermission tPermission) {
        this.tPermissionDao.update(tPermission);
        return this.queryById(tPermission.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tPermissionDao.deleteById(id) > 0;
    }
}