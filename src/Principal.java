import java.util.ArrayList;
import java.util.Scanner;



public class Principal {

	public static void main(String[] args){
		
		
		ArrayList<Livro> listaDeLivros = new ArrayList<Livro>();
		
		acervoLivros(listaDeLivros); 
		int menu = 0;
		
		
		do { 
			
			System.out.println("\n--------------------");
			System.out.println("     Biblioteca     ");
			System.out.println("--------------------");
			System.out.println("[1] Retirar Livro ");
			System.out.println("[2] Devolver Livro  ");
			System.out.println("[3] Doar um Livro  ");
			System.out.println("[4] Encerrar Programa   ");
			System.out.println("--------------------");
		
			Scanner ler = new Scanner(System.in);
			menu = ler.nextInt();
			
			switch(menu) { 
			
			case 1:
				
				System.out.println("\nLista de Livros: ");
				for (Livro livro : listaDeLivros) { 
					System.out.println(livro.toString()); 
				}
				
				System.out.println("\nDigite o número do livro desejado: ");
				int codLivro = ler.nextInt();
				boolean codInexistente = true; 
				for(Livro livro : listaDeLivros) { 
					if(livro.getCodigo () == codLivro) {
						codInexistente = false; 
						
						if(livro.getEstaDisponivel()) { 
							System.out.println("\nDigite o nome de quem vai retirar: \n");
							ler.nextLine();
							String vizinho = ler.next();
							livro.retirar(vizinho); 
						}
						
						else {
							System.out.println("\nTitulo Indisponivel!" + "\nTitulo locado por: " + livro.getemprestimoVizinho());
						}
					}
				}
				
				if(codInexistente) {
					System.out.println("\nCódigo Inexistente");
				}
			
				
				
				break;
			case 2:
				System.out.println("\nDigite o número do livro a ser devolvido: ");
				int codLivro1 = ler.nextInt();
				
				for (Livro livro : listaDeLivros) {
					if(livro.getCodigo() == codLivro1){
						livro.devolver();
					}
				}	
				
				break;
			
			case 3:
				System.out.println("\n---- DOAR LIVRO ----");
				
				ler.nextLine();
				
				System.out.println("\nDigite o tiulo: ");
				String titLivro = ler.nextLine();
				
				System.out.println("\nDigite o autor: ");
				String nomeAutor = ler.nextLine();
				
				System.out.println("\nDigite o Ano: ");
				int ano = ler.nextInt();
				
				listaDeLivros.add(new Livro (listaDeLivros.size() + 1, titLivro, nomeAutor, ano ));
				
				break;
				
			case 4: 
				System.out.println("\nPrograma encerrado!");
				System.exit(0);
				
			default:
				System.out.println("\nOpção inválida!");
			}
		}while(menu != 4);		
	}
		
	
	private static void acervoLivros(ArrayList<Livro> listaDeLivros) {
		listaDeLivros.add(new Livro(1,"1984", " Gerge Orwell", 1984));
		listaDeLivros.add(new Livro(2,"O Poder do Hábito", "Charles Duhigg ", 2012));
		listaDeLivros.add(new Livro(3,"Filosofia para corajosos", "Luiz Felipe pondé", 2016));
	}
	
}
