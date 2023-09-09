package view;

import model.IPI;
import model.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		IPI ipi = new IPI(true);
		Product arroz = new Product("Arroz", 7.00, 30);
		arroz.addTax(ipi);
	}

}
