package org.jeecg.modules.SmartPaper.vo;

import lombok.Data;

/**
 * @Description:
 * @Author: sike
 * @Date: 2021/12/9 1:58
 * @Version: V1.0
 */
@Data
public class ExamPeopleScoreVo {
    private String examId;
    private String examName;
    private String deptId;
    private String deptName;
    private String personName;
    private Integer examGrade;
}