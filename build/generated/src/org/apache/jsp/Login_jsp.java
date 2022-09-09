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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("    <head>\r\n");
      out.write("             \r\n");
      out.write("              <link href=\"Estilos/estilos2.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("\r\n");
      out.write("        <title>Login</title>\r\n");
      out.write("<!-- CSS only -->\r\n");
      out.write("    </head>\r\n");
      out.write("    <center>\r\n");
      out.write("         <div class=\"contenedor\">      \r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"limiter\">\r\n");
      out.write("            <div class=\"container-login100\" style=\"background-image: url('./IMG/bg-01.jpg');\">\r\n");
      out.write("                <div class=\"wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54\">\r\n");
      out.write("                    <form class=\"login100-form validate-form\" method=\"post\" action=\"Usuario\">\r\n");
      out.write("                        <span class=\"login100-form-title p-b-49\">\r\n");
      out.write("                            <br><br>\r\n");
      out.write("                            Iniciar Sesión<br><br>\r\n");
      out.write("                        </span>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"wrap-input100 validate-input m-b-23\" data-validate = \"Usuario Obligatorio\">\r\n");
      out.write("                            <span class=\"label-input100\">Usuario</span>\r\n");
      out.write("                            <input class=\"input100\" type=\"text\" name=\"textUsuario\" placeholder=\"Ingresar Usuario\" required>\r\n");
      out.write("                            <span class=\"focus-input100\" data-symbol=\"&#xf206;\"></span>\r\n");
      out.write("                        </div><br><br>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"wrap-input100 validate-input\" data-validate=\"Contraseña Obligatorio\">\r\n");
      out.write("                            <span class=\"label-input100\">Contraseña</span>\r\n");
      out.write("                            <input class=\"input100\" type=\"password\" name=\"textClave\" placeholder=\"Ingresar Contraseña\" required>\r\n");
      out.write("                            <span class=\"focus-input100\" data-symbol=\"&#xf190;\"></span>\r\n");
      out.write("                        </div><br><br>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"text-right p-t-8 p-b-31\">\r\n");
      out.write("                            <a href=\"ConsultarUsuario.jsp\">\r\n");
      out.write("                                ¿Contraseña olvidada?\r\n");
      out.write("                            </a>\r\n");
      out.write("                            \r\n");
      out.write("                            <div class=\"text-right p-t-8 p-b-31\">\r\n");
      out.write("                                <a href=registrarUsuario.jsp>\r\n");
      out.write("                                Registrarse\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div><br><br>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"container-login100-form-btn\">\r\n");
      out.write("                            <div class=\"wrap-login100-form-btn\">\r\n");
      out.write("                                <div class=\"login100-form-bgbtn\"></div>\r\n");
      out.write("                                <button type=\"submit\" class=\"login100-form-btn\">\r\n");
      out.write("                                    Ingresar\r\n");
      out.write("                                </button>\r\n");
      out.write("                                <input type=\"hidden\" value=\"4\" name=\"opcion\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write(" ");


                        if (request.getAttribute("mensajeError") != null) {
      out.write("\r\n");
      out.write("                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                    ");
 } else {
      out.write("\r\n");
      out.write("                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                    ");
}
      out.write("\r\n");
      out.write("                    </form>\r\n");
      out.write("                   \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div id=\"dropDownSelect1\"></div>\r\n");
      out.write("        </center>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
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
