package com.member.api.service;

import com.member.api.entity.PayRecord;

import java.util.List;

public interface PayingRecordService {
    List<PayRecord> PayRecord(Integer Member_id, Integer pageIndex,Integer pageSize);

}
