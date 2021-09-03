package com.carbontest.APIServer.Service;

import com.carbontest.APIServer.entity.TUser;
import java.util.List;

/**
 * 用户表(TUser)表服务接口
 *
 * @author makejava
 * @since 2021-07-15 10:10:36
 */
public interface TUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TUser queryById(Long id);

    /**
     * 通过Username查询单条数据
     *
     * @param username 用户名
     * @return 实例对象
     */
    TUser queryByUsername(String username);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TUser> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tUser 实例对象
     * @return 实例对象
     */
    TUser insert(TUser tUser);

    /**
     * 修改数据
     *
     * @param tUser 实例对象
     * @return 实例对象
     */
    TUser update(TUser tUser);

    /**
     * 根据id修改数据
     *
     * @param id 用户id
     * @return 实例对象
     */
    boolean updateById(Long id);

    /**
     * 通过用户id更新数据
     *
     * @param userId 用户id
     * @return 是否成功
     */

    boolean updateByUserId(Long userId);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

    /**
     * 通过用户id删除数据
     *
     * @param userid 用户id
     * @return 是否成功
     */
    boolean deleteByUserId(Long userid);



}