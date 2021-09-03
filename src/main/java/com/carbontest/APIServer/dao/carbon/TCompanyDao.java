package com.carbontest.APIServer.dao.carbon;

import com.carbontest.APIServer.entity.TCompany;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 公司表(TCompany)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-15 10:11:46
 */
public interface TCompanyDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TCompany queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TCompany> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tCompany 实例对象
     * @return 对象列表
     */
    TCompany queryAll(TCompany tCompany);

    /**
     * 新增数据
     *
     * @param tCompany 实例对象
     * @return 影响行数
     */
    int insert(TCompany tCompany);

    /**
     * 修改数据
     *
     * @param tCompany 实例对象
     * @return 影响行数
     */
    int update(TCompany tCompany);

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
     * @param userId 用户id
     * @return 影响行数
     */
    int deleteByUserId(Long userId);

}