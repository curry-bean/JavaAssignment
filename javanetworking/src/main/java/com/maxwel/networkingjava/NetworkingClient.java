package com.maxwel.networkingjava;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
public class NetworkingClient {

	public static void main(String[] args) {
		try {
			// establish socket
			Socket socket = new Socket("localhost", 10000);
			
			// data output stream to send messages out
			DataOutputStream messageOutputStream = new DataOutputStream(socket.getOutputStream());
			
			// client sends message to the server
			messageOutputStream.writeUTF("Hello , Welcome to networking.");
			
			// flush the output stream
			messageOutputStream.flush();
			
			// close the socket
			socket.close();
		} catch(IOException ex) {
			System.out.println("Error occured: " + ex.getMessage());
		}
	}
}
