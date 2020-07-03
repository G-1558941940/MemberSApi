package com.member.api.service;

/**
 * MemberTwoService
 *
 * @author panpan gao
 * @date 2020/7/1
 **/
public interface MemberTwoService {
    /**
     * 根据id 获取会员的钱包余额
     * @param id 会员id
     * @auth panpan gao
     * @return 钱包余额
     */
    Double getMyWalletBalance(Integer id);
}
