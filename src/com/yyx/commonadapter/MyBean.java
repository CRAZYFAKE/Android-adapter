package com.yyx.commonadapter;

public class MyBean {
	private String desc;
	private String phone;
	private String time;

	public MyBean() {
	}

	public MyBean(String desc, String phone, String time) {
		super();
		this.desc = desc;
		this.phone = phone;
		this.time = time;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
