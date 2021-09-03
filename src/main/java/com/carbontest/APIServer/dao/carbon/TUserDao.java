package com.carbontest.APIServer.dao.carbon;

import com.carbontest.APIServer.entity.TUser;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 用户表(TUser)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-15 10:10:36
 */
public interface TUserDao {

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
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TUser> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tUser 实例对象
     * @return 对象列表
     */
    List<TUser> queryAll(TUser tUser);

    /**
     * 新增数据
     *
     * @param tUser 实例对象
     * @return 影响行数
     */
    int insert(TUser tUser);

    /**
     * 修改数据
     *
     * @param tUser 实例对象
     * @return 影响行数
     */
    int update(TUser tUser);

    /**
     * 通过主键更新数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int updateById(Long id);

    /**
     * 通过用户id更新数据
     *
     * @param userId 用户id
     * @return 影响行数
     */
    int updateByUserId(Long userId);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);
    /**
     * 通过用户id删除数据
     *
     * @param userid 用户id
     * @return 影响行数
     */
    int deleteByUserId(Long userid);

}