package com.aitravelba.pojo.wechat;
/**
 * 
 * @author swiftwen
 * @date 2019年4月1日 下午3:02:17
 */
public class VoucherDetailEx extends VoucherDetail {

	/**
     * 价格
     */
    private Double price;
    
    /**
     * 标题
     */
    private String title;

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
    
    
}
