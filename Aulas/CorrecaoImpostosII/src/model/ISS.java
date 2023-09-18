package model;

public class ISS extends Tax{

	private static final double ALIQUOT = 5;
	
	public ISS() {
		super("ISS", "Imposto Sobre Serviço");
	}

	@Override
	protected double calculate(Product p) {
		double issCost = (p.getCostPrice() + (p.getCostPrice() * p.getProfit())) * getAliquot();
		return issCost;
	}

	@Override
	protected void defineAliquot(Product p) {
		setAliquot(ALIQUOT);
	}

}
