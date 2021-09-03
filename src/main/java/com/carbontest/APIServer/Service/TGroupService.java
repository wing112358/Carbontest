package com.carbontest.APIServer.Service;

import com.carbontest.APIServer.entity.TGroup;
import java.util.List;

/**
 * 服务商企业关系记录表(TGroup)表服务接口
 *
 * @author makejava
 * @since 2021-07-15 10:11:37
 */
public interface TGroupService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TGroup queryById(Integer id);

    /**
     * 查询多条数据
     *

     * @return 对象列表
     */
    TGroup queryAll(TGroup tGroup);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TGroup> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tGroup 实例对象
     * @return 实例对象
     */
    TGroup insert(TGroup tGroup);

    /**
     * 修改数据
     *
     * @param tGroup 实例对象
     * @return 实例对象
     */
    TGroup update(TGroup tGroup);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

    /**
     * 通过主键删除数据
     *
     * @param userId 用户id
     * @return 是否成功
     */
    boolean deleteByUserId(Long userId);

}