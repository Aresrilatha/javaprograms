package com.arrays;

public class Array1 {
	public static void main(String args[]) {
		int[] arr = new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		Object[] obj = new Object[10];
		obj[0]=new Employee(101,"hari",40000);
		obj[1]=new Employee(102,"ravi",35000);
		obj[2]=34;
		obj[3]="Hello";
		obj[4]="Hello";
		obj[5]="Hello";
		obj[6]="Hello";
		obj[7]="Hello";
		obj[8]="Hello";
		obj[9]="Hello";
		for(int i=0;i<10;i++) {
			System.out.println(obj[i]);
			}
	}
}
