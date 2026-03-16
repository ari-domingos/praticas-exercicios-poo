package pratica02;

public class Lampada {
	
	boolean	ligada;
	int brilho;
	
	void ligar() {
		ligada = true;
		brilho = 1;
	}
	
	void desligar() {
		ligada = false;
		brilho = 0;
	}
	
	int aumentarBrilho() {
	    if (ligada) {
	        if (brilho < 5) {  
	            brilho++;
	        }
	    }
	    return brilho;
	}
	int diminiurBrilho() {
	    if (ligada) {
	        if (brilho > 1) {  
	            brilho--;      
	        }
	    }
	    return brilho;
	}
}
