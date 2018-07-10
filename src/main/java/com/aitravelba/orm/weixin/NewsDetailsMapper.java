package com.aitravelba.orm.weixin;


import java.util.List;

import com.aitravelba.pojo.weixin.NewsDetails;

public interface NewsDetailsMapper {
	
	List<NewsDetails> queryCurDayNews();

	int insert(NewsDetails newsDetails);
}