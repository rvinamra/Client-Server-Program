import java.io.*;
import java.net.*;

//--------------------------------------------------------------------------------

public class cli {
	
	public static void main(String args[]) throws Exception{
		
		cli client = new cli();
		client.run();
		
	}
	
	public void run() throws Exception{
		
		Socket sock = new Socket("localhost", 123);
		PrintStream ps = new PrintStream(sock.getOutputStream());
		ps.println("hello from the other side!");
		
		InputStreamReader isr = new InputStreamReader(sock.getInputStream());
		BufferedReader br = new BufferedReader(isr);
		
		String msg = br.readLine();
		System.out.println(msg);
		
		//trial part to follow
		
				if (sock != null && !sock.isClosed()) {
			        sock.close(); //compiler do not allow me to do because I should catch IOExceoption from this method also...
			    }
		
		
	}

}
