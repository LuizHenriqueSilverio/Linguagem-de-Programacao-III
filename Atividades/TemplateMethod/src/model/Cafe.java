package model;

import java.util.Scanner;

public class Cafe extends BebidaCafeinada{

	@Override
	public void adicionarInfusao() {
		System.out.println("Adicionando pó de café à água fervente.");
	}

	@Override
	public void adicionarCondimentos() {
		System.out.println("Adicionando açúcar e leite.");
	}

	@Override
	public boolean clienteAceitaCondimentos() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Você deseja adicionar açúcar e leite no café?(y/n)");
		
		String resposta = scanner.nextLine();
		
		if(resposta == "y") {
			return true;
		}else {
			return false;
		}
	}
}
