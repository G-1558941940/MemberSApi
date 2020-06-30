package com.member.api.entity;

import lombok.*;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ParkingRecord {
private Integer p_record_charge_id;
private  String cardserial;
private String carnumber;
private Date intime;
private Date outtime;
}
