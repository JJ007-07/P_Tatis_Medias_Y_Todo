package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Util.ConexionDB;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.util.ArrayList;
import ModeloVO.PedidoVO;
import ModeloDAO.PedidoDAO;

public final class consultarDP_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\r\n");
      out.write("    <center>  <h1> consultar detalle Pedido</h1></center>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("       \r\n");
      out.write("        <title>Detalle Pedido consultar</title>\r\n");
      out.write("        <body>\r\n");
      out.write("   <form method=\"post\" action=\"DetallePedido\">\r\n");
      out.write("  \r\n");
      out.write("       <table>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th> Id detalle pedido FK\r\n");
      out.write("                        <input type=\"number\" name=\"textIdPedidoFK\" >\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-success btn-lg mb-1\" class=\"btn float-right login_btn\" onclick=\"return confirm('¿Estas seguro de  consultar el detalle pedido ?')\">Consultar Detalle Pedido</button>\r\n");
      out.write("                    </th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                 \r\n");
      out.write("             \r\n");
      out.write("            </table><br><br>\r\n");
      out.write("            <input type=\"hidden\"value=\"4\"  name=\"opcion\">\r\n");
      out.write("            <a href=\"DatosDP.jsp\">Consulta General</a>\r\n");
      out.write("             <a href=\"ModalDP.jsp\">Consulta Id Disponibles</a>\r\n");
      out.write("        \r\n");
      out.write("          \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("        </form><br><br>\r\n");
      out.write("        ");
 if (request.getAttribute("MensajeError")  !=null) {
      out.write("\r\n");
      out.write("         ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" \r\n");
      out.write("           ");
  }  else {
      out.write("\r\n");
      out.write("                   ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                   ");
}
      out.write("<br><br>\r\n");
      out.write("                   \r\n");
      out.write("                   <form><center>\r\n");
      out.write("                       \r\n");
      out.write("             \r\n");
      out.write("</head>\r\n");
      out.write("</body>\r\n");
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
