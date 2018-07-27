package application;

import java.util.Date;

import entities.Pedido;
import entities.enums.StatusDoPedido;

public class MainPedido {

	public static void main(String[] args) {

		Pedido pedido = new Pedido(1080, new Date(), StatusDoPedido.PAGAMENTO_PENDENTE);
		System.out.println(pedido);
		
		StatusDoPedido os1 = StatusDoPedido.ENTREGUE;
		StatusDoPedido os2 = StatusDoPedido.valueOf("ENTREGUE");
		
		System.out.println(os1);
		System.out.println(os2);
	}
}
