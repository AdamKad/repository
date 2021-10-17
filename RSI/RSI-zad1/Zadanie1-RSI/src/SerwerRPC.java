import org.apache.xmlrpc.WebServer;

public class SerwerRPC {

	public static void main(String[] args) {
		
		try {
			System.out.println("Startuje serwer XML-RPC...");
			int port=10022;
			WebServer server=new WebServer(port);
			
			server.addHandler("MojSerwer", new SerwerRPC());
			server.start();
			System.out.println("Serwer wystartowa³ pomyœlnie.");
			System.out.println("Nasluchuje na porcie: "+port);
			System.out.println("Aby zatrzymaæ serwer naciœnij ctrl+c");
		}catch(Exception exception) {
			System.err.println("Serwer XML-RPC: "+exception);
		}
	}
	
	public Integer multiplication(int x, int y) {
		return x*y;
	}
	
	public String showAge(String name, String age) {
		String result=(String)name+"-"+Integer.parseInt(age)+" lat";
		return result;
	}
	
	public Integer asyInt(int time, int res) {
		System.out.println("...wywo³ano asy - odliczam");
		
		try {
			Thread.sleep(time);
			
		}catch(InterruptedException ex) {
			ex.printStackTrace();
			Thread.currentThread().interrupt();
		}
		return(res);
	}
	
	public String show() {
		
		String show = "multiplication(int x, int y)-zwraca iloczyn dwoch liczb typu int  \nshowAge(String name, int age)-zwraca ciag znakow skladajacy sie z imienia i wieku \nasyInt(int time, int res)-po czasie time(w milisekundach) zwraca inta \naby wywolac procedure napisz jej nazwe i parametry po spacji np asyInt 10 1 \naby zakonczyc napisz exit";
	return show;
	}
}
