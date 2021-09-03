package com.carbontest.APIServer.service.impl;

import com.carbontest.APIServer.entity.TProjectBackup;
import com.carbontest.APIServer.dao.carbon.TProjectBackupDao;
import com.carbontest.APIServer.service.TProjectBackupService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 项目表(TProjectBackup)表服务实现类
 *
 * @author makejava
 * @since 2021-08-26 16:10:26
 */
@Service("tProjectBackupService")
public class TProjectBackupServiceImpl implements TProjectBackupService {
    @Resource
    private TProjectBackupDao tProjectBackupDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TProjectBackup queryById(Long id) {
        return this.tProjectBackupDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TProjectBackup> queryAllByLimit(int offset, int limit) {
        return this.tProjectBackupDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tProjectBackup 实例对象
     * @return 实例对象
     */
    @Override
    public TProjectBackup insert(TProjectBackup tProjectBackup) {
        this.tProjectBackupDao.insert(tProjectBackup);
        return tProjectBackup;
    }

    /**
     * 修改数据
     *
     * @param tProjectBackup 实例对象
     * @return 实例对象
     */
    @Override
    public TProjectBackup update(TProjectBackup tProjectBackup) {
        this.tProjectBackupDao.update(tProjectBackup);
        return this.queryById(tProjectBackup.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tProjectBackupDao.deleteById(id) > 0;
    }
}