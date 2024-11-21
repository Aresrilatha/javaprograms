package com.encapsulation;

public class Banking {
	private int accno;
	private String name;
	private String email;
	private long mobile;
	private double money;
	
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public int getAccno() {
		return accno;
	}
	public String getName() {
		return name;
	}
	public String getemail() {
		return email;
	}
	public long getMobile() {
		return mobile;
	}
	public double getMoney() {
		return money;
	}
	
	public String toString() {
		return "Person[ Person Accno:"+accno+",Person Name:"+name+", Person email:"+email+", Person mobile:"+mobile+", Person deposited money:"+money+"]";
	}
}
