package ClientSide;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;


/**
 * 
 * A java program that establishes a connection with a server
 * 
 */
public class Connector {

	/**
	 * A port number of the server for connection to public IP
	 */
	private static int PORTnum = 4567;
	
	/**
	 * A value that holds the client IP
	 */
	private static String IP = "";
	
	/**
	 * A stream to receive data from the server
	 */
	private static DataInputStream IN;
	
	/**
	 * A stream to send data to the server
	 */
	private static DataOutputStream OUT;
	
	public static void main (String[] args) throws IOException {
		
		try (
				Socket SOCKET = new Socket(InetAddress.getByName(IP), PORTnum);
			){
			IN = new DataInputStream(SOCKET.getInputStream());
			OUT = new DataOutputStream(SOCKET.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
