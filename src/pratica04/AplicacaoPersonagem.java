package pratica04;

import java.util.Scanner;

public class AplicacaoPersonagem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Personagem p1 = new Personagem();
	
		System.out.print("Nome do personagem: ");
		p1.nome = sc.nextLine();
		p1.vida = 100;
		mostrarInfo(p1);
		
		System.out.print("Dano tomado: ");
		int dano = sc.nextInt();		
		p1.tomarDano(dano);
		mostrarInfo(p1);
		
		System.out.print("Cura realizada: ");
		int cura = sc.nextInt();		
		p1.curar(cura);
		mostrarInfo(p1);
		
		System.out.print("Dano final: ");
		dano = sc.nextInt();		
		p1.tomarDano(dano);
		mostrarInfo(p1);
		
		sc.close();
	}
	
	static void mostrarInfo(Personagem personagem) {
		System.out.println("");
		System.out.println(personagem.nome);
		System.out.println(personagem.vida);
		System.out.println(personagem.status);
		System.out.println("");
	}
}
