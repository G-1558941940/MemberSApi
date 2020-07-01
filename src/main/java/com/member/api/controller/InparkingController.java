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
     * @param carOwnerId 车主id   当车主id = null  的时候将查询全部
     * @param pageIndex 页码
     * @param pageSize 显示数量
     */
    @GetMapping("/getMemberEntryRecord")
    public MyResult<List<MemberEntryRecordDTO>> getMemberEntryRecord(Integer carOwnerId,Integer pageIndex, Integer pageSize){
        MyResult<List<MemberEntryRecordDTO>> myResult;
        try {
            List<MemberEntryRecordDTO> memberEntryRecord = inparkingService.getMemberEntryRecord(carOwnerId, pageIndex, pageSize);
            myResult = new MyResult<>(0, "获取会员列表成功", memberEntryRecord);
        } catch (Exception e) {
            e.printStackTrace();
            myResult = new MyResult<>(1, "获取会员列表失败", null);
        }
        return myResult;
    }
}
