package com.carbontest.APIServer.Service;

import com.carbontest.APIServer.entity.TProject;
import java.util.List;

/**
 * 项目表(TProject)表服务接口
 *
 * @author makejava
 * @since 2021-07-15 10:11:14
 */
public interface TProjectService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TProject queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TProject> queryAllByLimit(int offset, int limit);

    List<TProject> queryAll(TProject tProject);

    /**
     * 新增数据
     *
     * @param tProject 实例对象
     * @return 实例对象
     */
    TProject insert(TProject tProject);

    /**
     * 修改数据
     *
     * @param tProject 实例对象
     * @return 实例对象
     */
    TProject update(TProject tProject);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}