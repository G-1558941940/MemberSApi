package com.member.api.service.impl;

import com.member.api.entity.OutParking;
import com.member.api.mappers.second.FindCarNumberMapper;
import com.member.api.mappers.second.OutParkingMapper;
import com.member.api.service.OutparkingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class OutparkingServiceimpl implements OutparkingService {
    @Autowired
    private FindCarNumberMapper FindCarNumberMapper;
    @Autowired
    private OutParkingMapper OutParkingMapper;

    @Override
    public List<OutParking> OutParkingRecord(Integer Member_id, Integer pageIndex, Integer pageSize) {

        Integer Size = pageSize * (pageIndex - 1); // limit ? offset pageindex
       log.info("出场记录的会员ID->"+Member_id);
       log.info("出场记录每页长度->"+pageSize);
       log.info("出场记录跳过长度->"+Size);

            List<OutParking> listout = OutParkingMapper.OutParkRecord(Member_id, pageSize, Size);
     log.info("出场记录->"+listout);


        return listout;
    }


}
