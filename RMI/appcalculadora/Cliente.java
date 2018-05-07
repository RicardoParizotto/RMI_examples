package appcalculadora;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Cliente {

	public static void main(String args[]) {
		if (System.getSecurityManager() == null) {
        		System.setSecurityManager(new SecurityManager());
		}
		try{
			Registry registry = LocateRegistry.getRegistry();
			Calculadora proxy = (Calculadora) registry.lookup("Calc");
			
			System.out.println(proxy.somarInt(12,4));

		
		} catch (Exception e){
			System.err.println("Calc exception:");
			e.printStackTrace();
		}
	}
}