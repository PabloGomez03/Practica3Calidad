package Practica3;

public class Cuenta {
	
	public String numero;
	public String titular;
	public Double saldo;

	public Cuenta(int i) {
		
	}

	public void Ingresa(double i) {
		// TODO Auto-generated method stub
		
		saldo = 100.0;
		
	}

	public Double getSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		
		this.saldo = saldo;
		
	}

	public void Retira(double i) {
		// TODO Auto-generated method stub
		
		saldo = -100.0;
		
	}

}
