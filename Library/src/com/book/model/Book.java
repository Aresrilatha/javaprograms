package com.library.model;

public class Library {
	int bookId;
	String bookName;
	String author;
	int edition;
	
	public void setBookId(int bookId){
		this.bookId=bookId;
	}
	public void setBookName(String bookName){
		this.bookName=bookName;
	}
	public void setAuthor(String author){
		this.author=author;
	}
	public void setEdition(int edition){
		this.edition = edition;
	}
	public int getBookId(){
		return bookId;
	}
	public String getBookName(){
		return bookName;
	}
	public String getAuthor(){
		return author;
	}
	public int getEdition(){
		return edition;
	}
	public String toString(){
		return "Book id:"+bookId+", Book Name:"+bookName+", Author of Book:"+author+", Edition no:"+edition;
	}
}
