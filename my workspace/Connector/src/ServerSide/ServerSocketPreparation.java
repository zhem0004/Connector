package ServerSide;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * A program to be run from server side, that allows a client to connect
 * via both public and private IPs of the server
 *
 */
public class ServerSocketPreparation {
	
	/**
	 * A stream to receive data from the client
	 */
	static DataInputStream in;
	
	/**
	 * A stream to send data to the client
	 */
	static DataOutputStream out;
	
	/**
	 * Server's private IP
	 */
	private static final String privateIP = "";
	
	/**
	 * IP of the client that will have a tunnel to server's port via server's 
	 * private IP
	 */
	private static String clientIP = "";
	
	/**
	 * A process to execute a query that creates a tunnel
	 */
	static Process p;

	public static void main(String[] args) throws IOException {
		
		try (
				ServerSocket server = new ServerSocket(4567, 2);
				Socket socket = server.accept();
				){
			server.setSoTimeout(900000);
			in = new DataInputStream(socket.getInputStream());
			out = new DataOutputStream(socket.getOutputStream());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		p = Runtime.getRuntime().exec("ssh -R 6789:" + privateIP + ":21 root@" + clientIP);
		
	}

}
