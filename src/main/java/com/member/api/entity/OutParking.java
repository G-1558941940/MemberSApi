package com.member.api.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OutParking {
    @ApiModelProperty(value = "出场记录ID")
    private Integer outparking_id;
    @ApiModelProperty(value = "卡号")
    private String cardserial;
    @ApiModelProperty(value = "车牌")
    private String carnumber;
    @ApiModelProperty(value = "出场时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date outtime;
    @ApiModelProperty(value = "会员信息ID")
    private Integer outtype;
    @ApiModelProperty(value = "出场车牌")
    private String carnumberout;
    @ApiModelProperty(value = "入场时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date intime;
    @ApiModelProperty(value = "添加时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date addtime;
    @ApiModelProperty(value = "停车场ID")
    private Integer parking_id;

}
