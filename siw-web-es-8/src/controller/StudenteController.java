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
public class StudenteController extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
	
	protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nextPage;
		HelperStudente helperStudente = new HelperStudente();
		HttpSession session = request.getSession();
		
		//Se corretto
		if(helperStudente.isValid(request)) {
			StudenteForm studenteForm = new StudenteForm (request.getParameter("nome").toUpperCase(), request.getParameter("cognome").toUpperCase());
			session.setAttribute("studenteForm", studenteForm);
			nextPage="/risposta.jsp";
		}
		//Se non corretto
		else {
			nextPage="/newStudente.jsp";
		}
		
		//Encode URL per browser che non gestisce i cookie
		response.encodeURL(nextPage);
		
		ServletContext application = getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher(nextPage);
		
		rd.forward(request, response);
		return;
	}
}