package com.member.api.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author 高盼盼
 * @Date 2020-06-30
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Inparking {
    private Long id;

    private Long inparkingId;

    private String cardserial;

    private String carnumber;

    private Long chargetypeId;

    private Long controllerId;

    private Date intime;

    private String picpath;

    private Integer intype;

    /**
    * 车辆类型
    */
    private Long carownertype;

    private Integer recordstatus;

    private String carnumberold;

    private Long carOwnerId;

    private String carOwnerName;

    private Boolean ismanualclear;

    private Long terminalid;

    /**
    * 车型
    */
    private Long carmodel;

    private String carcolor;

    private String platepicpath;

    private String carlogo;

    private Integer confidence;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private String reserve4;

    private Date updtime;

    private Date addtime;

    private Long parkingemptycount;

    private Boolean isenabledareacounter;

    private Long parkingId;

    private Long areaId;
}