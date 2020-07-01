package com.member.api.mappers.master;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * MemberMapper
 *
 * @author panpan gao
 * @date 2020/7/1
 **/
public interface MemberMapper {
    @Select("select wallet_mny from member where id = #{id}")
    Integer selectWalletMnyById(@Param("id") Integer id);
}
