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
<title>Manuten��o de Usuarios</title>
</head>
<body>


	<h1 align="center">Manuten��o de Usuarios</h1>

	<div id="cadastro" align="center">
		<a href="cadastro.jsp" target="mainframe"><img
			src="imagens/cadastro.png"></a>

	</div>
	<div align="left">
		<button id="botao1">
			<a href="usuarios.jsp?ordenacao=crescente">Crescente</a>
		</button>
		<button id="botao2">
			<a href="usuarios.jsp?ordenacao=alfabetica">Alfab�tica</a>
		</button>
	</div>

	<table id="login" cellpadding="5">
		<tr class="cadastros" align="center">
			<th class="cadastros">C�digo</th>
			<th class="cadastros">Nome</th>
			<th class="cadastros">Senha</th>
			<th class="cadastros">Nivel de Acesso</th>
			<th class="cadastros">Alterar</th>
			<th class="cadastros">Excluir</th>
		</tr>

		<%
		try {
			//carregar o driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection(
			"jdbc:mysql://127.0.0.1:3306/javaweb?useTimezone=true&serverTimezone=UTC", "root", "57264544");

			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

			ResultSet rs = null;

			if (request.getParameter("acao") != null) {
				st.executeUpdate("delete from login where log_codigo = " + request.getParameter("codigo"));
			}

			if (request.getParameter("ordenacao") == null) {
				rs = st.executeQuery("select * from login");

			} else if (request.getParameter("ordenacao").equals("crescente")) {
				rs = st.executeQuery("select * from login order by log_codigo");

			} else if (request.getParameter("ordenacao").equals("alfabetica")) {
				rs = st.executeQuery("select * from login order by log_usuario");
			}

			while (rs.next()) {
		%>
		<tr align="center">
			<td class="cadastros"><%=rs.getString("log_codigo")%></td>
			<td class="cadastros"><%=rs.getString("log_usuario")%></td>
			<td class="cadastros"><%=rs.getString("log_senha")%></td>
			<td class="cadastros"><%=rs.getString("log_nivelacesso")%></td>
			<td class="cadastros"><img id="imagem1" src="imagens/alter.png"></td>
			<td class="cadastros"><a
				href="usuarios.jsp?acao=excluir&amp;codigo=<%=rs.getString("log_codigo")%>"><img
					id="imagem1" src="imagens/delete.png"></a></td>
		</tr>
		<%
		}
		} catch (ClassNotFoundException erroClass) {
		out.println("Classe Driver JDBC N�o foi Localizado, erro = " + erroClass);
		} catch (SQLException erroSQL) {
		out.println("Erro de conex�o com o Banco de dados, erro = " + erroSQL);
		}
		%>

	</table>

</body>
</html>