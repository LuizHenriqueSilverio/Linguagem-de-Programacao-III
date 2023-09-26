package model;

import java.util.ArrayList;
import java.util.List;

public class Sale {
	private static int invoiceNumber = 0;
	private List<Product> products;
	
	public Sale() {
		invoiceNumber++;
		this.products = new ArrayList<>();
	}
	
	
}
