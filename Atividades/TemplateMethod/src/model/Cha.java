package model;

import java.util.Scanner;

public class Cha extends BebidaCafeinada {

	@Override
	public void adicionarInfusao() {
		System.out.println("Adicionando saquinho de chá à água fervente.");
	}

	@Override
	public void adicionarCondimentos() {
		System.out.println("Adicionando limão.");
	}
	
	@Override
	public boolean clienteAceitaCondimentos() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Você deseja adicionar limão ao chá?(y/n)");
		
		String resposta = scanner.nextLine();
		
		if(resposta == "y") {
			return true;
		}else {
			return false;
		}
	}
	
}
