package com.aitravelba.dao.yihui;

import java.util.List;

import com.aitravelba.pojo.yihui.Debtor;

public interface DebtorDao {
	int insert(Debtor record);

	int updateByPrimaryKeySelective(Debtor record);

	Debtor selectByPrimaryKey(Long id);
	
	List<Debtor> selectByCardNo(String cardNo);
	
	List<Debtor> selectByMobile(String mobile);

}
