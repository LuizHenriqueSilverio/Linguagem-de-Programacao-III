package model;

import java.util.ArrayList;
import java.util.List;

public class Stock {
	private List<StockItem> stockItems = new ArrayList<>();
	
	public Stock() {
		//Vamos recuperar do BD
		stockItems = DataBase.getStockItem();
	}
	
//	public void addStockItem(String product, double amount) {
//		String[] itemString = DataBase.getProductDescription(product);
//		Product stockProduct = new Product(itemString[0].toString(), Double.parseDouble(itemString[1]));
//		
//		StockItem stockItem = new StockItem(stockProduct, amount);
//		this.stockItems.add(stockItem);
//	}
//	
//	public void decreaseAmount(String product) {
//		for(StockItem si : stockItems) {
//			if(si.getProduct().getDescription() == product) {
//				si.setAmount(si.getAmount() - 1);
//				break;
//			}
//		}
//	}
}
