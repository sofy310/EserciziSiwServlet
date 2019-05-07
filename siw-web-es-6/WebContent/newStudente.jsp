<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inserimento Studente</title>
</head>
<body>
	<form method = "get" action = "studenteController">
		<p>Matricola <input type = "text" name = "matricola"
		value = "$(studente.matricola)" />
		</p>
		<p>Nome <input type = "text" name = "nome"
		value = "$(studente.nome)"/>
		</p>
		
		<input type = "reset" value = "Reimposta" />
		<input type = "submit" name = "InviaDati" value = "Invia" />
		
	
	
	</form>
</body>
</html>