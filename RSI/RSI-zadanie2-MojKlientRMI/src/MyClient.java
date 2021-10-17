import java.rmi.RemoteException;

public class MyClient {
	public static void main(String[] args) throws RemoteException {
	
		CalcObject zObjekt;
		Input input;
		ResultType wynik2;
		ResultType wynik3;
		InputType inObj2;
		InputType inObj;
		
		if(args.length==0) {
			System.out.println("You have to enter RMI object address in the gorm: //host_address/service_name");
			return;
		}
		String adres = args[0];
		String adres1 = args[1];
		inObj=new InputType();
		inObj.x1=2;
		inObj.x2=3;
		inObj.x3=6;
		inObj.operation="mul";
		
		inObj2=new InputType();
		inObj2.x1=1;
		inObj2.x2=4;
		
		inObj2.operation="mul";
		
		
		//inObj.operation="mul";
		
		//if(System.getSecurityManager()==null)
		//	System.setSecurityManager(new SecurityManager());
		
		try {
			
			 zObjekt = (CalcObject) java.rmi.Naming.lookup(adres);
		}
		catch(Exception e){
			System.out.println("Nie mozna pobrac referencji do "+adres);
			e.printStackTrace();
			return;
		}
		System.out.println("referencja do "+adres+" jest pobrana");
		try {
			
			 input = (Input) java.rmi.Naming.lookup(adres1);
		}
		catch(Exception e){
			System.out.println("Nie mozna pobrac referencji do "+adres);
			e.printStackTrace();
			return;
		}
		System.out.println("referencja do "+adres1+" jest pobrana");
		
		try {
			wynik3=input.oblicz2(inObj);
			inObj2.x3=(int)wynik3.result;
			wynik2=zObjekt.oblicz(inObj2);
		}
		catch(Exception e) {
			System.out.println("Blad zdalnego wywoolania");
			e.printStackTrace();
			return;
		}
		System.out.println("wynik"+wynik3.result+ " , "+wynik3.result_description);
		System.out.println("wynik"+wynik2.result+ " , "+wynik2.result_description);
		return;
	}
}
