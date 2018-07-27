package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class MainRetangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner (System.in);
		
		Retangulo retangulo = new Retangulo();

		System.out.println("Informe a altura x largura do Retângulo: ");
		retangulo.altura = sc.nextDouble();
		retangulo.largura = sc.nextDouble();
		
		System.out.println("--------------------------------------");
		System.out.println(retangulo);
		
		sc.close();
	}

}
