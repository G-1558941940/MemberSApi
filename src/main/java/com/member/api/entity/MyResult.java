package com.member.api.entity;

import lombok.*;

/**
 * MyResult
 *
 * @author panpan gao
 * @date 2020/6/30
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MyResult <T>{
    private Integer code;
    private String message;
    private T data;
}
