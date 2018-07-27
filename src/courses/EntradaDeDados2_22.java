package courses;

import java.util.Scanner;

public class EntradaDeDados2_22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine(); // desta forma é realizada a leitura da linha como um todo, ou seja, entrada
										 // "Red Blue Yellow" = saida --> sentence = Red Blue Yellow
		String x, y, z;
		x = sc.next(); // desta forma é realizada a leitura até o espaço
		y = sc.next(); // caso eu digite a entrada "Red Blue Yellow", significariam 3 entradas 
		z = sc.next(); // x=Red / y=Blue / z=Yellow

		System.out.println(sentence);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		sc.close();
	}
}
