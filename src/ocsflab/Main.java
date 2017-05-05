package ocsflab;

import java.io.IOException;
import java.util.Scanner;

/**
 * Main class for OCSF client.
 * @author Pappim Pipatkasrira
 * @version 1.0
 * @since May 5, 2017
 */
public class Main {
	
	/**
	 * Connects to the server and get the server message and send text to the server.
	 * @throws IOException
	 */
	public static void main ( String [] args ) throws IOException{
		MyClient client = new MyClient("10.2.12.83",5001);
		client.openConnection();
		Scanner input = new Scanner(System.in);
		String answer ="";
		while(!answer.equals("quit")){
			answer = input.nextLine();
			if(!answer.equals("quit")){
				client.sendToServer(answer);
			}
		}
		client.closeConnection();
	}

}
