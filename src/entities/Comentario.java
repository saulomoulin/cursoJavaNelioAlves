package entities;

public class Comentario {
	private String texto;
	
	public Comentario() {
		
	}
	
	public Comentario(String texto) {
		this.texto = texto;
	}
	
	public String getText() {
		return texto;
	}
	
	public void setText(String texto) {
		this.texto = texto;
	}
}
