package com.aitravelba.dto.req.news.kr36;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 新闻pojo
 * @desc 
 * @Author wenpeng
 * @2017年10月19日 下午5:09:42
 */
@XmlRootElement(name="rss")
public class News {

	private String title;
	
	private Date pubDate;
	
	private String generator;
	
	private String description;
	
	private String link;
	
	private List<NewsItem> items;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getPubDate() {
		return pubDate;
	}

	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}

	public String getGenerator() {
		return generator;
	}

	public void setGenerator(String generator) {
		this.generator = generator;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public List<NewsItem> getItems() {
		return items;
	}

	public void setItems(List<NewsItem> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "News [title=" + title + ", pubDate=" + pubDate + ", generator=" + generator + ", description="
				+ description + ", link=" + link + ", items=" + items + "]";
	}
	
	
}
