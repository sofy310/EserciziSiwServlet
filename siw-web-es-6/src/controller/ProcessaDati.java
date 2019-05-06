package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*WebServlet si usa per modificare il valore di default
 * dell'url associato a un servlet*/
@WebServlet("/processaDati")
/*Un servlet è una classe Java che estende HttpServlet, e quindi
 * eredita metodi per la gestione delle richieste.*/
public class ProcessaDati extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	/*Gestione della richiesta*/
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*Leggo i parametri e li metto al maiuscolo*/
		String nome = request.getParameter("nome").toUpperCase();
		String cognome = request.getParameter("cognome").toUpperCase();
		
		/*Leggo alcune intestazioni http della richiesta*/
		String address = (String)request.getRemoteAddr();
		String host = (String)request.getRemoteHost();
		String userAgent = (String)request.getHeader("User-Agent");
		
		/*Aggiungo attributi con metodi (chiave, valore)*/
		request.setAttribute("nome", nome);
		request.setAttribute("cognome", cognome);
		request.setAttribute("address", address);
		request.setAttribute("userAgent", userAgent);
		request.setAttribute("host", host);

		/*l'oggetto di tipo ServletContext rappresenta l'applicazione Web
		 * Tutti i servlet hanno accesso al ServletContext tramite il metodo getServletContext()*/
		ServletContext application = getServletContext();
		
		/*chiedo di interagire con la servlet indicata*/
		RequestDispatcher rd = application.getRequestDispatcher("/risposta.jsp");
		
		/*delego alla servlet indicata prima*/
		rd.forward(request, response);
		return;
	}
	
}
