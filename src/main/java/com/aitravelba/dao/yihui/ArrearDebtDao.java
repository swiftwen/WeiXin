package com.aitravelba.dao.yihui;

import java.util.List;
import java.util.Map;

import com.aitravelba.pojo.yihui.ArrearDebt;
import com.aitravelba.pojo.yihui.ArrearDebtExample;

public interface ArrearDebtDao {

	int countByExample(ArrearDebtExample example);

	int deleteByExample(ArrearDebtExample example);

	int deleteByPrimaryKey(Long id);

	int insert(ArrearDebt record);

	int insertSelective(ArrearDebt record);

	List<ArrearDebt> selectByExample(ArrearDebtExample example);

	ArrearDebt selectByPrimaryKey(Long id);

	int updateByExampleSelective(ArrearDebt record, ArrearDebtExample example);

	int updateByExample(ArrearDebt record, ArrearDebtExample example);

	int updateByPrimaryKeySelective(ArrearDebt record);
	
	int updateByTaskCodeSelective(ArrearDebt record);

	int updateByPrimaryKey(ArrearDebt record);


	ArrearDebt findOne(ArrearDebtExample example);



	Map<Long, Long> getDebtIdAndDebtorIdMap(List<Long> debtIds);
	
	List<ArrearDebt> selectByDebtorId(Long id);
	
	
}
