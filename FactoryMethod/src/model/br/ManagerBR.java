package model.br;

import model.Employee;

public class ManagerBR extends Employee{

	public ManagerBR(String position) {
		super(position);
	}

	@Override
	public double calculateSalary() {
		return 0;
	}
	
}
