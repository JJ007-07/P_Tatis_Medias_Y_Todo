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
      out.write("    <script src=\"CheckPassword.js\"></script>\n");
      out.write("    <link href=\"CheckPassword.css\" rel=\"stylesheet\" />\n");
      out.write("    <!--Bootsrap 4 CDN-->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("    \n");
      out.write("    <!--Fontawesome CDN-->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.3.1/css/all.css\" integrity=\"sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("\t<!--Custom styles-->\n");
      out.write("      \n");
      out.write("      <link href=\"Estilos/estilos2.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("</head>\n");
      out.write("  \n");
      out.write("<center>\n");
      out.write("<body>\n");
      out.write("<form id=\"form1\">\n");
      out.write("        <div class=\"container py-3\">\n");
      out.write("            <h4 class=\"text-center text-uppercase\">estradawebgroup.com</h4>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">            \n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6 mx-auto\">\n");
      out.write("                            <div class=\"card border-secondary\">\n");
      out.write("                                <div class=\"card-header\">\n");
      out.write("                                    <h3 class=\"mb-0 my-2\">Sign Up</h3>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Name</label>\n");
      out.write("                                        <div class=\"input-group\">\n");
      out.write("                                            <div class=\"input-group-prepend\">\n");
      out.write("                                                <span class=\"input-group-text\"><i class=\"fa fa-user\"></i></span>\n");
      out.write("                                            </div>\n");
      out.write("                                            <input ID=\"txtFirstName\" Class=\"form-control\" type=\"text\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Phone Number</label>\n");
      out.write("                                        <div class=\"input-group\">\n");
      out.write("                                            <div class=\"input-group-prepend\">\n");
      out.write("                                                <span class=\"input-group-text\"><i class=\"fa fa-phone\"></i></span>\n");
      out.write("                                            </div>\n");
      out.write("                                            <input ID=\"txtPhoneNumber\" Class=\"form-control\"  type=\"text\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Email</label>\n");
      out.write("                                        <div class=\"input-group\">\n");
      out.write("                                            <div class=\"input-group-prepend\">\n");
      out.write("                                                <span class=\"input-group-text\"><i class=\"fa fa-envelope\"></i></span>\n");
      out.write("                                            </div>\n");
      out.write("                                            <input ID=\"txtEmail\" Class=\"form-control\" type=\"text\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Password</label>\n");
      out.write("                                        <div class=\"input-group\">\n");
      out.write("                                            <div class=\"input-group-prepend\">\n");
      out.write("                                                <span class=\"input-group-text\"><i class=\"fa fa-lock\"></i></span>\n");
      out.write("                                            </div>\n");
      out.write("                                            <input ID=\"txtPassword\"  type=\"Password\" Class=\"form-control\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div id=\"strengthMessage\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Confirm Password</label>\n");
      out.write("                                        <div class=\"input-group\">\n");
      out.write("                                            <div class=\"input-group-prepend\">\n");
      out.write("                                                <span class=\"input-group-text\"><i class=\"fa fa-lock\"></i></span>\n");
      out.write("                                            </div>\n");
      out.write("                                            <input ID=\"txtConfirmPassword\" type=\"Password\" Class=\"form-control\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-success float-right rounded-0\">Register</button>\n");
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
