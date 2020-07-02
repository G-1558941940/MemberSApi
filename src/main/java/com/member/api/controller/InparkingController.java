package com.member.api.controller;

import com.member.api.dto.MemberEntryRecordDTO;
import com.member.api.entity.MyResult;
import com.member.api.service.InparkingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * InparkingController
 *
 * @author panpan gao
 * @date 2020/6/30
 **/
@RestController
@RequestMapping("/inparking")
@Slf4j
public class InparkingController {
    private final InparkingService inparkingService;

    public InparkingController(InparkingService inparkingService) {
        this.inparkingService = inparkingService;
    }

    /**
     * 获取会员的进场记录
     * @param memberId 会员id
     */
    @GetMapping("/getMemberEntryRecord")
    public MyResult<List<MemberEntryRecordDTO>> getMemberEntryRecord(Integer memberId){
        log.info("进入-获取进场记录 开始");
        log.info("入参 memberId: " + memberId);
        MyResult<List<MemberEntryRecordDTO>> myResult;
        try {
            List<MemberEntryRecordDTO> memberEntryRecord = inparkingService.getMemberEntryRecord(memberId);
            myResult = new MyResult<>(0, "获取进场记录成功", memberEntryRecord);
            log.info("获取进场记录成功 ---> " + myResult);
        } catch (Exception e) {
            myResult = new MyResult<>(1, "获取进场记录失败", null);
            log.error("获取进场记录失败 ---> " + myResult);
            log.error("获取进场记录失败 ---> " + e.getMessage());
        }
        log.info("结束-获取进场记录 结束");
        return myResult;
    }
}
