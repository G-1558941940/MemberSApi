package com.member.api.service;

import com.alibaba.fastjson.JSONObject;
import com.member.api.entity.Member;

public interface MemberService {
    public JSONObject registerService(Member member);
    public JSONObject VerifyMember(Member member);
    public JSONObject UpdateMember(Member member);
    public JSONObject UpdatePassword(String pay_password,String phone);
    public JSONObject DeleteMember(Member member);


}
