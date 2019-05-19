<%@ page import="model.Studente" %>
<!DOCTYPE html>
<html>
<body>
	<p>
	Questi sono i dati che hai inserito:
	</p>
	<p>
	Nome: ${studente.nome}
	</p>
	
	<p>
	Cognome: ${studente.cognome}
	</p>
	
	<p>
	Matricola: ${studente.matricola}
	</p>
	
	<p> 
	Sei sicuro di voler inviare questi dati?
	</p>

	<a href="<%out.print(response.encodeURL("confermaController"));%>">Conferma Definitiva</a>	

</body>
</html>