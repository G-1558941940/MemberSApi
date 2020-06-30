package com.member.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * PersonalVehiclesDTO
 *
 * @author panpan gao
 * @date 2020/6/30
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonalVehiclesDTO {
    private String carnumber;
    private String carColor;
    private String carmodeName;
}
