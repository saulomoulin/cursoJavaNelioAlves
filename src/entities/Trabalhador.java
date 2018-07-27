package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.NivelTrabalhador;

public class Trabalhador {
	private String nome;
	private NivelTrabalhador nivel;
	private Double salarioBase;

	private Departamento departamento; // cada trabalhador está alocada em um departamento
	private List<ContratoPorHora> contratos = new ArrayList<>(); // cada trabalhador pode possuir mais de um contrato
																	// por hora

	public Trabalhador() {

	}

	public Trabalhador(String nome, NivelTrabalhador nivel, Double baseSalarial, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = baseSalarial;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelTrabalhador getNivel() {
		return nivel;
	}

	public void setNivel(NivelTrabalhador nivel) {
		this.nivel = nivel;
	}

	public Double getBaseSalarial() {
		return salarioBase;
	}

	public void setBaseSalarial(Double baseSalarial) {
		this.salarioBase = baseSalarial;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratoPorHora> getContrato() {
		return contratos;
	}

	public void adicionarContrato(ContratoPorHora contrato) {
		contratos.add(contrato);
	}

	public void removerContrato(ContratoPorHora contrato) {
		contratos.remove(contrato);
	}

	public double renda(int ano, int mes) {
		double sum = salarioBase;
		Calendar cal = Calendar.getInstance();

		for (ContratoPorHora c : contratos) {
			cal.setTime(c.getData());

			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);

			if (ano == c_ano && mes == c_mes) {
				sum += c.valorTotal();
			}
		}
		return sum;
	}

}
