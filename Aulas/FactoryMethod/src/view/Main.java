package view;

import model.Employee;
import model.EmployeeFactory;
import model.EmployeeType;
import model.br.BREmployeeFactory;
import model.us.USEmployeeFactory;

public class Main {

	public static void main(String[] args) {
		EmployeeFactory factoryBR = new BREmployeeFactory();
		
		Employee e1 = factoryBR.createEmployee(EmployeeType.MANAGER);
		
		System.out.println(e1.getPosition() + " " + e1.calculateSalary())/
	}

}
