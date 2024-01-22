<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<h2>Entre com usuário e senha</h2>
	<form action="login.jsp" method="post">
		Usuário: <input type="text" name="txtUsuario" value="" size="8" />
		Senha: <input type="password" name="txtSenha" value="" size="6" /> <input
			type="submit" value="Enviar">
	</form>
</body>
</html>