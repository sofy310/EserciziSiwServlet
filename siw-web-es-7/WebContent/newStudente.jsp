<!DOCTYPE html>
<html>
<title>Inerimento Studente</title>
<body>
	<form method = "get" action = "studenteController">
	<p>
	Matricola: <input type = "text" name = "matricola" vaLue = "${studente.matricola}"/>
	${matricolaErrore}
	</p>
	<p>
	Nome: <input type = "text" name = "nome" value = "${studente.nome}"/>
	${nomeErrore}
	</p>
	<p>
	Cognome: <input type = "text" name = "cognome" value = "${studente.cognome}"/>
	${cognomeErrore}
	</p>
	<p>
	<input type = "submit" name = "inviaDati" value = "Invia"/>
	</p>
	</form>
</body>
</html>