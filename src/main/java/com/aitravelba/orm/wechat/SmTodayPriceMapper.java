package com.aitravelba.orm.wechat;

import com.aitravelba.pojo.wechat.SmTodayPrice;

public interface SmTodayPriceMapper{
	
	SmTodayPrice selectByVoucherId(Long voucherId);
}