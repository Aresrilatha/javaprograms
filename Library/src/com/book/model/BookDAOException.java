package com.book.model;

@SuppressWarnings("serial")
public class BookDAOException extends Exception {
	public BookDAOException(){
		super();
	}
	public BookDAOException(String msg){
		super(msg);
	}
	public BookDAOException(String msg,Throwable cause){
		super(msg,cause);
	}

}
