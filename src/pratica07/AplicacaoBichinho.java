package pratica07;

import java.util.Scanner;

public class AplicacaoBichinho {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Bichinho b1 = new Bichinho();
		
		System.out.println("=========================");
		System.out.print("Digite o nome do bichinho: ");
		b1.nome = sc.nextLine();

		int opcao = 0;
		do {
			
			System.out.println("");
			System.out.println("=== Bichinho Virtual ===");
			System.out.println("");
			System.out.println("1 - Alimentar");
			System.out.println("2 - Brincar");
			System.out.println("3 - Dormir");
			System.out.println("4 - Ver status");
			System.out.println("0 - Sair");
			System.out.println("------------------------");
			System.out.print("Digite a opção: ");
			opcao = sc.nextInt();
			System.out.println("");
			
			switch (opcao) {
				case 1: {
					System.out.print("Digite a porção: ");
					int porcao = sc.nextInt();
					
					b1.alimentar(porcao);
					
					break;
				}
				case 2: {
					b1.brincar();
					
					break;
				}
				case 3: {
					b1.dormir();
					
					break;
				}
				case 4: {
					mostrarBichinho(b1);
					
					break;
				}
				case 0: {
					System.out.println("Saindo do Sistema.");
					
					break;
				}
				default: 
					System.out.println("Opção inválida.");
					
					break;
			}
			
			if (opcao == 0) {
				break;
			}
			
		} while(true);
		
		sc.close();
	}
	
	static void mostrarBichinho(Bichinho bichinho) {
		System.out.println("======================");
		System.out.println("Nome: " + bichinho.nome);
		System.out.println("Fome: " + bichinho.fome);
		System.out.println("Energia: " + bichinho.energia);
		System.out.println("Humor: " + bichinho.humor);
		System.out.println("======================");
	}
}
