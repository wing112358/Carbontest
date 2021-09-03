package com.carbontest.APIServer.dao.carbon;

import com.carbontest.APIServer.entity.TApproveRecord;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 审核记录表(TApproveRecord)表数据库访问层
 *
 * @author makejava
 * @since 2021-07-15 10:12:25
 */
public interface TApproveRecordDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TApproveRecord queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TApproveRecord> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tApproveRecord 实例对象
     * @return 对象列表
     */
    List<TApproveRecord> queryAll(TApproveRecord tApproveRecord);

    /**
     * 新增数据
     *
     * @param tApproveRecord 实例对象
     * @return 影响行数
     */
    int insert(TApproveRecord tApproveRecord);

    /**
     * 修改数据
     *
     * @param tApproveRecord 实例对象
     * @return 影响行数
     */
    int update(TApproveRecord tApproveRecord);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}