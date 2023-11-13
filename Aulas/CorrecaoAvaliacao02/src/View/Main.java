package View;

import Model.Employee;
import Model.Payroll;

public class Main {

	public static void main(String[] args) {
		
		Payroll payroll = new Payroll();
		
		payroll.addEmployee("maria");
		payroll.addEmployee("jose");
		payroll.addEmployee("pedro");
		payroll.addEmployee("joao");
		payroll.addEmployee("paula");
		payroll.addEmployee("seila");
		
		for(Employee employee : payroll.getEmployees()) {
			System.out.println("Nome: " + employee.getName());
			System.out.println("Cargo: " + employee.getRole());
			System.out.println("Salário: R$" + employee.salary());
		}
		
		System.out.println("Total da folha: " + payroll.total());

	}

}
