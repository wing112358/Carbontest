package com.carbontest.APIServer.Service;

import com.carbontest.APIServer.entity.TCompany;
import java.util.List;

/**
 * 公司表(TCompany)表服务接口
 *
 * @author makejava
 * @since 2021-07-15 10:11:46
 */
public interface TCompanyService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TCompany queryById(Long id);

    TCompany queryAll(TCompany tCompany);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TCompany> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tCompany 实例对象
     * @return 实例对象
     */
    TCompany insert(TCompany tCompany);

    /**
     * 修改数据
     *
     * @param tCompany 实例对象
     * @return 实例对象
     */
    int update(TCompany tCompany);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

    /**
     * 通过主键删除数据
     *
     * @param userId 用户id
     * @return 是否成功
     */
    boolean deleteByUserId(Long userId);

}