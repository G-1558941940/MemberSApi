package com.member.api.mappers.second;

import com.member.api.entity.PayRecord;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface PayingRecordMapper {
    /**已经支付的订单
     * @param Member_id
     * @param pageSize
     * @param Size
     * @return
     */
    List<PayRecord> PayingRecord(@Param("Member_id") Integer Member_id, @Param("pageSize") Integer pageSize, @Param("Size") Integer Size );

}
