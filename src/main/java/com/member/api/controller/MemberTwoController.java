package com.member.api.controller;

import com.member.api.entity.MyResult;
import com.member.api.service.MemberTwoService;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
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
        log.info("进入-获取会员的钱包余额 开始");
        log.info("入参 id: " + id);
        MyResult<Integer> myResult;
        try {
            Integer myWalletBalance = memberTwoService.getMyWalletBalance(id);
            myResult = new MyResult<>(0, "获取会员的钱包余额成功", myWalletBalance);
            log.info("获取会员的钱包余额成功 result ---> " + myResult);
        } catch (Exception e) {
            myResult = new MyResult<>(1, "获取会员的钱包余额失败", null);
            log.error("获取会员的钱包余额失败 result ---> " + myResult);
            log.error("获取会员的钱包余额失败 ---> " + e.getMessage());
        }
        log.info("结束-获取会员的钱包余额 结束");
        return myResult;
    }
}
