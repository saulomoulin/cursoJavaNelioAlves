package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.sun.net.httpserver.Filter;

public class MainAprendendoList {

	public static void main(String[] args) {

		// criação de lista
		List<String> list = new ArrayList<>();

		list.add("Jack Bauer");
		list.add("Jack Chan");
		list.add("Jack Tequila");
		list.add("Jack Ass");
		list.add("Jack Jaca");
		list.add("Jack Jhonson");
		list.add(2, "Intruso posição 2");
		list.add("Tiranossauro Rex");
		list.add("Marcolino");

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println();
		System.out.println("Tamanho da lista = " + list.size());

		list.remove("Intruso posição 2"); // removendo por nome
		list.removeIf(x -> x.charAt(5) == 'C'); // removendo o "Jack" que possui C na segunda parte do nome

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println();
		System.out.println("Tamanho da lista = " + list.size());
		System.out.println("Index of Jack Jhonson: " + list.indexOf("Jack Jhonson"));

		// retornando apenas quem começa com "J"
		System.out.println();
		System.out.println("Lista retornando apenas quem começa com J");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}

		// retornando o primeiro elememto que começa com "J"
		System.out.println();
		System.out.println("Primeiro nome que começa com J");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
	}

}
