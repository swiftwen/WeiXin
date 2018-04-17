package com.aitravelba.dao.yihui.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aitravelba.dao.yihui.ArrearDebtDao;
import com.aitravelba.orm.yihui.ArrearDebtMapper;
import com.aitravelba.pojo.yihui.ArrearDebt;
import com.aitravelba.pojo.yihui.ArrearDebtExample;
@Repository("arrearDebtDao")
public class ArrearDebtDaoImpl implements ArrearDebtDao {

	@Resource
	private ArrearDebtMapper arrearDebtMapper;
	
	@Override
	public int countByExample(ArrearDebtExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(ArrearDebtExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(ArrearDebt record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(ArrearDebt record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ArrearDebt> selectByExample(ArrearDebtExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrearDebt selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByExampleSelective(ArrearDebt record, ArrearDebtExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(ArrearDebt record, ArrearDebtExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(ArrearDebt record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByTaskCodeSelective(ArrearDebt record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(ArrearDebt record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrearDebt findOne(ArrearDebtExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Long, Long> getDebtIdAndDebtorIdMap(List<Long> debtIds) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ArrearDebt> selectByDebtorId(Long id) {
		ArrearDebtExample example = new ArrearDebtExample();
		ArrearDebtExample.Criteria criteria = example.createCriteria();
		criteria.andDebtorIdEqualTo(id);
		return arrearDebtMapper.selectByExample(example);
	}

}
