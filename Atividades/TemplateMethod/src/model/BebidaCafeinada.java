package model;

public abstract class BebidaCafeinada {
	
	public final void prepararReceita() {
		ferverAgua();
		adicionarInfusao();
		servirNaXicara();
		if(clienteAceitaCondimentos()) {
			adicionarCondimentos();
		}
	}
	
	abstract void adicionarInfusao();
	
	abstract void adicionarCondimentos();
	
	private void ferverAgua() {
		System.out.println("Fervendo água.");
	}
	
	private void servirNaXicara() {
		System.out.println("Servindo na xícara.");
	}
	
	public boolean clienteAceitaCondimentos() {
		return true;
	}
}
