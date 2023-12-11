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
@WebServlet(urlPatterns = {""})
public class UsersController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String uri = req.getRequestURI();
		
		switch (uri) {
			case "/facebook/":
				
				//Carregar usuários do BD
				loadUsers(req);
				
				//Direcionar a chamada para a index.html
				RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
				rd.forward(req, resp);
				
				break;
	
			default:
				PrintWriter writer = resp.getWriter();
				writer.append("404 recurso não encontrado: " + uri);
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
