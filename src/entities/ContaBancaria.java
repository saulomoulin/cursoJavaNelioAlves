package entities;

public class ContaBancaria {
	private int numeroDaConta;
	private String nomeTitular;
	private double saldo;
	
	public ContaBancaria() {
		
	}
	
	public ContaBancaria(int numeroDaConta, String nomeTitular, double saldo) {
		super();
		this.numeroDaConta = numeroDaConta;
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
	}
	
	public ContaBancaria(int numeroDaConta, String nomeTitular) {
		super();
		this.numeroDaConta = numeroDaConta;
		this.nomeTitular = nomeTitular;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	// Saque e Depósito
	public void saqueConta (double saque) {
		saldo -= saque + 5;
	}
	
	public void depositoConta (double deposito) {
		saldo += deposito;
	}
	
	public String toString() {
		return "Conta: "+ numeroDaConta + ", " 
				+ "Nome: " + nomeTitular + ", "
				+ "Saldo: " + saldo;
	}
}
