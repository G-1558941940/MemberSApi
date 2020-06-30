package com.member.api.mappers.second;

import com.member.api.dto.PersonalVehiclesDTO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CarOwnerCarMapper {
    /**
     * 查询我的车辆信息
     * @param carOwnerId
     * @param pageIndex
     * @param pageSize
     * @return
     */
    @Select(
            "select " +
            "carnumber, " +
            "\"carColor\", " +
            "carmode_nane AS carmodeName " +
            "from car_owner_car car " +
            "where car_owner_id = #{carOwnerId} " +
            "limit #{pageSize} offset #{pageIndex} "
           )
    List<PersonalVehiclesDTO> selectPersonalVehicles(
            @Param("carOwnerId") Integer carOwnerId,
            @Param("pageIndex")  Integer pageIndex,
            @Param("pageSize")   Integer pageSize);
}