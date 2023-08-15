
public class Main {

	public static void main(String[] args) {
		Student maria = new Student(1, 999);
		maria.setName("Maria");
		maria.setBirthDate("11/06/2000");
		maria.setCourse("Sistemas de Informação");
		maria.setSemester((short) 4);
		
		Student jose = new Student(2, 888);
		jose.setName("José");
		jose.setBirthDate("14/07/2001");
		jose.setCourse("Sistemas de Informação");
		jose.setSemester((short) 8);
		
		System.out.println(maria.toString() + " " + maria.formatPersonalData());
		System.out.println(jose.toString() + " " + jose.formatPersonalData());
	}

}
