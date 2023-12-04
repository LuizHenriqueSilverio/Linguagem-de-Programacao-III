package view;

import model.Country;
import model.CountryEmployeeFactory;
import model.Employee;
import model.EmployeeFactory;

import model.EmployeeType;

public class Main {

	public static void main(String[] args) {
		EmployeeFactory factory = CountryEmployeeFactory.createObject(Country.BR);
		
		Employee e1 = factory.createEmployee(EmployeeType.MANAGER);
		
		System.out.println(e1.getPosition() + " " + e1.calculateSalary());
	}

}
