package teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.RepositorioSorvete;
import entidade.Sorvete;


public class Teste {
	
	static RepositorioSorvete rs = new RepositorioSorvete();

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		int opcao = 0;
		
		while(opcao != 4) {
			
			System.out.println("-------------SISTEMA SORVETERIA-------------");
			System.out.println("1- Inserir Sorvete: ");
			System.out.println("2- Remover Sorvete: ");
			System.out.println("3- Listar Sorvetes: ");
			System.out.println("4- SAIR: ");
			System.out.println("--------------------------------------------");
			opcao = sc.nextInt();
			
			switch(opcao) {
			
				case (1)://INSERIR					
		
					System.out.println("Informe o nome do sorvete: ");
					String nome = sc.nextLine();
					sc.nextLine();
					System.out.println("Informe os sabores: ");
					String sabores = sc.nextLine();
					System.out.println("Informe o preço: ");
					double preco = Double.parseDouble(sc.nextLine());					
					Sorvete sorvete = new Sorvete();
					sorvete.setNome(nome);
					sorvete.setSabor(sabores);
					sorvete.setPreco(preco);
					rs.inserirSorvete(sorvete);
					System.out.println("Sorvete Inserido");					
					
				break;
				
				case (2)://REMOVER
						
					System.out.println("Informe o nome do sorvete que será removido: ");
					String nomeR = sc.nextLine();
					sc.nextLine();
					rs.deletarSorvete(nomeR);
					System.out.println("Sorvete Removido");					
					
				break;
				
				case (3)://LISTAR
						
					List<Sorvete> lista = new ArrayList<Sorvete>();
						
					lista = rs.listaSorvetes();
						
					System.out.println("---------------SABORES---------------");
						
					for (Sorvete sorvetelista : lista) {
							
						System.out.println("Nome: "+sorvetelista.getNome());
						System.out.println("Sabores: "+sorvetelista.getSabor());
						System.out.println("Preço: "+sorvetelista.getPreco());
						System.out.println("---------------------------------");
							
					}			
				
				break;
				
				case (4):
					
					System.out.println("Saindo");
				
				break;
				
				default:
					
					System.out.println("Opção Inválida");
					
				break;
			}
		}
		sc.close();
	}
}
