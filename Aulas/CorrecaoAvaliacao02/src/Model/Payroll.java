package Model;

import java.util.ArrayList;
import java.util.List;

public class Payroll {
	
	private List<Employee> employees;
	
	public Payroll() {
		this.employees = new ArrayList<>();
	}
	
	public void addEmployee(String pk) {
		Employee e = DataBase.get(pk);
		employees.add(e);
	}
	
	public List<Employee> getEmployees() {
		return this.employees;
	}
	
	public double total() {
		double total = 0;
		for(Employee e : employees) {
			total += e.salary();
		}
		
		return total;
	}

}
