package Classes;

public class Funcionario extends Pessoa {
	private String cargo;
	private double salario;
	private int cod_func;
	public String getCargo() {
		return cargo;
	}
	public double getSalario() {
		return salario;
	}
	public int getCod_func() {
		return cod_func;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void setCod_func(int cod_func) {
		this.cod_func = cod_func;
	}
	
	public boolean pagar_salario() {
		
		return true;
	}
}
