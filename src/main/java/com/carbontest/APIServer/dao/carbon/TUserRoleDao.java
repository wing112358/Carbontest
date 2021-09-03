package com.carbontest.APIServer.dao.carbon;

import com.carbontest.APIServer.entity.TUserRole;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 用户角色关联表(TUserRole)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-15 10:07:17
 */
public interface TUserRoleDao {

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
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TUserRole> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tUserRole 实例对象
     * @return 对象列表
     */
    List<TUserRole> queryAll(TUserRole tUserRole);

    /**
     * 新增数据
     *
     * @param tUserRole 实例对象
     * @return 影响行数
     */
    int insert(TUserRole tUserRole);

    /**
     * 修改数据
     *
     * @param tUserRole 实例对象
     * @return 影响行数
     */
    int update(TUserRole tUserRole);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);
    /**
     * 通过主键删除数据
     *
     * @param userid 用户id
     * @return 影响行数
     */
    int deleteByUserId(Long userid);

}