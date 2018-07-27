package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class MainContaBancaria {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		ContaBancaria contaBancaria;

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o N�mero da conta : ");
		int conta = sc.nextInt();
		System.out.println("Informe o Titular da conta: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.println("Deseja inserir um dep�sito inicial (Y/N) ?: ");
		char depositoYN = sc.next().charAt(0);

		if (depositoYN == 'Y' || depositoYN == 'y') {
			System.out.println("Informe o Valor do dep�sito (R$) : ");
			double deposito = sc.nextDouble();
			contaBancaria = new ContaBancaria(conta, titular, deposito);
		} else {
			contaBancaria = new ContaBancaria(conta, titular);
		}

		System.out.println("Dados Atualizados da Conta:" + contaBancaria);

		char resposta = 'n';
		char respostaSaqueDeposito;
		
		System.out.println("Deseja realizar saque ou dep�sito (Y/N) ?: ");
		resposta = sc.next().charAt(0);
		
		while (resposta == 'y') {
			System.out.println(" Para Dep�sito (D) / Para Saque (S): ");
			respostaSaqueDeposito = sc.next().charAt(0);

			if (respostaSaqueDeposito == 'D' || respostaSaqueDeposito == 'd') {
				System.out.println("Informe o Valor do dep�sito (R$) : ");
				double deposito = sc.nextDouble();
				contaBancaria.depositoConta(deposito);
			} else {
				System.out.println("Informe o Valor do Saque (R$) : ");
				double saque = sc.nextDouble();
				contaBancaria.saqueConta(saque);
			}
			System.out.println("Dados Atualizados da Conta:" + contaBancaria);
			
			System.out.println("Deseja realizar saque ou dep�sito (Y/N) ?: ");
			resposta = sc.next().charAt(0);
		}

		sc.close();
	}

}
