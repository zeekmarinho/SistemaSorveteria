package dao;

import java.util.List;

import entidade.Sorvete;

public interface IRepositorioSorvete {
	
	public boolean inserirSorvete(Sorvete sorvete);
	public boolean deletarSorvete(String nome);
	public List<Sorvete> listaSorvetes();

}
