package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.EmpresaProveedoraVO;
import ModeloDAO.EmpresaProveedoraDAO;

public final class registrarPedido_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <script src=\"js/validar.js\" ></script>\r\n");
      out.write("        </head>\r\n");
      out.write(" <body>\r\n");
      out.write("<center>\r\n");
      out.write("<h1>Registrar Pedido</h1>\r\n");
      out.write("<form method=\"post\" action=\"Pedido\"  onsubmit=\"return validar();\">\r\n");
      out.write("    <table>\r\n");
      out.write("   \r\n");
      out.write("    <tr> No.Factura<br>\r\n");
      out.write("    <input type=\"text\"  id=\"NumeroFacturaPedido\" name=\"txtNumeroFacturaPedido\" ><br>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>Fecha Pedido<br>\r\n");
      out.write("    <input type=\"date\"  id=\"FechaPedido\" name=\"txtFechaPedido\"><br>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>Fecha Recibido<br>\r\n");
      out.write("    <input type=\"date\" id=\"FechaRecibido\" name=\"txtFechaRecibido\"><br>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>Fecha Vencimiento pago<br>\r\n");
      out.write("    <input type=\"date\" id=\"FechaVencimientoPago\" name=\"txtFechaVencimientoPago\"><br>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>Id Empresa Proveedora<br>\r\n");
      out.write("   <select name=\"txtIdEmpresaProveedora\">\r\n");
      out.write("                        <option>Seleccione una opción</option>\r\n");
      out.write("                        ");

                            EmpresaProveedoraDAO epDAO = new EmpresaProveedoraDAO();
                            for(EmpresaProveedoraVO epVO : epDAO.Listar()) {
                         
      out.write("\r\n");
      out.write("                         <option value=\"");
      out.print(epVO.getIdEmpresaProveedora());
      out.write('"');
      out.write('>');
      out.print(epVO.getRazonSocialEmpresaProveedora());
      out.write("</option>\r\n");
      out.write("                                 \r\n");
      out.write("                                 \r\n");
      out.write("                          ");
}
      out.write("       \r\n");
      out.write("           </tr><br>\r\n");
      out.write("    <tr>IVA<br>\r\n");
      out.write("    <input type=\"number\" id=\"IVA\" name=\"txtIVA\"><br>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>Descuento <br>\r\n");
      out.write("   <input type=\"number\" Id=\"Descuento\" name=\"txtDescuento\"><br>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>Estado Pedido<br>\r\n");
      out.write("    <select Id=\"EstadoPedido\" name=\"txtEstadoPedido\" >\r\n");
      out.write("    <option>Seleccione una opción</option>\r\n");
      out.write("    <option>Entregado</option>\r\n");
      out.write("    <option>Pago</option>\r\n");
      out.write("    </select> <br> <br>\r\n");
      out.write("    </tr>\r\n");
      out.write("    </table><br>\r\n");
      out.write("    <button>Registrar pedido</button>\r\n");
      out.write("    <input type=\"hidden\"value=\"1\"  name=\"opcion\">\r\n");
      out.write("\r\n");
      out.write("    <button type=\"submit\"  class=\"btn float-right login_btn\"> <a href=\"ConsultarPedido.jsp\"> Ver Pedidos registrados </a> </button>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </form><BR>\r\n");
      out.write("                            ");

            if (request.getAttribute("MensajeError") != null) {
      out.write("\r\n");
      out.write("                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" \r\n");
      out.write("                            ");
  } else {
      out.write("\r\n");
      out.write("                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                            ");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </center>\r\n");
      out.write("    </body>\r\n");
      out.write("    </html>\r\n");
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
