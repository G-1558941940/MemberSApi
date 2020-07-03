package com.member.api.mappers.coupon;

import com.member.api.entity.Coupon;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CouponMapper {

    List<Coupon> FindAllCoupon(@Param("Open_id") String Open_id);
}
