package com.maxwel.bookjavabean;

/**
 *
 * @author aloha-tech
 */

public class JavaBeanTester {

	public static void main(String[] args) 
        {
		// creating a instance of the class(object) using default constructor
		Patient book = new Patient();
		
		// using getters and setters to populate the object properties
		// using the getters of the bean
		book.setfirstName("Kidagaa");
		book.setLastName("Paula");
                book.setPatientId("29987");
		book.setUnitSex("Drama");
		book.setBpunit(657);
		
		
		// we can print out some details using the setters of the bean
                System.out.println("Welcome To Maxwel`s Library UseCase for JavaBeans");
                System.out.println("****************************************************");
                System.out.println("Patient id: " + book.getPatientid());
                System.out.println("Patient name is: " + book.getfirstName());
		System.out.println("Author name is : " + book.getLastName());
		System.out.println("Patient Genre is " + book.getunitsex());
		System.out.println("Patient pages :" + book.getBpunit());
		                
                System.out.println("*************************BYE************************");
                System.out.println("****************************************************");
	}

}
