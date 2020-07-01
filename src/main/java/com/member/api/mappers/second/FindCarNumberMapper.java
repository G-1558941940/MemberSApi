package com.member.api.mappers.second;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface FindCarNumberMapper {
 List<String> findCarNumber(@Param("Member_id") Integer Member_id);
}
