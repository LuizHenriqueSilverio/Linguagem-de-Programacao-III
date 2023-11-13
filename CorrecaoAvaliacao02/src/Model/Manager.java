package Model;

public class Manager extends Employee{
	
	private int subordinates;
	private double percentPerSubordinate;
	private int doneProjects;
	private double bonusPerProject;
	
	public Manager(String name, double salary, int sub, double percent, int doneProjects, double bonusProject) {
		super(name, "Gerente", salary);
		this.subordinates = sub;
		this.percentPerSubordinate = percent / 100;
		this.doneProjects = doneProjects;
		this.bonusPerProject = bonusProject;
	}

	
	@Override
	public double salary() {
		double valuePerSub = this.getSalary() * this.percentPerSubordinate;
		double extraBonus = valuePerSub * this.subordinates;
		double projectsBonus = doneProjects * bonusPerProject;
		
		return this.baseSalary() + extraBonus + projectsBonus;
	}

}
