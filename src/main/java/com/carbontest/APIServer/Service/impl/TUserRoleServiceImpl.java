package com.carbontest.APIServer.Service.impl;

import com.carbontest.APIServer.Service.TUserRoleService;
import com.carbontest.APIServer.dao.carbon.TUserRoleDao;
import com.carbontest.APIServer.entity.TUserRole;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户角色关联表(TUserRole)表服务实现类
 *
 * @author makejava
 * @since 2021-07-15 10:07:18
 */
@Service("tUserRoleService")
public class TUserRoleServiceImpl implements TUserRoleService {
    @Resource
    private TUserRoleDao tUserRoleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TUserRole queryById(Long id) {
        return this.tUserRoleDao.queryById(id);
    }

    @Override
    public TUserRole queryByUserId(Long userid) {
        return this.tUserRoleDao.queryByUserId(userid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TUserRole> queryAllByLimit(int offset, int limit) {
        return this.tUserRoleDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tUserRole 实例对象
     * @return 实例对象
     */
    @Override
    public TUserRole insert(TUserRole tUserRole) {
        this.tUserRoleDao.insert(tUserRole);
        return tUserRole;
    }

    /**
     * 修改数据
     *
     * @param tUserRole 实例对象
     * @return 实例对象
     */
    @Override
    public TUserRole update(TUserRole tUserRole) {
        this.tUserRoleDao.update(tUserRole);
        return this.queryById(tUserRole.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tUserRoleDao.deleteById(id) > 0;
    }

    @Override
    public boolean deleteByUserId(Long userid) {
        return this.tUserRoleDao.deleteByUserId(userid)>0;
    }
}