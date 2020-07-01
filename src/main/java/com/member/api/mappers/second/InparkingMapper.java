package com.member.api.mappers.second;

import com.member.api.dto.MemberEntryRecordDTO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * InparkingMapper
 * @auth panpan gao
 */
public interface InparkingMapper {
    /**
     * 查询会员的进场记录
     * @param memberId 会员id
     * @return 进场记录
     */
    @Select(
            "SELECT " +
            "inparking_id inparkingId,carnumber,intime,p.name parkName " +
            "FROM " +
            "inparking inpark " +
                    "left join parking p on inpark.parking_id = p.id " +
            "WHERE " +
            "inpark.carnumber IN (" +
                "SELECT " +
                "car.carnumber AS carnumber " +
                "FROM " +
                "member_car_ref \"ref\" " +
                "LEFT JOIN car_owner_car car ON \"ref\".car_id = car.car_id " +
                "WHERE " +
                "\"ref\".member_id = #{memberId}" +
            ")"
    )
    List<MemberEntryRecordDTO> selectMemberEntryRecord(
           @Param("memberId") Integer memberId
    );
}