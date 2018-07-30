package entities;

public class OrderItem {
	private Integer quantidade;
	private Double price;
	private ProdutoProduct produto;

	public OrderItem() {
	}

	public OrderItem(Integer quantidade, Double price, ProdutoProduct produto) {
		this.quantidade = quantidade;
		this.price = price;
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public ProdutoProduct getProduto() {
		return produto;
	}

	public void setProduto(ProdutoProduct produto) {
		this.produto = produto;
	}
	
	public double subTotal() {
		return price * quantidade;
	}

	public String toString() {
		return produto.getName() 
				+ ", $" 
				+ String.format("%.2f", price) 
				+ ", Quantity: " 
				+ quantidade + 
				", Subtotal: $" 
				+ String.format("%.2f", subTotal());
	}
}
