<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inserisci studente</title>
</head>
<body>
<form method = "get" action = "studenteController">

	<p>
	<!--  ${param["nomeParametro"]} corrisponde a request.getParameter("nomeParametro") -->
	Nome: <input type="text" name="nome" value="${param["nome"]}"/>	
	${nomeErrore}
	</p>
	
	<p>
	Cognome: <input type = "text" name = "cognome" value = "${param["cognome"]}"/>	
	${cognomeErrore}
	</p>
	
	<p>
	Matricola: <input type = "text" name = "matricola" value = "${param["matricola"]}"/>
	${matricolaErrore}
	</p>
	
	<p>
	<input type = "submit" name = "inviaDati" value = "Invia"/>
	</p>
	
</form>
</body>
</html>