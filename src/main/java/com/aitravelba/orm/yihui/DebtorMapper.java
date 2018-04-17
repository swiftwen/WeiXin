package com.aitravelba.orm.yihui;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.aitravelba.pojo.yihui.Debtor;
import com.aitravelba.pojo.yihui.DebtorExample;
public interface DebtorMapper {
	int countByExample(DebtorExample example);

    int deleteByExample(DebtorExample example);

    int deleteByPrimaryKey(Long id);

	int insert(Debtor record);

    int insertSelective(Debtor record);

    List<Debtor> selectByExample(DebtorExample example);

	Debtor selectByPrimaryKey(@Param("id") Long id);

    int updateByExampleSelective(@Param("record") Debtor record, @Param("example") DebtorExample example);

    int updateByExample(@Param("record") Debtor record, @Param("example") DebtorExample example);

    int updateByPrimaryKeySelective(Debtor record);

    int updateByPrimaryKey(Debtor record);
    

}