import java.util.Scanner;
import java.util.Vector;
import org.apache.xmlrpc.WebServer;
import org.apache.xmlrpc.XmlRpcClient;


public class KlientRPC {

	public static void main(String[] args) {
		
		try {
			
			Scanner scanner = new Scanner(System.in);
			String port=scanner.nextLine();
			XmlRpcClient srv= new XmlRpcClient("http://localhost:"+port);
			
			while(true) {
				
				String query = scanner.nextLine();		
				if(query.equals("exit")) {break;}
				Scanner s = new Scanner(query);
				String method = s.next();
				
				
			switch(method) {
			case "show": {
				String show=(String)srv.execute("MojSerwer.show", new Vector<Object>());
				System.out.println(show);
				break;
			}
			case "multiplication": {
				Vector<Integer> intParams= new Vector<Integer>();
				while(s.hasNext()) {intParams.addElement(Integer.parseInt(s.next()));}
				Object result=srv.execute("MojSerwer.multiplication",intParams);
				int wynik=((Integer)result).intValue();
				System.out.println("wynik:"+wynik);
				break;
			}
			case "showAge":{
				Vector<String> params= new Vector<String>();
				while(s.hasNext()) {params.addElement(s.next());}
				Object result=srv.execute("MojSerwer.showAge",params);
				String wynik=((String)result);
				System.out.println(wynik);
				break;
				}
			case "asyInt":{
				AC ac=new AC();
				Vector<Integer> intParams= new Vector<Integer>();
				while(s.hasNext()) {intParams.addElement(Integer.parseInt(s.next()));}
				srv.executeAsync("MojSerwer.asyInt",intParams, ac);
				break;
			}
			default: {
				System.out.println("z³e dane");
				break;
				}
			}
			s.close();
			}
			scanner.close();
			System.out.println("zakoñczono");
			
		}catch(Exception exception) {
			System.err.println("Klient XML-RPC: "+exception);
		}
	}
}
