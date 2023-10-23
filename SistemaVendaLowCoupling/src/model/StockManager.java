package model;

public class StockManager {
	private Stock stock;
	private Sale sale;
	
	public StockManager() {
		stock = new Stock();
		sale = null;
	}
	
	public void openSale() {
		sale = new Sale();
	}
	
	public void closeSale() {
		sale = null;
	}
	
	public boolean isOpen() {
		return sale != null;
	}
	
	
}
