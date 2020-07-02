package com.member.api.mappers.second;

import com.member.api.entity.NoPayRecord;
import com.member.api.entity.PayRecord;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface NopayingRecordMapper {
    /**未支付的订单
     * @param Member_id
     * @return
     */
    List<NoPayRecord> NoPayingRecord(@Param("Member_id") Integer Member_id );
}
