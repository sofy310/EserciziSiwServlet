
package controller;

import javax.servlet.http.HttpServletRequest;

public class HelperStudente {
	
	public boolean isValid(HttpServletRequest request) {
		
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		String messaggio = "Parametro mancante nella form";
		
		boolean corretto= true;
		
		if(nome.isEmpty()) {
			request.setAttribute("NomeErrore", messaggio);
			corretto=false;
		}
		if(cognome.isEmpty()) {
			request.setAttribute("CognomeErrore", messaggio);
			corretto=false;
		}

		
		return corretto;
	}

}