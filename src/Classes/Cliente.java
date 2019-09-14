package Classes;

public class Cliente extends Pessoa {
	private int fidelidade;
	private double total_gasto;
	static private int id_cliente;
	public int getFidelidade() {
		return fidelidade;
	}
	public double getTotal_gasto() {
		return total_gasto;
	}
	public static int getId_cliente() {
		return id_cliente;
	}
	public void setFidelidade(int fidelidade) {
		this.fidelidade = fidelidade;
	}
	public void setTotal_gasto(double total_gasto) {
		this.total_gasto = total_gasto;
	}
	public static void setId_cliente(int id_cliente) {
		Cliente.id_cliente = id_cliente;
	}
	
}
