package com.member.api.service;

import com.member.api.entity.PayRecord;

import java.util.List;

public interface PayingRecordService {
    List<PayRecord> PayRecord(String carnumber, Integer pageIndex,Integer pageSize);

}
