package com.aitravelba.dao.yihui.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import com.aitravelba.constants.CollectionEntrustStatus;
import com.aitravelba.constants.DebtorStatus;
import com.aitravelba.constants.TaskOrderStatus;
import com.aitravelba.constants.TaskStatus;
import com.aitravelba.dao.yihui.CollectionEntrustDao;
import com.aitravelba.orm.yihui.ArrearDebtMapper;
import com.aitravelba.orm.yihui.CollectionEntrustDebtMapper;
import com.aitravelba.orm.yihui.CollectionEntrustMapper;
import com.aitravelba.orm.yihui.DebtorMapper;
import com.aitravelba.pojo.yihui.ArrearDebt;
import com.aitravelba.pojo.yihui.ArrearDebtExample;
import com.aitravelba.pojo.yihui.CollectionEntrust;
import com.aitravelba.pojo.yihui.CollectionEntrustDebt;
import com.aitravelba.pojo.yihui.CollectionEntrustDebtExample;
import com.aitravelba.pojo.yihui.CollectionEntrustExample;
import com.aitravelba.pojo.yihui.CollectionEntrustExample.Criteria;
import com.aitravelba.pojo.yihui.Debtor;

@Repository("collectionEntrustDao")
public class CollectionEntrustDaoImpl implements CollectionEntrustDao {

	@Autowired
	private CollectionEntrustMapper collectionEntrustMapper;
	
	@Autowired
	private CollectionEntrustDebtMapper collectionEntrustDebtMapper;
	
	@Autowired
	private ArrearDebtMapper arrearDebtMapper;
	
	@Autowired
	private DebtorMapper debtorMapper;


	@Override
	public CollectionEntrust findOne(Long debtorId) {
		CollectionEntrustExample collectionEntrustExample = new CollectionEntrustExample();
		List<Byte> values = new ArrayList<Byte>();
		values.add(CollectionEntrustStatus.NO_OPEN_CASE.getValue());
		values.add(CollectionEntrustStatus.NO_PROGRESS.getValue());
		values.add(CollectionEntrustStatus.COMMITMENT_PAYMENT.getValue());
		values.add(CollectionEntrustStatus.APPLY_RELIEF.getValue());
		values.add(CollectionEntrustStatus.PART_PAYMENT.getValue());
		values.add(CollectionEntrustStatus.ALL_PAYMENT.getValue());
		values.add(CollectionEntrustStatus.APPLY_RETREAT.getValue());
		values.add(CollectionEntrustStatus.ENTRUSTED_ELECTRIC.getValue());
		collectionEntrustExample.createCriteria().andDebtorIdEqualTo(debtorId)
						.andStatusIn(values);
		collectionEntrustExample.setLimitStart(0);
		collectionEntrustExample.setLimitEnd(1);
		collectionEntrustExample.setOrderByClause("create_time desc");
		List<CollectionEntrust> collectionEntrusts = collectionEntrustMapper.selectByExample(collectionEntrustExample);
		if (null == collectionEntrusts || collectionEntrusts.size() == 0) {
			return null;
		}
		return collectionEntrusts.get(0);
	}

	@Override
	public CollectionEntrust selectLatestEntrust(Long debtorId) {
		CollectionEntrustExample collectionEntrustExample = new CollectionEntrustExample();
		collectionEntrustExample.setLimitStart(0);
		collectionEntrustExample.setLimitEnd(1);
		collectionEntrustExample.setOrderByClause("id desc");
		List<CollectionEntrust> collectionEntrusts = collectionEntrustMapper.selectByExample(collectionEntrustExample);
		return collectionEntrusts.get(0);
	}

	@Override
	public List<CollectionEntrust> selectByExample(CollectionEntrustExample example) {
		return collectionEntrustMapper.selectByExample(example);
	}

	@Override
	public int insert(CollectionEntrust record) {
		return collectionEntrustMapper.insert(record);
	}

