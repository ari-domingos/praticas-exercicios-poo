package pratica05;

public class Moto {

    String modelo;
    int velocidade;
    int combustivel = 0;
    String status = "Parada";

    int acelerar(int velocidade) {
        if (this.combustivel > 0) {
            this.velocidade += velocidade;

            if (this.velocidade > 180) {
                this.velocidade = 180;
                System.out.println("Limite de velocidade (180).");
            }

            this.status = "Em movimento";
        }
        else {
			System.out.println("Sem combustível! Abasteça antes.");
			System.out.println("");
		}

        return this.velocidade; 
    }

    int desacelerar(int velocidade) {
        this.velocidade -= velocidade; 

        if (this.velocidade < 0) {    
            this.velocidade = 0;
        }

        if (this.velocidade == 0) {
            this.status = "Parada";   
        }

        return this.velocidade; 
    }

    void abastecer(int litro) {
        this.combustivel += litro;

        if (this.combustivel > 50) {
        	this.combustivel = 50;    
        	System.out.println("Limite de combustível (50).");
        }
    }
}