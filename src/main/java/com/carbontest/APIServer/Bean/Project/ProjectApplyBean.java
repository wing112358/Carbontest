package com.carbontest.APIServer.Bean.Project;


import com.carbontest.APIServer.Bean.common.Request;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *项目申请参数实体
 */

@Data
@AllArgsConstructor
public class ProjectApplyBean extends Request {

    /**
     *地址
     */
    private String address;

    /**
     *申请签发量
     */
    private Integer applicationIssuance;

    /**
     *资产附件
     */
    private String assetAccessories;

    /**
     *公司id
     */
    private Integer companyId;

    /**
     *预计总量
     */
    private Integer estimatedTotal;

    /**
     *签发截止时间
     */
    private String issuancePeriodTimeEnd;

    /**
     *签发开始时间
     */
    private String issuancePeriodTimeStart;

    /**
     *方法论
     */
    private Integer methodology;

    /**
     *监测文件
     */
    private String monitoringFiles;

    /**
     *计算周期结束时间
     */
    private String periodTimeEnd;

    /**
     *计算周期开始时间
     */
    private String periodTimeStart;

    /**
     *项目所在方
     */
    private String projectAccessories;

    /**
     *项目坐标
     */
    private String projectArea;

    /**
     *项目简介
     */
    private String projectBrief;

    /**
     *项目文件
     */
    private String projectFiles;

    /**
     *项目名称
     */
    private String projectName;

    /**
     *项目类型
     */
    private Integer projectType;

    /**
     *审定报告
     */
    private String validationFiles;

    /**
     *核查报告
     */
    private String verificationFile;


    /**
     *项目合同
     */
    private String contract;


    /**
     *项目声明文件
     */
    private String declarationFile;


    /**
     *电费清单
     */
    private String electricityFile;


    /**
     *现场照片
     */
    private String picture;


    /**
     *项目并网时间
     */
    private String projectConnectionTime;


    /**
     *接线图
     */
    private String wiringDiagram;




}
