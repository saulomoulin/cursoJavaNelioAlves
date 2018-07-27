package courses;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados2_23 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
	/*	Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt(); // 35
		sc.nextLine(); // utilizado somente para consumir a quebra de linha
		               // conhecido como Limpeza de stream de entrada (flush)
		String name = sc.nextLine();
		char gender = sc.next().charAt(0); // Pra pegar o primeiro caracter
		
		//b5 - pegando o "b" como char e o "5" como int
		String s = sc.next();
		char letra = s.charAt(0);
		int digito = Integer.parseInt(s.substring(1));
		
		System.out.println(n1);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(letra);
		System.out.println(digito);
		
		sc.close(); */
	
		// Exercício de fixação
		Scanner sc  = new Scanner(System.in);
		
		// nome
		System.out.println("Informe seu nome completo:");
		String nome = sc.nextLine();	
		
		// quebra
		// sc.nextLine();
		
		// comodos
		System.out.println("How many bedrooms are there in your house?");
		int comodos = sc.nextInt();
		
		// preco
		System.out.println("Qual o preço do produto?");
		double preco = sc.nextDouble();
		
		// ultimo nome, idade, altura
		System.out.println("Qual seu último nome, idade e altura (informar na mesma linha)?");
		sc.nextLine();
		String vect [] = sc.nextLine().split(" ");
		String lastname = vect[0];	
		int idade = Integer.parseInt(vect[1]);
		double altura = Double.parseDouble(vect[2]);
		
		// Saídas
		System.out.println("Nome completo: "+ nome);
		System.out.println("Quantidade de comodos: "+ comodos);
		System.out.printf("Preço do produto: %.2f",preco);
		System.out.println();
		System.out.println("Último nome: " + lastname);
		System.out.println("Último idade: " + idade);
		System.out.printf("Último altura: %.2f", altura);
		sc.close();
	}
}
