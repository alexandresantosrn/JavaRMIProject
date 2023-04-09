
public class BD {

	public void carregarDados() {

		Loja loja1 = new Loja("Sports Center");
		Loja loja2 = new Loja("Ponto Xique");
		Loja loja3 = new Loja("Natal Rigor");

		Roupa roupa1 = new Roupa("Short preto básico para corrida", "Esportivo", 15);
		Roupa roupa2 = new Roupa("Caça legging", "Esportivo", 50);
		Roupa roupa3 = new Roupa("Camisa musculação", "Esportivo", 30);

		loja1.adicionarRoupa(roupa1);
		loja1.adicionarRoupa(roupa3);
		loja1.adicionarRoupa(roupa3);
	}

}
