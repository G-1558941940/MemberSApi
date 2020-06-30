package com.member.api.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CarOwnerCar {
    private Long carId;

    private Date timebegin;

    private Date timeend;

    private Integer status;

    private String systemauth;

    private String carnumberold;

    /**
    * 车辆类型
    */
    private Long carownertypeid;

    private Long opterId;

    private String groupid;

    private String entertype;

    /**
    * 车型:对应数据字典中车型的值
    */
    private Long carmodel;

    private String carcolor;

    private Long carOwnerId;

    private String carnumber;

    /**
    * 删除标志
    */
    private Boolean isDelete;

    /**
    * 车型名称:来自数据字典中的值
    */
    private String carmodeNane;

    /**
    * 编号
    */
    private String code;

    /**
    * 0:新增;1:修改;2:删除
    */
    private Short actiontype;

    /**
    * 是否同步
    */
    private Boolean isSync;

    /**
    * 是否为固定车位
    */
    private Boolean isfixedparking;

    private Date timestamp;

    /**
    * 子系统创建的车主id
    */
    private Long recordid;
}