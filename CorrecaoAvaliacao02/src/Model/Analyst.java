package Model;

public class Analyst extends Employee{

	public Analyst(String name, double salary) {
		super(name, "Analista", salary);
	}

	@Override
	public double salary() {
		return this.baseSalary();
	}

}
