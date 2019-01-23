package com.aitravelba.dto.resp.baidu;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 通用图片文字识别接口响应
 * @author swiftwen
 * @date 2019年1月22日 下午8:00:43
 */
public class GeneralBasicRespDto {

	
	private int direction;
	
	@JSONField(name="log_id")
	private Long logId;
	
	@JSONField(name="words_result_num")
	private int wordsResultNum;
	
	@JSONField(name="words_result")
	private List<WordResultDto> wordsResult;

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public Long getLogId() {
		return logId;
	}

	public void setLogId(Long logId) {
		this.logId = logId;
	}

	public int getWordsResultNum() {
		return wordsResultNum;
	}

	public void setWordsResultNum(int wordsResultNum) {
		this.wordsResultNum = wordsResultNum;
	}

	public List<WordResultDto> getWordsResult() {
		return wordsResult;
	}

	public void setWordsResult(List<WordResultDto> wordsResult) {
		this.wordsResult = wordsResult;
	}

	@Override
	public String toString() {
		return "GeneralBasicRespDto [direction=" + direction + ", logId=" + logId + ", wordsResultNum=" + wordsResultNum
				+ ", wordsResult=" + wordsResult + "]";
	}
	
	
	
	
}
