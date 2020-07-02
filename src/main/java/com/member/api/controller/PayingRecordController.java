package com.member.api.controller;

import com.member.api.entity.OutParking;
import com.member.api.entity.PayRecord;
import com.member.api.service.PayingRecordService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequestMapping("/member")
@RestController
public class PayingRecordController {
    @Autowired
    private PayingRecordService PayingRecordService;
    @ApiOperation(value = "会员已支付订单", httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name="Member_id",value = "会员ID"),
            @ApiImplicitParam(name = "pageSize", value = "每页长度"),
            @ApiImplicitParam(name = "pageIndex", value = "页码")
    })
    @PostMapping("/PayingRecord")
    public List<PayRecord> PayingRecord(Integer Member_id, Integer pageIndex, Integer pageSize) {

        //System.out.println(SecondService.parkingRecord(car_owner_id,pageIndex,pageSize));
        return PayingRecordService.PayRecord(Member_id, pageIndex, pageSize);
    }
}
