import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class AluguelRoupasImpl extends UnicastRemoteObject implements AluguelRoupasService{

	protected AluguelRoupasImpl() throws RemoteException {
		super();		
	}

	private static final long serialVersionUID = 1L;

	@Override
	public String findRoupasDisponiveis(String estilo, Date inicioAluguel, Date fimAluguel) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	
}
