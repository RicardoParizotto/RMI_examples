package appcalculadora;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Servidor implements Calculadora {

	/*
	public Servidor(){
		super();
	}
	*/

	public int somarInt(int val1, int val2) throws RemoteException{
		return val1 + val2;
	}

	public int multiplicarInt(int val1, int val2) throws RemoteException{
		return val1 * val2;
	}	

	public static void main(String args[]) {

		if (System.getSecurityManager() == null) {
        		System.setSecurityManager(new SecurityManager());
		}
		try{
			String name = "Calc";
			Calculadora calc = new Servidor();
			Calculadora stub = (Calculadora) UnicastRemoteObject.exportObject(calc, 0);
	
			// obtém referência para registry no localhost e na porta default para o registr
			Registry registry = LocateRegistry.getRegistry();
			registry.rebind(name, stub);
		} catch (Exception e){
			System.err.println("Calc exception:");
			e.printStackTrace();
		}
		
	}
}