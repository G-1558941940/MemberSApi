package com.member.api.service.impl;

import com.member.api.entity.PayRecord;
import com.member.api.mappers.second.PayingRecordMapper;
import com.member.api.service.PayingRecordService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class PayingRecordServiceimpl implements PayingRecordService {
    @Autowired
    private PayingRecordMapper payingRecordMapper;


    @Override
    public List<PayRecord> PayRecord(Integer Member_id, Integer pageIndex, Integer pageSize) {
        Integer Size=pageSize*(pageIndex-1);
        log.info("已支付订单的会员ID->"+Member_id);
        log.info("已支付订单的每页长度->"+pageSize);
        log.info("已支付订单的跳过长度->"+Size);
        log.info("已支付订单->"+payingRecordMapper.PayingRecord(Member_id,pageIndex,Size));
        return payingRecordMapper.PayingRecord(Member_id,pageIndex,Size);
    }
}
