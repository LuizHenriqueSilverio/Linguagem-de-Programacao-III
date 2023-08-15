public abstract class User {
	
	private int id;
	private String name;
	private String birthDate;
	
	public User(int id) throws Exception{
		if(id <= 0) {
			throw new Exception("ID está invalido!");
		}
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	
	public String formatPersonalData() {
		// return "ID: " + this.id + " Nome: " + this.name;
		return String.format("ID: %d\nNome: %s", this.id, this.name);
	}
	
}
