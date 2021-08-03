package ServerSide;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketPreparation {
	
	static DataInputStream in;
	
	static DataOutputStream out;
	
	private static final String privateIP = "";
	
	private static String clientIP = "";
	
    static DataInputStream privateIn;
	
	static DataOutputStream privateOut;
	
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
