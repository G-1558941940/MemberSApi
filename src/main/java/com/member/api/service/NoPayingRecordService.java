package com.member.api.service;

import com.member.api.entity.NoPayRecord;
import com.member.api.entity.PayRecord;

import java.util.List;

public interface NoPayingRecordService {
    List<NoPayRecord> NoPayRecord(Integer Member_id);
}
