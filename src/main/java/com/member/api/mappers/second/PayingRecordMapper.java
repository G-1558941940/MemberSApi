package com.member.api.mappers.second;

import com.member.api.entity.PayRecord;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface PayingRecordMapper {
    /**已经支付的订单
     * @param CarNUmber
     * @param pageSize
     * @param Size
     * @return
     */
    List<PayRecord> PayingRecord(@Param("CarNUmber") String CarNUmber, @Param("pageSize") Integer pageSize, @Param("Size") Integer Size );
}
