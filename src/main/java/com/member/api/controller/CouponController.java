package com.member.api.controller;

import com.member.api.entity.Coupon;
import com.member.api.service.FindCouponService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/member")
public class CouponController {
    @Autowired
    private FindCouponService FindCouponService;

    @ApiOperation(value = "会员优惠券信息", httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "Member_id", value = "会员ID"),
    })
    @PostMapping("/FindCoupon")
    public List<Coupon> FindCoupon(Integer Member_id) {
        return FindCouponService.FindCoupon(Member_id);
    }
}
