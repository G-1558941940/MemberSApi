package com.member.api.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

/**
 * WalletTopUpDTO
 *
 * @author panpan gao
 * @date 2020/7/1
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class WalletTopUpDTO {
    /**
     * 充值金额
     */
    private BigDecimal rechargeAmount;

    /**
     * 充值后的余额
     */
    private BigDecimal balanceAfterRecharge;

    /**
     * 支付时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date paymentTime;

    /**
     * 订单号
     */
    private String orderNumber;

    /**
     * 会员名称
     */
    private String memberName;


}
