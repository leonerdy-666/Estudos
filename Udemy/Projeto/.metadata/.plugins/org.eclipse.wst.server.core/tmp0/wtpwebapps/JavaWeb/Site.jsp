<%@page import="com.mysql.cj.protocol.Resultset"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Statement"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Site</title>
</head>
<body>

	<%
	try {
		//carregar o driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection(
		"jdbc:mysql://127.0.0.1:3306/javaweb?useTimezone=true&serverTimezone=UTC", "root", "57264544");

		if (request.getParameter("txtUsuario") != null) {

			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

			ResultSet rs = st.executeQuery("SELECT * FROM login where log_usuario = '" + request.getParameter("txtUsuario")
			+ "' and log_senha = '" + request.getParameter("txtSenha") + "'");

			if (rs.next()) {
		response.sendRedirect("index.jsp");
			} else {
		out.println("Sem acesso");
			}

		}

		/* while (rs.next())            
			out.println("usuario igual " + rs.getString("log_usuario")); */

	} catch (ClassNotFoundException erroClass) {
		out.println("Classe Driver JDBC Não foi Localizado, erro = " + erroClass);
	} catch (SQLException erroSQL) {
		out.println("Erro de conexão com o Banco de dados, erro = " + erroSQL);
	}
	%>


	<form action="">
		<table cellpadding="5" align="center">

			<tr>
				<td align="center"><img src="imagens/logo.png"></td>
			</tr>

			<tr>
				<td align="center">Usuário</td>
			</tr>
			<tr>
				<td><input type="text" name="txtUsuario" /></td>
			</tr>
			<tr>
			<tr>
				<td align="center">Senha</td>
			</tr>
			<tr>
				<td><input type="password" name="txtSenha" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="reset"> <input
					type="submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>