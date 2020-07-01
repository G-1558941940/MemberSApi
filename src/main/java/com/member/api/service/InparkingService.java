package com.member.api.service;

import com.member.api.dto.MemberEntryRecordDTO;

import java.util.List;

/**
 * InparkingService
 *
 * @author panpan gao
 * @date 2020/6/30
 **/
public interface InparkingService {
    /**
     * 获取会员的进场记录
     * @param memberId 会员id
     * @return 进场记录
     */
    List<MemberEntryRecordDTO> getMemberEntryRecord(Integer memberId);
}
