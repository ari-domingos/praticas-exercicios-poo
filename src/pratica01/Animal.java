package pratica01;

public class Animal {
	
	String nome;
	int energia = 50;
	String status = "Alimentado";
	
	int comer() {
		if (energia < 50) {
			energia += 10;		
			status = "Alimentado";			
		}
		else if (energia < 100) {
			energia += 10;		
			status = "Bem alimentado";
		}

		return energia;
	}
	
	int gastarEnergia () {
		if (energia > 0) {
			energia -= 10;
		}
		
		if (energia == 0) {
			status = "Com fome";
		}
		
		return energia;
	}
	
	void mostrarDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Energia: " + energia);
		System.out.println("Status: " + status);
		System.out.println("");
	}
}
