package model;

public class IPI extends Tax{
	
	// O correto seria puxar de um BD
	private static final double FOREIGN_ALIQUOT = 10;
	private static final double LOCAL_ALIQUOT = 8;
	
	public IPI() {
		super("IPI", "Imposto sobre Produtos Industrializados");
	}

	@Override
	public double calculate(Product p) {
		
		return 0;
	}

	@Override
	public void defineAliquot(Product p) {
		if(p.isForeign()) {
			setAliquot(FOREIGN_ALIQUOT);
		}else {
			setAliquot(LOCAL_ALIQUOT);
		}
	}
}
