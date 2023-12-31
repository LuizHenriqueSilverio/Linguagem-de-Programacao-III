package view;

import model.Tax;
import model.ICMS;
import model.IPI;
import model.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product arroz = new Product("Arroz Pileco", 7, 20);
		arroz.setIndustrial(true);
		
		Tax ipi = new IPI();
		Tax icms = new ICMS();
		
		arroz.addTax(ipi);
		arroz.addTax(icms);
		
		Product extratoTomate = new Product("Extrato Heinz", 7, 25);
		extratoTomate.setIndustrial(true);
		extratoTomate.setIsForeign(true);
		
		Tax ipiTomate = new IPI();
		
		extratoTomate.addTax(ipiTomate);
		
		System.out.println(arroz.getName() + ", " + String.format("R$%.2f", arroz.calculateSalePrice()));
		System.out.println(extratoTomate.getName() + ", " + String.format("R$%.2f", extratoTomate.calculateSalePrice()));
	}

}
