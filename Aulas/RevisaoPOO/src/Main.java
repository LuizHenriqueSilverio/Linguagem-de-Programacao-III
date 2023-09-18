
public class Main {
	
	private static void printUserData(User user) {
		System.out.println(user.formatPersonalData() + "\n");
	}

	public static void main(String[] args) {
		Student maria = new Student(1, 999);
		maria.setName("Maria");
		maria.setBirthDate("11/06/2000");
		maria.setCourse("Sistemas de Informação");
		maria.setSemester((short) 4);
		
		Professor emerson = new Professor(2, "21");
		emerson.setName("Emerson");
		emerson.setLevel("Doutor");
		emerson.setArea("Informática");
		
		AT ju = new AT(3, "891");
		ju.setName("Julia");
		ju.setArea("TI");
		ju.setRole("Técnina em Laboratório");
		
		printUserData(maria);
		printUserData(emerson);
		printUserData(ju);
	}

}
