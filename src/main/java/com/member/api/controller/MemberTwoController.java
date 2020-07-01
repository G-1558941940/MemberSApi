package com.member.api.controller;

import com.member.api.entity.MyResult;
import com.member.api.service.MemberTwoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * MemberTwoController
 *
 * @author panpan gao
 * @date 2020/7/1
 **/
@RestController
@RequestMapping("/memberTwo")
public class MemberTwoController {
    private final MemberTwoService memberTwoService;

    public MemberTwoController(MemberTwoService memberTwoService) {
        this.memberTwoService = memberTwoService;
    }

    /**
     * 获取会员的钱包余额
     * @param id 会员id
     */
    @GetMapping("/getMyWalletBalance")
    public MyResult<Integer> getMyWalletBalance(Integer id){
        MyResult<Integer> myResult;
        try {
            Integer myWalletBalance = memberTwoService.getMyWalletBalance(id);
            myResult = new MyResult<>(0, "获取会员的钱包余额成功", myWalletBalance);
        } catch (Exception e) {
            e.printStackTrace();
            myResult = new MyResult<>(1, "获取会员的钱包余额失败", null);
        }
        return myResult;
    }
}
