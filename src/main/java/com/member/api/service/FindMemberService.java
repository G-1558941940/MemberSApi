package com.member.api.service;

import com.member.api.entity.Member;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FindMemberService {
    List<Member> FindMember( Integer pageIndex,Integer pageSize);
}
