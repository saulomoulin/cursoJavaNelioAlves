package entities;

public class Produto {
	
	private String name;
	private double price;
	private int quantidade;
	
	public Produto() {
		
	}
	
	public Produto(String name, double price, int quantidade) {
		this.name = name;
		this.price = price;
		this.quantidade = quantidade;
	}
	
	public Produto(String name, double price) {
		this.name = name;
		this.price = price;
		// this.quantidade = 0; - se torna opcional, pois por default já recebe 0
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	/* Não foi declarado, pois trata-se de uma forma de proteção, pois a quantidade não pode ser modificada diretamente, apenas visualizada
	 * public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}*/
	
	public double totalValueInStock() {
		return price * quantidade;
	}
	
	public void addProducts (int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removeProducts (int quantidade) {
		if (quantidade > this.quantidade) {
			System.out.printf("Quantidade '%i' maior do que a presente em estoque %i ", quantidade, this.quantidade);
		}
		else {
			this.quantidade -= quantidade;
		}
	}
	
	public String toString() {
		 return name 
				 + ", $ " + String.format("%.2f", price) 
				 + ", " + quantidade 
				 + " unidades, Total: $" 
				 + String.format("%.2f", totalValueInStock());
	}
	
}
