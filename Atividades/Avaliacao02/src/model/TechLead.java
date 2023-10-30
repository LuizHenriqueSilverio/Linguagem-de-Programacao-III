package model;

import java.util.ArrayList;
import java.util.List;

public class TechLead implements Employee{
	
	private String name;
	private String function;
	private double salary;
	private int extraHours;
	private List<Employee> teamMembers;
	
	public TechLead(String name, double salary) {
		this.name = name;
		this.salary = salary;
		this.function = "Líder Técnico";
		this.extraHours = 0;
		teamMembers = new ArrayList<>();
	}
	
	@Override
	public double calculate() {
		double extraSalary = this.extraHours * 150.00;
		
		for(Employee teamMember : teamMembers) {
			extraSalary += (this.salary * 0.05);
		}
		
		return salary + extraSalary;
	}

	@Override
	public void addExtraHours(int extraHours) {
		this.extraHours += extraHours;
	}
	
	public void addTeamMember(Employee employee) {
		this.teamMembers.add(employee);
	}

	@Override
	public String getEmployeeDetails() {
		return String.format("%s - %s - %.2f", this.name, this.function, this.calculate());
	}

}
