package com.member.api.mappers.iot;

import com.member.api.dto.RecordDTO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * EInvoceRecordMapper
 * @auth panpan gao
 * @date 2020/7/2
 */
public interface EInvoceRecordMapper {

    /**
     * 开票记录
     * @param memberId 会员id
     * @param pageIndex 页码
     * @param pageSize 显示数量
     * @return 开票记录
     */
    @Select("select " +
                "company_name AS companyName," +
                "phone AS phone," +
                "apply_date AS applyDate," +
                "finish_date AS finishDate," +
                "invoce_head_type AS invoceHeadType," +
                "invocd_head AS invocdHead," +
                "spend_type AS spendType," +
                "tax_number AS taxNumber," +
                "total_money AS totalMoney," +
                "finish_state AS finishState " +
            "FROM iot.dev_man.e_invoce_record " +
            "WHERE member_id = #{memberId} " +
            "limit #{pageSize} offset #{pageIndex}")
    List<RecordDTO> selectRecordsOfMakeOutAnInvoice(
            @Param("memberId") Integer memberId,
            @Param("pageIndex") Integer pageIndex,
            @Param("pageSize") Integer pageSize
    );
}