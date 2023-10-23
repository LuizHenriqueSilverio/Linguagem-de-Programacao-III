package model;

public class StockItem {
	
	private Product product;
	private int amount;
	
	public StockItem(Product product, int amount) {
		this.product = product;
		this.amount = amount;
	}
	
	public Product getProduct() {
		return this.product;
	}
	
	public double getAmount() {
		return this.amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public void removeFromStock(int amount) {
		this.amount -= amount;
	}
}
