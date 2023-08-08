import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User {
	private String nome;
	private String cpf;
	private List<String> friends;
	
	public User() {
		friends = new ArrayList<>();
		friends.add("Luiza");
		friends.add("Rosana");
	}
	
	public void addFriend(String name) {
		friends.add(name);
	}
	
	public List<String> getFriends() {
		List<String> friendsCopy = new ArrayList<>();
		for(String friendName : this.friends) {
			friendsCopy.add(friendName);
		}
		
		return friendsCopy;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		if(cpf == null || cpf.equals("")) {
			return;
		}else {
			this.cpf = cpf;
		}
	}
	
}
