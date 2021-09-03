package com.carbontest.APIServer.Bean.Project;


import com.carbontest.APIServer.Bean.common.Request;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *签发申请参数实体
 */

@Data
@AllArgsConstructor
public class IssueApplyBean extends Request {

    /**
     *附件
     */
    private String assetAccessories;

    /**
     *申请签发量
     */
    private Integer applicationIssuance;
    /**
     *id
     */
    private Integer id;

    /**
     *签发结束时间
     */
    private String issuancePeriodTimeEnd;

    /**
     *签发开始时间
     */
    private String issuancePeriodTimeStart;
    /**
     *监测文件
     */
    private String monitoringFiles;
    /**
     *核查报告
     */
    private String verificationFile;

    /**
     *电费清单
     */
    private String calculationFile;
    /**
     *发电量计算表
     */
    private String electricityFile;


}
