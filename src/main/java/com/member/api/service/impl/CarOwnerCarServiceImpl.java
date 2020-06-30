package com.member.api.service.impl;

import com.member.api.dto.PersonalVehiclesDTO;
import com.member.api.mappers.second.CarOwnerCarMapper;
import com.member.api.service.CarOwnerCarService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * CarOwnerCarServiceImpl
 *
 * @author panpan gao
 * @date 2020/6/30
 **/
@Service
public class CarOwnerCarServiceImpl implements CarOwnerCarService {
    private final CarOwnerCarMapper carOwnerCarMapper;

    public CarOwnerCarServiceImpl(CarOwnerCarMapper carOwnerCarMapper) {
        this.carOwnerCarMapper = carOwnerCarMapper;
    }

    @Override
    public List<PersonalVehiclesDTO> getPersonalVehicles(Integer carOwnerId, Integer pageIndex, Integer pageSize) {
        int pageIndex2 = (pageIndex - 1) * pageSize;
        List<PersonalVehiclesDTO> personalVehiclesDTOS = carOwnerCarMapper.selectPersonalVehicles(carOwnerId, pageIndex2, pageSize);
        for (PersonalVehiclesDTO personalVehiclesDTO : personalVehiclesDTOS) {

            String carmodeName = personalVehiclesDTO.getCarmodeName();
            String carmodeName2;
            switch (carmodeName){
                case "面包车":
                case "轿车":
                case "小货车":
                case "未知":
                    carmodeName2 = "小型车";
                    break;
                case "客车":
                case "货车":
                    carmodeName2 = "大型车";
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + carmodeName);
            }

            personalVehiclesDTO.setCarmodeName(carmodeName2);
        }
        return personalVehiclesDTOS;
    }
}
