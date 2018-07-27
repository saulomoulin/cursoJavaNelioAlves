package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.FuncionarioArrayList;

public class MainFuncionarioArrayList {

	public static void main(String[] args) {
		// FuncionarioArrayList
		Locale.setDefault(Locale.US); // setando para padrão americano de número

		List<FuncionarioArrayList> list = new ArrayList<>();
		FuncionarioArrayList funcionario;

		Scanner sc = new Scanner(System.in);

		System.out.print("Deseja registrar quantos funcionários? ");
		int quantidade = sc.nextInt();

		for (int i = 1; i <= quantidade; i++) {
			System.out.println();
			System.out.print("Funcionario #" + i);
			System.out.print("ID: ");
			int id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salário: ");
			double salario = sc.nextDouble();

			funcionario = new FuncionarioArrayList(id, nome, salario);
			list.add(funcionario);

		}

		System.out.print("Informe o ID do funcionário que deseja incrementar o salário: ");
		int id = sc.nextInt();
		FuncionarioArrayList func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (func == null) {
			System.out.println("Este ID não existe");
		} else {
			System.out.print("Informe a porcentagem: ");
			double porcentagem = sc.nextDouble();
			func.incrementaSalario(porcentagem);
		}

		System.out.println();
		System.out.println("Lista de funcionários:");
		for (FuncionarioArrayList obj : list) {
			System.out.println(obj);
		}
		sc.close();
	}
}
