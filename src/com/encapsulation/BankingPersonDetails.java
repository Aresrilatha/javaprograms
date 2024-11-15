package com.encapsulation;

import java.util.HashMap;
import java.util.Scanner;

public class BankingPersonDetails {
	static HashMap<Integer, Banking> bnkmap = new HashMap<Integer,Banking>();
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int condition =0;
		do {
			System.out.println("Options Available:\n 1. Insert\n 2.Update\n 3. Delete\n 4. Retrieve\n 5. Exit\n Choose among Options:");
			condition = sc.nextInt();
			switch(condition) {
			case 1 : insertPersonDetails(sc);
			  		break;
			case 2 :updatePersonDetails(sc);
					break;
			case 3 : deletePersonDetails(sc);
					 break;
			case 4 : retrivePersonDetails();
					 break;
			}
		}while(condition != 5);
	}
	public static void insertPersonDetails(Scanner sc) {
		Banking b = getDetails(sc,"Insert");
		bnkmap.put(b.getAccno(), b);
	}
	public static void updatePersonDetails(Scanner sc) {
		Banking b = getDetails(sc,"Update");
		bnkmap.put(b.getAccno(), b);
	}
	public static void deletePersonDetails(Scanner sc) {
		System.out.println("Enter Person Accno:");
		bnkmap.remove(sc.nextInt());
	}
	public static void retrivePersonDetails() {
		System.out.println(bnkmap);
	}
	
	public static Banking getDetails(Scanner sc, String condition) {
		Banking b = new Banking();
		if(condition.equalsIgnoreCase("Insert") || condition.equalsIgnoreCase("Update")) {
			System.out.println("Enter Person Accno:");
			b.setAccno(sc.nextInt());
		}
		
		System.out.println("Enter Person Name:");
		b.setName(sc.next());
		
		System.out.println("Enter Person Email:");
		b.setEmail(sc.next());
		
		System.out.println("Enter Person Contact:");
		b.setMobile(sc.nextLong());
		
		System.out.println("Enter Person Deposit Money:");
		b.setMoney(sc.nextDouble());
		
		return b;
	}

}
