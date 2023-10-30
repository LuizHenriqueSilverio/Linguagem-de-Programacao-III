package model;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee{
	
	private String name;
	private String function;
	private double salary;
	private double bonus;
	private int extraHours;
	private List<Employee> subordinates;
	
	public Manager(String name, double salary, double bonus) {
		this.name = name;
		this.salary = salary;
		this.bonus = bonus;
		this.function = "Gerente";
		this.extraHours = 0;
		subordinates = new ArrayList<>();
	}
	
	@Override
	public double calculate() {
		double extraSalary = this.extraHours * 250.00;
		
		for(Employee subordinate : subordinates) {
			extraSalary += (this.salary * 0.01);
		}
		
		extraSalary += this.bonus;
		
		return salary + extraSalary;
	}

	@Override
	public void addExtraHours(int extraHours) {
		this.extraHours += extraHours;
	}
	
	public void addSubordinate(Employee employee) {
		this.subordinates.add(employee);
	}

	@Override
	public String getEmployeeDetails() {
		return String.format("%s - %s - R$%.2f", this.name, this.function, this.calculate());
	}
	
}
