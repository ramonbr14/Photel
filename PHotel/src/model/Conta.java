package model;

public class Conta {
	private int codigo;
	private double valorTotal;
	private boolean pago;
	private Consumo[] consumo;
	
	//Construtores
	public Conta() {
		super();
	}
	public Conta(int codigo, double valorTotal, boolean pago, Consumo[] consumo) {
		super();
		this.codigo = codigo;
		this.valorTotal = valorTotal;
		this.pago = pago;
		this.consumo = consumo;
	}
	
	//Getter e Setter
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public boolean isPago() {
		return pago;
	}
	public void setPago(boolean pago) {
		this.pago = pago;
	}
	public Consumo[] getConsumo() {
		return consumo;
	}
	public void setConsumo(Consumo[] consumo) {
		this.consumo = consumo;
	}
	
	
	
}
