package model;

public class DebitCard implements PaymentMethod{

	@Override
	public double calculate(double price) {
		return price;
	}

}
