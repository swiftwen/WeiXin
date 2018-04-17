package com.aitravelba.orm.yihui;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.aitravelba.pojo.yihui.CollectionEntrustDebt;
import com.aitravelba.pojo.yihui.CollectionEntrustDebtExample;

public interface CollectionEntrustDebtMapper {
    int countByExample(CollectionEntrustDebtExample example);

    int deleteByExample(CollectionEntrustDebtExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CollectionEntrustDebt record);

    int insertSelective(CollectionEntrustDebt record);

    List<CollectionEntrustDebt> selectByExample(CollectionEntrustDebtExample example);

    CollectionEntrustDebt selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CollectionEntrustDebt record, @Param("example") CollectionEntrustDebtExample example);

    int updateByExample(@Param("record") CollectionEntrustDebt record, @Param("example") CollectionEntrustDebtExample example);

    int updateByPrimaryKeySelective(CollectionEntrustDebt record);

    int updateByPrimaryKey(CollectionEntrustDebt record);

	int batchInsert(@Param("entrustDebtList") List<CollectionEntrustDebt> collectionEntrustDebts);
	
	List<CollectionEntrustDebt> getByEntrustIdAndOrgId(@Param("entrustId") Long entrustId,@Param("orgId") Long orgId);

	int batchUpdateByPrimaryKeySelective(@Param("list") List<CollectionEntrustDebt> collectionEntrustDebtList);
	
	
	int countByEntrustId(@Param("entrustId") Long entrustId);
	
	int endByEntrustIdAndOrgId(@Param("entrustId") Long entrustId,@Param("orgId") Long orgId);
}