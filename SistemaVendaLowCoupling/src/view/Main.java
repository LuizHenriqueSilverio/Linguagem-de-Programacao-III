package view;


import model.SaleManager;

public class Main {

	public static void main(String[] args) {
		SaleManager manager = new SaleManager();
		manager.openSale();
		
		manager.addItem("arroz", 3);
		manager.addItem("feijao", 2);
		manager.addItem("sal", 1);
		//sale.addPaymentMethod("cc");
		//sale.addPaymentMethod("dc");
		sale.addPaymentMethod("c");
		
		System.out.println(String.format("Venda - #1234 - %s", sale.getDate().toLocaleString()) );
		
		for(String si : sale.getSaleItems()) {
			System.out.println(si);
		}
		
		
		System.out.println(String.format("Total: R$%.2f", sale.getTotal()));
		System.out.println("Forma de pagamento: " + sale.getPaymentMethod());
		System.out.println(String.format("Valor a ser pago: R$%.2f", sale.getPaymentValue()));
	}

}
