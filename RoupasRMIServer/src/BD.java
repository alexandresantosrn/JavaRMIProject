
public class BD {

	public static void carregarDados() {

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
	}

}
