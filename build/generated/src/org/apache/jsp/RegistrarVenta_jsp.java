package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegistrarVenta_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("        <title>Ventas</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>Registrar Venta</h1>\r\n");
      out.write("        <form method=\"post\" action=\"Cliente\">\r\n");
      out.write("             <div class=\"d-flex\">\r\n");
      out.write("            <div class=\"col-sm-4\">\r\n");
      out.write("                <div class=\"card\">\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label>Datos del Cliente</label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group d-flex\">\r\n");
      out.write("                            <div class=\"col-sm-6 d-flex\">\r\n");
      out.write("                             <input type=\"text\" name=\"TextNumDoc\" class=\"form-control\" placeholder=\"No de documento\">\r\n");
      out.write("                             <input type=\"submit\"  value=\"buscar\" class=\"btn btn-outline-info\">\r\n");
      out.write("                            <input type=\"hidden\" value=\"3\" name=\"opcion\">\r\n");
      out.write("                             </div>\r\n");
      out.write("                            <div class=\"col-sm-8\">\r\n");
      out.write("                                 <input type=\"text\" name=\"TextNombre\" class=\"form-control col-sm-4\"\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("       \r\n");
      out.write("            \r\n");
      out.write("      \r\n");
      out.write("            </form>\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label>Datos Producto</label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group d-flex\">\r\n");
      out.write("                             <div class=\"col-sm-6 d-flex\">\r\n");
      out.write("                             <input type=\"text\" name=\"txtcodigoB\" class=\"form-control\" placeholder=\"No de documento\">\r\n");
      out.write("                             <input type=\"submit\"  value=\"buscar\" class=\"btn btn-outline-info\">\r\n");
      out.write("                            <input type=\"hidden\" value=\"3\" name=\"opcion\">\r\n");
      out.write("                              \r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-sm-8\">\r\n");
      out.write("                                 <input type=\"text\" name=\"TextNombre\" class=\"form-control col-sm-4\"\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\"></div>\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("           \r\n");
      out.write("            <div class=\"col-sm-8\">\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("             \r\n");
      out.write("                         \r\n");
      out.write("                        \r\n");
      out.write("        \r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
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
