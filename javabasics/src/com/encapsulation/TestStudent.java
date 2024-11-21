package com.encapsulation;
import java.util.ArrayList;
import java.util.Scanner;

public class TestStudent {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> a = new ArrayList<Student>();
		Student st1 = getDetails(sc);
		a.add(st1);
		Student st2 = getDetails(sc);
		a.add(st2);
		System.out.println(a);
	}
		public static Student getDetails(Scanner sc) {
			Student st = new Student();
			System.out.println("Enter rollno:");
			st.setRollno(sc.nextInt());
			System.out.println("Enter Name:");
			st.setName(sc.next());
			System.out.println("Enter the class studying:");
			st.setWhichClass(sc.nextInt());
			System.out.println("Enter the fee");
			st.setFee(sc.nextFloat());
			System.out.println("Enter Mobile number:");
			st.setMobile(sc.nextLong());
			return st;
		}
}
