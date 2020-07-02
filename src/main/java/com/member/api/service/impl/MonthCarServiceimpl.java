package com.member.api.service.impl;

import com.member.api.entity.MontCar;
import com.member.api.mappers.second.MonthCarMapper;
import com.member.api.service.MonthCarService;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class MonthCarServiceimpl implements MonthCarService {
    @Autowired
    private MonthCarMapper MonthCarMapper;
    @Override
    public List<MontCar> FindCarRecord(Integer Member_id) {
        log.info("查询月租车的会员ID->"+Member_id);
        List<MontCar> list=MonthCarMapper.FindMonthCar(Member_id);
        log.info("会员月租车的记录->"+list);
        return list;
    }
}
