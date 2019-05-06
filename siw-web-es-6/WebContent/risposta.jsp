<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<body>
		<p>
			Nome: <% out.println(request.getAttribute("nome")); %>
		</p>
		<p>
			Cognome: <% out.println(request.getAttribute("cognome")); %>
		</p>
	</body>
</html>