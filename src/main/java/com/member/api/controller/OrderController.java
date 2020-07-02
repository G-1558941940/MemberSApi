package com.member.api.controller;

import com.member.api.dto.WalletTopUpDTO;
import com.member.api.entity.MyResult;
import com.member.api.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * OrderController
 *
 * @author panpan gao
 * @date 2020/7/1
 **/
@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    /**
     * 获取会员钱包充值记录
     *
     * @param id 会员id
     * @return 记录
     */
    @GetMapping("/getWalletRechargeRecord")
    public MyResult<List<WalletTopUpDTO>> getWalletRechargeRecord(Integer id, Integer pageIndex, Integer pageSize) {
        log.info("获取会员钱包充值记录 -- 进入");
        log.info("入参 id: " + id + ",pageIndex: " + pageIndex + ",pageSize: " + pageSize);
        MyResult<List<WalletTopUpDTO>> myResult;
        try {
            List<WalletTopUpDTO> walletRechargeRecord = orderService.getWalletRechargeRecord(id, pageIndex, pageSize);
            myResult = new MyResult<>(0, "获取会员钱包充值记录成功", walletRechargeRecord);
            log.info("获取会员钱包充值记录成功 result --> " + myResult);
        } catch (Exception e) {
            e.printStackTrace();
            myResult = new MyResult<>(1, "获取会员钱包充值记录失败", null);
            log.error("获取会员钱包充值记录失败 result --> " + myResult);
            log.error("获取会员钱包充值记录失败 --> " + e.getMessage());
        }
        log.info("获取会员钱包充值记录 -- 结束");
        return myResult;
    }
}
