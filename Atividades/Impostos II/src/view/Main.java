package view;

import model.ICMS;
import model.IPI;
import model.ISS;
import model.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		IPI ipi = new IPI();
		ICMS icms = new ICMS();
		ISS iss = new ISS();
		
		Product arroz = new Product("Arroz", 7.00, 20, true);
		arroz.addTax(icms);
		arroz.addTax(iss);
		
		Product feijao = new Product("Feijão", 7.00, 25, true);
		feijao.addTax(icms);
		feijao.addTax(iss);
		
		
		System.out.printf("Preço final do arroz: R$%.2f\n", arroz.calculateSalePrice());
		System.out.printf("Preço final do feijão: R$%.2f", feijao.calculateSalePrice());
	}

}
