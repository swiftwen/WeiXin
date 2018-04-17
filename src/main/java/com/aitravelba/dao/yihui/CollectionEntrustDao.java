package com.aitravelba.dao.yihui;

import java.util.Date;
import java.util.List;

import com.aitravelba.pojo.yihui.CollectionEntrust;
import com.aitravelba.pojo.yihui.CollectionEntrustExample;

public interface CollectionEntrustDao {
	
	/**
	 * @desc 根据债务人ID查询进行中催收委托关系
	 * @param debtorId
	 * @return 
	 * @Author wuweibing
	 * @2017年10月24日 下午2:15:14
	 */
	CollectionEntrust findOne(Long debtorId);
	/**
	 * @desc 根据债务人ID查询最近一条委托关系
	 * @param debtorId
	 * @return 
	 * @Author wenpeng
	 * @2017年12月22日 下午2:15:14
	 */
	CollectionEntrust selectLatestEntrust(Long debtorId);
	
	List<CollectionEntrust> selectByExample(CollectionEntrustExample example);
	
	int insert(CollectionEntrust record);
	
	int updateByPrimaryKeySelective(CollectionEntrust record);
	
	CollectionEntrust selectByPrimaryKey(Long id);
	/**
	 * @desc 根据债务主键id查询当前债务所属的小组id
	 * @param debtId 债务主键
	 * @return 
	 * @Author wenpeng
	 * @2017年8月30日 下午5:18:51
	 */
	CollectionEntrust selectGroupIdByDebtId(Long debtId);

	/**
	 * @desc 委托时间结束
	 * @return 
	 * @Author wuweibing
	 * @2017年8月22日 下午2:21:49
	 */
	List<CollectionEntrust> selectExpireEntrust(Date start, Date end);
	
	/**
	 * @desc 接单后7天无催收记录更新
	 * @return 
	 * @Author wuweibing
	 * @2017年8月22日 下午2:47:11
	 */
	List<CollectionEntrust> selectEntrustWithoutCollectionRecord(Date before7Day);
	
	/**
	 * @desc 连续30天无还款记录
	 * @param before30Day
	 * @return 
	 * @Author wuweibing
	 * @2017年8月22日 下午3:36:43
	 */
	List<CollectionEntrust> selectEntrustWithoutRefundRecord(Date before30Day);

	/**
	 * @desc 平台退案更新操作
	 * @param collectionEntrust
	 * @param value 
	 * @Author wuweibing
	 * @2017年8月22日 下午4:35:15
	 */
	void updateCollectionEntrust(CollectionEntrust collectionEntrust);
	
	/**
	 * @desc 查询退案或撤案次数
	 * @return 
	 * @Author wuweibing
	 * @2017年8月22日 下午5:50:07
	 */
	int countRetreatEntrust(Long debtorId);

	/**
	 * @desc 根据债务人列表查询机构委托关系(不包括某个小组)
	 * @param deptId
	 * @param orgId
	 * @param debtorIds
	 * @return 
	 * @Author wuweibing
	 * @2017年8月23日 下午5:46:52
	 */
	List<CollectionEntrust> selectOrgEntrust(Long deptId, Long orgId, List<Long> debtorIds);
	
	/**
	 * @desc 根据ID列表查询催收委托关系列表
	 * @param ids
	 * @return 
	 * @Author wuweibing
	 * @2017年8月31日 上午9:37:21
	 */
	List<CollectionEntrust> selectByIds(List<Long> ids);

	/**
	 * @desc 按照从早至后的顺序返回债务人所有被委托的记录
	 * @param debtorId 债务人主键
	 * @return
	 * @Author liyicheng
	 * @2017年9月18日 下午3:35:26
	 */
	List<CollectionEntrust> selectDebtorAllEntrust(Long debtorId);
	
	List<String> showEntrustFirstParty(long entrustId);
	
	/**
	 * @desc 查询部门委托中案件数量
	 * @param deptId
	 * @return 
	 * @Author wuweibing
	 * @2017年9月21日 下午3:30:05
	 */
	int countEntrusting(Long deptId);
	/**
	 * @desc 查询24小时后能自动结案案件
	 * @return 
	 * @Author swiftwen
	 * @2017年10月10日 上午11:05:14
	 */
	List<CollectionEntrust> selectCanAutoFinishTask();
	/**
	 * @desc 查询36小时后能自动结案案件
	 * @return 
	 * @Author swiftwen
	 * @2017年12月26日 上午11:05:14
	 */
	List<CollectionEntrust> selectElectricCanAutoFinishTask();
	
	/**
	 * 根据债务ID和还款时间查询催收委托关系
	 * @desc 
	 * @param debtorId
	 * @param refundTime
	 * @return 
	 * @Author wuweibing
	 * @2017年9月30日 下午6:28:28
	 */
	CollectionEntrust selectOneCollectionEntrust(Long debtorId , Date refundTime);

	
	/**
	 * @desc 根据ID和时间更新催收委托关系
	 * @param record
	 * @return 
	 * @Author wuweibing
	 * @2017年11月28日 下午4:52:15
	 */
	int updateWithTime(CollectionEntrust record);

	int countByExample(CollectionEntrustExample example);
	
}