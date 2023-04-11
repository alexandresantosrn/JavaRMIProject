import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Date;

public class AluguelRoupasImpl extends UnicastRemoteObject implements AluguelRoupasService {

	protected AluguelRoupasImpl() throws RemoteException {
		super();
	}

	private static final long serialVersionUID = 1L;

	@Override
	public String findRoupasDisponiveis(String estilo, String inicio, String fim) throws RemoteException {
		String msg = carregarItens(estilo);
		return msg;
	}

	public String carregarItens(String estilo) {

		BDRepository rp = new BDRepository();
		
		//Criação das lojas
		Loja loja1 = new Loja("Alguém Veste");
		Loja loja2 = new Loja("Ponto Xique");
		Loja loja3 = new Loja("Natal Rigor");

		//Criação das roupas
		Roupa roupa1 = new Roupa("Short preto básico para corrida", "Esportivo", 15);
		Roupa roupa2 = new Roupa("Caça legging", "Esportivo", 50);
		Roupa roupa3 = new Roupa("Camisa musculação", "Esportivo", 30);
		Roupa roupa4 = new Roupa("Camisa social padrão", "Tradicional", 40);
		Roupa roupa5 = new Roupa("Vestido tradicional", "Tradicional", 70);
		Roupa roupa6 = new Roupa("Calça Jeans padrão", "Tradicional", 30);
		Roupa roupa7 = new Roupa("Terno completo", "Festa", 100);
		Roupa roupa8 = new Roupa("Vestido para noiva", "Festa", 200);
		Roupa roupa9 = new Roupa("Smoking tradicional", "Festa", 150);				

		//Adicionando roupas as lojas
		loja1.adicionarRoupa(roupa1);
		loja2.adicionarRoupa(roupa2);
		loja3.adicionarRoupa(roupa3);
		loja1.adicionarRoupa(roupa4);
		loja2.adicionarRoupa(roupa5);
		loja3.adicionarRoupa(roupa6);
		loja1.adicionarRoupa(roupa7);
		loja2.adicionarRoupa(roupa8);
		loja3.adicionarRoupa(roupa9);
		
		//Adicionando roupas ao repositório
		rp.adicionarRoupa(roupa1);
		rp.adicionarRoupa(roupa2);
		rp.adicionarRoupa(roupa3);
		rp.adicionarRoupa(roupa4);
		rp.adicionarRoupa(roupa5);
		rp.adicionarRoupa(roupa6);
		rp.adicionarRoupa(roupa7);
		rp.adicionarRoupa(roupa8);
		rp.adicionarRoupa(roupa9);
		
		//Adicionando lojas ao repositório
		rp.adicionarLoja(loja1);
		rp.adicionarLoja(loja2);
		rp.adicionarLoja(loja3);

		ArrayList<Roupa> roupas = new ArrayList<>();
		roupas = rp.retornarRoupasByEstilo(estilo);

		ArrayList<Loja> lojas = new ArrayList<>();
		lojas = rp.getLojas();

		String msg = "Seguem as roupas encontradas para o estilo selecionado: " + estilo + ": \n";

		for (Loja loja : lojas) {
			for (Roupa roupa : roupas) {
				if (loja.checkRoupaEmLoja(roupa)) {
					msg = msg + "Produto: " + roupa.getNome() + " de: " + roupa.getPreco()
							+ " reais, localizado na loja: " + loja.getNome() + ".\n";
				}
			}
		}

		return msg;
	}

}
