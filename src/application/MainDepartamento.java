package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.ContratoPorHora;
import entities.Departamento;
import entities.Trabalhador;
import entities.enums.NivelTrabalhador;

public class MainDepartamento {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");
		
		System.out.print("Entre com o nome do Departamento: ");
		String nomeDepartamento = sc.nextLine();

		System.out.println("Entre com os dados do Trabalhador: ");
		System.out.print("Nome: ");
		String nomeTrabalhador = sc.nextLine();
		System.out.print("Nível: ");
		String nivelTrabalhador = sc.nextLine();
		System.out.print("Base Salarial: ");
		double salarioBase = sc.nextDouble();

//		o nome está na classe trabalhador, 
//		o NivelTrabalhador é uma instancia por isto está desse jeito
//		salarioBase também é da classe Trabalhador
//		a classe Trabalhador possui a classe Departamento
		Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelTrabalhador.valueOf(nivelTrabalhador),
				salarioBase, new Departamento(nomeDepartamento));
		
		System.out.print("Quantos contratos esse trabalhador vai possuir? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Entre com o Contrato #" + i + "data:");
			System.out.print("Entre com a data (DD/MM/AAAA): ");
			Date data = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valorHora = sc.nextDouble();
			System.out.print("Duração em horas: ");
			int hora = sc.nextInt();
			
			ContratoPorHora contratoHora = new ContratoPorHora(data, valorHora, hora);
			trabalhador.adicionarContrato(contratoHora);
		}
		
		System.out.println();
		System.out.print("Entre com o mês e o ano para calcular o salário (MM/AAAA): ");
		String mesAndAno = sc.next();
		int mes = Integer.parseInt(mesAndAno.substring(0,2)); // pegando o mes
		int ano = Integer.parseInt(mesAndAno.substring(3)); // pega da posição 3 em diante
		System.out.print("Nome: " + trabalhador.getNome());
		System.out.print("Departamento: " + trabalhador.getDepartamento().getName());
		//System.out.print("Valor ganho em " +mesAndAno + ": " + trabalhador.renda(ano, mes));
		System.out.print("Valor ganho em " +mesAndAno + ": " + String.format(".2f", trabalhador.renda(ano, mes))	);
		
		sc.close();
	}

}
