package com.carbontest.APIServer.Service.impl;

import com.carbontest.APIServer.Service.TUserService;
import com.carbontest.APIServer.dao.carbon.TUserDao;
import com.carbontest.APIServer.entity.TUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户表(TUser)表服务实现类
 *
 * @author makejava
 * @since 2021-07-15 10:10:36
 */
@Service("tUserService")
public class TUserServiceImpl implements TUserService {
    @Resource
    private TUserDao tUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TUser queryById(Long id) {
        return this.tUserDao.queryById(id);
    }

    /**
     * 通过Username查询单条数据
     *
     * @param username 用户名
     * @return 实例对象
     */
    @Override
    public TUser queryByUsername(String username) {
        return this.tUserDao.queryByUsername(username);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TUser> queryAllByLimit(int offset, int limit) {
        return this.tUserDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tUser 实例对象
     * @return 实例对象
     */
    @Override
    public TUser insert(TUser tUser) {
        this.tUserDao.insert(tUser);
        return tUser;
    }

    /**
     * 修改数据
     *
     * @param tUser 实例对象
     * @return 实例对象
     */
    @Override
    public TUser update(TUser tUser) {
        this.tUserDao.update(tUser);
        return this.queryById(tUser.getId());
    }

    @Override
    public boolean updateById(Long id) {
        return this.tUserDao.updateById(id) > 0;
    }

    /**
     * 通过用户更新数据
     *
     * @param  userId 用户id
     * @return 是否成功
     */
    @Override
    public boolean updateByUserId(Long userId) {
        return this.tUserDao.updateByUserId(userId) > 0;
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tUserDao.deleteById(id) > 0;
    }

    /**
     * 通过用户删除数据
     *
     * @param  userid 用户id
     * @return 是否成功
     */
    @Override
    public boolean deleteByUserId(Long userid) {
        return this.tUserDao.deleteByUserId(userid) > 0;
    }
}