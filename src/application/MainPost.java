package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comentario;
import entities.Post;

public class MainPost {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentario c1 = new Comentario("Hava a nice trip!");
		Comentario c2 = new Comentario("Wow that's awesome!");
		Post       p1 = new Post(
							sdf.parse("21/06/2018 13:05:44"),
							"Traveling to New Zealand",
							"I'm going to visit this wonderful country!",
							12);
		p1.addComentario(c1);
		p1.addComentario(c2);
		
		System.out.println(p1);
	}

}
