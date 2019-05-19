<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>
	I dati che hai inserito sono i seguenti.
	</p>
	<p>
	Matricola:${studente.getMatricola()}
	</p>
	<p>
	Nome:${studente.getNome()}
	</p>
	<p>
	Cognome:${studente.getCognome()}
	</p>
</body>
</html>