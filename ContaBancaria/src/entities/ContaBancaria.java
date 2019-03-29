package entities;


public class ContaBancaria {

	protected int number;
	private String name;
	private double saldo;

	public ContaBancaria(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public ContaBancaria(int number, String name,double valor) {
		this.number = number;
		this.name = name;
		depositaConta(valor);
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void depositaConta(double valor) {
		saldo += valor;
	}
	
	public void saqueConta(double valor) {
		saldo -= valor + 5.00;
	}
	
	public String toString() {
		return "Conta : " 
					+ number 
					+ ",Titular: " 
					+ name
					+ ", "  
					+ " Saldo: $ "
					+ String.format("%.2f",saldo);
	}
	
}
