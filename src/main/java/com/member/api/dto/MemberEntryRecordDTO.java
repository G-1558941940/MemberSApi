package com.member.api.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
public class MemberEntryRecordDTO {
    private Integer inparkingId;
    private String carnumber;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date intime;
    private String parkName;
}
