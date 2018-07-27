package application;

import java.util.Locale;
import java.util.Scanner;

import utilitie.ConversaoRealDolar;

public class MainCotacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual a cotação do Dólar ? ");
		double dolar = sc.nextDouble();
		System.out.println("Quantos Dólares vai comprar ? ");
		double qtdeDolar = sc.nextDouble();
		System.out.printf("Valor a ser pago em R$ = %.2f ", ConversaoRealDolar.conversao(dolar, qtdeDolar));
		sc.close();

	}

}
