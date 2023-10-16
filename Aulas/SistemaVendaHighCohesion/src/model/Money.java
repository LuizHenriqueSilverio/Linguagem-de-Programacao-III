package model;

public class Money implements PaymentMethod{

	@Override
	public double calculate(double price) {
		double finalPrice = price * 0.95;
		return finalPrice;
	}
	
}
