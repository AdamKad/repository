

/*

import java.util.Scanner;
import java.util.Vector;


import org.apache.xmlrpc.XmlRpcClient;



public class ClientRpc {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		try {
			
			String ip = reader.nextLine();
			XmlRpcClient srv = new XmlRpcClient(ip);
			
			Vector<Integer> params = new Vector<Integer>();
			params.addElement(new Integer(13));
			
			
			
			Object result = srv.execute("Moj serwer.show",new Vector<String>());
			String wynik = (String)result;
			System.out.println(wynik);
			
			
			/*Vector<Integer> params2 = new Vector<Integer>();
			
			params2.addElement(new Integer(3000));
			srv.executeAsync("Moj serwer.asy",params2, cb);
			System.out.println("Zakonczono procedure asy");*/
			/*
			while(true) {
			AC cb = new AC();
			String query = reader.nextLine();		
			if(query.equals("exit")) {break;}
			
			
			Scanner s = new Scanner(query);
			String method = s.next();
			
			String p="";
			while(s.hasNext()) {p+= s.next() + " ";}
			
			Vector<String> vs = new Vector<String>();
			
			vs.addElement(p);
			if(method.equals("asy")) {
				srv.executeAsync("Moj serwer.asy", vs,cb);
				
				
			}
			else {
			Object r = srv.execute("Moj serwer."+method, vs);			
			System.out.println(r);
				}
			s.close();
			}
			
			reader.close();
		}
		catch(Exception e) {
			System.err.println("Klient XML-RPC: " + e);			
		}
		
		
	}

	

}
*/
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
