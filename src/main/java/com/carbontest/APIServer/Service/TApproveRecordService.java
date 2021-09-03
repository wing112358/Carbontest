package com.carbontest.APIServer.Service;

import com.carbontest.APIServer.entity.TApproveRecord;
import java.util.List;

/**
 * 审核记录表(TApproveRecord)表服务接口
 *
 * @author makejava
 * @since 2021-07-15 10:12:25
 */
public interface TApproveRecordService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TApproveRecord queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TApproveRecord> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tApproveRecord 实例对象
     * @return 实例对象
     */
    TApproveRecord insert(TApproveRecord tApproveRecord);

    /**
     * 修改数据
     *
     * @param tApproveRecord 实例对象
     * @return 实例对象
     */
    TApproveRecord update(TApproveRecord tApproveRecord);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}