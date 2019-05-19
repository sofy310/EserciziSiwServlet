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
import service.StudenteServices;

@WebServlet("/confermaController")
public class ConfermaController extends HttpServlet {

	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException{
		
		String nextPage = "/fine.jsp";
		HttpSession session = request.getSession();
		Studente studente = new Studente();
		StudenteForm studenteForm = (StudenteForm)session.getAttribute("studenteForm");
		
		StudenteServices studenteServices = new StudenteServices();
		studenteServices.salvaStudente(studente);
		
		
		ServletContext application = getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher("/fine.jsp");
		rd.forward(request, response);
		return;
	}
}
