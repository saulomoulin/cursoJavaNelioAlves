package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class MainProduto {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----------------------------");
		System.out.println("Entrada de dados do Produto: ");
		
		//nome do produto
		System.out.println("Nome: ");
		String name = sc.nextLine();
		
		// preco do produto
		System.out.println("Preco: ");
		double price = sc.nextDouble();
		
		// quantidade do produto
		System.out.println("Quantidade em estoque: ");
		int quantidade = sc.nextInt();
		
		Produto produto = new Produto(name, price, quantidade);
		
		System.out.println("-----------------------------");
		System.out.println(produto);
		System.out.println("-----------------------------");
		
		System.out.println("Entre com o número de produtos a serem adicionados no estoque");
		int quantidadeAdd = sc.nextInt();
		produto.addProducts(quantidadeAdd);
		System.out.println("Quantidade atualizada em estoque" + produto);

		System.out.println("-----------------------------");
		System.out.println("Entre com o número de produtos a serem removidos no estoque");
		int quantidadeRet = sc.nextInt();
		produto.removeProducts(quantidadeRet);
		System.out.println("Quantidade atualizada em estoque" + produto);

		sc.close();
	}

}
