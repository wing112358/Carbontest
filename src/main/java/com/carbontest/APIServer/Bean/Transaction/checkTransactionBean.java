package com.carbontest.APIServer.Bean.Transaction;


import com.carbontest.APIServer.Bean.common.Request;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *签发审核参数实体
 */

@Data
@AllArgsConstructor
public class checkTransactionBean extends Request {


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


}
