package pratica03;

import java.util.Scanner;

public class AplicacaoContaBancaria {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ContaBancaria cb1 = new ContaBancaria();
		
		System.out.print("Nome do titular: ");
		cb1.titular = sc.nextLine();
		mostrarStatus(cb1);
		
		System.out.print("Valor para depositar: ");
		double valor = sc.nextDouble();
		cb1.depositar(valor);
		mostrarStatus(cb1);
		
		System.out.print("Valor para sacar: ");
		valor = sc.nextDouble();
		cb1.sacar(valor);
		mostrarStatus(cb1);
		
		System.out.print("Valor para sacar: ");
		valor = sc.nextDouble();
		cb1.sacar(valor);
		mostrarStatus(cb1);
		
		sc.close();
	}
	
	static void mostrarStatus(ContaBancaria conta) {
		System.out.println("");
		System.out.println(conta.titular);
		System.out.println(conta.saldo);
		System.out.println(conta.status);
		System.out.println("");
	}
}
