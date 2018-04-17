package com.aitravelba.dao.yihui.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import com.aitravelba.constants.TaskOrderStatus;
import com.aitravelba.dao.yihui.CollectionEntrustDebtDao;
import com.aitravelba.orm.yihui.CollectionEntrustDebtMapper;
import com.aitravelba.pojo.yihui.CollectionEntrustDebt;
import com.aitravelba.pojo.yihui.CollectionEntrustDebtExample;

@Repository("collectionEntrustDebtDao")
public class CollectionEntrustDebtDaoImpl implements CollectionEntrustDebtDao {
	
	private static final Logger logger = LoggerFactory.getLogger(CollectionEntrustDebtDaoImpl.class);
	@Autowired
	private CollectionEntrustDebtMapper collectionEntrustDebtMapper;

	@Override
	public int insert(CollectionEntrustDebt record) {
		return collectionEntrustDebtMapper.insert(record);
	}

	@Override
	public CollectionEntrustDebt selectByDebtId(Long debtId) {
		CollectionEntrustDebtExample example = new CollectionEntrustDebtExample();
		example.createCriteria().andDebtIdEqualTo(debtId);
		example.setOrderByClause("create_time desc");
		example.setLimitStart(0);
		example.setLimitEnd(1);
		List<CollectionEntrustDebt> collectionEntrustDebts = collectionEntrustDebtMapper.selectByExample(example);
		if(collectionEntrustDebts.isEmpty()) {
			return null;
		}
		return collectionEntrustDebts.get(0);
	}

	@Override
	public int batchInsert(List<CollectionEntrustDebt> collectionEntrustDebts) {
		return collectionEntrustDebtMapper.batchInsert(collectionEntrustDebts);
	}

	@Override
	public List<CollectionEntrustDebt> selectByExample(CollectionEntrustDebtExample example) {
		return collectionEntrustDebtMapper.selectByExample(example);
	}

	@Override
	public int updateByPrimaryKeySelective(CollectionEntrustDebt record) {
		return collectionEntrustDebtMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public List<CollectionEntrustDebt> getByEntrustIdAndOrgId(Long entrustId,Long orgId) {
        List<CollectionEntrustDebt> list =  collectionEntrustDebtMapper.getByEntrustIdAndOrgId(entrustId,orgId);
        if(list.size()>1) {
        	logger.info("get by entrust id,the size greater than one");
        }
        return list;
	}

	@Override
	public int updateByExampleSelective(CollectionEntrustDebt record, CollectionEntrustDebtExample example) {
		
		return collectionEntrustDebtMapper.updateByExampleSelective(record, example);
	}

	@Override
	public List<CollectionEntrustDebt> selectByEntrustIdAndDebtId(Long entrustId, Long debtId) {
		CollectionEntrustDebtExample example = new CollectionEntrustDebtExample();
		CollectionEntrustDebtExample.Criteria criteria = example.createCriteria();
		if(null!=entrustId) {
			criteria.andEntrustIdEqualTo(entrustId);
		}
		if(null!=debtId) {
			criteria.andDebtIdEqualTo(debtId);
		}
		return selectByExample(example);
	}

	@Override
	public int updateByEntrustIdAndDebtIdSelective(CollectionEntrustDebt record, Long entrustId, Long debtId) {
		Assert.notNull(entrustId);
		CollectionEntrustDebtExample example = new CollectionEntrustDebtExample();
		CollectionEntrustDebtExample.Criteria criteria = example.createCriteria();
		criteria.andEntrustIdEqualTo(entrustId);
		if(null!=debtId) {
			criteria.andDebtIdEqualTo(debtId);
		}
		return updateByExampleSelective(record, example);
	}

	@Override
	public List<CollectionEntrustDebt> selectByEntrustId(Long entrustId) {
		CollectionEntrustDebtExample example = new CollectionEntrustDebtExample();
		example.createCriteria().andEntrustIdEqualTo(entrustId);
		return collectionEntrustDebtMapper.selectByExample(example);
	}

	@Override
	public int batchUpdateByPrimaryKeySelective(List<CollectionEntrustDebt> collectionEntrustDebtList) {
		return collectionEntrustDebtMapper.batchUpdateByPrimaryKeySelective(collectionEntrustDebtList);
	}

	@Override
	public List<CollectionEntrustDebt> selectEntrustingDebt(Long entrustId) {
		Assert.notNull(entrustId);
		CollectionEntrustDebtExample example = new CollectionEntrustDebtExample();
		List<Byte> statusList = new ArrayList<Byte>();
		statusList.add(TaskOrderStatus.NO_OPEN_CASE.getValue());
		statusList.add(TaskOrderStatus.NO_PROGRESS.getValue());
		statusList.add(TaskOrderStatus.COMMITMENT_PAYMENT.getValue());
		statusList.add(TaskOrderStatus.PART_PAYMENT.getValue());
		statusList.add(TaskOrderStatus.ALL_PAYMENT.getValue());
		statusList.add(TaskOrderStatus.APPLY_RELIEF.getValue());
		example.createCriteria().andEntrustIdEqualTo(entrustId);
		return collectionEntrustDebtMapper.selectByExample(example);
	}

	@Override
	public int updateByPrimaryKey(CollectionEntrustDebt record) {
		return collectionEntrustDebtMapper.updateByPrimaryKey(record);
	}

	@Override
	public int countByEntrustId(Long entrustId) {
		return collectionEntrustDebtMapper.countByEntrustId(entrustId);
	}

	@Override
	public int endByEntrustIdAndOrgId(Long entrustId, Long orgId) {
		return collectionEntrustDebtMapper.endByEntrustIdAndOrgId(entrustId, orgId);
	}
	
}
