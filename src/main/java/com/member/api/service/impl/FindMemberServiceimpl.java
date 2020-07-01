package com.member.api.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.member.api.entity.Member;
import com.member.api.mappers.master.MasterMapper;
import com.member.api.mappers.second.FindCarNumberMapper;
import com.member.api.service.FindMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FindMemberServiceimpl implements FindMemberService {
    @Autowired
    private MasterMapper MasterMapper;
    @Override
    public List<Member> FindMember(Integer pageIndex,Integer pageSize) {
        Integer Size= (pageIndex - 1) * pageSize;
        return MasterMapper.FindMember(pageIndex,Size);
    }

    @Override
    public JSONObject FindMemberCount() {

        return (JSONObject)JSON.parse("{\"count\":"+MasterMapper.FindMemberCount()+"}");
    }
}
