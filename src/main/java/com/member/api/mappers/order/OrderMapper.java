package com.member.api.mappers.order;

import com.member.api.dto.WalletTopUpDTO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * OrderMapper
 *
 * @author panpan gao
 * @date 2020/7/1
 **/
public interface OrderMapper {
    /**
     * 获取会员的钱包充值记录
     * @param id 会员id
     * @return 充值记录
     */
    @Select("SELECT " +
            "\"order\".payamount as rechargeAmount," +
            "wallet.cur_wallet_mny as balanceAfterRecharge," +
            "\"order\".pay_finished as paymentTime," +
            "\"order\".order_no as orderNumber," +
            "\"order\".member_name as memberName " +
            "FROM " +
            "member_wallet_log wallet " +
            "LEFT JOIN parking_recharge_order \"order\" on wallet.recharge_order_id = \"order\".id " +
            "where \"order\".member_id = #{id} ")
    List<WalletTopUpDTO> selectWalletRechargeRecord(Integer id);
}
