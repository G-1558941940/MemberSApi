package com.member.api.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * MemberEntryRecordDTO
 *
 * @author panpan gao
 * @date 2020/6/30
 **/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class MemberEntryRecordDTO {
    /**
     * 进场id
     */
    private Integer inparkingId;

    /**
     * 车牌号
     */
    private String carnumber;

    /**
     * 入场时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date intime;

    /**
     * 停车场名称
     */
    private String parkName;

    /**
     * 停车时长
     */
    private Integer stopTime;
}
