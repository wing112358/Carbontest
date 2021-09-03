package com.carbontest.APIServer.Bean.Transaction;


import com.carbontest.APIServer.Bean.common.Request;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *签发审核参数实体
 */

@Data
@AllArgsConstructor
public class addTransactionBean extends Request {

    /**
     *合计金额
     */
    private Integer amount;

    /**
     *买家公司
     */
    private String buyerName;

    /**
     *单价
     */
    private Integer price;

    /**
     *合同文件
     */
    private String contract;

    /**
     *卖家公司
     */
    private String owner;

    /**
     *项目id
     */
    private Integer projectId;

    /**
     *项目名称
     */
    private String projectName;

    /**
     *购买数量
     */
    private Integer quantity;


}
