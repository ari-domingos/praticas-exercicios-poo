package pratica04;

public class Personagem {

	String nome;
	int vida = 100;
	String status = "Vivo";
	
	int tomarDano(int dano) {
		this.vida -= dano;
		
		if (this.vida <= 0) {
		    this.vida = 0;
		    status = "Morto";		    	
		}
		else {
	        status = "Vivo";
		}
		
		return vida;
	}
	
	int curar(int cura) {
		if (this.vida < 100) {
			this.vida += cura;
			
			if (this.vida > 100) {
			    this.vida = 100;
			}
			
			status = "Vivo";		
		}
		
		return vida;
	}
}
