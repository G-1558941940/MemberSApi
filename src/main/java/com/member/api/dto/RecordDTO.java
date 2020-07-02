package com.member.api.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * RecordDTO
 *
 * @author panpan gao
 * @date 2020/7/2
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RecordDTO {
    /**
     * 发票主题
     */
    private String companyName;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 申请开票时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date applyDate;

    /**
     * 完成时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date finishDate;

    /**
     * 发表抬头类型：0(企业发票)；1(个人发票)
     */
    @JsonIgnore
    private Integer invoceHeadType;


    private String invoceHeadTypeStr;

    /**
     * 发票抬头
     */
    private String invocdHead;

    /**
     * 消费类型，0(停车费);1(充值消费);2(月卡缴费)
     */
    @JsonIgnore
    private Integer spendType;

    /**
     * 消费类型
     */
    private String spendTypeStr;

    /**
     * 纳税人识别号
     */
    private String taxNumber;

    /**
     * 发票总金额
     */
    private Integer totalMoney;

    /**
     * 完成状态：true(完成);false(未完成)
     */
    @JsonIgnore
    private Boolean finishState;

    /**
     * 完成状态
     */
    private String finishStateStr;
}
