package com.member.api.entity;

import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PayRecord {
private String id;
private String carnumber;
private Date intime;
private Date outtime;
private Integer parktime;
private Float payamount;
private Float paidamount;
private  Integer paymenttype;
private  Date chargetime;
private  String close_optername;
private  String close_accountno;
private  String parking_name;
}
