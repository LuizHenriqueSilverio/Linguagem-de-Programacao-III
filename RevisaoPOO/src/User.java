import java.util.ArrayList;
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
