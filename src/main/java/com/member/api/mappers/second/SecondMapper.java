package com.member.api.mappers.second;

import com.member.api.entity.Car_owner;
import com.member.api.entity.OutParking;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SecondMapper {

    /**查询会员信息
     * @param pageIndex 页码
     * @param pageSize  每页长度
     * @return Car_owner 集合
     */
public List<Car_owner> Car_owner(Integer pageIndex,Integer pageSize);
//public List<> Outstanding_order();
}
