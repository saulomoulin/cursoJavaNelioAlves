package courses;

import java.util.Locale;
import java.util.Scanner;

public class Curso {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		// ------------------------------------------------------------------------
		/* Fun�ao Math (raiz quadrada)
		// ------------------------------------------------------------------------
		double x = 25;
		double y = Math.sqrt(x);
		System.out.println(y);
		*/
		
		// ------------------------------------------------------------------------
		/* Exemplo utilizado par demonstra��o do Debug
		 	* Teclas
			� CTRL+SHIFT+B - marcar/desmarcar breakpoint
			� - iniciar/continuar o debug
			� F6 - executar um passo (pula fun��o)
			� F5 - executar um passo (entra na fun��o)
			� F7 - sair do m�todo em execu��o
			� - parar debug
		// ------------------------------------------------------------------------
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int higher = max(a, b, c);
		ShowResult(higher);

		sc.close(); */
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero: ");
		double numero = sc.nextDouble();

		while (numero >= 0.0) {
			double raiz = Math.sqrt(numero);
			System.out.printf("Raiz quadrada de %.3f igual a %.3f%n", numero, raiz);
			System.out.println("Informe outro n�mero: ");
			numero = sc.nextDouble();
		}
		System.out.println("Peeeeerdeu - N�mero negativo!");
		sc.close();
	}
	/*
	// retornar o maior valor de 3 n�meros
	public static int max(int x, int y, int z) {
		int aux;

		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}

	// imprime o maior valor na tela
	public static void ShowResult(int maiorValor) {
		System.out.println("Maior valor = " + maiorValor);
	} */ 
}
