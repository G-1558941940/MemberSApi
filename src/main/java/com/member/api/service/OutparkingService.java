package com.member.api.service;

import com.member.api.entity.OutParking;
import org.springframework.stereotype.Service;

import java.util.List;

public interface OutparkingService {
  List<OutParking> OutParkingRecord(Integer Member_id,Integer pageIndex,Integer pageSize);
}
