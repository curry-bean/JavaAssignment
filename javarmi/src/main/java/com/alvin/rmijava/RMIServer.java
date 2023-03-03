package com.alvin.rmijava;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
// the server class extends UnicastRemoteObject and implements the interface we
// created earlier
public class RMIServer extends UnicastRemoteObject implements RMIInterface {
	protected RMIServer() throws RemoteException {
		super();
	}
	private static final long serialVersionUID = 1L;
	/**
	 * Overriding the method defined in the RMIInterface class
	 */
	public String hello(String name) throws RemoteException {
		System.err.println(name+ " is trying to connect");
		return "Server says hello to: " + name;
	}
	public static void main(String[] args) {
		try {
			// we bind the server to local host with the name 'rmi-server'
			Naming.rebind("//localhost/rmi-server/", new RMIServer());
			System.out.println("Server ready for use...");
		}catch(Exception ex) {
			// and print out any exceptions that may be thrown when the server is starting
			System.err.println("RMI Server Exception! Details: " + ex.getMessage());
		}
	}
}
