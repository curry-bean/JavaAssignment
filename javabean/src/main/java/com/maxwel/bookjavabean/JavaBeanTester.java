package com.maxwel.bookjavabean;

/**
 *
 * @author aloha-tech
 */

public class JavaBeanTester {

	public static void main(String[] args) 
        {
		// creating a instance of the class(object) using default constructor
		Book book = new Book();
		
		// using getters and setters to populate the object properties
		// using the getters of the bean
		book.setBookName("Kidagaa");
		book.setAuthorName("Paula");
                book.setBookId("29987");
		book.setBookGenre("Drama");
		book.setBookPages(657);
		
		
		// we can print out some details using the setters of the bean
                System.out.println("Welcome To Maxwel`s Library UseCase for JavaBeans");
                System.out.println("****************************************************");
                System.out.println("Book id: " + book.getBookId());
                System.out.println("Book name is: " + book.getBookName());
		System.out.println("Author name is : " + book.getAuthorName());
		System.out.println("Book Genre is " + book.getBookGenre());
		System.out.println("Book pages :" + book.getBookPages());
		                
                System.out.println("*************************BYE************************");
                System.out.println("****************************************************");
	}

}
