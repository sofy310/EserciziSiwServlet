<%@ page import="model.Studente" %>
<!DOCTYPE html>
<html>
<body>
	
	<p>
	Hai inserito questi dati
	Nome: ${studenteForm.nome}
	</p>
	<p>
	Cognome: ${studenteForm.cognome}
	</p>

	<p>
	Sei sicuro di voler procedere con questi dati?</p>
	<a href="<%out.print(response.encodeURL("confermaController"));%>">Conferma Definitiva</a>

</body>
</html>