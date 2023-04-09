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

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Roupa> getRoupas() {
		return roupas;
	}

	public void setRoupas(ArrayList<Roupa> roupas) {
		this.roupas = roupas;
	}

	public void adicionarRoupa(Roupa roupa) {
		roupas.add(roupa);
	}

}
