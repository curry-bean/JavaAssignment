package com.maxwel.rmijava;

import java.rmi.Naming;

import javax.swing.JOptionPane;

public class RMIClient {
	public static void main(String[] args) {
		try {
			System.setProperty("java.rmi.server.hostname","192.168.0.103");
			
			RMIInterface lookUp = (RMIInterface) Naming.lookup("//localhost/rmi-server");
			String text = JOptionPane.showInputDialog("What is your name?");
			
			String response = lookUp.hello(text);
			JOptionPane.showMessageDialog(null, response);
		} catch(Exception ex) {
			System.err.println("An Error Occured Connecting to Client: " + ex.getMessage());
		}
	}
}
