package com.member.api.mappers.master;

import com.member.api.entity.Member;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MasterMapper {


    /**
     * 会员注册
     * @param Member
     * @return
     */
     Integer MemberRegister(@Param("Member") Member Member);

    /**
     * 按号码查询会员是否被注册
     * @param Member
     * @return
     */
     List<Member> VerifyMember(@Param("Member") Member Member);

    /**更新会员信息
     * @param Member
     * @return
     */
     Integer UpdateMember(@Param("Member") Member Member);

    /**赋予支付密码
     * @param pay_password
     * @param phone
     * @return
     */
     Integer UpdatePassWord(@Param("pay_password") String pay_password, @Param("phone") String phone);

    /**删除会员
     * @param member
     * @return
     */
     Integer DeleteMember(@Param("member") Member member);
     List<Member> FindMember(@Param("pageSize") Integer pageSize, @Param("Size") Integer Size);
     Integer FindMemberCount();
}
