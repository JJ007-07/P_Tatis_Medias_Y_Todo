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
      out.write("        <link href=\"./Estilos/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"./Estilos/floating-labels.css\" rel=\"stylesheet\">\r\n");
      out.write("      \r\n");
      out.write("           <link href=\"Estilos/CheckPassword.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <title>Iniciar Sesion</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <form class=\"form-signin\" method=\"post\" action=\"Usuario\">\r\n");
      out.write("            <div class=\"text-center mb-4\">\r\n");
      out.write("                <img class=\"mb-4\" src=\"./IMG/Log.svg\" alt=\"\" width=\"200\" height=\"200\">\r\n");
      out.write("                <h1 class=\"h3 mb-3 font-weight-normal\">Iniciar Sesión</h1>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-label-group\">\r\n");
      out.write("                <input type=\"email\" name=\"textUsuario\" id=\"inputEmail\" class=\"form-control\" placeholder=\"Email address\" required>\r\n");
      out.write("                <label for=\"inputEmail\">Correo Electronico</label>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-label-group\">\r\n");
      out.write("          \r\n");
      out.write("                <input type=\"password\" name=\"textClave\" id=\"inputPassword\" class=\"form-control password1\" placeholder=\"Password\" required >\r\n");
      out.write("               \r\n");
      out.write("                <label for=\"inputPassword\">Contraseña</label>\r\n");
      out.write("                       <span class=\"fa fa-fw fa-eye password-icon show-password\"></span>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"checkbox mb-3\">\r\n");
      out.write("                <label>\r\n");
      out.write("                    <input type=\"checkbox\" value=\"remember-me\"> Recordarme\r\n");
      out.write("                </label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <button type=\"submit\" class=\"btn btn-lg btn-primary btn-block\">INGRESAR</button>\r\n");
      out.write("            <input type=\"hidden\" value=\"4\" name=\"opcion\">\r\n");
      out.write("            <p style=\"float: left;\"><a href=registrarUsuario.jsp class=\"Texto1\">Registrarse</a></p>\r\n");
      out.write("            <p style=\"float: right;\"><a href=\"#\" class=\"Texto2\">¿Clave olvidada?</a></p>\r\n");
      out.write("            <p class=\"mt-5 mb-3 text-muted text-center\">&copy; Tatis Medias & Todo</p>\r\n");
      out.write("        </form>\r\n");
      out.write("        ");
if (request.getAttribute("mensajeError") != null) {
      out.write("\r\n");
      out.write("        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("        ");
 } else {
      out.write("\r\n");
      out.write("        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("        ");
}
      out.write("\r\n");
      out.write("               <script>\r\n");
      out.write("  window.addEventListener(\"load\", function() {\r\n");
      out.write(" \r\n");
      out.write("    // icono para poder interaccionar con el elemento\r\n");
      out.write("    showPassword = document.querySelector('.show-password');\r\n");
      out.write("    showPassword.addEventListener('click', () => {\r\n");
      out.write(" \r\n");
      out.write("      // elementos input de tipo password\r\n");
      out.write("      password1 = document.querySelector('.password1');\r\n");
      out.write("  \r\n");
      out.write(" \r\n");
      out.write("      if ( password1.type === \"text\" ) {\r\n");
      out.write("        password1.type = \"password\"\r\n");
      out.write("        \r\n");
      out.write("        showPassword.classList.remove('fa-eye-slash');\r\n");
      out.write("      } else {\r\n");
      out.write("        password1.type = \"text\"\r\n");
      out.write("       \r\n");
      out.write("        showPassword.classList.toggle(\"fa-eye-slash\");\r\n");
      out.write("      }\r\n");
      out.write("  })\r\n");
      out.write("});\r\n");
      out.write("</script> \r\n");
      out.write("<script src=\"https://kit.fontawesome.com/2c36e9b7b1.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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
