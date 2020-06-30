package com.member.api.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.member.api.entity.Member;
import com.member.api.mappers.master.MasterMapper;
import com.member.api.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MasterMapper MemberMapper;

    @Override
    public JSONObject registerService(Member member) {
        System.out.println("member =2 " + member);
        Integer inte1=MemberMapper.MemberRegister(member);
        JSONObject pase=null;
        if (inte1>0){
           pase= JSON.parseObject("{\"InsertStatus\":\"注册成功\"}");
        }else {
            pase= JSON.parseObject("{\"InsertStatus\":\"注册失败\"}");
        }
        System.out.println("pase = " + pase);
        return pase;
    }

    @Override
    public JSONObject VerifyMember(Member member) {
           List<Member> list=MemberMapper.VerifyMember(member);

        JSONObject pase=null;
        if (list!=null){
            pase= JSON.parseObject("{\"VerifyStatus\":\"不可用，会员已被注册\"}");
        }else {
            pase= JSON.parseObject("{\"VerifyStatus\":\"可用，会员可以注册\"}");
        }
        System.out.println("pase = " + pase);
         return pase;

    }

    @Override
    public JSONObject UpdateMember(Member member) {
         Integer inte1=MemberMapper.UpdateMember(member);
        JSONObject pase=null;
         if (inte1>0){
             pase= JSON.parseObject("{\"UpdateStatus\":\"修改成功\"}");
         }else {
             pase= JSON.parseObject("{\"UpdateStatus\":\"修改失败\"}");
         }
        System.out.println("pase = " + pase);
        return pase;
    }

    /**赋予支付密码
     * @param pay_password
     * @param phone
     * @return
     */
    @Override
    public JSONObject UpdatePassword(String pay_password, String phone) {

        Integer inte1=MemberMapper.UpdatePassWord(pay_password,phone);
        JSONObject pase=null;
        if (inte1>0){
            pase= JSON.parseObject("{\"UpdateStatus\":\"密码修改成功\"}");
        }else {
            pase= JSON.parseObject("{\"UpdateStatus\":\"密码修改失败\"}");
        }
        System.out.println("pase = " + pase);
        return pase;
    }

    /**删除会员
     * @param member
     * @return
     */
    @Override
    public JSONObject DeleteMember(Member member) {
        System.out.println("member 3= " + member);
        Integer inte1=MemberMapper.DeleteMember(member);
        JSONObject pase=null;
        if (inte1>0){
            pase=JSON.parseObject("{\"DeleteStatus\":\"会员删除成功\"}");
        }else {
            pase=JSON.parseObject("{\"DeleteStatus\":\"会员删除失败\"}");
        }
        return pase;
    }
}
