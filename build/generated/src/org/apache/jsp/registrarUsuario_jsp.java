package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloDAO.RolDAO;
import ModeloVO.RolVO;

public final class registrarUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registro usuario</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/CheckPassword.js\" type=\"text/javascript\"></script>\n");
      out.write("    <link href=\"Estilos/CheckPassword.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    \n");
      out.write("</head>\n");
      out.write("  \n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <form id=\"form1\" method=\"post\" action=\"Usuario\">\n");
      out.write("        <div class=\"container py-3\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">            \n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6 mx-auto\">\n");
      out.write("                            <div class=\"card border-secondary\">\n");
      out.write("                                <div class=\"card-header\">\n");
      out.write("                                    <h3 class=\"mb-0 my-2\">Registrarse</h3>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Correo</label>\n");
      out.write("                                        <div class=\"input-group\">\n");
      out.write("                                            <div class=\"input-group-prepend\">\n");
      out.write("                                                <span class=\"input-group-text\"><i class=\"fa fa-user\"></i></span>\n");
      out.write("                                            </div>\n");
      out.write("                                            \n");
      out.write("\n");
      out.write("                                            <input ID=\"txtEmail\"  name=\"textUsuario\" required Class=\"form-control\" type=\"Email\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                   \n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label >Contraseña</label>\n");
      out.write("\n");
      out.write("                                        <div class=\"input-group\">\n");
      out.write("                                            \n");
      out.write("                                            <div class=\"input-group-prepend\">\n");
      out.write("                                                <span class=\"input-group-text\"><i class=\"fa fa-lock\"></i></span>\n");
      out.write("                                            </div>\n");
      out.write("                                            <input ID=\"txtPassword\" name=\"textClave\" required type=\"Password\" class=\"form-control password1\" placeholder=\"\"/>      \n");
      out.write("                                            \n");
      out.write("                                        </div>\n");
      out.write("                                        <span class=\"fa fa-fw fa-eye password-icon show-password\"></span>\n");
      out.write("                                        <div id=\"strengthMessage\"></div>\n");
      out.write("                                        <script>\n");
      out.write("  window.addEventListener(\"load\", function() {\n");
      out.write(" \n");
      out.write("    // icono para poder interaccionar con el elemento\n");
      out.write("    showPassword = document.querySelector('.show-password');\n");
      out.write("    showPassword.addEventListener('click', () => {\n");
      out.write(" \n");
      out.write("      // elementos input de tipo password\n");
      out.write("      password1 = document.querySelector('.password1');\n");
      out.write("  \n");
      out.write(" \n");
      out.write("      if ( password1.type === \"text\" ) {\n");
      out.write("        password1.type = \"password\"\n");
      out.write("        \n");
      out.write("        showPassword.classList.remove('fa-eye-slash');\n");
      out.write("      } else {\n");
      out.write("        password1.type = \"text\"\n");
      out.write("       \n");
      out.write("        showPassword.classList.toggle(\"fa-eye-slash\");\n");
      out.write("      }\n");
      out.write("  })\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("                                        \n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Estado</label>\n");
      out.write("                                        <div class=\"input-group\">\n");
      out.write("                                            <div class=\"input-group-prepend\">\n");
      out.write("                                                <span class=\"input-group-text\"><i class=\" fa fa-user\"></i></span>\n");
      out.write("                                            </div>\n");
      out.write("                                            <input ID=\"txtEstado\" name=\"textEstado\" required type=\"text\" Class=\"form-control\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input type=\"hidden\" value=\"1\" name=\"opcion\" >\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-success float-right rounded-0\" >Registrarse</button>\n");
      out.write("                                    </div>\n");
      out.write("                                     ");
 
                                         if(request.getAttribute("MensajeError") !=null) {
      out.write("\n");
      out.write("                                         ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("           \n");
      out.write("               \n");
      out.write("                                         ");
}else {
      out.write("\n");
      out.write("                                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("  \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("                         \n");
      out.write("                                        \n");
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
