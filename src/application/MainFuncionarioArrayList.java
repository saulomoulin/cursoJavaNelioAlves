package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.FuncionarioArrayList;

public class MainFuncionarioArrayList {

	public static void main(String[] args) {
		// FuncionarioArrayList
		Locale.setDefault(Locale.US); // setando para padr�o americano de n�mero

		List<FuncionarioArrayList> list = new ArrayList<>();
		FuncionarioArrayList funcionario;

		Scanner sc = new Scanner(System.in);

		System.out.print("Deseja registrar quantos funcion�rios? ");
		int quantidade = sc.nextInt();

		for (int i = 1; i <= quantidade; i++) {
			System.out.println();
			System.out.print("Funcionario #" + i);
			System.out.print("ID: ");
			int id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Sal�rio: ");
			double salario = sc.nextDouble();

			funcionario = new FuncionarioArrayList(id, nome, salario);
			list.add(funcionario);

		}

		System.out.print("Informe o ID do funcion�rio que deseja incrementar o sal�rio: ");
		int id = sc.nextInt();
		FuncionarioArrayList func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (func == null) {
			System.out.println("Este ID n�o existe");
		} else {
			System.out.print("Informe a porcentagem: ");
			double porcentagem = sc.nextDouble();
			func.incrementaSalario(porcentagem);
		}

		System.out.println();
		System.out.println("Lista de funcion�rios:");
		for (FuncionarioArrayList obj : list) {
			System.out.println(obj);
		}
		sc.close();
	}
}
