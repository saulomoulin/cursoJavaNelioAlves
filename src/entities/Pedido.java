package entities;

import java.util.Date;
import entities.enums.StatusDoPedido;

public class Pedido {
	private int id;
	private Date momento;
	private StatusDoPedido status;

	public Pedido() {
	}

	public Pedido(int id, Date momento, StatusDoPedido status) {
		this.id = id;
		this.momento = momento;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusDoPedido getStatus() {
		return status;
	}

	public void setStatus(StatusDoPedido status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Pedido [ID=" + id + ", Momento=" + momento + ", Status=" + status + "]";
	}

}
