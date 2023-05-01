<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="resources/styles.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Manutenção de Usuarios</h1>

	<div id="cadastro" align="center">
		<img src="imagens/cadastro.png">
	</div>
	<div  align="left">
		<button id="botao1">Crescente</button>
		<button id="botao2">Decrescente</button>
	</div>

	<table id="cadastros" cellpadding="5">
		<tr align="center">
			<th>Código</th>
			<th>Nome</th>
			<th>Senha</th>
			<th>Nivel de Acesso</th>
			<th>Alterar</th>
			<th>Excluir</th>
		</tr>
		<tr align="center">
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td><img id="imagem1" src="imagens/delete.png"></td>
			<td><img id="imagem1" src="imagens/alter.png"></td>
		</tr>

	</table>

</body>
</html>