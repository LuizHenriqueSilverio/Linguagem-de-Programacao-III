package Model;

public class TechLead extends Employee{
	
	private int subordinates;
	private double percentPerSubordinate;
	
	public TechLead(String name, double salary, int sub, double percent) {
		super(name, "Líder Técnico", salary);
		this.subordinates = sub;
		this.percentPerSubordinate = percent / 100;
	}

	
	@Override
	public double salary() {
		double valuePerSub = this.getSalary() * this.percentPerSubordinate;
		double extraBonus = valuePerSub * this.subordinates;
		return this.baseSalary() + extraBonus;
	}
	
	
}
