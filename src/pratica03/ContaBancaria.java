package pratica03;

public class ContaBancaria {
	
	String titular;
	double saldo;
	String status;
	
	double depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			
			if (this.saldo == 0) {
				status = "Saldo zerado";					
			}
			else if (this.saldo > 0) {
				status = "Saldo positivo";									
			}
		}
		
		return saldo;
	}
	
	double sacar(double valor) {
	    if (valor > this.saldo) {
	        status = "Saldo insuficiente";
	    } 
	    else {
	        this.saldo -= valor;

	        if (this.saldo == 0) {
	            status = "Saldo zerado";
	        } 
	        else {
	            status = "Saldo positivo";
	        }
	    }
	    return saldo;
	}
}
