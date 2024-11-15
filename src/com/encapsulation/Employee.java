package com.encapsulation;

public class Employee {
	private int empid;
	private String name;
	private double salary;
	private int age;
	private long mobile;
	private String address;
	private String gender;
	
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public int getEmpid() {
		return empid;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public int getAge() {
		return age;
	}
	public long getMobile() {
		return mobile;
	}
	public String getAddress() {
		return address;
	}
	public String getGender() {
		return gender;
	}
	
	public String toString() {
		return "Employee[ Employee id:" + empid +", Employee Name:"+name+", Employee salary:"+salary+", Employee age:"+age+", Employee Contact:"+mobile+", Emp Address:"+address+", Emp gender:"+gender+"]";
	}
}
