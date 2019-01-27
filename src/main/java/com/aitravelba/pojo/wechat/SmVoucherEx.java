package com.aitravelba.pojo.wechat;

import lombok.Data;

@Data
public class SmVoucherEx {
    /**
     * 自增id
     */
    private Long id;

    private Long catId;
    
    private String catTitle;
    
    private String voucherTitle;
    
    private String picUrl;
    
    private Double price;

    
}