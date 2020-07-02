package com.member.api.service.impl;

import com.member.api.dto.RecordDTO;
import com.member.api.mappers.iot.EInvoceRecordMapper;
import com.member.api.service.EInvoceRecordService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * EInvoceRecordServiceImpl
 *
 * @author panpan gao
 * @date 2020/7/2
 **/
@Service
public class EInvoceRecordServiceImpl implements EInvoceRecordService {
    private final EInvoceRecordMapper eInvoceRecordMapper;

    public EInvoceRecordServiceImpl(EInvoceRecordMapper eInvoceRecordMapper) {
        this.eInvoceRecordMapper = eInvoceRecordMapper;
    }

    @Override
    public List<RecordDTO> getRecordsOfMakeOutAnInvoice(Integer memberId,Integer pageIndex, Integer pageSize) {
        pageIndex = (pageIndex - 1) * pageSize;
        List<RecordDTO> recordDTOS = eInvoceRecordMapper.selectRecordsOfMakeOutAnInvoice(memberId, pageIndex, pageSize);
        for (RecordDTO recordDTO : recordDTOS) {
            /* 完成状态 */
            Boolean finishState = recordDTO.getFinishState();
            String finishStateString;
            if (finishState.equals(false)){
                finishStateString = "未完成";
            } else {
                finishStateString = "完成";
            }
            recordDTO.setFinishStateStr(finishStateString);

            /* 消费类型 */
            Integer spendType = recordDTO.getSpendType();
            String spendTypeStr;
            if (spendType == 0){
                spendTypeStr = "停车费";
            } else if (spendType == 1){
                spendTypeStr = "充值消费";
            } else {
                spendTypeStr = "月卡缴费";
            }
            recordDTO.setSpendTypeStr(spendTypeStr);

            Integer invoceHeadType = recordDTO.getInvoceHeadType();
            String invoceHeadTypeStr;
            if (invoceHeadType == 0){
                invoceHeadTypeStr = "企业发票";
            } else {
                invoceHeadTypeStr = "个人发票";
            }
            recordDTO.setInvoceHeadTypeStr(invoceHeadTypeStr);

            recordDTO.setTotalMoney(recordDTO.getTotalMoney() / 100);
        }
        return recordDTOS;
    }
}
