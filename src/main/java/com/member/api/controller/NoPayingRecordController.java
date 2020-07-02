package com.member.api.controller;

import com.member.api.entity.NoPayRecord;
import com.member.api.entity.PayRecord;
import com.member.api.service.NoPayingRecordService;
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
public class NoPayingRecordController {
    @Autowired
    private NoPayingRecordService NoPayingRecordService;
    @ApiOperation(value = "会员未支付订单", httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name="Member_id",value = "会员ID"),

    })
    @PostMapping("/NoPayingRecord")
    public List<NoPayRecord> NoPayingRecord(Integer Member_id) {
        System.out.println("Member_id = " + Member_id);

        //System.out.println(SecondService.parkingRecord(car_owner_id,pageIndex,pageSize));
        return NoPayingRecordService.NoPayRecord(Member_id);
    }
}
