package com.encapsulation;

import java.util.HashMap;
import java.util.Scanner;

public class TestEmployee {
	static HashMap<Integer, Employee> empmap = new HashMap<Integer, Employee>();

	public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			
			int oper =0;
			do {
			
			System.out.println("Available Options are: 1. Insert\n 2. Update\n 3. Delete\n 4. Retrive\n 5. exit \n Choose among options");
			oper =sc.nextInt();
			
			switch(oper) {
			case 1 : insertEmp(sc);
			         break;
			case 2 : updateEmp(sc);
			         break;
			case 3 : deleteEmp(sc);
			         break;
			case 4 : retriveEmp();
			         break;
			}
			}while(oper != 5);
	}

	public static void insertEmp(Scanner sc) {
		Employee emp = getDetails(sc, "Insert");
		empmap.put(emp.getEmpid(), emp);
	}

	public static void updateEmp(Scanner sc) {
		Employee emp = getDetails(sc, "Update");
		empmap.put(emp.getEmpid(), emp);

	}

	public static void deleteEmp(Scanner sc) {
				System.out.println("Enter empid:");
				empmap.remove(sc.nextInt());
			}

	public static void retriveEmp() {
				System.out.println(empmap);
			}

	public static Employee getDetails(Scanner sc, String oper) {
				Employee emp = new Employee();
				
				if(oper.equalsIgnoreCase("Insert") || oper.equalsIgnoreCase("Update")) {
					System.out.println("Enter empid:");
					emp.setEmpid(sc.nextInt());
			}
			
			  System.out.println("Enter Employee Name:");
			  emp.setName(sc.next());
			  
			  System.out.println("Enter Employee salary:");
			  emp.setSalary(sc.nextDouble());
			  
			  System.out.println("Enter Employee Age:");
			  emp.setAge(sc.nextInt());
			  
			  System.out.println("Enter Employee Mobile:");
			  emp.setMobile(sc.nextLong());
			  
			  System.out.println("Enter Employee Address:");
			  emp.setAddress(sc.next());
			  
			  System.out.println("Enter Employee Gender:");
			  emp.setGender(sc.next());
			  
			  return emp;
	}
}
