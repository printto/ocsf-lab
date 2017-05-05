package ocsflab;

import java.io.IOException;
import java.util.Scanner;

import com.lloseng.ocsf.client.AbstractClient;

/**
 * Manage objects that is recieved from the server.
 * @author Pappim Pipatkasrira
 * @version 1.0
 * @since May 5, 2017
 */
public class MyClient extends AbstractClient{

	/**
	 * Connect to the server.
	 * @param host
	 * @param port
	 */
	public MyClient(String host, int port) {
		super(host, port);
	}

	/**
	 * Handle messages that recieved to the server.
	 */
	@Override
	protected void handleMessageFromServer(Object msg) {
		System.out.println("[Server] : " + msg);
	}

	/**
	 * Prints message to confirm that is connected to the server.
	 */
	@Override
	protected void connectionEstablished(){
		System.out.println("[Console]: Connected to "+ this.getHost()+" Port: " + this.getPort());
	}
	
	/**
	 * Prints message when disconnect to the server.
	 */
	@Override
	protected void connectionClosed(){
		System.out.print("[Console]: Disconnected.");
	}

}
