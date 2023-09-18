package model;

import java.util.ArrayList;
import java.util.List;

public class Product {
	private String name;
	private double costPrice;
	private double profit;
	private boolean foreign;
	private List<Tax> taxes;
	
	public Product(String name, double costPrice, double profit) throws Exception {
		this.foreign = false;
		setName(name);
		setCostPrice(costPrice);
		setProfit(profit);
		this.taxes = new ArrayList<>();
	}
	
	public double getCostPrice() {
		return this.costPrice;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setIsForeign(boolean isForeign) {
		this.foreign = isForeign;
	}
	
	public boolean isForeign() {
		return this.foreign;
	}
	
	public boolean addTax(Tax tax) throws Exception{
		
		if(tax == null) {
			throw new Exception("Imposto não pode ser nulo.");
		}
		
		if(taxes.contains(tax)) {
			return false;
		}else {
			tax.defineAliquot(this);
			taxes.add(tax);
		}
		
		return true;
	}
	
	public double calculateSalePrice() {
		double taxesSum = 0;
		
		for(Tax tax : taxes) {
			taxesSum += tax.calculate(this);
		}
		
		double finalCost = costPrice + taxesSum;
		
		double finalPrice = finalCost + (finalCost * profit);
		
		return finalPrice;
	}

	private void setProfit(double profit) throws Exception{
		if(profit <= 0) {
			throw new Exception("Margem está inválida.");
		}
		this.profit = profit / 100;
	}

	private void setCostPrice(double costPrice) throws Exception{
		if(costPrice <= 0) {
			throw new Exception("Preço de custo inválido.");
		}
		this.costPrice = costPrice;
	}

	private void setName(String name) throws Exception {
		if(name == null || name.equals("")) {
			throw new Exception("Nome inválido.");
		}
		this.name = name;
	}
}
