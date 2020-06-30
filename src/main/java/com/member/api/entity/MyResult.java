package com.member.api.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
public class MyResult <T>{
    private Integer code;
    private String message;
    private T data;
}
