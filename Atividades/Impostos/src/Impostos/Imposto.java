package Impostos;

public class Imposto {
	private String nome;
	private double porcentagem;
	
	public Imposto(String nome, double porcentagem) {
		this.nome = nome;
		this.porcentagem = porcentagem;
	}

	public double getPorcentagem() {
		return porcentagem;
	}

	public void setPorcentagem(double porcentagem) {
		this.porcentagem = porcentagem;
	}

	public String getNome() {
		return nome;
	}
	
	
}
