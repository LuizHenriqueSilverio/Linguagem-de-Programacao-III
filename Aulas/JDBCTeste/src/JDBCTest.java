import model.ModelException;
import model.User;
import model.dao.MySQLUserDAO;
import model.dao.UserDAO;

public class JDBCTest {

	public static void main(String[] args) throws ModelException {
		/*
		User luiz = new User(6);
		luiz.setName("Luiz Henrique");
		luiz.setGender("M");
		luiz.setEmail("luiz@mail.com");
		
		UserDAO userDAO = new MySQLUserDAO();
		userDAO.save(luiz);
		//userDAO.update(luiz);
		*/
		
		UserDAO userDAO = new MySQLUserDAO();
		
		for(User user: userDAO.listAll()) {
			System.out.println(user.getName() + " - " + user.getEmail());
		}
		
	}
	
}