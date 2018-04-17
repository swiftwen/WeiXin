package com.aitravelba.orm.yihui;


import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.aitravelba.pojo.yihui.CollectionEntrust;
import com.aitravelba.pojo.yihui.CollectionEntrustExample;

public interface CollectionEntrustMapper {
	int countByExample(CollectionEntrustExample example);

	int deleteByExample(CollectionEntrustExample example);

	int deleteByPrimaryKey(Long id);

	/**
	 * @desc
	 * @param record
	 * @return 返回主键
	 * @Author liyicheng
	 * @2017年8月3日 下午7:21:12
	 */
	int insert(CollectionEntrust record);
	
	List<CollectionEntrust> selectCanAutoFinishTask();
	
	List<CollectionEntrust> selectElectricCanAutoFinishTask();

	int insertSelective(CollectionEntrust record);

	List<CollectionEntrust> selectByExample(CollectionEntrustExample example);
	
	CollectionEntrust selectGroupIdByDebtId(Long debtId);

	CollectionEntrust selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") CollectionEntrust record,
					@Param("example") CollectionEntrustExample example);

	int updateByExample(@Param("record") CollectionEntrust record, @Param("example") CollectionEntrustExample example);

	int updateByPrimaryKeySelective(CollectionEntrust record);

	int updateByPrimaryKey(CollectionEntrust record);


	List<CollectionEntrust> selectEntrustWithoutCollectionRecord(Date before7Day);

	List<CollectionEntrust> selectEntrustWithoutRefundRecord(Date before30Day);
	
	List<String> showEntrustFirstParty(long entrustId);

	int updateWithTime(CollectionEntrust record);

}