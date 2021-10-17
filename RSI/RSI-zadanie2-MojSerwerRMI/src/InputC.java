import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class InputC extends UnicastRemoteObject implements Input {

	private static final long serialVersionUID=101L;
	protected InputC() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public ResultType oblicz2(InputType inputParam) throws RemoteException{
		int zm1, zm2, zm3;
		ResultType wynik= new ResultType();
		zm1=inputParam.getx1();
		zm2=inputParam.getx2();
		zm3=inputParam.getx3();
		wynik.result_description= "Operacja "+inputParam.operation+"["+zm1+","+zm2+","+zm3+"]";
		
		switch(inputParam.operation) {
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
