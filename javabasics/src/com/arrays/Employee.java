package com.arrays;

public class Employee {
	int empid;
	String empname;
	double salary;
	Employee(int empid,String empname,double salary){
		this.empid=empid;
		this.empname=empname;
		this.salary=salary;
	}
	
	@Override
	public String toString() {
		return "Employee Id:"+this.empid+"\nEmployee name :"+this.empname+"\nEmp salary:"+this.salary;
	}
	public static void main(String args[]) {
		Employee e = new Employee(101,"Hari",50000);
		System.out.println(e.toString()); 
		}
}
