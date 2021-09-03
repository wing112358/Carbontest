package com.carbontest.APIServer.dao.carbon;

import com.carbontest.APIServer.entity.TProjectCcer;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TProjectCcer)表数据库访问层
 *
 * @author makejava
 * @since 2021-08-26 16:11:25
 */
public interface TProjectCcerDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TProjectCcer queryById(Long id);



    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TProjectCcer> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tProjectCcer 实例对象
     * @return 对象列表
     */
    TProjectCcer queryAll(TProjectCcer tProjectCcer);

    /**
     * 新增数据
     *
     * @param tProjectCcer 实例对象
     * @return 影响行数
     */
    int insert(TProjectCcer tProjectCcer);

    /**
     * 修改数据
     *
     * @param tProjectCcer 实例对象
     * @return 影响行数
     */
    int update(TProjectCcer tProjectCcer);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}