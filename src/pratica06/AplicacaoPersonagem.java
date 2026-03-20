package pratica06;

import java.util.Scanner;

public class AplicacaoPersonagem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Personagem p1 = new Personagem();
		
		System.out.println("==============================");
		System.out.print("Digite o nome: ");
		p1.nome = sc.nextLine();
		
		int opcao = 0;
		do {
			System.out.println("=== Sistema RPG ===");
			System.out.println("");
			System.out.println("1 - Atacar");
			System.out.println("2 - Defender");
			System.out.println("3 - Descansar");
			System.out.println("4 - Mostrar Dados");
			System.out.println("0 - Sair");
			System.out.println("-------------------");
			System.out.print("Digite a opção: ");
			opcao = sc.nextInt();
			System.out.println("");
			
			switch (opcao) {
				case 1: {
					p1.atacar();
					
					break;
				}
				case 2: {
					System.out.print("Digite o dano recebido do inimigo: ");
					int dano = sc.nextInt();
					p1.defender(dano);
					
					break;
				}
				case 3: {
					p1.descansar();
					
					break;
				}
				case 4: {
					mostrarPersonagem(p1);
					
					break;
				}
				case 0: {
					System.out.println("Saindo do sistema");
					
					break;
				}
				default:
					System.out.println("Opção inválida");
					
					break;
			}
			
			if (opcao == 0) {
				break;
			}
			
		} while (true);
		
		sc.close();
	}
	
	static void mostrarPersonagem(Personagem personagem) {
		System.out.println("=============================");
		System.out.println("Nome: " + personagem.nome);
		System.out.println("Vida: " + personagem.vida);
		System.out.println("Energia: " + personagem.energia);
		System.out.println("Status: " + personagem.status);
		System.out.println("=============================");
	}
}
