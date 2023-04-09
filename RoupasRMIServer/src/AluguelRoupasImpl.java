import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class AluguelRoupasImpl extends UnicastRemoteObject implements AluguelRoupasService{

	protected AluguelRoupasImpl() throws RemoteException {
		super();	
		BD bd = new BD();
		bd.carregarDados();
	}

	private static final long serialVersionUID = 1L;

	@Override
	public String findRoupasDisponiveis(String estilo) throws RemoteException {
		// TODO Auto-generated method stub
		String msg = "Que alegria!!";
		return msg;
	}

	
}
