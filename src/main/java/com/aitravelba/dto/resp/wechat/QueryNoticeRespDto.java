package com.aitravelba.dto.resp.wechat;

import lombok.Data;

/**
 * 
 * @author swiftwen
 * @date 2019年1月27日 下午4:39:03
 */
@Data
public class QueryNoticeRespDto {

	private Long id;

    private String title;

    private String description;

    private String createTime;
    
    
}
