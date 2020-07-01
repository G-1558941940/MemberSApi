package com.member.api.service.impl;

import com.member.api.entity.OutParking;
import com.member.api.mappers.second.FindCarNumberMapper;
import com.member.api.mappers.second.OutParkingMapper;
import com.member.api.service.OutparkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OutparkingServiceimpl implements OutparkingService {
    @Autowired
    private FindCarNumberMapper FindCarNumberMapper;
    @Autowired
    private OutParkingMapper OutParkingMapper;
    @Override
    public List<OutParking> OutParkingRecord(Integer Member_id, Integer pageIndex, Integer pageSize) {
        List<String> list=FindCarNumberMapper.findCarNumber(Member_id);
        List<OutParking> listout = null;
        for (int i=0; i< list.size();i++) {
         listout= OutParkingMapper.OutParkRecord(list.get(i),pageIndex,pageSize);
        }
        System.out.println("listout = " + listout);
        return listout;
    }
}
