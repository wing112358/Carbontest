package com.carbontest.APIServer.Service;

import com.carbontest.APIServer.entity.TChainRequestRecord;
import java.util.List;

/**
 * 区块链请求记录表(TChainRequestRecord)表服务接口
 *
 * @author makejava
 * @since 2021-07-15 10:11:58
 */
public interface TChainRequestRecordService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TChainRequestRecord queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TChainRequestRecord> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tChainRequestRecord 实例对象
     * @return 实例对象
     */
    TChainRequestRecord insert(TChainRequestRecord tChainRequestRecord);

    /**
     * 修改数据
     *
     * @param tChainRequestRecord 实例对象
     * @return 实例对象
     */
    TChainRequestRecord update(TChainRequestRecord tChainRequestRecord);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}