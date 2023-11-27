package Model;

public abstract class Employee {
	private String name;
	private String role;
	private double salary;
	private double perExtraHourValue;
	private double extraHours;
	
	public Employee(String name, String role, double salary) {
		this.name = name;
		this.role = role;
		this.salary = salary;
	}
	
	
	public void setPerExtraHourValue(double perExtraHourValue) {
		this.perExtraHourValue = perExtraHourValue;
	}

	
	public void setExtraHours(double extraHours) {
		this.extraHours = extraHours;
	}

	
	public String getName() {
		return name;
	}

	
	public String getRole() {
		return role;
	}


	protected double getSalary() {
		return salary;
	}

	
	public double getPerExtraHourValue() {
		return perExtraHourValue;
	}


	public double getExtraHours() {
		return extraHours;
	}

	protected double baseSalary() {
		double baseSalary = this.getSalary();
		double extraEarnings = this.getExtraHours() * this.getPerExtraHourValue();
		
		return baseSalary + extraEarnings;
	}

	public abstract double salary();
	
}
