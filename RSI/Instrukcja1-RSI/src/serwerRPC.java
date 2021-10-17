import org.apache.xmlrpc.WebServer;

public class serwerRPC {

	public static void main(String[] args) {
		
		try {
			System.out.println("Startuje serwer XML-RPC...");
			int port=10022;
			WebServer server=new WebServer(port);
			
			server.addHandler("MojSerwer", new serwerRPC());
			server.start();
			System.out.println("Serwer wystartowa³ pomyœlnie.");
			System.out.println("Nasluchuje na porcie: "+port);
			System.out.println("Aby zatrzymaæ serwer naciœnij ctrl+c");
		}catch(Exception exception) {
			System.err.println("Serwer XML-RPC: "+exception);
		}
	}
	
	public Integer echo(int x, int y) {
		return new Integer(x+y);
	}
	
	public int execAsy(int x) {
		System.out.println("...wywo³ano asy - odliczam");
		
		try {
			Thread.sleep(x);
		}catch(InterruptedException ex) {
			ex.printStackTrace();
			Thread.currentThread().interrupt();
		}
		System.out.println("...asy - koniec odpliczania");
		return(123);
	}
}
