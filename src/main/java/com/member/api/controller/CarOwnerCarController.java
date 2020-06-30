package com.member.api.controller;

import com.member.api.dto.PersonalVehiclesDTO;
import com.member.api.entity.MyResult;
import com.member.api.service.CarOwnerCarService;
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
public class CarOwnerCarController {
    private final CarOwnerCarService carOwnerCarService;

    public CarOwnerCarController(CarOwnerCarService carOwnerCarService) {
        this.carOwnerCarService = carOwnerCarService;
    }

    /**
     * 查询我的车辆信息
     */
    @GetMapping("/getPersonalVehicles")
    public MyResult<List<PersonalVehiclesDTO>> getPersonalVehicles(Integer carOwnerId, Integer pageIndex, Integer pageSize) {
        MyResult<List<PersonalVehiclesDTO>> myResult;
        try {
            List<PersonalVehiclesDTO> personalVehicles = carOwnerCarService.getPersonalVehicles(carOwnerId, pageIndex, pageSize);
            myResult = new MyResult<>(0, "获取个人车辆成功", personalVehicles);
        } catch (Exception e) {
            e.printStackTrace();
            myResult = new MyResult<>(1, "获取个人车辆失败", null);
        }
        return myResult;
    }
}
