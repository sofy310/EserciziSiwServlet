package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/mostraDati")
	public class MostraDati extends HttpServlet {
	
			private static final long serialVersionUID = 1L;
	
			protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
		
				HttpSession session = request.getSession();
				// preparo il tipo (HTML)
				
				response.setContentType("text/html");
	
				
				// preparo un oggetto su cui scrivere la risposta
				PrintWriter out = response.getWriter();
	
				// scrivo il corpo
				out.println("<!DOCTYPE html>"); out.println("<html>");
				out.println("<head>");
				out.println("<meta charset=\"ISO-8859-1\" />");
				out.println("<title>Dati confermati</title>");
				out.println("</head>");
				out.println("<body>");
				out.println("<h1>Hai confermato i seguenti dati</h1>");
				out.println("<ul>");
				out.println("<li>Nome: <b>" + session.getAttribute("NOME") + "</b></li>");
				out.println("<li>Cognome: <b>" + session.getAttribute("COGNOME") + "</b></li>");
				out.println("</ul>");
				out.println("</body>\n</html> ");
	}
}