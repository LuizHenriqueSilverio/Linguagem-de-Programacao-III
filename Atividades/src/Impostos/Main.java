package Impostos;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		Imposto icms = new Imposto("ICMS", 0.07);
		Imposto confins = new Imposto("Confins", 0.12);
		Imposto ipi = new Imposto("IPI", 0.08);
		Imposto iss = new Imposto("ISS", 0.05);
		Imposto cide = new Imposto("Cide", 0.10);
		Imposto csll = new Imposto("CSLL", 0.04);
        
        List<Produto> prod = new ArrayList<>();
        
        Produto arroz = new Produto("Arroz", 7.00, 0.20);
        arroz.insereImposto(icms);
        arroz.insereImposto(confins);
        arroz.insereImposto(iss);
        
        Produto feijao = new Produto("Feijão", 7.00, 0.25);
        feijao.insereImposto(icms);
        feijao.insereImposto(confins);
        feijao.insereImposto(iss);
        
        Produto carne = new Produto("Carne", 7.00, 0.35);
        carne.insereImposto(confins);
        carne.insereImposto(icms);
        carne.insereImposto(ipi);
        
        Produto cerveja = new Produto("Cerveja", 7.00, 0.30);
        cerveja.insereImposto(confins);
        cerveja.insereImposto(icms);
        cerveja.insereImposto(iss);
        cerveja.insereImposto(ipi);
        
        Produto gas = new Produto("Gás", 7.00, 0.15);
        gas.insereImposto(confins);
        gas.insereImposto(icms);
        gas.insereImposto(ipi);
        
        Produto gasolina = new Produto("Gasolina", 7.00, 0.15);
        gasolina.insereImposto(confins);
        gasolina.insereImposto(icms);
        gasolina.insereImposto(cide);
        
        prod.add(arroz);
        prod.add(feijao);
        prod.add(carne);
        prod.add(cerveja);
        prod.add(gas);
        prod.add(gasolina);
        
        for(Produto produto : prod) {
        	double precoVenda = produto.calcularPrecoVenda();
        	produto.imprimeDadosProduto(precoVenda);
        }
	}

}
