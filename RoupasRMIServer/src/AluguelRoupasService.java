import java.rmi.Remote;
import java.rmi.RemoteException;
import java.time.LocalDate;
import java.util.Date;

public interface AluguelRoupasService extends Remote {

	String findRoupasDisponiveis(String estilo, LocalDate inicio, LocalDate fim) throws RemoteException;
}
