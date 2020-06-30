package com.member.api.service.impl;

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



}
