package com.aitravelba.constants;

public enum TaskOrderStatus {
	NO_OPEN_CASE((byte) 0, "未开案"),
	NO_PROGRESS((byte) 1, "暂无进展"),
	COMMITMENT_PAYMENT((byte) 2, "承诺还款"), 
	PART_PAYMENT((byte) 40, "已部分还款"), 
	ALL_PAYMENT((byte) 50, "已全部还款"), 
	APPLY_RELIEF((byte) 92, "申请减免"), 
	ABNORMAL_FINISHED((byte) 99, "已异常结束"), 
	FINISHED((byte) 100, "已正常结案"),
	ENTRUSTED_ELECTRIC((byte) 101, "已委托电催"),
	ELECTRIC_RETREAT((byte) 102,"电催退回"),
	ELECTRIC_BACK((byte) 104,"易回撤回");

	private final byte value;
	private final String desc;

	TaskOrderStatus(byte value, String desc) {
		this.value = value;
		this.desc = desc;
	}

	public byte getValue() {
		return value;
	}

	public String getDesc() {
		return this.desc;
	}
}
