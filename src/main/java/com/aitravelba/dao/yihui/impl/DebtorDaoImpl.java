package com.aitravelba.dao.yihui.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.aitravelba.dao.yihui.DebtorDao;
import com.aitravelba.orm.yihui.DebtorMapper;
import com.aitravelba.pojo.yihui.Debtor;
import com.aitravelba.pojo.yihui.DebtorExample;
@Repository("debtorDao")
public class DebtorDaoImpl implements DebtorDao {

	@Resource
	private DebtorMapper debtorMapper;
	
	@Override
	public int insert(Debtor record) {
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(Debtor record) {
		return 0;
	}

	@Override
	public Debtor selectByPrimaryKey(Long id) {
		return debtorMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Debtor> selectByCardNo(String cardNo) {
		DebtorExample example = new DebtorExample();
		DebtorExample.Criteria criteria = example.createCriteria();
		criteria.andCardNoEqualTo(cardNo);
		return debtorMapper.selectByExample(example);
	}

	@Override
	public List<Debtor> selectByMobile(String mobile) {
		DebtorExample example = new DebtorExample();
		DebtorExample.Criteria criteria = example.createCriteria();
		criteria.andMobileEqualTo(mobile);
		return debtorMapper.selectByExample(example);
	}
	
}
