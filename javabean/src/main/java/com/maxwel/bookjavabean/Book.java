package com.maxwel.bookjavabean;

import java.io.Serializable;

/**
 *
 * @author maxwel-ochieng
 */

public class Book implements Serializable {
	private static final long serialVersionUID = 1L;
	
	// encapulated class properties(use 'private' keyword)
	private String bookId;
	private String bookName;
        private String authorName;
	private String bookgenre;
	private Integer bookpages;
	
	// getters help retrieve details for the object
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
        public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String bookName) {
		this.authorName = authorName;
	}
	public String getBookGenre() {
		return bookgenre;
	}
	public void setBookGenre(String bookgenre) {
		this.bookgenre = bookgenre;
	}
	public Integer getBookPages() {
		return bookpages;
	}
	
	// setters help 'set' properties of the object
	public void setBookPages(Integer bookpages) {
		this.bookpages = bookpages;
	}

	// the default constructor takes no arguments
	public Book() {}
}
