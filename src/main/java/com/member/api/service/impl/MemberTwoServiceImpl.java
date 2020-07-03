package com.member.api.service.impl;

import com.member.api.mappers.master.MemberMapper;
import com.member.api.service.MemberTwoService;
import org.springframework.stereotype.Service;

/**
 * MemberTwoServiceImpl
 *
 * @author panpan gao
 * @date 2020/7/1
 **/
@Service
public class MemberTwoServiceImpl implements MemberTwoService {
    private final MemberMapper memberMapper;

    public MemberTwoServiceImpl(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    @Override
    public Double getMyWalletBalance(Integer id) {
        Double money = memberMapper.selectWalletMnyById(id) / 100.00;
        return money;
    }
}
