<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<%
String usuario = request.getParameter("txtUsuario");
String senha = request.getParameter("txtSenha");

if (usuario.equals("gustavo"))
	if (senha.equals("1234"))
		out.println("<h1>Olá " +usuario+","+" seja bem-vindo </h1>");
	else
		out.println("<h1> Senha Inválida</h1>");
else 
	out.println("<h1> Usuário Inválido</h1>");
		
%>

</body>
</html>