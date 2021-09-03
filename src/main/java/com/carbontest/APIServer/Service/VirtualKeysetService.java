package com.carbontest.APIServer.Service;

import com.carbontest.APIServer.entity.VirtualKeyset;
import java.util.List;

/**
 * (VirtualKeyset)表服务接口
 *
 * @author makejava
 * @since 2021-07-15 10:08:26
 */
public interface VirtualKeysetService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    VirtualKeyset queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<VirtualKeyset> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param virtualKeyset 实例对象
     * @return 实例对象
     */
    VirtualKeyset insert(VirtualKeyset virtualKeyset);

    /**
     * 修改数据
     *
     * @param virtualKeyset 实例对象
     * @return 实例对象
     */
    VirtualKeyset update(VirtualKeyset virtualKeyset);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}