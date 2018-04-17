package com.aitravelba.dto.req.news.kr36;

import java.util.Date;

/**
 * 
 * @desc 
 * @Author wenpeng
 * @2017年10月19日 下午5:11:44
 */
public class NewsItem {

	private String author;
	
	private String title;
	
	private String category;
	
	private String link;
	
	private String guid;
	
	private String description;
	
	private Date pubDate;
	
	private String source;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getPubDate() {
		return pubDate;
	}

	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	@Override
	public String toString() {
		return "NewsItem [author=" + author + ", title=" + title + ", category=" + category + ", link=" + link
				+ ", guid=" + guid + ", description=" + description + ", pubDate=" + pubDate + ", source=" + source
				+ "]";
	}
	
}
