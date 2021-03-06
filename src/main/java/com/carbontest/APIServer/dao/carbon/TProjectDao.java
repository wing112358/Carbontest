package com.carbontest.APIServer.dao.carbon;

import com.carbontest.APIServer.entity.TProject;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 项目表(TProject)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-15 10:11:14
 */
public interface TProjectDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TProject queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TProject> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tProject 实例对象
     * @return 对象列表
     */
    List<TProject> queryAll(TProject tProject);

    /**
     * 新增数据
     *
     * @param tProject 实例对象
     * @return 影响行数
     */
    int insert(TProject tProject);

    /**
     * 修改数据
     *
     * @param tProject 实例对象
     * @return 影响行数
     */
    int update(TProject tProject);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}