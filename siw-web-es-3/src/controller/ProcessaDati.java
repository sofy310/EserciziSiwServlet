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
	/*request e response sono due riferimenti a oggetti passati dal contenitore
	 * per gestire rispettivamente la richiesta e la risposta*/
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    /*ritorna il valore del parametro se il risultato esiste, altrimenti ritorna null*/
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
		/*consente la comunicazione tra gli oggetti del servlet e il contenitore
		 * consente di manipolalre oggetti condivisi accessibili da tutte le classi dell'app*/
		ServletContext application = getServletContext();
		
		/*riferimento all'altra classe*/
		/*grazie al RequestDispatcher siamo in grado di inoltrare
		 * richieste ad altri oggetti servlet*/
		RequestDispatcher rd = application.getRequestDispatcher("/risposta.jsp");
		
		/*inoltro della richiesta*/
		rd.forward(request, response);
		return;
	}
	
}
