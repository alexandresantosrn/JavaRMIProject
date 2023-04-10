import java.util.ArrayList;

public class RepositoryRoupas {
	
	public ArrayList<Roupa> roupas = new ArrayList<>();
	public ArrayList<Loja> lojas = new ArrayList<>();
	
	public void adicionarRoupa(Roupa roupa) {
		
		roupas.add(roupa);
	}
	
	public void adicionarLoja(Loja loja) {
		
		lojas.add(loja);
	}
	
	public ArrayList<Roupa> retornarRoupasByEstilo (String estilo) {
		ArrayList<Roupa> roupasReturn = new ArrayList<>(); 
		
		for (Roupa roupa : roupas) {
			if (roupa.getEstilo().equals(estilo)) {
				roupasReturn.add(roupa);
			}
		}
		
		return roupasReturn;
	}

	public ArrayList<Roupa> getRoupas() {
		return roupas;
	}

	public void setRoupas(ArrayList<Roupa> roupas) {
		this.roupas = roupas;
	}

	public ArrayList<Loja> getLojas() {
		return lojas;
	}

	public void setLojas(ArrayList<Loja> lojas) {
		this.lojas = lojas;
	}
	
	public String retornarLojaByRoupa (Roupa roupa) {
		String lojaReturn = "";
		
		for (Loja loja : lojas) {
			for (int i = 0; i <= roupas.size(); i++) {
				if (roupa.getNome().equals(loja.getRoupas().get(i).getNome())) {
					lojaReturn = loja.getNome();
				}
			}			
		}
		
		return lojaReturn;
	}
	
	

}
