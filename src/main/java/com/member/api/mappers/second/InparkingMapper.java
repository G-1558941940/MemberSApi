package com.member.api.mappers.second;

import com.member.api.dto.MemberEntryRecordDTO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface InparkingMapper {
    /**
     * 查询会员的进场记录
     * @param carOwnerId 车主id
     * @param pageIndex 页码
     * @param pageSize 显示数量
     * @return 进场记录
     */
    @Select("<script>" +
            "select " +
            "inparking_id AS inparkingId,carnumber,intime,park.name as parkName " +
            "from inparking inpark " +
            "left join parking park ON inpark.parking_id = park.id " +
            "<if test='carOwnerId != null'>" +
            "where car_owner_id = #{carOwnerId} " +
            "</if> " +
            "order by intime desc " +
            "limit #{pageSize} offset #{pageIndex}" +
            "</script>")
    List<MemberEntryRecordDTO> selectMemberEntryRecord(
            @Param("carOwnerId") Integer carOwnerId,
            @Param("pageIndex")  Integer pageIndex,
            @Param("pageSize")   Integer pageSize
    );
}