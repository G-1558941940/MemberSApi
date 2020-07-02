package com.member.api.controller;

import com.member.api.dto.RecordDTO;
import com.member.api.entity.MyResult;
import com.member.api.service.EInvoceRecordService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * EInvoceRecordController
 *
 * @author panpan gao
 * @date 2020/7/2
 **/
@RestController
@RequestMapping("/record")
@Slf4j
public class EInvoceRecordController {
    private final EInvoceRecordService eInvoceRecordService;

    public EInvoceRecordController(EInvoceRecordService eInvoceRecordService) {
        this.eInvoceRecordService = eInvoceRecordService;
    }

    /**
     * 获取会员开票
     *
     * @param memberId  会员id
     * @param pageIndex 页码
     * @param pageSize  显示数量
     * @return 获取会员开票
     */
    @GetMapping("/getRecordsOfMakeOutAnInvoice")
    public MyResult<List<RecordDTO>> getRecordsOfMakeOutAnInvoice(Integer memberId, Integer pageIndex, Integer pageSize) {
        log.info("获取会员开票成功 开始");
        log.info("入参 memberId: " + memberId + ",pageIndex: " + pageIndex + ",pageSize: " + pageSize);
        MyResult<List<RecordDTO>> myResult;
        try {
            List<RecordDTO> recordsOfMakeOutAnInvoice = eInvoceRecordService.getRecordsOfMakeOutAnInvoice(memberId, pageIndex, pageSize);
            myResult = new MyResult<>(0, "获取会员开票成功", recordsOfMakeOutAnInvoice);
            log.info("获取会员开票成功 result -- > " + myResult);
        } catch (Exception e) {
            myResult = new MyResult<>(1, "获取会员开票失败", null);
            log.error("获取会员开票失败 result -- > " + myResult);
            log.error("获取会员开票失败 error -- > " + e.getMessage());
        }
        log.info("获取会员开票成功 结束");
        return myResult;
    }
}
