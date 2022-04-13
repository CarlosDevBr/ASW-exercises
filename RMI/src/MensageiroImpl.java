import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
 
public class MensageiroImpl extends UnicastRemoteObject implements Mensageiro {
 
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public MensageiroImpl() throws RemoteException {
	 super();
 }
 
 public int soma( int a, int b ) throws RemoteException {
	//System.out.println("Cliente : " +  getClientHost());
	System.out.println("Recebendo valores : " + a +" e "+ b);
	 return (a+b);
 }
} 
