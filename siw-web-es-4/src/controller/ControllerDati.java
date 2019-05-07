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

@WebServlet("/controllerDati")
public class ControllerDati extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/*gestione della richiesta*/
	protected void doGet (HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{
		
		/*leggo e manipolo i parametri*/
		String nome = request.getParameter("nome").toUpperCase();
		String cognome = request.getParameter("cognome").toUpperCase();
		
		/*Metto i valori nella sessione*/
		HttpSession session = request.getSession();
		session.setAttribute("NOME", nome);
		session.setAttribute("COGNOME", cognome);
		
		ServletContext sc = getServletContext();
		RequestDispatcher rd = sc.getRequestDispatcher("/confermaDati");
		rd.forward(request, response);
		
		return;
	}

}
