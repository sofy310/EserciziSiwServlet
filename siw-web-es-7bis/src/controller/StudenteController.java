package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Studente;

@WebServlet("/studenteController")
public class StudenteController extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
				throws IOException, ServletException{
		
			String nextPage;
			HelperStudente helperStudente = new HelperStudente();
			HttpSession session = request.getSession();
			
			if(helperStudente.isValid(request)) {
				String nome = request.getParameter("nome").toUpperCase();
				String cognome = request.getParameter("cognome").toUpperCase();
				String matricola = request.getParameter("matricola");
				Studente studente = new Studente(nome, cognome, matricola);
				
				session.setAttribute("studente", studente);
				
				nextPage = "/confermaStudente.jsp";
			}
			
			else {
				nextPage = "/newStudente.jsp";
			}
			
			response.encodeURL(nextPage);
			
			ServletContext application = getServletContext();
			RequestDispatcher rd = application.getRequestDispatcher(nextPage);
			rd.forward(request, response);
			return;
	}
}
