package Model;

public class EmployeeFactory {

	public enum EmployeeType {
		ANALYST,
		ARCHITECT,
		MANAGER,
		TECHLEAD;
	}
	
	public static Employee createEmployee(EmployeeType id, String name, double salary, int subs, double percentual, int projects) {
		switch(id) {
			case ANALYST: 
				return new Analyst(name, salary);
				
			case ARCHITECT:
				return new Architect(name, salary, projects, 0);
			
			case MANAGER:
				return new Manager(name, salary, subs, percentual, projects, 0);
				
			case TECHLEAD:
				return new TechLead(name, salary, subs, percentual);
			
			default:
				return null;
		}
	}
}
