package com.member.api.service;

import com.member.api.dto.RecordDTO;

import java.util.List;

/**
 * EInvoceRecordService
 *
 * @author panpan gao
 * @date 2020/7/2
 **/
public interface EInvoceRecordService {
    /**
     * 获取会员开票记录
     * @param memberId 会员id
     * @param pageIndex 页码
     * @param pageSize 显示数量
     * @return 开票记录
     */
    List<RecordDTO> getRecordsOfMakeOutAnInvoice(Integer memberId,Integer pageIndex, Integer pageSize);
}
