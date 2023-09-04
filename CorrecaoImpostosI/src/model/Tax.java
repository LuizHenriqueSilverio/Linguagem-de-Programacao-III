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
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		
		if(!(obj instanceof Tax)) {
			return false;
		}
		
		Tax tax = (Tax) obj;
		
		return this.abbr.equals(tax.abbr);
		
	}
	

	public double calculate() {
		//TODO implementar calculo do imposto
		return 0;
	}

	public void setAliquot(double aliquot) {
		this.aliquot = aliquot / 100;
	}
}
