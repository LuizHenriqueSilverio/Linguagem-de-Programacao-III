package model;

public class ICMS extends Tax{

	public ICMS() {
		super("ICMS", "Imposto Circ. Mercadorias", 7);
	}
	
	public void setAliquot(Product product) {
		if(product.hasIpi()) {
			setAliquot(5);
		}else {
			setAliquot(7);
		}
	}
	
}
