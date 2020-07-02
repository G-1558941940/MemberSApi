package com.member.api.controller;

import com.member.api.entity.MontCar;
import com.member.api.service.MonthCarService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/member")
@RestController
public class MonthCarController {
    @Autowired
    private MonthCarService MonthCarService;
    @ApiOperation(value = "会员月租车信息", httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name="Member_id",value = "会员信息"),
    })
    @PostMapping("/FindMonthCarRecord")
    public List<MontCar> FindMonthCarRecord(Integer Member_id){
        return MonthCarService.FindCarRecord(Member_id);
    }

}
