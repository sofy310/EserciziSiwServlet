package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*questa classe gestisce la richiesta che ci arriva per gestire i dati di uno Studente*/

@WebServlet("/studenteController")
public class StudenteController extends HttpServlet {

	/*i due parametri http che mi arrivano devono essere diversi dalla stringa vuota
	 * se uno dei due è vuoto, il controller aggiunge nella richiesta un attributo 
	 * che riporta un messaggio di errore*/
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		
		String nome = request.getParameter("nome").trim(); //trim rimuove tutti gli spazi bianchi
		/*quando l'utente inserisce uno spazio all'inizio o alla fine trim li rimuove*/
		String cognome = request.getParameter("cognome").trim();
		
		
		boolean ciSonoErrori = false;
		
		
		String nextPage; //qual è la prossima pagina
		
		/*se la stringa nome è vuota*/
		if(nome.equals("")) {
			String messaggio = "Campo nome obbligatorio"; //voglio far arrivare questa stringa alla pagina JSP
			request.setAttribute("nomeErr", messaggio);
			ciSonoErrori = true;
		}
		
		/*se la stringa cognome è vuota*/
		if(cognome.equals("")) {
			String messaggio = "Campo cognome obbligatorio"; //voglio far arrivare questa stringa alla pagina JSP
			request.setAttribute("cognomeErr", messaggio);
			ciSonoErrori = true;
		}
		
		/*prossima pagina*/
		if(ciSonoErrori) {
			nextPage = "/newStudente.jsp";	 //torna alla form		
		}
		else {
			nextPage = "/risposta.jsp";   //vai alla risposta
			request.setAttribute("nome",nome.toUpperCase());
			request.setAttribute("cognome", cognome.toUpperCase());
		};
		
		ServletContext sc = getServletContext();
		RequestDispatcher rd = sc.getRequestDispatcher(nextPage);
		rd.forward(request, response);
		return;
	}
}
