package com.member.api.service;

import com.member.api.dto.PersonalVehiclesDTO;

import java.util.List;

/**
 * CarOwnerCarService
 *
 * @author panpan gao
 * @date 2020/6/30
 **/
public interface CarOwnerCarService {
    /**
     * 查询我的车辆信息
     * @param memberId 会员id
     * @return 车辆信息
     */
    List<PersonalVehiclesDTO> getPersonalVehicles(Integer memberId);
}
