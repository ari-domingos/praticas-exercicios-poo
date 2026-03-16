package pratica02;

import java.util.Scanner;

public class AplicacaoLampada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Lampada l1 = new Lampada();
		
		System.out.println("Lâmpada ligada: " + l1.ligada);
		System.out.println("Brilho: " + l1.brilho);
		System.out.println("");

		System.out.print("Deseja ligar a lâmpada (true/false): ");
		l1.ligada = sc.nextBoolean();
		System.out.println("");
	
		if (l1.ligada) {
		    l1.ligar();
		}
		
		while (l1.ligada == true) {
			
			System.out.println("Lâmpada ligada: " + l1.ligada);
			System.out.println("Brilho: " + l1.brilho);
			System.out.println("");
			
			System.out.print("Aumentar brilho (1-5) : ");
			int aumentarBrilho = sc.nextInt();
			System.out.println("");
			
			for (int i = 1; i <= aumentarBrilho; i++) {
				l1.aumentarBrilho();
			}
			
			System.out.println("Lâmpada ligada: " + l1.ligada);
			System.out.println("Brilho: " + l1.brilho);
			System.out.println("");
			
			System.out.print("Diminuir brilho (1-5) : ");
			int diminuirBrilho = sc.nextInt();
			System.out.println("");
			
			for (int i = 1; i <= diminuirBrilho; i++) {
				l1.diminiurBrilho();
			}
			
			System.out.println("Lâmpada ligada: " + l1.ligada);
			System.out.println("Brilho: " + l1.brilho);
			System.out.println("");
			
			System.out.print("Deseja desligar a lâmpada (true/false): ");
			boolean escolhaFinal = sc.nextBoolean();
			System.out.println("");
			
			if (escolhaFinal == true) {
				l1.desligar();
			}
		}
			
		System.out.println("Lâmpada ligada: " + l1.ligada);
		System.out.println("Brilho: " + l1.brilho);
		System.out.println("");
		
		sc.close();
	}
}
