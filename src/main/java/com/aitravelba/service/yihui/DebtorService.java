package com.aitravelba.service.yihui;

import com.aitravelba.pojo.yihui.Debtor;


/**
 * @desc 
 * @Author wuweibing
 * @2017年8月24日 下午2:20:38
 */
public interface DebtorService {
	Debtor selectById(Long id);
	
	Debtor selectByCardNo(String cardNo);
}
