package View;

import Model.EmployeeFactory;
import Model.EmployeeFactory.EmployeeType;
import Model.Employee;

public class Main {

	public static void main(String[] args) {
		Employee e = EmployeeFactory.createEmployee(EmployeeType.MANAGER, "Emerson", 2000, 5, 8, 0);
		
		System.out.println(e);
	}

}
