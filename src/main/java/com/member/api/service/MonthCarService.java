package com.member.api.service;

import com.member.api.entity.MontCar;

import java.util.List;

public interface MonthCarService {
 List<MontCar> FindCarRecord(Integer Member_id);
}
