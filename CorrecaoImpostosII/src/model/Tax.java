package model;

public abstract class Tax {
	private String abbr;
	private String name;
	private double aliquot;

	public Tax(String abbr, String name) {
		//TODO validar todos os atributos
		this.abbr = abbr;
		this.name = name;
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
	

	public abstract double calculate(Product p);

	public void setAliquot(double aliquot) {
		this.aliquot = aliquot / 100;
	}
	
	protected double getAliquot() {
		return aliquot;
	}
	
	public abstract void defineAliquot(Product p);
}
