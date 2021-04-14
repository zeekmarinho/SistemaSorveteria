package dao;

import java.util.ArrayList;
import java.util.List;

import entidade.Sorvete;

public class RepositorioSorvete implements IRepositorioSorvete {
	
	List<Sorvete> listaSorvetes = new ArrayList<Sorvete>();

	//Inserir sorvete na lista
	public boolean inserirSorvete(Sorvete sorvete) {
		
		try {
			listaSorvetes.add(sorvete);
		}catch (Exception e) {
			return false;
		}		
		return true;		
		
	}

	//Remover sorvete da lista
	public boolean deletarSorvete(String nome) {
		
		for (Sorvete sorvete : listaSorvetes) {
			if(sorvete.getNome() == nome) {
				listaSorvetes.remove(sorvete);
			}
		}
		return false;
	}

	//Listar Sorvetes
	public List<Sorvete> listaSorvetes() {
		
		return this.listaSorvetes;
	}

}
