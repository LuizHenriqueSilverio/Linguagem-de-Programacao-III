package view;

import model.Cafe;
import model.Cha;

public class Cafeteria {
	public static void main(String[] args) {
		Cafe cafe = new Cafe();
		Cha cha = new Cha();
		
		System.out.println("Fazendo chá: ");
		cha.prepararReceita();
		
		System.out.println("Fazendo café: ");
		cafe.prepararReceita();
	}
}
