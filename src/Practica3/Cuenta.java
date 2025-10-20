package Practica3;

public class Cuenta {
	
	public String numero;
	public String titular;
	public Double saldo;

	public Cuenta(double i) {
		
		this.saldo = i;
		
	}

	public void Ingresa(double i) {
		// TODO Auto-generated method stub
		
		this.saldo += i;
		
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
		
		double res = saldo - i;
		
		if(res>=-500)
		this.saldo -= i;
		else {
			
			System.out.println("Fondos insuficientes en la cuenta "+this.titular+"!!\n");
		}
		
	}

}
