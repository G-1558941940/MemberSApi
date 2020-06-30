package com.member.api.mappers.second;

import com.member.api.entity.OutParking;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SecondMapper {
    /**
     * @return 会员的车牌号
     */
public List<String> MemberPhone();

}
