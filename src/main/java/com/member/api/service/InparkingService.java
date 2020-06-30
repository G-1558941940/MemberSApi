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
     * @param carOwnerId 车主id
     * @param pageIndex 页码
     * @param pageSize 数量
     * @return 进场记录
     */
    List<MemberEntryRecordDTO> getMemberEntryRecord(Integer carOwnerId,Integer pageIndex, Integer pageSize);
}
