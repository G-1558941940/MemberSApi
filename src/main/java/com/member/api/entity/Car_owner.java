package com.member.api.entity;

import lombok.*;

import java.util.Date;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Car_owner {
    private String name;
    private Integer id;
    private String telephone;
    private String identityno;
    private Date addtime;
    private Date updtime;
    private String city_code;
    private Integer car_owner_id;
    private Integer company_id;
    private  Boolean is_delete;
    private  Boolean is_fast_charge;
    private String code;
    private Integer actionType;
    private Boolean is_sync;
    private Integer parking_id;
    private Integer recordid;
    private  Date timestamp;

}
