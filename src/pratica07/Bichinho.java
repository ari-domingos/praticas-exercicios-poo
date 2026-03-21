package pratica07;

public class Bichinho {

	String nome;
	int fome = 50;
	int energia = 100;
	String humor = "Neutro";
	
	void alimentar(int porcao) {
		if (this.humor.equals("Desmaiado")) {
			System.out.println("Bichinho desmaiado, acorde-o primeiro!");
			return;
		}
		
		this.fome -= porcao;
		
		if (this.fome < 0) {
			this.fome = 0;
		}
		
		if (this.fome == 0) {
			this.humor = "Satisfeito";				
		}
		
		if (this.fome == 100) {
			this.humor = "Desmaiado";
		}
	}
	
	void brincar() {
		if (this.energia > 20) {
			this.fome += 15;
			
			if (this.fome > 100) {
				this.fome = 100;
			}
			
	        if (this.fome == 100) {
	            this.humor = "Desmaiado";
	            System.out.println("Bichinho desmaiou de fome!");
	            return;
	        }
			
			this.energia -= 20;
			this.humor = "Feliz";
		}
		else {
			System.out.println("Bichinho cansado demais para brincar!");
		}
	}
	
	void dormir() {
		this.energia += 40;
		
		if (this.energia > 100) {
			this.energia = 100;
		}
		
		this.fome += 10;
		
		if (this.fome > 100) {
			this.fome = 100;
		}
		
	    if (this.fome == 100) {
	        this.humor = "Desmaiado";
	        
			if (this.humor.equals("Desmaiado")) {
				this.humor = "Acordado";
			}
			else {
		        this.humor = "Descansado"; 
		    }
	    }
	}
}
