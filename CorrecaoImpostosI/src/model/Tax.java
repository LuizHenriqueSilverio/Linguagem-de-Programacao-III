package model;

public class Tax {
	private String abbr;
	private String name;
	private double aliquot;
	
	public Tax(String abbr, String name, double aliquot) {
		//TODO validar todos os atributos
		this.abbr = abbr;
		this.name = name;
		setAliquot(aliquot);
	}
	
	public double calculate() {
		//TODO implementar calculo do imposto
		return 0;
	}

	private void setAliquot(double aliquot) {
		this.aliquot = aliquot / 100;
	}
}
