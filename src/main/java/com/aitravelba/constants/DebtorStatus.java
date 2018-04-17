package com.aitravelba.constants;

public enum DebtorStatus {
	WITHDRAWN((byte) -128, "已撤案"),
	ELECTRIC_BACK((byte) -11, "易回撤回"),
	ELECTRIC_RETREAT((byte) -12, "电催退回"),
	NO_DIVISION((byte) 0, "未分案"),
	REMINDER((byte) 1, "地催"),
	ELECTRIC((byte) 2, "将委给电催"),
	ENTRUSTED_ELECTRIC((byte) 3, "已委托给电催");

	DebtorStatus(byte value, String desc) {
		this.value = value;
		this.desc = desc;
	}

	private final String desc;
	private final byte value;
	

	public static DebtorStatus getDebtorStatus(int value) {
		switch (value) {
		case -128:
			return WITHDRAWN;
		case -12:
			return ELECTRIC_RETREAT;
		case -11:
			return ELECTRIC_BACK;
		case 0:
			return NO_DIVISION;
		case 1:
			return REMINDER;
		case 2:
			return ELECTRIC;
		case 3:
			return ENTRUSTED_ELECTRIC;
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
