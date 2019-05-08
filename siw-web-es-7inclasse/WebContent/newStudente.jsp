<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" href="CSS/style.css"/>
	</head>
	<body>
		<form action = "studenteController" method = "post">
			<div>
				Nome: <input type = "text" name = "nome" value ="${nome}"/>
				<span class="error">${nomeErr}</span>
			</div>
			<div>
				Cognome: <input type = "text" name = "cognome" value ="${cognome}"/>
				<span class="error">${cognomeErr}</span>
			</div>
			<div>
				<input type = "submit" value = "Invia"/>
			</div>
		</form>
	</body>
</html>