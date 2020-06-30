package com.member.api.mappers.second;

import com.member.api.entity.Car_owner;
import com.member.api.entity.OutParking;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SecondMapper {
    /**
     * @return 会员的车牌号
     */
public List<Car_owner> Car_owner();

}
