package com.carbontest.APIServer.Service.impl;

import com.carbontest.APIServer.Service.TApproveRecordService;
import com.carbontest.APIServer.dao.carbon.TApproveRecordDao;
import com.carbontest.APIServer.entity.TApproveRecord;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 审核记录表(TApproveRecord)表服务实现类
 *
 * @author makejava
 * @since 2021-07-15 10:12:25
 */
@Service("tApproveRecordService")
public class TApproveRecordServiceImpl implements TApproveRecordService {
    @Resource
    private TApproveRecordDao tApproveRecordDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TApproveRecord queryById(Long id) {
        return this.tApproveRecordDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TApproveRecord> queryAllByLimit(int offset, int limit) {
        return this.tApproveRecordDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tApproveRecord 实例对象
     * @return 实例对象
     */
    @Override
    public TApproveRecord insert(TApproveRecord tApproveRecord) {
        this.tApproveRecordDao.insert(tApproveRecord);
        return tApproveRecord;
    }

    /**
     * 修改数据
     *
     * @param tApproveRecord 实例对象
     * @return 实例对象
     */
    @Override
    public TApproveRecord update(TApproveRecord tApproveRecord) {
        this.tApproveRecordDao.update(tApproveRecord);
        return this.queryById(tApproveRecord.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tApproveRecordDao.deleteById(id) > 0;
    }
}