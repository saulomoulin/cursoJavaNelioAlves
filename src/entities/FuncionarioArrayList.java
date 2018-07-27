package entities;

public class FuncionarioArrayList {
	private int id;
	private String nome;
	private double salario;

	public FuncionarioArrayList(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void incrementaSalario(double porcentagem) {
		salario += salario * (porcentagem / 100);
	}
	
	public String toString() {
		return "ID: " + id + ", Nome: " + nome + ", Salario: " + salario;
	}
}
