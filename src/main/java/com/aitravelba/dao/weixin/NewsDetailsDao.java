package com.aitravelba.dao.weixin;

import java.util.List;

import com.aitravelba.pojo.weixin.NewsDetails;

public interface NewsDetailsDao {
	List<NewsDetails> queryCurDayNews();
	
	int insert(NewsDetails newsDetails);

}
