
public class MyClient {
	public static void main(String[] args) {
		double wynik;
		CalcObject2 zObjekt2;
		ResultType wynik2;
		InputType inObj;
		
		if(args.length==0) {
			System.out.println("You have to enter RMI object address in the gorm: //host_address/service_name");
			return;
		}
		String adres = args[0];
		inObj=new InputType();
		inObj.x1=2.2;
		inObj.x2=4.5;
		inObj.operation="add";
		//if(System.getSecurityManager()==null)
		//	System.setSecurityManager(new SecurityManager());
		
		try {
			 zObjekt2 = (CalcObject2) java.rmi.Naming.lookup(adres);
		}
		catch(Exception e){
			System.out.println("Nie mozna pobrac referencji do "+adres);
			e.printStackTrace();
			return;
		}
		System.out.println("referencja do "+adres+" jest pobrana");
		
		try {
			wynik2=zObjekt2.calculate(inObj);
		}
		catch(Exception e) {
			System.out.println("Blad zdalnego wywoolania");
			e.printStackTrace();
			return;
		}
		System.out.println("wynik"+wynik2.result+ " , "+wynik2.result_description);
		return;
	}
}
