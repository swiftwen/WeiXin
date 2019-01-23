package com.aitravelba.dto.req.baidu;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author swiftwen
 * @date 2019年1月22日 下午7:37:19
 */
public class GeneralPicRecognizationReqDto {

	private String image;
	
	private String url;
	/**
	 * 识别语言类型，默认为CHN_ENG
	 */
	@JsonProperty("language_type")
	private String languageType;
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getLanguageType() {
		return languageType;
	}
	public void setLanguageType(String languageType) {
		this.languageType = languageType;
	}
	
	
}
