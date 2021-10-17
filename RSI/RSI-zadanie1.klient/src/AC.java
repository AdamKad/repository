

import java.net.URL;

import org.apache.xmlrpc.AsyncCallback;

public class AC implements AsyncCallback{
	public void handleResult(Object result,URL url, String metoda) { System.out.println("Otrzymano: " + result + " spod url " + url + "z pomoc¹ metody: " + metoda);}
	public void handleError(Exception e, URL url, String metoda) {System.out.println("B³¹d: " + e + " spod url " + url + "z pomoc¹ metody: " + metoda);}
}


/*import java.net.URL;

import org.apache.xmlrpc.AsyncCallback;

public class AC implements AsyncCallback{
	
	
	@Override
	public void handleResult(Object rezultat, URL url, String metoda) {
		
		System.out.println("Rezultat:"+rezultat);
	}
	@Override
	public void handleError(Exception e, URL url, String metoda) {
		
		System.out.println("error");
	}
	
	

}
*/