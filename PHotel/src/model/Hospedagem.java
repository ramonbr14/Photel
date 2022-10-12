package model;
import java.time.*;

public class Hospedagem {
	private int codigo;
	private LocalDate dataEntrada; //LEmbrar de usar o formato aaaa-mm-dd;
	private LocalDate dataSaida;
	private Hospede hospede;
	private Aposento aposento;
	private Conta conta;
	public Hospedagem() {
		super();
	}
	public Hospedagem(int codigo, LocalDate dataEntrada, LocalDate dataSaida, Hospede hospede, Aposento aposento,
			Conta conta) {
		super();
		this.codigo = codigo;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.hospede = hospede;
		this.aposento = aposento;
		this.conta = conta;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public LocalDate getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public LocalDate getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(LocalDate dataSaida) {
		this.dataSaida = dataSaida;
	}
	public Hospede getHospede() {
		return hospede;
	}
	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}
	public Aposento getAposento() {
		return aposento;
	}
	public void setAposento(Aposento aposento) {
		this.aposento = aposento;
	}
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	
}
