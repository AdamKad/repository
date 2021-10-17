
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalcObjImpl extends UnicastRemoteObject implements CalcObject{
	
	public CalcObjImpl() throws RemoteException{
		super();
	}
	public ResultType oblicz(InputType inParam) throws RemoteException{
		int zm1, zm2, zm3;
		ResultType wynik= new ResultType();
		zm1=inParam.getx1();
		zm2=inParam.getx2();
		zm3=inParam.getx3();
		wynik.result_description= "Operacja "+inParam.operation+"["+zm1+","+zm2+","+zm3+"]";
		
		switch(inParam.operation) {
		case "mul":
			wynik.result= zm1*zm2*zm3;
			break;
		case "div":
			wynik.result= zm1/zm2/zm3;
			break;
		default:
			wynik.result=0;
			wynik.result_description="Podano zla operacja";
			return wynik;
		}
		return wynik;
	}
	
}
