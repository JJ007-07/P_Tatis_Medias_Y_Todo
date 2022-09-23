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
      out.write(" \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Pedidos</title>\r\n");
      out.write("       <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"js/validar.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <link href=\"Estilos/2.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <section class=\"h-100 h-custom\" style=\"background-color: #999999;\">\r\n");
      out.write("  <div class=\"container py-5 h-100\">\r\n");
      out.write("    <div class=\"row d-flex justify-content-center align-items-center h-100\">\r\n");
      out.write("      <div class=\"col-lg-8 col-xl-6\">\r\n");
      out.write("        <div class=\"card rounded-3\">\r\n");
      out.write("          <img src=\"https://img.freepik.com/vector-gratis/recepcion-pedidos-telefono-centro-contacto-tienda-atencion-al-cliente-pedido-facil-entrega-rapida-servicio-comercial-personaje-dibujos-animados-operador-centro-llamadas_335657-2564.jpg?w=2000\"\r\n");
      out.write("            class=\"w-100\" style=\"border-top-left-radius: .3rem; border-top-right-radius: .3rem;\"\r\n");
      out.write("            alt=\"Sample photo\">\r\n");
      out.write("            <div class=\"card-body p-4 p-md-5\">\r\n");
      out.write("                <h3 class=\"mb-4 pb-2 pb-md-0 mb-md-5 px-md-2\">Información de Registro Pedidos</h3>\r\n");
      out.write("\r\n");
      out.write("        <form class=\"px-md-2\" method=\"post\" action=\"Pedido\" onsubmit=\"return validar();\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-outline mb-4\">\r\n");
      out.write("                <label class=\"form-label\" for=\"form3Example1q\">No.Factura</label>\r\n");
      out.write("                <input class=\"form-control\"  type=\"text\"  id=\"NumeroFacturaPedido\" name=\"txtNumeroFacturaPedido\" >\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-outline mb-4\">\r\n");
      out.write("                <label class=\"form-label\" for=\"form3Example1q\">Fecha Pedido</label>\r\n");
      out.write("                <input class=\"form-control\"  type=\"date\"  id=\"FechaPedido\" name=\"txtFechaPedido\"><br>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-outline mb-4\">\r\n");
      out.write("                <label class=\"form-label\" for=\"form3Example1q\">Fecha Recibido</label>\r\n");
      out.write("                <input class=\"form-control\"  type=\"date\" id=\"FechaRecibido\" name=\"txtFechaRecibido\">\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-outline mb-4\">\r\n");
      out.write("                 <label class=\"form-label\" for=\"form3Example1q\">Fecha Vencimiento de Pago</label>\r\n");
      out.write("                <input class=\"form-control\"  type=\"date\" id=\"FechaVencimientoPago\" name=\"txtFechaVencimientoPago\">\r\n");
      out.write("               \r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label class=\"form-label\" for=\"form3Example1q\">Empresa Proveedora</label>\r\n");
      out.write("               <select class=\"form-control\"  name=\"txtIdEmpresaProveedora\" id=\"IdEmpresaProveedoraFK\">\r\n");
      out.write("                    <option>Seleccione una opción</option>\r\n");
      out.write("                    ");

                        EmpresaProveedoraDAO epDAO = new EmpresaProveedoraDAO();
                        for (EmpresaProveedoraVO epVO : epDAO.Listar()) {
                    
      out.write("\r\n");
      out.write("                    <option value=\"");
      out.print(epVO.getIdEmpresaProveedora());
      out.write('"');
      out.write('>');
      out.print(epVO.getRazonSocialEmpresaProveedora());
      out.write("</option>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    ");
}
      out.write("       </select>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"form-outline mb-4\">\r\n");
      out.write("                 <label class=\"form-label\" for=\"form3Example1q\">IVA</label>\r\n");
      out.write("                <input class=\"form-control\"  type=\"number\" id=\"IVA\" name=\"txtIVA\">\r\n");
      out.write("               \r\n");
      out.write("            </div>\r\n");
      out.write("             <div class=\"form-outline mb-4\">\r\n");
      out.write("                 <label class=\"form-label\" for=\"form3Example1q\">Descuento</label>\r\n");
      out.write("                <input class=\"form-control\"  type=\"number\" Id=\"Descuento\" name=\"txtDescuento\">\r\n");
      out.write("                \r\n");
      out.write("            </div>   \r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label class=\"form-label\" for=\"form3Example1q\">Estado Pedido</label>\r\n");
      out.write("               <select class=\"form-control\"  Id=\"EstadoPedido\" class=\"form-control\"  name=\"txtEstadoPedido\" >\r\n");
      out.write("                        <option>Seleccione una opción</option>\r\n");
      out.write("\r\n");
      out.write("                        <option>Entregado</option>\r\n");
      out.write("                        <option>Pago</option>\r\n");
      out.write("                    </select>       \r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("                \r\n");
      out.write("            <br>\r\n");
      out.write("            <div>   \r\n");
      out.write("                <input type=\"hidden\" value=\"1\" name=\"opcion\">\r\n");
      out.write("\r\n");
      out.write("                \r\n");
      out.write("              <button type=\"submit\" class=\"btn btn-success btn-lg mb-1\" onclick=\"return confirm('¿Estas seguro de  registrar el pedido?')\" >Registrar Pedido</button>\r\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary btn-lg\" style=\"margin-bottom: 4px;\"><a href=\"ConsultarPedido.jsp\" style=\"color: #FFFFFF; text-decoration: none;\">Consultar Pedido</a></button>\r\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary btn-lg\" style=\"margin-bottom: 4px;\"><a href=\"registrarDP.jsp\" style=\"color: #FFFFFF; text-decoration: none;\">registrar productos</a></button>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");

            if (request.getAttribute("MensajeError") != null) {
      out.write("\r\n");
      out.write("        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("           \r\n");
      out.write("\r\n");
      out.write("        ");
} else {
      out.write("\r\n");
      out.write("        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("  \r\n");
      out.write("        ");
}
      out.write("\r\n");
      out.write("</section>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html> ");
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
