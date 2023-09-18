package model;

public class IPI extends Tax{

	public IPI(double aliquot) {
		super("IPI", "Imposto sobre Produtos Industrializados", aliquot);
	}

	@Override
	public double calculate(Product p) {
		
		return 0;
	}

}
