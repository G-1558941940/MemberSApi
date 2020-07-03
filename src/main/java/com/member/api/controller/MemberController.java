package com.member.api.controller;

import com.alibaba.fastjson.JSONObject;
import com.member.api.entity.Member;
import com.member.api.service.FindMemberService;
import com.member.api.service.MemberService;
import com.member.api.service.SecondService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/member")
@RestController
@Slf4j
public class MemberController {
    @Autowired
    private MemberService MemberService;
    @Autowired
    private SecondService SecondService;
    @Autowired
   private  FindMemberService FindMemberService;
    @ApiOperation(value = "会员的支付密码的赋予", httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pay_password", value = "支付密码"),
            @ApiImplicitParam(name = "phone", value = "电话号码")
    })
    @PostMapping(value = "/PasswordMember")
    public JSONObject PasswordMember(String pay_password, String phone) {

        return MemberService.UpdatePassword(pay_password, phone);
    }

    @ApiOperation(value = "会员的注册(正常注册流程，非短信注册)", httpMethod = "POST")
    @PostMapping(value = "/InsertMember")
    public JSONObject InsertMember(Member member) {
        System.out.println("member =1 " + member);
        return MemberService.registerService(member);
    }

    @ApiOperation(value = "会员注册的校验", httpMethod = "POST")
    @PostMapping(value = "/VerifyMember")
    public JSONObject VerifyMember(Member member) {
        System.out.println("member =1 " + member);
        return MemberService.VerifyMember(member);
    }

    @ApiOperation(value = "会员信息的更新", httpMethod = "POST")
    @PostMapping(value = "/UpdateMember")
    public JSONObject UpdateMember(Member member) {
        return MemberService.UpdateMember(member);
    }

    @ApiOperation(value = "会员信息的删除", httpMethod = "POST")
    @PostMapping("/DeleteMember")
    public JSONObject DeleteMember(Member member) {
        return MemberService.DeleteMember(member);
    }

    @ApiOperation(value = "会员信息", httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "phone", value = "会员电话"),
            @ApiImplicitParam(name = "pageSize", value = "每页长度"),
            @ApiImplicitParam(name = "pageIndex", value = "页码")
    })
    @PostMapping("/MemberFind")
    public List<Member> MemberFind(String phone,Integer pageIndex, Integer pageSize) {


        return FindMemberService.FindMember(phone,pageIndex,pageSize);
    }
    @ApiOperation(value = "会员信息行数", httpMethod = "POST")
    @PostMapping("/MemberFindCount")
    public JSONObject MemberFindCount(){

        return FindMemberService.FindMemberCount();
    }


}
