package com.carbontest.APIServer.Service;

import com.carbontest.APIServer.entity.TUserRole;
import java.util.List;

/**
 * 用户角色关联表(TUserRole)表服务接口
 *
 * @author makejava
 * @since 2021-07-15 10:07:18
 */
public interface TUserRoleService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TUserRole queryById(Long id);

    /**
     * 通过用户ID查询单条数据
     *
     * @param userid 主键
     * @return 实例对象
     */
    TUserRole queryByUserId(Long userid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TUserRole> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tUserRole 实例对象
     * @return 实例对象
     */
    TUserRole insert(TUserRole tUserRole);

    /**
     * 修改数据
     *
     * @param tUserRole 实例对象
     * @return 实例对象
     */
    TUserRole update(TUserRole tUserRole);

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