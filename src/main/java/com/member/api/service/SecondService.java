package com.member.api.service;

import com.member.api.entity.Car_owner;
import com.member.api.entity.OutParking;

import java.util.List;

public interface SecondService {
public List<Car_owner> Car_owners(Integer pageIndex,Integer pageSize);
}
