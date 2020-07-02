package com.member.api.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.util.Date;

/**
 * PersonalVehiclesDTO
 *
 * @author panpan gao
 * @date 2020/6/30
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PersonalVehiclesDTO {
    /**
     * 车牌号
     */
    private String carnumber;
    /**
     * 车颜色
     */
    private String carColor;
    /**
     * 车牌类型
     */
    private String carmodeName;

    /**
     * 月卡id
     */
    @JsonIgnore
    private Integer monId;

    /**
     * 白名单id
     */
    @JsonIgnore
    private Integer whiteId;

    /**
     * 会卡截至日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date timeEnd;

    /**
     * 车辆类型
     */
    private String vehicleType;
}
