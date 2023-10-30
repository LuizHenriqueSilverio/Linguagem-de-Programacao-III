package model;

public class Architect implements Employee{
	
	private String name;
	private String function;
	private double salary;
	private int extraHours;
	
	public Architect(String name, double salary) {
		this.name = name;
		this.salary = salary;
		this.function = "Architect";
		this.extraHours = 0;
	}
	
	@Override
	public double calculate() {
		double extraSalary = (this.extraHours * 200.00) + (this.salary * 0.02);
		return salary + extraSalary;
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
