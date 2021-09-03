package com.carbontest.APIServer.Service.impl;

import com.carbontest.APIServer.Service.TAssetService;
import com.carbontest.APIServer.dao.carbon.TAssetDao;
import com.carbontest.APIServer.entity.TAsset;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 资产表(TAsset)表服务实现类
 *
 * @author makejava
 * @since 2021-07-15 10:12:16
 */
@Service("tAssetService")
public class TAssetServiceImpl implements TAssetService {
    @Resource
    private TAssetDao tAssetDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TAsset queryById(Integer id) {
        return this.tAssetDao.queryById(id);
    }

    @Override
    public TAsset queryAll(TAsset tAsset) {
        return this.tAssetDao.queryAll(tAsset);
    }

    @Override
    public List<TAsset> queryAllList(TAsset tAsset) {
        return this.tAssetDao.queryAllList(tAsset);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TAsset> queryAllByLimit(int offset, int limit) {
        return this.tAssetDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tAsset 实例对象
     * @return 实例对象
     */
    @Override
    public TAsset insert(TAsset tAsset) {
        this.tAssetDao.insert(tAsset);
        return tAsset;
    }

    /**
     * 修改数据
     *
     * @param tAsset 实例对象
     * @return 实例对象
     */
    @Override
    public TAsset update(TAsset tAsset) {
        this.tAssetDao.update(tAsset);
        return this.queryById(tAsset.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tAssetDao.deleteById(id) > 0;
    }
}