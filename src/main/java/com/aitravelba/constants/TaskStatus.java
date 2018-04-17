package com.aitravelba.constants;

public enum TaskStatus {
	FROZEN((byte) -1, "已冻结案件"),
	ELECTRIC_OR_FINISHED((byte) -2, "电催或已结案"),
	ELECTRIC((byte) -3, "电催"),
	ENTRUSTED_ELECTRIC((byte) -5, "已委托给电催"),
	STOP((byte) -10,"云贷总裁办要求停催"),
	CLAIM((byte)-11,"已提诉到法务"),
	URGENT_STOP((byte) -12,"金控紧急停催"),
	CLOSED_ACCOUNT((byte) -13,"已结清"),
	OPER_CLOSE((byte) -14,"运营反馈已结清"),
	OUTSIDE_CASE((byte) -15,"商务委外案件"),
	ELECTRIC_RETREAT((byte) -17,"电催退回"),
	ELECTRIC_BACK((byte) -18,"易回撤回"),
	OTHER((byte) -100,"其他原因"),
	INITIAL((byte) -127, "新增案件"),
	WITHDRAWN((byte) -128, "已撤案"),
	WAIT_FOR_ENTRUST((byte) 0, "未委托"),
	NO_PROGRESS((byte) 1, "暂无进展"),
	COMMITMENT_PAYMENT((byte) 2, "承诺还款"), 
	APPLY_RELIEF((byte) 3, "申请减免"),
	NO_OPEN_CASE((byte) 10, "未开案"),
	PART_PAYMENT((byte) 40, "已部分还款"), 
	ALL_PAYMENT((byte) 50, "已全部还款"),
	APPLY_RETREAT((byte) 60, "申请退案"), 
	ENTRUST_EXPIRE((byte) 90, "平台委托到期"),
	TOTAL_DEBT_LT_SPECIFIED_AMOUNT((byte) 91, "债务总额少于特定数"),
	CREDITOR_APPROVE_REDUCE((byte) 93, "债权方同意减免"), 
	FINISHED((byte) 100, "已正常终止");

	TaskStatus(byte value, String desc) {
		this.value = value;
		this.desc = desc;
	}

	private final String desc;
	private final byte value;

	public static TaskStatus getTaskStatus(int value) {
		switch (value) {
		case -128:
			return WITHDRAWN;
		case -127:
			return INITIAL;
		case -17:
			return ELECTRIC_RETREAT;
		case -18:
			return ELECTRIC_BACK;
		case -5:
			return ENTRUSTED_ELECTRIC;
		case -3:
			return ELECTRIC;
		case -2:
			return ELECTRIC_OR_FINISHED;
		case -1:
			return FROZEN;
		case 0:
			return WAIT_FOR_ENTRUST;
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
		case 90:
			return ENTRUST_EXPIRE;
		case 91:
			return TOTAL_DEBT_LT_SPECIFIED_AMOUNT;
		case 93:
			return CREDITOR_APPROVE_REDUCE;
		case 100:
			return FINISHED;
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
