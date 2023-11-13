package Model;

public class Architect extends Employee{
	
	private int projects;
	private double percentualPerProject;
	
	public Architect(String name, double salary, int projects, double percentual) {
		super(name, "Arquiteto", salary);
		this.projects = projects;
		this.percentualPerProject = percentual / 100;
	}

	
	@Override
	public double salary() {
		double bonusPerProject = this.getSalary() * this.percentualPerProject;
		double extraBonus = bonusPerProject * this.projects;
		
		
		return this.baseSalary() + extraBonus;
	}
	
	
	
}
