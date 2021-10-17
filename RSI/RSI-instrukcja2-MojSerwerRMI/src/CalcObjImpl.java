import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalcObjImpl extends UnicastRemoteObject implements CalcObject{
	
	private static final long serialVersionUIO=101L;
	
	public CalcObjImpl() throws RemoteException{
		super();
	}
	
	public double calculate (double a, double b) throws RemoteException {
		double wynik=a+b;
		return wynik;
	}
}
