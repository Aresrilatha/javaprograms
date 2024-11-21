package com.student.model;

@SuppressWarnings("serial")
public class StudentDAOException extends Exception {
	public StudentDAOException(){
		super();
	}
	public StudentDAOException(String msg){
		super(msg);
	}
	public StudentDAOException(String msg,Throwable cause){
		super(msg,cause);
	}
}
