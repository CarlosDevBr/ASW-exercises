import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.NotBoundException;
import java.net.MalformedURLException;
import java.util.Scanner;

public class MensageiroClient {

 public static void main( String args[] ) {
	try (Scanner sc = new Scanner(System.in)) {
		int i,j;
		 

		 try {
			Mensageiro m = (Mensageiro) Naming.lookup( "rmi://localhost/MensageiroService" );
		 	System.out.print("Digite 1o. valor = " );
			i = sc.nextInt();	
		 	System.out.print("Digite 2o. valor =  ");
			j = sc.nextInt();	
			System.out.println("soma = " + m.soma( i,j ));
		 }
		 catch( MalformedURLException e ) {
			 System.out.println();
			 System.out.println( "MalformedURLException: " + e.toString() );
		 }
		 catch( RemoteException e ) {
			 System.out.println();
			 System.out.println( "RemoteException: " + e.toString() );
		 }
		 catch( NotBoundException e ) {
			 System.out.println();
			 System.out.println( "NotBoundException: " + e.toString() );
		 }
		 catch( Exception e ) {
			 System.out.println();
			 System.out.println( "Exception: " + e.toString() );
		 }
	}
 }
} 
