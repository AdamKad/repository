import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MySerwer {
	public static void main(String[] args) {
		if(args.length==0) {
			System.out.println("You have to enter RMI object address in the gorm: //host_address/service_name");
			return;
		}
		if(System.getSecurityManager()==null)
			System.setSecurityManager(new SecurityManager());
		
	
		/*try {
			Registry reg= LocateRegistry.createRegistry(1099);
		}catch(RemoteException e1) {
			e1.printStackTrace();
		}*/
		
		
		
		try {
			CalcObjImpl2 implObjektu2 = new CalcObjImpl2();
			java.rmi.Naming.rebind(args[0],implObjektu2);
			System.out.println("Server is registered now2");
			System.out.println("Press Ctrl+C to stop...");
		}
		catch(Exception e){
			System.out.println("Server cant be registered");
			e.printStackTrace();
			return;
		}
	}
}
