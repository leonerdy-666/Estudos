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
<title>HTML Frames</title>
</head>
<FRAMESET COLS="10%, *">
	<FRAME SRC="esquerda.jsp">
	<FRAMESET ROWS="15%, 80%">
		<FRAME SRC="topo.jsp">
		<FRAME SRC="centro.jsp" name="mainframe">
	</FRAMESET>
</FRAMESET>
</html>