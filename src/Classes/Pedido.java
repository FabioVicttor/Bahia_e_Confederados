package Classes;

import java.util.Date;

public class Pedido {
	private int id_pedido;
	private double valor_total;
	private int id_mesa;
	private Date data;
	public int getId_pedido() {
		return id_pedido;
	}
	public double getValor_total() {
		return valor_total;
	}
	public int getId_mesa() {
		return id_mesa;
	}
	public Date getData() {
		return data;
	}
	public void setId_pedido(int id_pedido) {
		this.id_pedido = id_pedido;
	}
	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}
	public void setId_mesa(int id_mesa) {
		this.id_mesa = id_mesa;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
}
