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
		+ String.format("Per�metro: %.2f", perimetroRetangulo());
	}
}
