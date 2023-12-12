package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.ModelException;
import model.User;
import model.dao.DAOFactory;
import model.dao.UserDAO;

//Rotas
@WebServlet(urlPatterns = {"", "/save", "/user/update", "/user/delete"})
public class UsersController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String uri = req.getRequestURI();
		
		switch (uri) {
			case "/facebook/": {
				
				//Carregar usuários do BD
				loadUsers(req);
				
				//Direcionar a chamada para a index.html
				RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
				rd.forward(req, resp);
				
				break;
			}
			
			case "/facebook/save": {
				
				String userId = req.getParameter("user-id");
				
				if(userId.equals("")) {
					insertUser(req);
				}else {
					updateUser(req);
				}
				
				resp.sendRedirect("/facebook");
				
				break;
			}
			
			case "/facebook/user/update": {
				
				loadUser(req);
				
				// Direcionar a chamada para a form_user.jsp
				RequestDispatcher rd = req.getRequestDispatcher("/form_user.jsp");
				rd.forward(req, resp);
				
				break;
			}
			
			case "/facebook/user/delete": {
				
				deleteUser(req);
				resp.sendRedirect("/facebook");
				
				break;
			}
			
			default:
				PrintWriter writer = resp.getWriter();
				writer.append("404 recurso não encontrado: " + uri);
				break;
		}
	}

	private void deleteUser(HttpServletRequest req) {
		String userId = req.getParameter("userId");
		
		User user = new User(Integer.parseInt(userId));
		
		UserDAO dao = DAOFactory.createDAO(UserDAO.class);
		
		try {
			dao.delete(user);
		} catch (ModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void updateUser(HttpServletRequest req) {
		// Pegar os dados do formulário
		String userId = req.getParameter("user-id");
		String name = req.getParameter("user-name");
		String gender = req.getParameter("user-gender");
		String email = req.getParameter("email");
				
		// Criar um objeto do tipo User e setar os dados
		User user = new User(Integer.parseInt(userId));
		user.setName(name);
		user.setGender(gender);
		user.setEmail(email);
				
		// Criar um DAO e salvar o objeto
		UserDAO dao = DAOFactory.createDAO(UserDAO.class);
				
		try {
			dao.update(user);
		} catch (ModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void loadUser(HttpServletRequest req) {
		// Recuperar o id do usuário da URI
		
		String idUserStr = req.getParameter("userId");
		
		int userId = idUserStr != null ? Integer.parseInt(idUserStr) : 0;
		
		// Carregar o usuário do banco
		UserDAO dao = DAOFactory.createDAO(UserDAO.class);
		
		User user = null;
		
		try {
			user = dao.findById(userId);
		} catch (ModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Colocar o usuário no contexto
		
		req.setAttribute("usuario", user);
		
	}

	private void insertUser(HttpServletRequest req) {
		// Pegar os dados do formulário
		String name = req.getParameter("user-name");
		String gender = req.getParameter("user-gender");
		String email = req.getParameter("email");
		
		// Criar um objeto do tipo User e setar os dados
		User user = new User();
		user.setName(name);
		user.setGender(gender);
		user.setEmail(email);
		
		// Criar um DAO e salvar o objeto
		UserDAO dao = DAOFactory.createDAO(UserDAO.class);
		
		try {
			dao.save(user);
		} catch (ModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void loadUsers(HttpServletRequest req) {
		// Criar um DAO
		UserDAO dao = DAOFactory.createDAO(UserDAO.class);
		
		// Recuperar os usuários em uma lista
		List<User> users = null;
		
		try {
			users = dao.listAll();
		} catch (ModelException e) {
			e.printStackTrace();
		}
		
		// Deixar lista disponível para ser acessada
		req.setAttribute("usuarios", users);
	}
	
}
