package com.member.api.service.impl;

import com.member.api.dto.WalletTopUpDTO;
import com.member.api.mappers.order.OrderMapper;
import com.member.api.service.OrderService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * OrderServiceImpl
 *
 * @author panpan gao
 * @date 2020/7/1
 **/
@Service
public class OrderServiceImpl implements OrderService {
    private final OrderMapper orderMapper;

    public OrderServiceImpl(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }

    @Override
    public List<WalletTopUpDTO> getWalletRechargeRecord(Integer id) {
        List<WalletTopUpDTO> walletTopUpDTOS = orderMapper.selectWalletRechargeRecord(id);
        for (WalletTopUpDTO walletTopUpDTO : walletTopUpDTOS) {
            BigDecimal rechargeAmount = walletTopUpDTO.getRechargeAmount().divide(BigDecimal.valueOf(100),2,BigDecimal.ROUND_HALF_DOWN);
            BigDecimal balanceAfterRecharge = walletTopUpDTO.getBalanceAfterRecharge().divide(BigDecimal.valueOf(100),2,BigDecimal.ROUND_HALF_DOWN);
            walletTopUpDTO.setRechargeAmount(rechargeAmount);
            walletTopUpDTO.setBalanceAfterRecharge(balanceAfterRecharge);
        }
        return walletTopUpDTOS;
    }
}
