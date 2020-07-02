package com.member.api.service.impl;

import com.member.api.dto.MemberEntryRecordDTO;
import com.member.api.mappers.second.InparkingMapper;
import com.member.api.service.InparkingService;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    public List<MemberEntryRecordDTO> getMemberEntryRecord(Integer memberId) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long currentTime = System.currentTimeMillis(); // 当前时间时间戳
        List<MemberEntryRecordDTO> memberEntryRecordDTOS = inparkingMapper.selectMemberEntryRecord(memberId);
        for (MemberEntryRecordDTO memberEntryRecordDTO : memberEntryRecordDTOS) {
            Date intime = memberEntryRecordDTO.getIntime(); // 入场时间
            long createTime = df.parse(df.format(intime)).getTime();
            long diff = (currentTime - createTime) / 1000 / 60;
            memberEntryRecordDTO.setStopTime((int) diff);
        }
        return memberEntryRecordDTOS;
    }
}
