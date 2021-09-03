package com.carbontest.APIServer.Bean.Company;


import com.carbontest.APIServer.Bean.common.Request;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *账号审核参数实体
 */

@Data
@AllArgsConstructor
public class CheckCompanyBean extends Request {

    /**
     *申请签发量
     */
    private Integer applicationIssuance;

    /**
     *审核意见
     */
    private String approveRemark;

    /**
     *审核结果
     */
    private Integer approveResult;

    /**
     *审核人
     */
    private String approveUser;

    /**
     *记录id
     */
    private Integer id;

    /**
     *分佣比例
     */
    private Integer ratio;

    /**
     *服务商id
     */
    private String servicerId;




}
