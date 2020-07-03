package com.member.api.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.member.api.entity.Member;
import com.member.api.mappers.master.MasterMapper;
import com.member.api.mappers.second.FindCarNumberMapper;
import com.member.api.service.FindMemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class FindMemberServiceimpl implements FindMemberService {
    @Autowired
    private MasterMapper MasterMapper;
    @Override
    public List<Member> FindMember(String phone,Integer pageIndex,Integer pageSize) {
        Integer Size= (pageIndex - 1) * pageSize;
        log.info("每页长度->"+pageSize);
        log.info("跳过长度->"+Size);
        log.info("会员信息->"+MasterMapper.FindMember(phone,pageSize,Size));
        return MasterMapper.FindMember(phone,pageSize,Size);
    }

    @Override
    public JSONObject FindMemberCount() {
          log.info("会员总数量->"+MasterMapper.FindMemberCount());
        return (JSONObject)JSON.parse("{\"count\":"+MasterMapper.FindMemberCount()+"}");
    }
}
