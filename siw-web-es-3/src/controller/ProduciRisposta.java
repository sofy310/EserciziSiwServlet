package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/produciRisposta")
public class ProduciRisposta extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
					throws ServletException, IOException {
		
		String nome = (String)request.getAttribute("nome");
		String cognome = (String) request.getAttribute("cognome");
		String address = (String) request.getAttribute("address");
		String userAgent = (String) request.getAttribute("userAgent");
		String host = (String) request.getAttribute("host");
		
		/*GESIONE DELLA RISPOSTA
		 * Un'intestazione fondamentale è quella che specifica il tipo di contenuto della risposta (HTML). 
		 *Questa intestazione si specifica con il metodo void setContent(String contentType)*/
		response.setContentType("text/html");
		
		/*creo un oggetto su cui scrivere la risposta 
		 * questo metodo è fornito dall'oggetto responsabile della risposta */
		PrintWriter out = response.getWriter();
		
		/*scrivo il corpo*/
	    out.println("<!DOCTYPE html>"); 
	    out.println("<html>");
	    out.println("<head>");
    	out.println("<meta charset=\"ISO-8859-1\" />");
    	out.println("<title>mostra parametri</title>");
    	out.println("</head>");
    	out.println("<body>");
    	out.println("<h1>Dati inseriti nella form iscrizione</h1>");
    	out.println("<ul>");
    	out.println("<li>Nome: <b>"+nome+"</b></li>");
    	out.println("<li>Cognome: <b>"+cognome+"</b></li>");
    	out.println("</ul>");
    	out.println("<h1>Altri dati relativi alla richiesta</h1>");
    	out.println("<br />IP: <b>"+address+"</b>");
    	out.println("<br />Host: <b>"+host+"</b>");
    	out.println("<br />User Agent: <b>"+userAgent+"</b>");
    	out.println("</body>\n</html> ");
	}

}
