package com.carbontest.APIServer.Service.impl;

import com.carbontest.APIServer.Service.TChainRequestRecordService;
import com.carbontest.APIServer.dao.carbon.TChainRequestRecordDao;
import com.carbontest.APIServer.entity.TChainRequestRecord;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 区块链请求记录表(TChainRequestRecord)表服务实现类
 *
 * @author makejava
 * @since 2021-07-15 10:11:58
 */
@Service("tChainRequestRecordService")
public class TChainRequestRecordServiceImpl implements TChainRequestRecordService {
    @Resource
    private TChainRequestRecordDao tChainRequestRecordDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TChainRequestRecord queryById(Long id) {
        return this.tChainRequestRecordDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TChainRequestRecord> queryAllByLimit(int offset, int limit) {
        return this.tChainRequestRecordDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tChainRequestRecord 实例对象
     * @return 实例对象
     */
    @Override
    public TChainRequestRecord insert(TChainRequestRecord tChainRequestRecord) {
        this.tChainRequestRecordDao.insert(tChainRequestRecord);
        return tChainRequestRecord;
    }

    /**
     * 修改数据
     *
     * @param tChainRequestRecord 实例对象
     * @return 实例对象
     */
    @Override
    public TChainRequestRecord update(TChainRequestRecord tChainRequestRecord) {
        this.tChainRequestRecordDao.update(tChainRequestRecord);
        return this.queryById(tChainRequestRecord.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tChainRequestRecordDao.deleteById(id) > 0;
    }
}