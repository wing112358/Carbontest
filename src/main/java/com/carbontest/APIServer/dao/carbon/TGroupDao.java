package com.carbontest.APIServer.dao.carbon;

import com.carbontest.APIServer.entity.TGroup;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 服务商企业关系记录表(TGroup)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-15 10:11:37
 */
public interface TGroupDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TGroup queryById(Integer id);



    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TGroup> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tGroup 实例对象
     * @return 对象列表
     */
    TGroup queryAll(TGroup tGroup);

    /**
     * 新增数据
     *
     * @param tGroup 实例对象
     * @return 影响行数
     */
    int insert(TGroup tGroup);

    /**
     * 修改数据
     *
     * @param tGroup 实例对象
     * @return 影响行数
     */
    int update(TGroup tGroup);

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
     * @param userId 用户id
     * @return 影响行数
     */
    int deleteByUserId(Long userId);

}