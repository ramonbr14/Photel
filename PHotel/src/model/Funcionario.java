package model;

public class Funcionario {
	private int Codigo;
	private String nome;
	private String cargo;
	private String salario;
	private String cpf;
	private String telefone;
	
	//Construtores
	public Funcionario() {
		super();
	}
	
	public Funcionario(int codigo, String nome, String cargo, String salario, String cpf, String telefone) {
		super();
		Codigo = codigo;
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	
	//G e S
	public int getCodigo() {
		return Codigo;
	}
	public void setCodigo(int codigo) {
		Codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
}
