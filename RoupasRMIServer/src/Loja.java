import java.util.ArrayList;

public class Loja {

	String nome;
	public ArrayList<Roupa> roupas = new ArrayList<>();

	public Loja(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void adicionarRoupa(Roupa roupa) {
		roupas.add(roupa);
	}

	public boolean checkRoupaEmLoja(Roupa roupa) {

		boolean b = false;

		if (roupas.contains(roupa)) {
			b = true;
		}

		return b;
	}

}
