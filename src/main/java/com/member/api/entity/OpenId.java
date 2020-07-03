package com.member.api.entity;

import lombok.*;

@Setter
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class OpenId {
private Integer Member_id;
private String wx_mini_open_id;
}
