package model;

public class ICMS extends Tax{

	private static final double INDUSTRIAL_ALIQUOT = 5;
	private static final double NON_INDUSTRIAL_ALIQUOT = 5;
	
	public ICMS() {
		super("ICMS", "Imposto sobre Circulação de Mercadorias");
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double calculate(Product p) {
		double icmsCost = p.getCostPrice() * this.getAliquot();
		return icmsCost;
	}

	@Override
	public void defineAliquot(Product p) {
		if(p.isIndustrial()) {
			setAliquot(INDUSTRIAL_ALIQUOT);
		}else {
			setAliquot(NON_INDUSTRIAL_ALIQUOT);
		}
		
	}

}
