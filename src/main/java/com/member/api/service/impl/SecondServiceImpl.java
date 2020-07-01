package com.member.api.service.impl;

import com.member.api.entity.Car_owner;
import com.member.api.entity.OutParking;
import com.member.api.mappers.master.MasterMapper;
import com.member.api.mappers.second.SecondMapper;
import com.member.api.service.SecondService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecondServiceImpl implements SecondService {
    @Autowired
    private SecondMapper SecondMapper;
    @Autowired
    private MasterMapper MasterMapper;


    @Override
    public List<Car_owner> Car_owners(Integer pageIndex, Integer pageSize) {
        Integer size = (pageIndex - 1) * pageSize;

        return SecondMapper.Car_owner(pageSize,size);

    }
/*
    @Override
    public List<OutParking> parkingRecord(Integer Car_owner_id, Integer pageIndex, Integer pageSize) {
        Integer size = (pageIndex - 1) * pageSize;
        System.out.println("size = " + size);
        return SecondMapper.ParkRecord(Car_owner_id,pageSize,size);
    }
    */
}
