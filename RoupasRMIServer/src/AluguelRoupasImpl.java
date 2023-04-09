import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Date;

public class AluguelRoupasImpl extends UnicastRemoteObject implements AluguelRoupasService{

	protected AluguelRoupasImpl() throws RemoteException {
		super();	
		//BD.carregarDados();
	}

	private static final long serialVersionUID = 1L;

	@Override
	public String findRoupasDisponiveis(String estilo, String inicio, String fim) throws RemoteException {		
		String msg = carregarItens(estilo);
		return msg;
	}
	
	public String carregarItens(String estilo) {
		
		RepositoryRoupas rp = new RepositoryRoupas();
		Loja loja1 = new Loja("Sports Center");
		Loja loja2 = new Loja("Ponto Xique");
		Loja loja3 = new Loja("Natal Rigor");

		Roupa roupa1 = new Roupa("Short preto básico para corrida", "Esportivo", 15);
		Roupa roupa2 = new Roupa("Caça legging", "Esportivo", 50);
		Roupa roupa3 = new Roupa("Camisa musculação", "Esportivo", 30);

		loja1.adicionarRoupa(roupa1);
		loja1.adicionarRoupa(roupa2);
		loja1.adicionarRoupa(roupa3);
		rp.adicionarRoupa(roupa1);
		rp.adicionarRoupa(roupa2);
		rp.adicionarRoupa(roupa3);	
		
		ArrayList<Roupa> roupas = new ArrayList<>();
		roupas = rp.retornarRoupasByEstilo(estilo);
		
		String x = roupas.get(0).getNome();
		
		return x;
	}

	
}
