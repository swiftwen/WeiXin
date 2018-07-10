package com.aitravelba.dao.weixin.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.aitravelba.dao.weixin.NewsDetailsDao;
import com.aitravelba.orm.weixin.NewsDetailsMapper;
import com.aitravelba.pojo.weixin.NewsDetails;
@Repository("newsDetailsDao")
public class NewsDetailsDaoImpl implements NewsDetailsDao {

	@Resource
	private NewsDetailsMapper newsDetailsMapper;
	
	@Override
	public List<NewsDetails> queryCurDayNews() {
		return newsDetailsMapper.queryCurDayNews();
	}

	@Override
	public int insert(NewsDetails newsDetails) {
		// TODO Auto-generated method stub
		return newsDetailsMapper.insert(newsDetails);
	}

}
