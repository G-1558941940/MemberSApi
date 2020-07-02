package com.member.api.service.impl;

import com.member.api.entity.NoPayRecord;
import com.member.api.mappers.second.NopayingRecordMapper;
import com.member.api.service.NoPayingRecordService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class NoPayRecordServiceimpl implements NoPayingRecordService {
    @Autowired
    private NopayingRecordMapper NopayingRecordMapper;
    @Override
    public List<NoPayRecord> NoPayRecord(Integer Member_id) {
        log.info("未支付订单的会员ID->"+Member_id);
        log.info("未支付订单->"+NopayingRecordMapper.NoPayingRecord(Member_id));
        return NopayingRecordMapper.NoPayingRecord(Member_id);
    }
}
