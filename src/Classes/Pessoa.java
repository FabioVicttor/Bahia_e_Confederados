package Classes;

import java.util.Date;

public class Pessoa {
	private String nome;
	private String sexo;
	private String cpf;
	private int idade;
	private Date data_cadastro;
	private Date data_desligado = null;
	
	public String getNome() {
		return nome;
	}
	public String getSexo() {
		return sexo;
	}
	public String getCpf() {
		return cpf;
	}
	public int getIdade() {
		return idade;
	}
	public Date getData_cadastro() {
		return data_cadastro;
	}
	public Date getData_desligado() {
		return data_desligado;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setData_cadastro(Date data_cadastro) {
		this.data_cadastro = data_cadastro;
	}
	public void setData_desligado(Date data_desligado) {
		this.data_desligado = data_desligado;
	}
	
	public void add() {
		
	}
	 public void remover() {
		 
	 }
	 
	 public void att() {
		 
	 }
}
