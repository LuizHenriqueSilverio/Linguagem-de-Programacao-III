
public class Main {

	public static void main(String[] args) {
		User emerson = new User();
		emerson.setNome("Emerson");
		emerson.setCpf("123.456.789-10");
		
		System.out.println("Lista de amigos: ");
		for (String friendName : emerson.getFriends()) {
			System.out.println(friendName);
		}
	}

}
