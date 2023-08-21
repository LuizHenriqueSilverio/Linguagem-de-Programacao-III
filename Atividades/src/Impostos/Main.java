package Impostos;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		
		
		List<Imposto> impostos = new ArrayList<>();
		
		impostos.add(new Imposto("Confins", 0.12));
		impostos.add(new Imposto("ICMS", 0.07));
		impostos.add(new Imposto("ISS", 0.05));
        impostos.add(new Imposto("IPI", 0.08));
        impostos.add(new Imposto("Cide", 0.1));
        impostos.add(new Imposto("CSLL", 0.04));
        
        List<Produto> prod = new ArrayList<>();
        
        prod.add(new Produto("Arroz", 7.00, new ArrayList<>(impostos.subList(0, 3)), 0.20));
        prod.add(new Produto("Feijão", 7.00, new ArrayList<>(impostos.subList(0, 3)), 0.25));
        prod.add(new Produto("Carne", 7.00, new ArrayList<>(impostos.subList(1, 3)), 0.35));
        prod.add(new Produto("Cerveja", 7.00, new ArrayList<>(impostos.subList(1, 5)), 0.30));
        prod.add(new Produto("Gás", 7.00, new ArrayList<>(impostos.subList(1, 3)), 0.15));
        prod.add(new Produto("Gasolina", 7.00, new ArrayList<>(impostos.subList(1, 5)), 0.15));
        
        
        
        for(Produto produto : prod) {
        	double precoVenda = produto.calcularPrecoVenda();
        	produto.imprimeDadosProduto(precoVenda);
        }
	}

}
