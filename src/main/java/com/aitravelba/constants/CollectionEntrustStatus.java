package com.aitravelba.constants;

/**
 * @desc 催收委托状态
 * @Author wuweibing
 * @2017年7月27日 下午7:02:41
 */
public enum CollectionEntrustStatus {
	NO_OPEN_CASE((byte) 0, "未开案"), 
	NO_PROGRESS((byte) 1, "暂无进展"), 
	COMMITMENT_PAYMENT((byte) 2, "承诺还款"), 
	APPLY_RELIEF((byte) 3, "申请减免"), 
	PART_PAYMENT((byte) 40, "已部分还款"), 
	ALL_PAYMENT((byte) 50, "已全部还款"), 
	APPLY_RETREAT((byte) 60, "申请退案"), 
	RETREATED((byte) 61, "已退案"), 
	ENTRUSTED_OTHER_TEAMS((byte) 70, "已委托给其他团队"), 
	ENTRUST_TIME_OVER((byte) 90, "委托时间结束"), 
	NO_RECORD_AFTER_SEVEN_DAY((byte) 91, "接单后7天无催收记录"),
	NO_RECORD_AFTER_30_DAY((byte) 92, "连续30天无还款记录"),
	FINISHED((byte) 100,"已正常完结"),
	ENTRUSTED_ELECTRIC((byte) 101, "已委托电催"),
	ELECTRIC_RETREAT((byte) 102,"电催退回"),
	ELECTRIC_FROZEN((byte) 103,"电催冻结"),
	ELECTRIC_BACK((byte) 104,"易回撤回");
	CollectionEntrustStatus(byte value, String desc) {
		this.value = value;
		this.desc = desc;
	}

	private final byte value;
	private final String desc;

	public static CollectionEntrustStatus getStatus(int value) {
		switch (value) {
		case 0:
			return NO_OPEN_CASE;
		case 1:
			return NO_PROGRESS;
		case 2:
			return COMMITMENT_PAYMENT;
		case 3:
			return APPLY_RELIEF;
		case 40:
			return PART_PAYMENT;
		case 50:
			return ALL_PAYMENT;
		case 60:
			return APPLY_RETREAT;
		case 61:
			return RETREATED;
		case 70:
			return ENTRUSTED_OTHER_TEAMS;
		case 90:
			return ENTRUST_TIME_OVER;
		case 91:
			return NO_RECORD_AFTER_SEVEN_DAY;
		case 92:
			return NO_RECORD_AFTER_30_DAY;
		case 100:
			return FINISHED;
		case 101:
			return ENTRUSTED_ELECTRIC;
		case 102:
			return ELECTRIC_RETREAT;
		case 103:
			return ELECTRIC_FROZEN;
		case 104:
			return ELECTRIC_BACK;
		default:
			return null;
		}
	}

	
	public byte getValue() {
		return value;
	}

	public String getDesc() {
		return this.desc;
	}
}
