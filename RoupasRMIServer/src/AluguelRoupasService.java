import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

public interface AluguelRoupasService extends Remote {

	String findRoupasDisponiveis(String estilo, Date inicioAluguel, Date fimAluguel) throws RemoteException;
}