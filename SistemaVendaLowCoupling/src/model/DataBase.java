package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBase {
	private static Map<String, String[]> products = new HashMap<>();
	
	private static Map<String, PaymentMethod> payments = new HashMap<>();
	
	private static Map<String, StockItem> stockItems = new HashMap<>();
	
	static {
		products.put("arroz", new String[] {"Arroz Tipo 1", "20"});
		products.put("feijao", new String[] {"Feijão Malícia", "30"});
		products.put("sal", new String[] {"Sal Marino", "8"});
		
		stockItems.put("arroz", new StockItem(new Product("Arroz Tipo 1", 20), 5));
		stockItems.put("arroz", new StockItem(new Product("Feijão Malícia", 30), 5));
		stockItems.put("arroz", new StockItem(new Product("Sal Marino", 8), 5));
		
		payments.put("cc", new CreditCard(5));
		payments.put("dc", new DebitCard(0));
		payments.put("c", new Cash(5));
		
	}
	
	public static List<StockItem> getStockItem() {
		List<StockItem> items = new ArrayList<>();
		
		for(StockItem stockItem : this.stockItems.values()) {
			items.add(stockItem);
		}
		
		return items;
	}
	
	public static String[] getProductDescription(String key) {
		return products.get(key);
	}
	
	public static PaymentMethod getPayment(String key) {
		return payments.get(key);
	}
}
;