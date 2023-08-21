package Impostos;

import java.util.ArrayList;
import java.util.List;

public class Produto {
	private String nome;
	private double precoCusto;
	private List<Imposto> impostos; 
	private double margemLucro;
	
	public Produto(String nome, double precoCusto, List<Imposto> impostos, double margemLucro) {
		this.nome = nome;
		this.precoCusto = precoCusto;
		this.impostos = new ArrayList<>(impostos);
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
	
	public double calcularPrecoVenda() {
		double precoImpostos = 0;
		
		for(Imposto imposto : impostos) {
			precoImpostos += precoCusto * imposto.getPorcentagem();
		}
		double precoLucro = precoCusto * margemLucro;
		return this.precoCusto + precoImpostos + precoLucro;
	}
	
	public String imprimirImpostos() {
		String linha = "";
		for(Imposto imposto: impostos) {
			linha += imposto.getNome().concat(","); 
		}
		return linha;
	}
	
	public void imprimeDadosProduto(double precoVenda) {
		System.out.println(this.nome);
    	System.out.println(String.format("Preco de custo: R$%.2f", this.precoCusto));
    	System.out.println("Impostos: " + this.imprimirImpostos());
    	System.out.println("Margem de Lucro: " + this.margemLucro);
    	System.out.println(String.format("Preco de venda: R$%.2f\n", precoVenda));
	}
}
