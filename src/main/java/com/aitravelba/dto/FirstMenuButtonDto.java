package com.aitravelba.dto;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 
 * @author swiftwen
 * @date 2019年1月23日 下午1:24:12
 */
public class FirstMenuButtonDto {
	
    private String name;
	
	@JSONField(name="sub_button")
	private List<BasicElement> subButton;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<BasicElement> getSubButton() {
		return subButton;
	}

	public void setSubButton(List<BasicElement> subButton) {
		this.subButton = subButton;
	}

	
}
