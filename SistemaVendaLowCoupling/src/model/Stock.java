package model;

import java.util.ArrayList;
import java.util.List;

public class Stock {
	private List<StockItem> stockItems = new ArrayList<>();
	
	public Stock() {
		//Vamos recuperar do BD
		stockItems = DataBase.getStockItem();
	}
	
	public boolean hasAmount(String codeProd, int amount) {
		Product p = DataBase.getProduct(codeProd);
		
		
		for(StockItem stockItem : stockItems) {
			Product pInStock = stockItem.getProduct();
			if(p.getDescription().equals(pInStock.getDescription())) {
				return stockItem.getAmount() >= amount;
			}
		}
		
		return false;
	}
	
	public void removeFromStock(String codeProd, int amount) {
		Product p = DataBase.getProduct(codeProd);
		
		
		for(StockItem stockItem : stockItems) {
			Product pInStock = stockItem.getProduct();
			if(p.getDescription().equals(pInStock.getDescription())) {
				stockItem.removeFromStock();
			}
		}
	}
}
