package utilitie;

public class ConversaoRealDolar {

	public static final double IOF = 0.06;
	
	public static double conversao (double cotacao, double qtdeDolar) {
		return ((cotacao * qtdeDolar) + (cotacao * qtdeDolar * IOF));
	}
}
