package model;

public class ISS extends Tax{

	public ISS() {
		super("ISS", "Imposto Sobre Serviço");
	}

	@Override
	protected double calculate(Product p) {

		return 0;
	}

	@Override
	protected void defineAliquot(Product p) {

		
	}

}
