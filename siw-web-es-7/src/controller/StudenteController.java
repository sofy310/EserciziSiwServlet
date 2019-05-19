package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Studente;

@WebServlet("/studenteController")
public class StudenteController extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException{
		
		
		/*Leggo i parametri dalla richiesta*/
		String matricola = request.getParameter("matricola").toUpperCase();
		String nome = request.getParameter("nome").toUpperCase();
		String cognome = request.getParameter("cognome").toUpperCase();
		
		String nextPage = "/risposta.jsp";
		
		boolean ciSonoErrori = false;
		
		Studente studente = new Studente(nome, cognome, matricola);
		request.setAttribute("studente", studente);

		
		if(matricola.equals("")) {
			ciSonoErrori = true;
			request.setAttribute("matricolaErrore", "La matricola inserita non è valida!");
		}
		
		if(nome.equals("")) {
			ciSonoErrori = true;
			request.setAttribute("nomeErrore", "Il nome inserito non è valido!");
		}
		
		if(cognome.equals("")) {
			ciSonoErrori = true;
			request.setAttribute("cognomeErrore", "Il cognome inserito non è valido!");
		}
		
		if(ciSonoErrori) {
			nextPage = "/newStudente.jsp";
		}
		
		ServletContext application = this.getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher(nextPage);
		rd.forward(request, response);
		return;
	}

}
