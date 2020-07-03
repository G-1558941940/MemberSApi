package com.member.api.service;

import com.member.api.entity.Coupon;

import java.util.List;

public interface FindCouponService {
 List<Coupon> FindCoupon(Integer Member_id);
}
