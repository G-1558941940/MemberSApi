package com.member.api.mappers.second;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface FindCarNumberMapper {
 List<String> findCarNumber(Integer Member_id);
}
