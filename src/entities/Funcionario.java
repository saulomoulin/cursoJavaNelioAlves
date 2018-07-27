package entities;

public class Funcionario {
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido () {
		return salarioBruto - imposto;
	}
	
	public void incrementaSalario (double porcentagem) {
		double salarioIncremento;
		porcentagem = (porcentagem/100);
		salarioIncremento = (salarioLiquido())+ (salarioBruto * porcentagem);
		System.out.println("Salario Update: "+ salarioIncremento);
	}
	
	public String toString() {
		return	"Funcionario: " + nome +
				String.format("%nSalário Líquido R$%.2f", salarioLiquido());
	}
}
