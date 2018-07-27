package entities;

public class Retangulo {

	public double altura;
	public double largura;
	
	public double areaRetangulo() {
		return altura * largura;
	}
	
	public double perimetroRetangulo() {
		return altura *2 + largura *2;
	}
	
	public String toString() {
		return 
		String.format("Area: %.2f%n", areaRetangulo())	
		+ String.format("Perímetro: %.2f", perimetroRetangulo());
	}
}
