package model;

public class StockItem {
	
	private Product product;
	private double amount;
	
	public StockItem(Product product, double quantity) {
		this.product = product;
		this.amount = quantity;
	}
	
	public Product getProduct() {
		return this.product;
	}
	
	public double getAmount() {
		return this.amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
}
