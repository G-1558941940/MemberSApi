package com.member.api.entity;

import lombok.*;

import java.util.Date;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Coupon {

    private String carnumber;
    private String phone;
    private Integer status;
    private String name;
    private Integer type;
    private Date expire_start;
    private Date expire_end;
    private Integer  actual_reduction;
}
