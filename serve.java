import java.io.*;
import java.net.*;

//---------------------------------------------------------------------------------

public class serve {
	
	public static void main(String args[]) throws Exception{
		
		serve server = new serve();
		server.run();
		
		
	}
	
//---------------------------------------------------------------------------------
	
	public void run() throws Exception{
		
		ServerSocket servesock = new ServerSocket(123);
		Socket sock = servesock.accept();
		InputStreamReader isr = new InputStreamReader(sock.getInputStream());
		BufferedReader br = new BufferedReader(isr);
		
		String msg = br.readLine();
		System.out.println(msg);
		
		if(msg != null)
		{
			PrintStream ps = new PrintStream(sock.getOutputStream());
			ps.println("Message Received");
		}
		
		//trial part to follow
		
		if (servesock != null && !servesock.isClosed()) {
	        servesock.close(); //compiler do not allow me to do because I should catch IOExceoption from this method also...
	    }
	}

}
