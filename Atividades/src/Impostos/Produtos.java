package Impostos;

import java.util.List;

public class Produtos {
	private String nome;
	private double precoCusto;
	private List<Imposto> impostos; 
	private double margemLucro;
	
	public Produtos(String nome, double precoCusto, List<Imposto> impostos, double margemLucro) {
		this.nome = nome;
		this.precoCusto = precoCusto;
		this.impostos = impostos;
		this.margemLucro = margemLucro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public List<Imposto> getImpostos() {
		return impostos;
	}

	public void setImpostos(List<Imposto> impostos) {
		this.impostos = impostos;
	}

	public double getMargemLucro() {
		return margemLucro;
	}

	public void setMargemLucro(double margemLucro) {
		this.margemLucro = margemLucro;
	}
	
	
}
