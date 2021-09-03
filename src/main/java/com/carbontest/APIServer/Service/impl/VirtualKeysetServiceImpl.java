package com.carbontest.APIServer.Service.impl;

import com.carbontest.APIServer.Service.VirtualKeysetService;
import com.carbontest.APIServer.dao.carbon.VirtualKeysetDao;
import com.carbontest.APIServer.entity.VirtualKeyset;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (VirtualKeyset)表服务实现类
 *
 * @author makejava
 * @since 2021-07-15 10:08:26
 */
@Service("virtualKeysetService")
public class VirtualKeysetServiceImpl implements VirtualKeysetService {
    @Resource
    private VirtualKeysetDao virtualKeysetDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public VirtualKeyset queryById(Integer id) {
        return this.virtualKeysetDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<VirtualKeyset> queryAllByLimit(int offset, int limit) {
        return this.virtualKeysetDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param virtualKeyset 实例对象
     * @return 实例对象
     */
    @Override
    public VirtualKeyset insert(VirtualKeyset virtualKeyset) {
        this.virtualKeysetDao.insert(virtualKeyset);
        return virtualKeyset;
    }

    /**
     * 修改数据
     *
     * @param virtualKeyset 实例对象
     * @return 实例对象
     */
    @Override
    public VirtualKeyset update(VirtualKeyset virtualKeyset) {
        this.virtualKeysetDao.update(virtualKeyset);
        return this.queryById(virtualKeyset.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.virtualKeysetDao.deleteById(id) > 0;
    }
}