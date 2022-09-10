package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.UsuarioVO;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css\" integrity=\"sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./Estilos/StyleLogin.css\">\r\n");
      out.write("        <title>Iniciar Sesion</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div>\r\n");
      out.write("            \r\n");
      out.write("            <img src=\"IMG/Logo.png\" alt=\"Logo del sistemas\" class=\"imagen\"/>\r\n");
      out.write("            <div class=\"FormularioCont\">\r\n");
      out.write("                <h1 class=\"H1\">INICIAR SESIÓN</h1>\r\n");
      out.write("                <form class=\"Formulario\" method=\"post\" action=\"Usuario\">\r\n");
      out.write("                    \r\n");
      out.write("            <img src=\"IMG/./Logo.png\" alt=\"Logo del SI\" class=\"imagen\"/>\r\n");
      out.write("            <div class=\"FormularioCont\">\r\n");
      out.write("                <h1 class=\"H1\">INICIAR SESIÓN</h1>\r\n");
      out.write("                <form class=\"Formulario\" method=\"post\" action=\"\">\r\n");
      out.write("                    <input class=\"emailtxt\" type=\"text\" name=\"textUsuario\" placeholder=\"  Correo Electronico\" required>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <input class=\"passwordtxt\" type=\"password\" name=\"textClave\" placeholder=\"  Clave\" required>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <button type=\"submit\" class=\"buttonbtn\">INGRESAR</button>\r\n");
      out.write("                    <input type=\"hidden\" value=\"4\" name=\"opcion\">\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <p><a href=registrarUsuario.jsp class=\"Texto1\">Registrarse</a><a href=\"ConsultarUsuario.jsp\" class=\"Texto2\">¿Contraseña olvidada?</a></p>\r\n");
      out.write("                    <p><a href=registrarUsuario.jsp class=\"Texto1\">Registrarse</a><a href=\"ConsultarUsuario.jsp\" class=\"Texto2\">¿Clave olvidada?</a></p>\r\n");
      out.write("                    <br>\r\n");
      out.write("                </form>\r\n");
      out.write("                ");
if (request.getAttribute("mensajeError") != null) {
      out.write("\r\n");
      out.write("                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                ");
 } else {
      out.write("\r\n");
      out.write("                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                ");
}
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
