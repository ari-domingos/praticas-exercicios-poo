package pratica06;

public class Personagem {

	String nome;
	int vida = 100;
	int energia = 100;
	String status = "Em aguardo";
	
	int atacar() {
		if (this.energia > 0) {
			this.energia -= 10;
			this.status = "Atacando";
			System.out.println("Atacando o inimigo. (-10 de energia)");
		}
		else {
			System.out.println("Sem energia! Descanse antes.");
			this.energia = 0;
		}
		
		return this.energia;
	}
	
	int defender (int dano) {		
		this.vida -= dano;
		System.out.println("Defendeu o ataque do inimigo.");
		
		if (this.vida <= 0) {
			this.vida = 0;
			this.status = "Morto";
		}
		
		return this.vida;		
	}
	
	void descansar () {
	    if (this.status.equals("Morto")) { 
	        System.out.println("Personagem morto, não pode descansar.");
	        return; 
	    }

	    this.energia += 20;

	    if (this.energia > 100) {
	        this.energia = 100;
	    }

	    this.status = "Descansando";
	}
}
