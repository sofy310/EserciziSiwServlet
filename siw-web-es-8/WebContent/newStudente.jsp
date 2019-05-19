  
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="studenteController" method="get">
	<div>
	<!--  ${param["nomeParametro"]} corrisponde a request.getParameter("nomeParametro") -->
	Nome: <input type="text" name="nome" value="${param["nome"]}"/>
	${NomeErrore}
	</div>
	<div>
	Cognome: <input type="text" name="cognome" value="${param["cognome"]}"/>
	${CognomeErrore}
	</div>

	
	<div>
	<input type ="submit" name="submit" value="invia"/>
	</div>
	</form>

</body>
</html>