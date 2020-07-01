package com.member.api.service.impl;

import com.member.api.entity.PayRecord;
import com.member.api.mappers.second.PayingRecordMapper;
import com.member.api.service.PayingRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PayingRecordServiceimpl implements PayingRecordService {
    @Autowired
    private PayingRecordMapper payingRecordMapper;


    @Override
    public List<PayRecord> PayRecord(String carnumber, Integer pageIndex, Integer pageSize) {
        Integer Size=pageSize*(pageIndex-1);
        return payingRecordMapper.PayingRecord(carnumber,pageIndex,Size);
    }
}
