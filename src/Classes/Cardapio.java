package Classes;

public class Cardapio extends Pedido {
	private int id_item;
	private String nome_item;
	private String descricao;
	private String tipo_item;
	private double valor;
	public int getId_item() {
		return id_item;
	}
	public String getNome_item() {
		return nome_item;
	}
	public String getDescricao() {
		return descricao;
	}
	public String getTipo_item() {
		return tipo_item;
	}
	public double getValor() {
		return valor;
	}
	public void setId_item(int id_item) {
		this.id_item = id_item;
	}
	public void setNome_item(String nome_item) {
		this.nome_item = nome_item;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setTipo_item(String tipo_item) {
		this.tipo_item = tipo_item;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
}
