package com.member.api.mappers.second.impl;

import com.member.api.dto.MemberEntryRecordDTO;
import com.member.api.mappers.second.InparkingMapper;
import com.member.api.service.InparkingService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * InparkingServiceImpl
 *
 * @author panpan gao
 * @date 2020/6/30
 **/
@Service
public class InparkingServiceImpl implements InparkingService {
    private final InparkingMapper inparkingMapper;

    public InparkingServiceImpl(InparkingMapper inparkingMapper) {
        this.inparkingMapper = inparkingMapper;
    }
    @Override
    public List<MemberEntryRecordDTO> getMemberEntryRecord(Integer carOwnerId, Integer pageIndex, Integer pageSize) {
        int pageIndex2 = (pageIndex - 1) * pageSize;
        return inparkingMapper.selectMemberEntryRecord(carOwnerId, pageIndex2, pageSize);
    }
}
