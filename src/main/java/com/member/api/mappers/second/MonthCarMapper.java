package com.member.api.mappers.second;

import com.member.api.entity.MontCar;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MonthCarMapper {

  /**查找月卡车
   * @param Member_id
   * @return
   */
  List<MontCar> FindMonthCar(@Param("Member_id") Integer Member_id);
}
