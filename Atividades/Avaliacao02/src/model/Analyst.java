package model;

public class Analyst implements Employee{
	
	private String name;
	private String function;
	private double salary;
	private int extraHours;
	
	public Analyst(String name, double salary) {
		this.name = name;
		this.salary = salary;
		this.extraHours = 0;
		this.function = "Analista";
	}
	
	@Override
	public double calculate() {
		double extraSalary = this.extraHours * 100.00;
		return this.salary + extraSalary;
	}

	@Override
	public void addExtraHours(int extraHours) {
		this.extraHours += extraHours;
	}

	@Override
	public String getEmployeeDetails() {
		return String.format("%s - %s - %.2f", this.name, this.function, this.calculate());
	}

}
