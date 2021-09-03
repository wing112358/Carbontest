package com.carbontest.APIServer.dao.carbon;

import com.carbontest.APIServer.entity.TAsset;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 资产表(TAsset)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-15 10:12:16
 */
public interface TAssetDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TAsset queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TAsset> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tAsset 实例对象
     * @return 对象列表
     */
    TAsset queryAll(TAsset tAsset);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param tAsset 实例对象
     * @return 对象列表
     */
    List<TAsset> queryAllList(TAsset tAsset);

    /**
     * 新增数据
     *
     * @param tAsset 实例对象
     * @return 影响行数
     */
    int insert(TAsset tAsset);

    /**
     * 修改数据
     *
     * @param tAsset 实例对象
     * @return 影响行数
     */
    int update(TAsset tAsset);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}