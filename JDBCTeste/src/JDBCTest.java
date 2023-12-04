import model.ModelException;
import model.User;
import model.dao.MySQLUserDAO;
import model.dao.UserDAO;

public class JDBCTest {

	public static void main(String[] args) throws ModelException {
		User emerson = new User();
		
		emerson.setName("Emerson Teste DAO");
		emerson.setGender("M");
		emerson.setEmail("emerson@mail.com");
		
		UserDAO userDAO = new MySQLUserDAO();
		userDAO.save(emerson);
		
		
	}
	
}