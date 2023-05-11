<%@page import="com.mysql.cj.protocol.Resultset"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Statement"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="resources/styles.css">
<meta charset="ISO-8859-1">
<title>Cadastro</title>
</head>
<body>
	<h1 align="center">Cadastro de Usuarios</h1>

	<form id="frmCadastro" action="cadastro.jsp?acao=gravar" method="post" >

		<table align="center">
			<tr>
				<td><p align="center">Código</p> <input type="number" name="codigoUsuario" /></td>
				<td><p align="center">Nome</p> <input type="text" name="nomeUsuario" /></td>
				<td><p align="center">Senha</p> <input type="password" name="senhaUsuario" /></td>
				<td><p align="center">nivel de Acesso</p> <input type="number"
					name="nivelUsuario" /></td>
			</tr>
			<tr>
				<td colspan="2" align="right"><input class="botoesCadastro"
					type="submit"></td>
				<td colspan="2" align="left"><input class="botoesCadastro"
					type="reset"></td>
			</tr>
		</table>
	</form>

</body>
</html>