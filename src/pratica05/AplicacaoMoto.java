package pratica05;

import java.util.Scanner;

public class AplicacaoMoto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Moto m1 = new Moto();
		
		System.out.print("Digite o modelo da moto: ");
		m1.modelo = sc.nextLine();
		System.out.println("");
		
		int opcao = 0;
		do {
			
			System.out.println("=== Sistema de Moto ===");
			System.out.println("");
			System.out.println("1 - Acelerar");
			System.out.println("2 - Desacelerar");
			System.out.println("3 - Abastecer");
			System.out.println("4 - Mostrar Dados");
			System.out.println("0 - Sair");
			System.out.println("");
			System.out.print("Digite a opção: ");
			opcao = sc.nextInt();
			System.out.println("");
			
			switch (opcao) {
				case 1: {
					System.out.print("Digite quantos km/h deseja acelerar: ");
					int acelerar = sc.nextInt();
					System.out.println("");

					m1.acelerar(acelerar);						
					
					break;
				}
				case 2: {
					System.out.print("Digite quantos km/h deseja desacelerar: ");
					int desacelerar = sc.nextInt();
					m1.desacelerar(desacelerar);
					System.out.println("");
					
					break;
				}
				case 3: {
					System.out.print("Digite quantos litros deseja colocar: ");
					int litros = sc.nextInt();
					m1.abastecer(litros);
					System.out.println("");
					
					break;
				}
				case 4: {
					mostrarStatus(m1);
					
					break;
				}
				case 0: {
					System.out.println("Saindo do sistema!");
					
					break;
				}
				default:
					System.out.println("Opção inválida!");
					System.out.println("");
			}
			
			if (opcao == 0) {
				break;
			}
			
		} while (true);
		
		sc.close();
	}
	
	static public void mostrarStatus(Moto moto) {
		System.out.println("Modelo: " + moto.modelo);
		System.out.println("Velocidade: " + moto.velocidade);
		System.out.println("Combustível: " + moto.combustivel);
		System.out.println("Status: " + moto.status);
		System.out.println("");
	}

}
