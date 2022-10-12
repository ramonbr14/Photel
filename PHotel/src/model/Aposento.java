package model;

public class Aposento {
	private int codigo;
	private double valor;
	private String descricao;
	private int numero;
	
	//Contrutores
	public Aposento() {
		super();
	}

	public Aposento(int codigo, double valor, String descricao, int numero) {
		super();
		this.codigo = codigo;
		this.valor = valor;
		this.descricao = descricao;
		this.numero = numero;
	}

	//getter e setter
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
