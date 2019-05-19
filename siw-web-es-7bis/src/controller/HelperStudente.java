package controller;

import javax.servlet.http.HttpServletRequest;

public class HelperStudente {

	
	public boolean isValid(HttpServletRequest request) {
		boolean tuttoOK = true;
		
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		String matricola = request.getParameter("matricola");
		
		String messaggioErrore = "Non hai inserito correttamente questo campo.";
		
		if(nome.equals("")) {
			tuttoOK = false;
			request.setAttribute("nomeErrore", messaggioErrore);
		}
		
		if(cognome.equals("")) {
			tuttoOK = false;
			request.setAttribute("cognomeErrore", messaggioErrore);
		}		
		
		if(matricola.equals("")) {
			tuttoOK = false;
			request.setAttribute("matricolaErrore", messaggioErrore);
		}

		return tuttoOK;
	}
}
