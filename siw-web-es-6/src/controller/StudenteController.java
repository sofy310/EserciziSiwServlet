package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/studenteController")
public class StudenteController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws java.io.IOException, ServletException {
		
		/*Leggo i parametri*/
		String matricola = request.getParameter("matricola");
		String nome = request.getParameter("nome");
		String nextPage = "/studente.jsp";
		
		/*per verificare se almeno un campo non è corretto*/
		boolean campiCorretti = true; 
		
		Studente studente = new Studente(matricola, nome);
		request.setAttribute("studente", studente);
		
		if(matricola == null || matricola.contentEquals(" ")) {
			request.setAttribute("matricolaError", "La matricola non è valida!");
			campiCorretti = false;
		}
		
		if(nome == null || nome.contentEquals(" ")) {
			request.setAttribute("nomeError", "Il nome non è valido!");
			campiCorretti = false;
		}
		
		if(campiCorretti == false) {
			nextPage = "/newStudente.jsp";
		}
		
		ServletContext sc = this.getServletContext();
		
		RequestDispatcher rd = sc.getRequestDispatcher(nextPage);
		rd.forward(request, response);
		
		return;
		
	}
}
