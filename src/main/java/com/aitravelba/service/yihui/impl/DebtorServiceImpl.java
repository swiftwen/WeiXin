package com.aitravelba.service.yihui.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.aitravelba.dao.yihui.DebtorDao;
import com.aitravelba.pojo.yihui.Debtor;
import com.aitravelba.service.yihui.DebtorService;

@Service("debtorService")
public class DebtorServiceImpl implements DebtorService {

	@Resource
	private DebtorDao debtorDao;
	@Override
	public Debtor selectById(Long id) {
		return debtorDao.selectByPrimaryKey(id);
	}
	
	@Override
	public Debtor selectByCardNo(String cardNo) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
