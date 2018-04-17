package com.aitravelba.dao.yihui;

import java.util.List;

import com.aitravelba.pojo.yihui.CollectionEntrustDebt;
import com.aitravelba.pojo.yihui.CollectionEntrustDebtExample;

public interface CollectionEntrustDebtDao {
	int insert(CollectionEntrustDebt record);
	
	/**
	 * @desc 根据债务ID查询任务单
	 * @param debtId
	 * @return 
	 * @Author wuweibing
	 * @2017年8月1日 下午3:56:06
	 */
	CollectionEntrustDebt selectByDebtId(Long debtId);

	/**
	 * @desc 批量插入任务单
	 * @param collectionEntrustDebts
	 * @return 
	 * @Author wuweibing
	 * @2017年8月3日 下午4:36:53
	 */
	int batchInsert(List<CollectionEntrustDebt> collectionEntrustDebts);
	
	/**
	 * @desc 查询任务单列表
	 * @param example
	 * @return 
	 * @Author wuweibing
	 * @2017年8月7日 上午11:04:23
	 */
	List<CollectionEntrustDebt> selectByExample(CollectionEntrustDebtExample example);

	/**
	 * @desc 根据主键更新任务单
	 * @param record
	 * @return 
	 * @Author wuweibing
	 * @2017年8月7日 上午11:03:12
	 */
	int updateByPrimaryKeySelective(CollectionEntrustDebt record);
	
	int updateByExampleSelective(CollectionEntrustDebt record,CollectionEntrustDebtExample example);
	/**
	 * @desc 
	 * @param record
	 * @param entrustId 不为空
	 * @param debtId  不为空
	 * @return 
	 * @Author wenpeng
	 * @2017年8月18日 上午11:53:38
	 */
	int updateByEntrustIdAndDebtIdSelective(CollectionEntrustDebt record,Long entrustId,Long debtId);
	
	List<CollectionEntrustDebt> getByEntrustIdAndOrgId(Long entrustId,Long orgId);
	
	List<CollectionEntrustDebt> selectByEntrustIdAndDebtId(Long entrustId,Long debtId);
	
	List<CollectionEntrustDebt> selectByEntrustId(Long entrustId);

	/**
	 * @desc 批量更新催收委托关系具体债务表
	 * @param collectionEntrustDebtList
	 * @return 
	 * @Author wuweibing
	 * @2017年12月11日 下午3:30:29
	 */
	int batchUpdateByPrimaryKeySelective(List<CollectionEntrustDebt> collectionEntrustDebtList);
	
	/**
	 * @desc 根据委托关系主键查询未结束催收委托关系具体债务列表
	 * @param entrustId
	 * @return 
	 * @Author wuweibing
	 * @2017年12月23日 下午4:36:39
	 */
	List<CollectionEntrustDebt> selectEntrustingDebt(Long entrustId);
	
	int updateByPrimaryKey(CollectionEntrustDebt record);
	
	/**
	 * @desc 统计某个委托关系债务属于多少个债权方
	 * @param entrustId
	 * @return 
	 * @Author swiftwen
	 * @2018年1月29日 下午4:50:00
	 */
	int countByEntrustId(Long entrustId);
	
	int endByEntrustIdAndOrgId(Long entrustId,Long orgId);
}
