package view;


import model.Sale;
import model.PaymentMethod;
import model.CreditCard;
import model.DebitCard;
import model.Money;

public class Main {

	public static void main(String[] args) {
		Sale sale = new Sale();
		
		sale.addItem("arroz", 3);
		sale.addItem("feijao", 2);
		sale.addItem("sal", 1);
		
		System.out.println(String.format("Venda - #1234 - %s", sale.getDate().toLocaleString()) );
		
		for(String si : sale.getSaleItems()) {
			System.out.println(si);
		}
		
		// PaymentMethod payment = new CreditCard();
		//PaymentMethod payment = new DebitCard();
		PaymentMethod payment = new Money();
		
		sale.addPaymentMethod(payment);
		
		System.out.println(String.format("Total: R$%.2f", sale.getTotal()));
	}

}
