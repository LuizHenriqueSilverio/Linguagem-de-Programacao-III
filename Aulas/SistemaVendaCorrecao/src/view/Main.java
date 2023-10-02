package view;

import model.Product;
import model.SaleItem;
import model.Sale;

public class Main {

	public static void main(String[] args) {
		Product arroz = new Product("Arroz Pileco T1", 15.00);
		Product feijao = new Product("Feijão Malícia", 20.00);
		
		SaleItem siArroz = new SaleItem(arroz, 3);
		SaleItem siFeijao = new SaleItem(feijao, 2);
		
		Sale sale = new Sale();
		sale.addSaleItem(siArroz);
		sale.addSaleItem(siFeijao);
		
		System.out.println(String.format("Venda - #1234 - %s", sale.getDate().toLocaleString()) );
		
		for(SaleItem i : sale.getItems()) {
			System.out.print(i.getProduct().getDescription() + " - ");
			System.out.print(i.getAmount() + " - ");
			System.out.print("R$" + i.getProduct().getPrice() + " - ");
			System.out.print("R$" + i.getSaleItemSubTotal() + "\n");
		}
		
		System.out.println("Total: R$" + sale.getTotal());
	}

}
