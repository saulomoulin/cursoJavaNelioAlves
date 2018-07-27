package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class MainFuncionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Funcionario funcionario = new Funcionario();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o nome, salario e imposto: ");
		funcionario.nome = sc.nextLine();
		funcionario.salarioBruto = sc.nextDouble();
		funcionario.imposto = sc.nextDouble();
		
		System.out.println(funcionario);
		
		System.out.println("Qual a porcentagem a ser incrementada no salário?");
		double porcentagem = sc.nextDouble();
		funcionario.incrementaSalario(porcentagem);
		
		sc.close();
	}

}
