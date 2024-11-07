package com.arrays;

public class Test1 {
	public static void main(String args[]) {
		Employee[] e = { new Employee(101,"Hari",50000), new Employee(102,"Shiva",40000), new Employee(103, "Ravi", 35000)};
		for(int i=0;i<e.length;i++) {
		System.out.println(e[i].toString()+"\n"); 
		}
		Employee[] e1 = new Employee[20];
		e1[0]= new Employee(104,"Laya", 43000);
		e1[1]= new Employee(105,"Samrat",70000);
		for(int i=0;i<e1.length;i++) {
			System.out.println(e1[i].toString()+"\n");
		}
	}
	}
