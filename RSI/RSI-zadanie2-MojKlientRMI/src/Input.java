import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Input extends Serializable, Remote{
	public ResultType oblicz2(InputType inputParam) throws RemoteException;

}
