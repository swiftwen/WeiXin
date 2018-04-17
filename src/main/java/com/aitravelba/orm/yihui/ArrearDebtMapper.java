package com.aitravelba.orm.yihui;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.aitravelba.pojo.yihui.ArrearDebt;
import com.aitravelba.pojo.yihui.ArrearDebtExample;

public interface ArrearDebtMapper {
    int countByExample(ArrearDebtExample example);

    int deleteByExample(ArrearDebtExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ArrearDebt record);

    int insertSelective(ArrearDebt record);

    List<ArrearDebt> selectByExample(ArrearDebtExample example);

    ArrearDebt selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ArrearDebt record, @Param("example") ArrearDebtExample example);

    int updateByExample(@Param("record") ArrearDebt record, @Param("example") ArrearDebtExample example);

    int updateByPrimaryKeySelective(ArrearDebt record);

    int updateByPrimaryKey(ArrearDebt record);
	
	int batchInsertAndUpdate(@Param("list") List<ArrearDebt> arrearDebts);

	int updateStatusForEntrust(@Param("debtorId") Long debtorId);
	
	int batchInsert(@Param("list") List<ArrearDebt> arrearDebts);
	
	int batchUpdateByPrimaryKeySelective(@Param("list") List<ArrearDebt> arrearDebts);
    
	List<ArrearDebt> dumpEntrustableToRedis(@Param("limitStart") int limitStart, @Param("limitEnd") int limitEnd);


	List<ArrearDebt> getEntrustableForBatchAddToRedis(@Param("debtorId") Long debtorId, @Param("creditorId") Long creditorId);

	List<Long> getEntrustableForBatchDelFromRedis(@Param("debtorId") Long debtorId, @Param("creditorId") Long creditorId);
	
	int batchClearOrDeleteDebt(@Param("state") Byte state,@Param("orgId") Long orgId,@Param("list") List<Long> debtorIds);
	
	int countCreditorByDebtorId(@Param("debtorId") Long debtorId);
	
	int countDebtByCreditorAndDebtorId(@Param("creditorId") Long creditorId,@Param("debtorId") Long debtorId);
	
	long countShouldRefundTotal(@Param("debtorId") Long debtorId,@Param("debtId") Long debtId);
	
}