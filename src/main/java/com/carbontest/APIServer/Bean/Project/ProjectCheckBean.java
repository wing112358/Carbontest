package com.carbontest.APIServer.Bean.Project;


import com.carbontest.APIServer.Bean.common.Request;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *项目审核参数实体
 */

@Data
@AllArgsConstructor
public class ProjectCheckBean extends Request {

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

}
