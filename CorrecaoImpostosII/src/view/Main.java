package view;

import model.Tax;
import model.IPI;
import model.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product arroz = new Product("Arroz Pileco", 7, 20);
		Tax ipi = new IPI();
		
		ipi.defineAliquot(arroz);
		arroz.addTax(ipi);
		// Tax icms = new Tax("ICMS", "Imposto Circ. Mercadorias", 7);
		
		System.out.println(arroz.getName() + ", " + String.format("R$%.2f", arroz.calculateSalePrice()));

	}

}
