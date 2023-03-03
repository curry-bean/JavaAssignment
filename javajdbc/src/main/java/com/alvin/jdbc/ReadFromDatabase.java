package com.alvin.jdbc;

packages com.maxwel.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadFromDatabase {
	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection( //create a connection to database
				"jdbc:mysql://localhost:3306/jbdc?useSSL=false", // driver URL
				"jbdc", // username
				"password"); // password
			Statement statement = connection.createStatement();
			
			// select all records in the table
			ResultSet resultSet = statement.executeQuery("SELECT * FROM Book_details");
			while(resultSet.next()) {
				// get the value of each field per row
				String BookId = resultSet.getString("Bookid");
                                String BookName = resultSet.getString("BookName");
				String LastName = resultSet.getString("BookAuthor");		
				Integer BookAge = resultSet.getInt("BookPages");
								
				// create a book object out of the book bean
				Book book = new Book(BookId, BookName, LastName ,BookAge);
				// print the book out
				System.out.println("Retrieved book: " + Book.toString());
			}
		}catch(SQLException ex) {
			System.err.println("An error occured: " + ex.getMessage());
		}
	}
}
