package com.carbontest.APIServer.Service;

import com.carbontest.APIServer.entity.TAsset;
import java.util.List;

/**
 * 资产表(TAsset)表服务接口
 *
 * @author makejava
 * @since 2021-07-15 10:12:16
 */
public interface TAssetService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TAsset queryById(Integer id);

    /**
     * 查询单条数据
     *

     * @return 对象列表
     */
    TAsset queryAll(TAsset tAsset);

    /**
     * 查询多条数据
     *

     * @return 对象列表
     */
    List<TAsset> queryAllList(TAsset tAsset);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TAsset> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tAsset 实例对象
     * @return 实例对象
     */
    TAsset insert(TAsset tAsset);

    /**
     * 修改数据
     *
     * @param tAsset 实例对象
     * @return 实例对象
     */
    TAsset update(TAsset tAsset);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}