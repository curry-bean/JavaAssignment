package com.maxwel.jdbc;

import java.io.Serializable;
//
//author @aloha-tech
//
// student bean with getters and setters and copy con and default con
public class Book implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String BookId;
	private String BookName;
	private String  BookAuthor;
	private Integer BookPages;
	
	// getter and setters
	public String getBookId() {
		return BookId;
	}
	public void setBookId(String BookId) {
		this.BookId = BookId;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String BookName) {
		this.BookName = BookName;
	}
	public String getBookAuthor() {
		return BookAuthor;
	}
	public void setBookAuthor(String BookAuthor) {
		this.BookAuthor = BookAuthor;
	}
	public Integer getBookPages() {
		return BookPages;
	}
	public void setBookPages(Integer BookPages) {
		this.BookPages = BookPages;
	}
	
	@Override
	public String toString() {
		return "Book [BookId=" + BookId + ", BookName=" + BookName + ", BookAuthor=" + BookAuthor
			+ ", Book Age = " +BookId +"";
	}
	
	// default and custom copy constructor
	public Book() {  }
	public Book(String BookId, String BookName,String BookAuthor,Integer BookPages) {
		super();
		this.BookId = BookId;
		this.BookName = BookName;
		this.BookAuthor = BookAuthor;
		this.BookPages = BookPages;
	}
}
