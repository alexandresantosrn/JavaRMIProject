import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main {

	public static void main(String[] args) throws RemoteException, AlreadyBoundException {

		Registry registry = LocateRegistry.createRegistry(1099);
		AluguelRoupasService server = new AluguelRoupasImpl();
		registry.rebind("Roupas", (Remote) server);
		System.out.println("Servidor RMI pronto!");
	}

}
