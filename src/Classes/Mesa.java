package Classes;

public class Mesa extends Pedido{
	private int id_mesa;
	private int id_pedido;
	public int getId_mesa() {
		return id_mesa;
	}
	public int getId_pedido() {
		return id_pedido;
	}
	public void setId_mesa(int id_mesa) {
		this.id_mesa = id_mesa;
	}
	public void setId_pedido(int id_pedido) {
		this.id_pedido = id_pedido;
	}
}
