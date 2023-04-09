import java.util.ArrayList;

public class RepositoryRoupas {
	
	public ArrayList<Roupa> roupas = new ArrayList<>();
	
	public void adicionarRoupa(Roupa roupa) {
		
		roupas.add(roupa);
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
	
	

}
