/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.74
 * Generated at: 2023-05-11 14:00:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.mysql.cj.protocol.Resultset;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public final class usuarios_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.mysql.cj.protocol.Resultset");
    _jspx_imports_classes.add("java.sql.SQLException");
    _jspx_imports_classes.add("java.sql.Connection");
    _jspx_imports_classes.add("java.sql.ResultSet");
    _jspx_imports_classes.add("java.sql.Statement");
    _jspx_imports_classes.add("java.sql.DriverManager");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"resources/styles.css\">\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<h1 align=\"center\">Manutenção de Usuarios</h1>\r\n");
      out.write("\r\n");
      out.write("	<div id=\"cadastro\" align=\"center\">\r\n");
      out.write("		<img src=\"imagens/cadastro.png\">\r\n");
      out.write("	</div>\r\n");
      out.write("	<div align=\"left\">\r\n");
      out.write("		<button id=\"botao1\">\r\n");
      out.write("			<a href=\"usuarios.jsp?ordenacao=crescente\">Crescente</a>\r\n");
      out.write("		</button>\r\n");
      out.write("		<button id=\"botao2\">\r\n");
      out.write("			<a href=\"usuarios.jsp?ordenacao=alfabetica\">Alfabética</a>\r\n");
      out.write("		</button>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<table id=\"cadastros\" cellpadding=\"5\">\r\n");
      out.write("		<tr align=\"center\">\r\n");
      out.write("			<th>Código</th>\r\n");
      out.write("			<th>Nome</th>\r\n");
      out.write("			<th>Senha</th>\r\n");
      out.write("			<th>Nivel de Acesso</th>\r\n");
      out.write("			<th>Alterar</th>\r\n");
      out.write("			<th>Excluir</th>\r\n");
      out.write("		</tr>\r\n");
      out.write("\r\n");
      out.write("		");

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
		
      out.write("\r\n");
      out.write("		<tr align=\"center\">\r\n");
      out.write("			<td>");
      out.print(rs.getString("log_codigo"));
      out.write("</td>\r\n");
      out.write("			<td>");
      out.print(rs.getString("log_usuario"));
      out.write("</td>\r\n");
      out.write("			<td>");
      out.print(rs.getString("log_senha"));
      out.write("</td>\r\n");
      out.write("			<td>");
      out.print(rs.getString("log_nivelacesso"));
      out.write("</td>\r\n");
      out.write("			<td><img id=\"imagem1\" src=\"imagens/alter.png\"></td>\r\n");
      out.write("			<td><a\r\n");
      out.write("				href=\"usuarios.jsp?acao=excluir&amp;codigo=");
      out.print(rs.getString("log_codigo"));
      out.write("\"><img\r\n");
      out.write("					id=\"imagem1\" src=\"imagens/delete.png\"></a></td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		");

		}
		} catch (ClassNotFoundException erroClass) {
		out.println("Classe Driver JDBC Não foi Localizado, erro = " + erroClass);
		} catch (SQLException erroSQL) {
		out.println("Erro de conexão com o Banco de dados, erro = " + erroSQL);
		}
		
      out.write("\r\n");
      out.write("\r\n");
      out.write("	</table>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
