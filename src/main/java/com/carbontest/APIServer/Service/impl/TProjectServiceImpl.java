package com.carbontest.APIServer.Service.impl;

import com.carbontest.APIServer.Service.TProjectService;
import com.carbontest.APIServer.dao.carbon.TProjectDao;
import com.carbontest.APIServer.entity.TProject;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 项目表(TProject)表服务实现类
 *
 * @author makejava
 * @since 2021-07-15 10:11:14
 */
@Service("tProjectService")
public class TProjectServiceImpl implements TProjectService {
    @Resource
    private TProjectDao tProjectDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TProject queryById(Integer id) {
        return this.tProjectDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TProject> queryAllByLimit(int offset, int limit) {
        return this.tProjectDao.queryAllByLimit(offset, limit);
    }

    @Override
    public List<TProject> queryAll(TProject tProject){
        return this.tProjectDao.queryAll(tProject);
    }

    /**
     * 新增数据
     *
     * @param tProject 实例对象
     * @return 实例对象
     */
    @Override
    public TProject insert(TProject tProject) {
        this.tProjectDao.insert(tProject);
        return tProject;
    }

    /**
     * 修改数据
     *
     * @param tProject 实例对象
     * @return 实例对象
     */
    @Override
    public TProject update(TProject tProject) {
        this.tProjectDao.update(tProject);
        return this.queryById(tProject.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tProjectDao.deleteById(id) > 0;
    }
}