package ClientSide;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;


/**
 * (Program is to be saved as .jar file.
 *  Before executing, run in CMD the query below
 *  java -Dserver.port=6789 -jar Connector.jar
 *  it makes sure that the program runs from the right port)
 */
public class Connector {

	
	private static int PORTnum = 4567;
	
	private static String IP = "143.198.45.215";
	
	private static DataInputStream IN;
	
	private static DataOutputStream OUT;
	
	public static void main (String[] args) throws IOException {
		
		try (
				Socket SOCKET = new Socket(InetAddress.getByName(IP), PORTnum);
			){
			IN = new DataInputStream(SOCKET.getInputStream());
			OUT = new DataOutputStream(SOCKET.getOutputStream());
			System.out.println("Success");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
