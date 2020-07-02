package com.member.api.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class EInvoceRecord {
    private Long id;

    private String companyName;

    /**
     * 用户手机
     */
    private String phone;

    /**
     * 申请时间
     */
    private Date applyDate;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 住址
     */
    private String address;

    /**
     * 完成时间
     */
    private Date finishDate;

    /**
     * 完成状态：true(完成);false(未完成)
     */
    private Boolean finishState;

    /**
     * 发票抬头类型：0(企业发票)；1(个人发票)
     */
    private Integer invoceHeadType;

    /**
     * 发票抬头
     */
    private String invocdHead;

    /**
     * 发票流水号
     */
    private String code;

    /**
     * 发票类型：0（普通发票）；1(增值税专用发票)
     */
    private Integer invoceType;

    /**
     * 发票总金额
     */
    private Long totalMoney;

    /**
     * 纳税人识别号
     */
    private String taxNumber;

    /**
     * 是否推送:已经推送(true);没有推送(false)
     */
    private Boolean isPush;

    /**
     * 消费类型，0(停车费);1(充值消费);2(月卡缴费)
     */
    private Integer spendType;

    private Long companyId;

    /**
     * 会员id
     */
    private Long memberId;
}