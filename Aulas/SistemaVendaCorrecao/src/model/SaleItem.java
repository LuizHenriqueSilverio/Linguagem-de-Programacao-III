package model;

public class SaleItem {
	private Product product;
	private int amount;
	
	public SaleItem(Product product, int amount) {
		this.product = product;
		this.amount = amount;
	}
	
	public Product getProduct() {
		return this.product;
	}
	
	public int getAmount() {
		return this.amount;
	}
	
	public double getSaleItemSubTotal() {
		return this.product.getPrice() * this.amount;
	}
}
