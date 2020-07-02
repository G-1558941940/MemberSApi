package com.member.api.controller;

import com.member.api.dto.PersonalVehiclesDTO;
import com.member.api.entity.MyResult;
import com.member.api.service.CarOwnerCarService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

/**
 * CarOwnerCarController
 *
 * @author panpan gao
 * @date 2020/6/30
 **/
@RestController
@RequestMapping("/carownercar")
@Slf4j
public class CarOwnerCarController {
    private final CarOwnerCarService carOwnerCarService;

    public CarOwnerCarController(CarOwnerCarService carOwnerCarService) {
        this.carOwnerCarService = carOwnerCarService;
    }

    /**
     * 查询我的车辆信息
     */
    @GetMapping("/getPersonalVehicles")
    public MyResult<List<PersonalVehiclesDTO>> getPersonalVehicles(Integer memberId) {
        log.info("查询获取个人车辆 开始");
        log.info("入参 memberId: " + memberId);
        MyResult<List<PersonalVehiclesDTO>> myResult;
        try {
            List<PersonalVehiclesDTO> personalVehicles = carOwnerCarService.getPersonalVehicles(memberId);
            myResult = new MyResult<>(0, "获取个人车辆成功", personalVehicles);
            log.info("获取个人车辆成功 ---> " + myResult);
        } catch (Exception e) {
            myResult = new MyResult<>(1, "获取个人车辆失败", null);
            log.error("获取个人车辆失败 result ---> " + myResult);
            log.error("获取个人车辆失败 ---> " +  e.getMessage());
        }
        log.info("查询获取个人车辆 结束");
        return myResult;
    }
}
