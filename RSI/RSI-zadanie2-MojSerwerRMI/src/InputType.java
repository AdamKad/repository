
import java.io.Serializable;
import java.rmi.RemoteException;

public class InputType implements Serializable{
	private static final long serialVersionUID=101L;
	String operation;
	public int x1;
	public int x2;
	public int x3;

	
	public int getx1() {
		return x1;
	}
	public int getx2() {
		return x2;
	}
	public int getx3() {
		return x3;
	}
	
}
