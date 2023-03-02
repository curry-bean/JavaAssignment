package com.maxwel.rmijava;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 
 * @author maxwel
 * This interface will be implemented by both the client and server class.
 * It extends Remote.
 */
public interface RMIInterface extends Remote {
	/**
	 * All methods defined here that would be used in the RMI operations and must be public and throw a RemoteException exception
	 */
	
	public String hello(String name) throws RemoteException;
}
