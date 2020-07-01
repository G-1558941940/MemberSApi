package com.member.api.controller;

import com.member.api.entity.OutParking;
import com.member.api.service.OutparkingService;
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
public class OutparkingController {
@Autowired
private OutparkingService OutparkingService;
    @ApiOperation(value = "会员出场信息", httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name="Member_id",value = "会员信息"),
            @ApiImplicitParam(name = "pageSize", value = "每页长度"),
            @ApiImplicitParam(name = "pageIndex", value = "页码")
    })
    @PostMapping("/OutparkingRecord")
    public List<OutParking> parkingRecord(Integer Member_id, Integer pageIndex, Integer pageSize) {
        System.out.println("Member_id = " + Member_id);
        System.out.println("pageIndex = " + pageIndex);
        System.out.println("pageSize = " + pageSize);
        //System.out.println(SecondService.parkingRecord(car_owner_id,pageIndex,pageSize));
        return OutparkingService.OutParkingRecord(Member_id,pageIndex,pageSize);
    }

}
