package com.encapsulation;

public class Student {
	private int rollno;
	private String name;
	private int whichclass;
	private float fee;
	private long mobile;
	public void setRollno(int rollno) {
		this.rollno=rollno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setWhichClass(int whichclass) {
		this.whichclass=whichclass;
	}
	public void setFee(float fee) {
		this.fee = fee;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public int getRollno() {
		return rollno;
	}
	public String getName() {
		return name;
	}
	public int getWhichClass() {
		return whichclass;
	}
	public float getfee() {
		return fee;
	}
	public long getMobile() {
		return mobile;
	}
	public String toString() {
		return "Student rollno:"+this.rollno +", Student Name:"+this.name+", Student Studying in "+this.whichclass+" class" + ", Student fee:"+this.fee+", Student Mobile number:"+this.mobile;
	}
}
