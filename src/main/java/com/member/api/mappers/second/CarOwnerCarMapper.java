package com.member.api.mappers.second;

import com.member.api.dto.PersonalVehiclesDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CarOwnerCarMapper {
    /**
     * 查询我的车辆信息
     * @param memberId 会员id
     * @return 车辆信息
     */
    List<PersonalVehiclesDTO> selectPersonalVehicles(
            @Param("memberId") Integer memberId);
}