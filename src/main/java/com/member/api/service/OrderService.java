package com.member.api.service;

import com.member.api.dto.WalletTopUpDTO;

import java.util.List;

/**
 * OrderService
 *
 * @author panpan gao
 * @date 2020/7/1
 **/
public interface OrderService {
    /**
     * 获取会员的钱包充值记录
     *
     * @param id 会员id
     * @return 充值记录
     */
    List<WalletTopUpDTO> getWalletRechargeRecord(Integer id);
}
