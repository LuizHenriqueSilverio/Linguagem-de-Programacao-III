package view;

import model.Analyst;
import model.Architect;
import model.Manager;
import model.Payroll;
import model.TechLead;

public class Main {

	public static void main(String[] args) {
		Payroll payroll = new Payroll();
		
		Analyst maria = new Analyst("Maria", 3500.00);
		maria.addExtraHours(5);
		
		Architect joao = new Architect("João", 5000.00);
		joao.addExtraHours(7);
		
		TechLead rogerio = new TechLead("Rogério", 11000.00);
		rogerio.addExtraHours(5);
		rogerio.addTeamMember(joao);
		rogerio.addTeamMember(maria);
		
		Manager luiz = new Manager("Luiz", 20000.00, 1500.00);
		luiz.addSubordinate(maria);
		luiz.addSubordinate(joao);
		luiz.addSubordinate(rogerio);
		
		payroll.addEmployee(maria);
		payroll.addEmployee(joao);
		payroll.addEmployee(rogerio);
		payroll.addEmployee(luiz);
		
		payroll.print();

	}

}
