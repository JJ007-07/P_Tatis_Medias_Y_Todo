package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.EmpresaProveedoraVO;
import ModeloDAO.EmpresaProveedoraDAO;

public final class registrarProveedor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("z\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\t<title>Login Page</title>\r\n");
      out.write("   <!--Made with love by Mutiullah Samim -->\r\n");
      out.write("   \r\n");
      out.write("\t<!--Bootsrap 4 CDN-->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\r\n");
      out.write("    \r\n");
      out.write("    <!--Fontawesome CDN-->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.3.1/css/all.css\" integrity=\"sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("\t<!--Custom styles-->\r\n");
      out.write("      \r\n");
      out.write("      <link href=\"Estilos/estilos2.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("      <script src=\"js/validarPR.js\" type=\"text/javascript\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("  \r\n");
      out.write("<center>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"contenedor\">      \r\n");
      out.write("\r\n");
      out.write("        <center>\r\n");
      out.write("            <h1 class=\"titulo\">Registrar Empresas Proveedoras</h1>\r\n");
      out.write("            <form method=\"post\" action=\"EmpresaProveedora\" onsubmit=\"return validarPR();\">\r\n");
      out.write("            <table>\r\n");
      out.write("                \r\n");
      out.write("                <tr>\r\n");
      out.write("                   \r\n");
      out.write("                <div class=\"campos\">Nit Empresa</div>\r\n");
      out.write("                <input type=\"number\"  id=\"NitEmpresaProveedora\" name=\"txtNit\"><br><br>\r\n");
      out.write("                        \r\n");
      out.write("                    <div class=\"campos\"> Razon social Empresa </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <input type=\"text\" id=\"RazonSocialEmpresaProveedora\" name=\"txtRazon\"><br><br>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"campos\">Nombre Comercial Empresa</div>\r\n");
      out.write("                    \r\n");
      out.write("                    <input type=\"text\" id=\"NombreComercialEmpresaProveedora\" name=\"txtNombreC\"><br><br>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"campos\">Direccion De empresa</div>\r\n");
      out.write("                    \r\n");
      out.write("                    <input type=\"text\" id=\"DireccionEmpresaProveedora\" name=\"txtDireccion\"><br><br>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                      <div class=\"campos\">Telefono Empresa</div>\r\n");
      out.write("                      <input type=\"number\" id=\"TelefonoEmpresaProveedora\" name=\"txtTelefono\"><br><br>\r\n");
      out.write("                   \r\n");
      out.write("                <div class=\"campos\">Numero de pago</div>\r\n");
      out.write("                <input type=\"text\" id=\"Numeropago\" name=\"txtNumero\"><br><br>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"campos\"> Estado del Provedor</div>\r\n");
      out.write("                <select name=\"txtEstado\" id=\"EstadoEmpresaProveedora\">\r\n");
      out.write("                        <option>Seleccione una opción</option>\r\n");
      out.write("                       <option>Activo</option>\r\n");
      out.write("                       <option>Inactivo</option>\r\n");
      out.write("                    </select> <br> <br>\r\n");
      out.write("                   \r\n");
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                    </select> <br> <br>\r\n");
      out.write("\r\n");
      out.write("                   \r\n");
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                </tr>\r\n");
      out.write("                \r\n");
      out.write("                 </div>\r\n");
      out.write("                    \r\n");
      out.write("                \r\n");
      out.write("            </table><br>\r\n");
      out.write("                                         <div class=\"form-group\">\t\r\n");
      out.write("                                         <input type=\"hidden\" value=\"1\" name=\"opcion\" class=\"btn float-right login_btn\">\r\n");
      out.write("                                         <button type=\"submit\" class=\"btn float-right login_btn\" > Registrar Producto</button>\r\n");
      out.write("            \r\n");
      out.write("                                         \r\n");
      out.write("                                         <button type=\"submit\"  class=\"btn float-right login_btn\"> <a href=\"ConsultarProveedor.jsp\"> Ver Empresas registrados </a> </button>\r\n");
      out.write("                                         <button type=\"submit\"  class=\"btn float-right login_btn\"> <a href=\"Menu.jsp\"> Volver al menú </a> </button>\r\n");
      out.write("                                        \r\n");
      out.write("                                        </div>\r\n");
      out.write("        </form>\r\n");
      out.write("                    <div class=\"tres\"> \r\n");
      out.write("                         \r\n");
      out.write("                                         ");
 
                                         if  (request.getAttribute("MensajeError") !=null) {
      out.write("\r\n");
      out.write("                                         ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("           \r\n");
      out.write("               \r\n");
      out.write("                                         ");
}else {
      out.write("\r\n");
      out.write("                                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("  \r\n");
      out.write("                                        ");
}
      out.write("\r\n");
      out.write("                                        \r\n");
      out.write("                    </div>\r\n");
      out.write("      \r\n");
      out.write("        </center>\r\n");
      out.write("      \r\n");
      out.write("        </div>\r\n");
      out.write("      \r\n");
      out.write("    </body>\r\n");
      out.write("    </center>\r\n");
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
