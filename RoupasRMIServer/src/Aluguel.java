import java.time.LocalDate;

public class Aluguel {

	Roupa roupa;
	LocalDate inicio;
	LocalDate fim;

	public Aluguel(Roupa roupa, LocalDate inicio, LocalDate fim) {
		super();
		this.roupa = roupa;
		this.inicio = inicio;
		this.fim = fim;
	}

	public Roupa getRoupa() {
		return roupa;
	}

	public void setRoupa(Roupa roupa) {
		this.roupa = roupa;
	}

	public LocalDate getInicio() {
		return inicio;
	}

	public void setInicio(LocalDate inicio) {
		this.inicio = inicio;
	}

	public LocalDate getFim() {
		return fim;
	}

	public void setFim(LocalDate fim) {
		this.fim = fim;
	}

}
