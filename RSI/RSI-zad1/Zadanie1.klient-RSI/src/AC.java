import java.net.URL;

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
