package model;

public class SaleManager {
	private Stock stock;
	private Sale sale;
	
	public SaleManager() {
		stock = new Stock();
		sale = null;
	}
	
	public void openSale() {
		sale = new Sale();
	}
	
	public void closeSale() {
		sale = null;
	}
	
	private boolean isOpen() {
		return sale != null;
	}
	
	public boolean addItem(String codeProd, int amount) {
		if(!isOpen()) {
			return false;
		}
		if(stock.hasAmount(codeProd, amount)) {
			sale.addItem(codeProd, amount);
			stock.removeFromStock(codeProd, amount);
			return true;
		}
		return false;
	}
}
