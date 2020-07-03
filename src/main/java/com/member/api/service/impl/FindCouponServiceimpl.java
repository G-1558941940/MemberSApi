package com.member.api.service.impl;

import com.member.api.entity.Coupon;
import com.member.api.mappers.coupon.CouponMapper;
import com.member.api.mappers.master.MasterMapper;
import com.member.api.service.FindCouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FindCouponServiceimpl implements FindCouponService {
    @Autowired
    private CouponMapper CouponMapper;
    @Autowired
    private MasterMapper MasterMapper;

    @Override
    public List<Coupon> FindCoupon(Integer Member_id) {
        String str=MasterMapper.FindMemberOpenId(Member_id); // 获取用户的 opendId
        System.out.println("str = " + str);
        List<Coupon> openIdList=CouponMapper.FindAllCoupon(str);

        return openIdList;
    }
}
