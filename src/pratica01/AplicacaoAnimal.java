package pratica01;

import java.util.Scanner;

public class AplicacaoAnimal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Animal a1 = new Animal();
		
		System.out.println("Digite o nome do Animal: ");
		a1.nome = sc.nextLine();
		
		a1.mostrarDados();
		
		int energiaGasta;
		System.out.println("Digite o total de energia gasta por: ");
		energiaGasta = sc.nextInt();
		
		if (energiaGasta <= 0) {
			System.out.println("Mínimo de energia gasta é 1.");
			System.out.println("");
		} 
		else {
			for (int i = 1 ; i < energiaGasta + 1 ; i++) {
				a1.gastarEnergia();				
			}
		}
		
		
		a1.mostrarDados();

		int vezesAlimentado;
		System.out.println("Digite o total de vezes alimentado: ");
		vezesAlimentado = sc.nextInt();
		
		if (vezesAlimentado <= 0) {
			System.out.println("Mínimo de energia gasta é 1.");
			System.out.println("");
		} 
		else {
			for (int i = 1 ; i < vezesAlimentado + 1 ; i++) {
				a1.comer();				
			}			
		}
		
		a1.mostrarDados();
		
		sc.close();
	}
}
