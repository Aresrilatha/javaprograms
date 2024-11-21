package com.student.model;


import java.util.List;
import java.util.Scanner;

import com.student.model.Student;
import com.student.model.StudentDao;
import com.student.model.StudentDAOException;

public class StudentDetails {
	static //static HashMap<Integer, Student> stumap = new HashMap<Integer, Student>();
	
	StudentDao st = new StudentDao();

	public static void main(String args[]) throws StudentDAOException {
			Scanner sc = new Scanner(System.in);
			StudentDetails stu1 = new StudentDetails();
			int oper =0;
			do {
			
			System.out.println("Available Options are:\n 1. Insert\n 2. Update\n 3. Delete\n 4. Retrive\n 5. exit \n Choose among options");
			oper =sc.nextInt();
			
			switch(oper) {
			case 1 : stu1.insertStu(sc);
			         break;
			case 2 : stu1.updateStu(sc);
			         break;
			case 3 : StudentDetails.deleteStu(sc);
			         break;
			case 4 : List<Student> lst = stu1.retriveStu();
					 for(Student st1:lst){
						 System.out.println(st1);
					 }
			         break;
			}
			}while(oper != 5);
	}

	public void insertStu(Scanner sc) throws StudentDAOException {
		Student stu = getDetails(sc, "Insert");
		st.insertStu(stu);
	}

	public void updateStu(Scanner sc) throws StudentDAOException {
		Student stu = getDetails(sc, "Update");
		st.updateStu(stu);

	}

	public static void deleteStu(Scanner sc) throws StudentDAOException {
				System.out.println("Enter Student roll no:");
				st.deleteStu(sc.nextInt());
			}

	public List<Student >retriveStu() throws StudentDAOException {
				return st.retriveStu();
			}

	public static Student getDetails(Scanner sc, String oper) {
				Student stu = new Student();
				
				if(oper.equalsIgnoreCase("Insert") || oper.equalsIgnoreCase("Update")) {
					System.out.println("Enter Student rollno:");
					stu.setRollno(sc.nextInt());
			}
			
				System.out.println("Enter Name:");
				stu.setName(sc.next());
				
				System.out.println("Enter the class studying:");
				stu.setWhichClass(sc.nextInt());
				
				System.out.println("Enter the fee");
				stu.setFee(sc.nextFloat());
				
				System.out.println("Enter Mobile number:");
				stu.setMobile(sc.nextLong());
				
				return stu;
	}
}
