package model;

import java.util.ArrayList;
import java.util.List;

public class Payroll {
	private List<Employee> employees;
	private double total;
	
	public Payroll() {
		this.employees = new ArrayList<>();
	}
	
	public void addEmployee(Employee employee) {
		this.employees.add(employee);
	}
	
	private void calculatePayroll() {
		for(Employee employee : employees) {
			this.total += employee.calculate();
		}
	}
	
	public void print() {
		for(Employee employee : employees) {
			System.out.println(employee.getEmployeeDetails());
		}
		this.calculatePayroll();
		System.out.println(String.format("Total - R$%.2f", this.total));
	}
}
