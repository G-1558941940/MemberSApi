package com.member.api.mappers.second;

import com.member.api.entity.Car_owner;
import com.member.api.entity.OutParking;
import com.member.api.entity.PayRecord;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import sun.java2d.pipe.OutlineTextRenderer;

import java.util.List;

@Component
public interface SecondMapper {

    /**
     * 查询会员信息
     *
     * @param pageSize  每页长度
     * @param Size  跳过长度
     * @return Car_owner 集合
     */
    List<Car_owner> Car_owner(@Param("pageSize") Integer pageSize, @Param("Size") Integer Size);

    /**查询该会员的出场记录
     * @param carnumber
     * @param pageSize
     * @param Size
     * @return
     */
    List<OutParking> OutParkRecord(@Param("carnumber") Integer carnumber, @Param("pageSize") Integer pageSize, @Param("Size") Integer Size);


}