	@Override
	public int updateByPrimaryKeySelective(CollectionEntrust record) {
		Assert.notNull(record);
		Assert.notNull(record.getId());
		return collectionEntrustMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public CollectionEntrust selectByPrimaryKey(Long id) {
		Assert.notNull(id);
		Assert.isTrue(id>0);
		return collectionEntrustMapper.selectByPrimaryKey(id);
	}


	@Override
	public List<CollectionEntrust> selectExpireEntrust(Date start, Date end) {
		CollectionEntrustExample example = new CollectionEntrustExample();
		List<Byte> values = new ArrayList<Byte>();
		values.add(CollectionEntrustStatus.NO_OPEN_CASE.getValue());
		values.add(CollectionEntrustStatus.NO_PROGRESS.getValue());
		values.add(CollectionEntrustStatus.COMMITMENT_PAYMENT.getValue());
		values.add(CollectionEntrustStatus.APPLY_RELIEF.getValue());
		values.add(CollectionEntrustStatus.PART_PAYMENT.getValue());
		Criteria criteria = example.createCriteria().andStatusIn(values);
		if(null != start) {
			criteria.andEntrustExpireTimeGreaterThanOrEqualTo(start);
		}
		if(null != end) {
			criteria.andEntrustExpireTimeLessThanOrEqualTo(end);
		}
		
		return collectionEntrustMapper.selectByExample(example);
	}

	@Override
	public List<CollectionEntrust> selectEntrustWithoutCollectionRecord(Date before7Day) {
		return collectionEntrustMapper.selectEntrustWithoutCollectionRecord(before7Day);
	}

	@Override
	public List<CollectionEntrust> selectEntrustWithoutRefundRecord(Date before30Day) {
		return collectionEntrustMapper.selectEntrustWithoutRefundRecord(before30Day);
	}

	@Override
	@Transactional(rollbackFor=Exception.class,propagation = Propagation.REQUIRES_NEW)
	public void updateCollectionEntrust(CollectionEntrust collectionEntrust) {
		//查询任务单,修改状态
		CollectionEntrustDebtExample collectionEntrustDebtExample = new CollectionEntrustDebtExample();
		collectionEntrustDebtExample.createCriteria().andEntrustIdEqualTo(collectionEntrust.getId());
		List<CollectionEntrustDebt> collectionEntrustDebts = collectionEntrustDebtMapper.selectByExample(collectionEntrustDebtExample);
		List<Long> debtIds = new ArrayList<Long>();
		Date entrustEndTime = new Date();
		for (CollectionEntrustDebt collectionEntrustDebt : collectionEntrustDebts) {
			collectionEntrustDebt.setEntrustEndTime(entrustEndTime);
			collectionEntrustDebt.setStatus(TaskOrderStatus.ABNORMAL_FINISHED.getValue());
			debtIds.add(collectionEntrustDebt.getDebtId());
			if(collectionEntrustDebtMapper.updateByPrimaryKeySelective(collectionEntrustDebt) != 1) {
				throw new RuntimeException("更新任务单失败");
			}
		}
		
		//查询债务,修改状态
		if(debtIds.size() > 0) {
			ArrearDebtExample arrearDebtExample = new ArrearDebtExample();
			arrearDebtExample.createCriteria().andIdIn(debtIds).andStatusNotEqualTo(TaskStatus.WAIT_FOR_ENTRUST.getValue());
			List<ArrearDebt> arrearDebts = arrearDebtMapper.selectByExample(arrearDebtExample);
			for (ArrearDebt arrearDebt : arrearDebts) {
				ArrearDebt arrearDebtCopy = new ArrearDebt(); 
				arrearDebtCopy.setId(arrearDebt.getId());
				arrearDebtCopy.setStatus(TaskStatus.WAIT_FOR_ENTRUST.getValue());
				if(arrearDebt.getShouldRefundTotal() == 0) {
					arrearDebtCopy.setStatus(TaskStatus.FINISHED.getValue());
				}
				arrearDebtCopy.setRelieveAmount(0);
				if(arrearDebtMapper.updateByPrimaryKeySelective(arrearDebtCopy) != 1) {
					throw new RuntimeException("更新债务状态失败");
				}
			}
		}
		
		
		//修改催收委托关系
		CollectionEntrust collectionEntrustCopy = new CollectionEntrust();
		collectionEntrustCopy.setId(collectionEntrust.getId());
		collectionEntrustCopy.setEntrustEndTime(entrustEndTime);
		collectionEntrustCopy.setStatus(collectionEntrust.getStatus());
		if(collectionEntrustMapper.updateByPrimaryKeySelective(collectionEntrustCopy) != 1) {
			throw new RuntimeException("更新催收委托关系失败");
		}
		Debtor debotr = new Debtor();
		debotr.setId(collectionEntrust.getDebtorId());
		debotr.setStatus(DebtorStatus.NO_DIVISION.getValue());
		if(debtorMapper.updateByPrimaryKeySelective(debotr) != 1) {
			throw new RuntimeException("更新债务人失败");
		}
	}

	@Override
	public int countRetreatEntrust(Long debtorId) {
		CollectionEntrustExample example = new CollectionEntrustExample();
		List<Byte> values = new ArrayList<Byte>();
		values.add(CollectionEntrustStatus.RETREATED.getValue());
		values.add(CollectionEntrustStatus.ENTRUST_TIME_OVER.getValue());
		values.add(CollectionEntrustStatus.NO_RECORD_AFTER_SEVEN_DAY.getValue());
		values.add(CollectionEntrustStatus.NO_RECORD_AFTER_30_DAY.getValue());
		example.createCriteria().andDebtorIdEqualTo(debtorId).andStatusIn(values);
		return collectionEntrustMapper.countByExample(example);
	}

	@Override
	public List<CollectionEntrust> selectOrgEntrust(Long deptId, Long orgId, List<Long> debtorIds) {
		Assert.notNull(deptId);
		Assert.notNull(orgId);
		CollectionEntrustExample example = new CollectionEntrustExample();
		List<Byte> values = new ArrayList<Byte>();
		values.add(CollectionEntrustStatus.NO_OPEN_CASE.getValue());
		values.add(CollectionEntrustStatus.NO_PROGRESS.getValue());
		values.add(CollectionEntrustStatus.COMMITMENT_PAYMENT.getValue());
		values.add(CollectionEntrustStatus.APPLY_RELIEF.getValue());
		values.add(CollectionEntrustStatus.PART_PAYMENT.getValue());
		values.add(CollectionEntrustStatus.ALL_PAYMENT.getValue());
		example.createCriteria().andOrgIdEqualTo(orgId).andDeptIdNotEqualTo(deptId).andDebtorIdIn(debtorIds).andStatusIn(values);

		return collectionEntrustMapper.selectByExample(example);
	}

	@Override
	public CollectionEntrust selectGroupIdByDebtId(Long debtId) {
		Assert.notNull(debtId);
		Assert.isTrue(debtId>0);
		return collectionEntrustMapper.selectGroupIdByDebtId(debtId);
	}

	@Override
	public List<CollectionEntrust> selectByIds(List<Long> ids) {
		CollectionEntrustExample example = new CollectionEntrustExample();
		example.createCriteria().andIdIn(ids);
		return collectionEntrustMapper.selectByExample(example);
	}
	
	@Override
	public List<CollectionEntrust> selectDebtorAllEntrust(Long debtorId) {
		CollectionEntrustExample example = new CollectionEntrustExample();
		example.createCriteria().andDebtorIdEqualTo(debtorId);
		example.setOrderByClause("create_time asc");
		return collectionEntrustMapper.selectByExample(example);
	}

	@Override
	public List<String> showEntrustFirstParty(long entrustId) {
		Assert.isTrue(entrustId>0);
		return collectionEntrustMapper.showEntrustFirstParty(entrustId);
	}
	
	@Override
	public int countEntrusting(Long deptId) {
		Assert.notNull(deptId);
		CollectionEntrustExample example = new CollectionEntrustExample();
		List<Byte> statusList = getEntrustingStatusList();
		example.createCriteria().andDeptIdEqualTo(deptId).andStatusIn(statusList);
		 
		return collectionEntrustMapper.countByExample(example);
	}

	private List<Byte> getEntrustingStatusList() {
		List<Byte> statusList = new ArrayList<Byte>();
		statusList.add(CollectionEntrustStatus.NO_OPEN_CASE.getValue());
		statusList.add(CollectionEntrustStatus.NO_PROGRESS.getValue());
		statusList.add(CollectionEntrustStatus.COMMITMENT_PAYMENT.getValue());
		statusList.add(CollectionEntrustStatus.APPLY_RELIEF.getValue());
		statusList.add(CollectionEntrustStatus.PART_PAYMENT.getValue());
		statusList.add(CollectionEntrustStatus.ALL_PAYMENT.getValue());
		statusList.add(CollectionEntrustStatus.APPLY_RETREAT.getValue());
		statusList.add(CollectionEntrustStatus.ENTRUSTED_ELECTRIC.getValue());
		return statusList;
	}
	
	@Override
	public List<CollectionEntrust> selectCanAutoFinishTask() {
		return collectionEntrustMapper.selectCanAutoFinishTask();
	}

	@Override
	public List<CollectionEntrust> selectElectricCanAutoFinishTask() {
		return collectionEntrustMapper.selectElectricCanAutoFinishTask();
	}

	@Override
	public CollectionEntrust selectOneCollectionEntrust(Long debtorId, Date refundTime) {
		CollectionEntrustExample example = new CollectionEntrustExample();
		List<Byte> statusList = getEntrustingStatusList();
		example.createCriteria().andDebtorIdEqualTo(debtorId).andEntrustBeginTimeLessThanOrEqualTo(refundTime).andEntrustEndTimeGreaterThanOrEqualTo(refundTime).andStatusNotEqualTo(CollectionEntrustStatus.ENTRUSTED_OTHER_TEAMS.getValue());
		example.setLimitStart(0);
		example.setLimitEnd(1);
		example.setOrderByClause("create_time desc");
		List<CollectionEntrust> collectionEntrusts = collectionEntrustMapper.selectByExample(example);
		if (collectionEntrusts.size() > 0) {
			return collectionEntrusts.get(0);
		}
		
		example = new CollectionEntrustExample();
		example.createCriteria().andDebtorIdEqualTo(debtorId).andStatusIn(statusList);
		example.setLimitStart(0);
		example.setLimitEnd(1);
		example.setOrderByClause("create_time desc");
		collectionEntrusts = collectionEntrustMapper.selectByExample(example);
		if (collectionEntrusts.size() > 0) {
			return collectionEntrusts.get(0);
		}
		
		return null;
	}

	@Override
	public int updateWithTime(CollectionEntrust record) {
		return collectionEntrustMapper.updateWithTime(record);
	}


	@Override
	public int countByExample(CollectionEntrustExample example) {
		return collectionEntrustMapper.countByExample(example);
	}

}