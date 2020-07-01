package com.member.api.controller;

import com.member.api.dto.MemberEntryRecordDTO;
import com.member.api.entity.MyResult;
import com.member.api.service.InparkingService;
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
        MyResult<List<MemberEntryRecordDTO>> myResult;
        try {
            List<MemberEntryRecordDTO> memberEntryRecord = inparkingService.getMemberEntryRecord(memberId);
            myResult = new MyResult<>(0, "获取进场记录成功", memberEntryRecord);
        } catch (Exception e) {
            e.printStackTrace();
            myResult = new MyResult<>(1, "获取进场记录失败", null);
        }
        return myResult;
    }
}
