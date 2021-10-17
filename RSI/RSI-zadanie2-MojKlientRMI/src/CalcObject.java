import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalcObject extends Remote{
	public ResultType oblicz(InputType inputParam) throws RemoteException;

}
