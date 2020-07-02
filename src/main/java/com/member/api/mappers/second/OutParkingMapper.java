package com.member.api.mappers.second;

import com.member.api.entity.OutParking;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface OutParkingMapper {

    /**查询该会员的出场记录
     * @param Member_id
     * @param pageSize
     * @param Size
     * @return
     */
    List<OutParking> OutParkRecord(@Param("Member_id") Integer Member_id, @Param("pageSize") Integer pageSize, @Param("Size") Integer Size);

    /**所有会员的出场记录
     * @param pageSize
     * @param Size
     * @return
     */
    List<OutParking> FindAllOutParkRecord(@Param("pageSize") Integer pageSize, @Param("Size") Integer Size);
}

