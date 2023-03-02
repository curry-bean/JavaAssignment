package com.maxwel.networkingjava;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.*;
public class NetworkingServer {
	public static void main(String[] args) throws IOException {
		try {
			// Create the server port
			ServerSocket server = new ServerSocket(10000);
			// authorize to accept in that port
			Socket socket = server.accept();
			// create an input stream to receive messages
			DataInputStream messageInputStream = new DataInputStream(socket.getInputStream());
			
			// variable to hold incoming message
			String incomingMessage = messageInputStream.readUTF().toString();
			
			// print out the message sent by server
			System.out.println("Message received: " + incomingMessage);
			
			// close the connection
			server.close();
		} catch (IOException e) {
			System.out.println("Error occured: " + e.getMessage());
		}
	}
}
