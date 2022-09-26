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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\t<title>Proveedor</title>\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT\" crossorigin=\"anonymous\">\r\n");
      out.write("       <script src=\"js/validarPR.js\" type=\"text/javascript\"></script>\r\n");
      out.write("       <link href=\"Estilos/2.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("      \r\n");
      out.write("</head>\r\n");
      out.write("  \r\n");
      out.write("<center>\r\n");
      out.write("<body>\r\n");
      out.write("    \r\n");
      out.write("     <section class=\"h-100 h-custom\" style=\"background-color: #999999;\">\r\n");
      out.write("  <div class=\"container py-5 h-100\">\r\n");
      out.write("    <div class=\"row d-flex justify-content-center align-items-center h-100\">\r\n");
      out.write("      <div class=\"col-lg-8 col-xl-6\">\r\n");
      out.write("        <div class=\"card rounded-3\">\r\n");
      out.write("            <img src=\"https://www.emagister.com/blog/wp-content/uploads/2020/01/proveedor-empresa-kraken.jpg \"\r\n");
      out.write("            class=\"w-100\" style=\"border-top-left-radius: .3rem; border-top-right-radius: .3rem;\"\r\n");
      out.write("            alt=\"Sample photo\">\r\n");
      out.write("            <div class=\"card-body p-4 p-md-5\">\r\n");
      out.write("                <h3 class=\"mb-4 pb-2 pb-md-0 mb-md-5 px-md-2\">Información de Registro Proveedor</h3>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"contenedor\">      \r\n");
      out.write("\r\n");
      out.write("        <center>\r\n");
      out.write("           \r\n");
      out.write("            <form class=\"px-md-2\" method=\"post\" action=\"EmpresaProveedora\" onsubmit=\"return validarPR();\">\r\n");
      out.write("            <table>\r\n");
      out.write("                \r\n");
      out.write("                <tr>\r\n");
      out.write("               <div class=\"form-label-group\"> \r\n");
      out.write("                <label class=\"form-label\" for=\"NitEmpresaProveedora\">Nit Empresa</label>\r\n");
      out.write("                <input type=\"number\"  id=\"NitEmpresaProveedora\" name=\"txtNit\" class=\"form-control\"/>\r\n");
      out.write("                \r\n");
      out.write("                </div>        \r\n");
      out.write("                \r\n");
      out.write("                <div class=\"form-label-group\">\r\n");
      out.write("                    <label class=\"form-label\" for=\"RazonSocialEmpresaProveedora\">Razon social Empresa</label>\r\n");
      out.write("                    <input type=\"text\" id=\"RazonSocialEmpresaProveedora\" name=\"txtRazon\" class=\"form-control\"/>\r\n");
      out.write("                     \r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"form-label-group\">\r\n");
      out.write("                    <label class=\"form-label\" for=\"form3Example1q\">Nombre Comercial</label>\r\n");
      out.write("                    <input type=\"text\" id=\"NombreComercialEmpresaProveedora\" name=\"txtNombreC\" class=\"form-control\"/>\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"form-label-group\">\r\n");
      out.write("                    <label class=\"form-label\" for=\"form3Example1q\">Direccion De empresa</label>\r\n");
      out.write("                    <input type=\"text\" id=\"DireccionEmpresaProveedora\" name=\"txtDireccion\" class=\"form-control\"/>\r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("               \r\n");
      out.write("                <div class=\"form-outline mb-4\">\r\n");
      out.write("                     <label class=\"form-label\" for=\"TelefonoEmpresaProveedora\">Telefono empresa</label>\r\n");
      out.write("                    <input type=\"number\" id=\"TelefonoEmpresaProveedora\" name=\"txtTelefono\" class=\"form-control\">\r\n");
      out.write("                   \r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("              <div class=\"form-label-group\">\r\n");
      out.write("                     <label class=\"form-label\" for=\"Numeropago\">Numero de pago</label>\r\n");
      out.write("                <input type=\"text\" id=\"Numeropago\" name=\"txtNumero\" class=\"form-control\">\r\n");
      out.write("               \r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"form-label-group\">\r\n");
      out.write("                     <label class=\"form-label\" for=\"EstadoEmpresaProveedora\">Estado del Proveedor</label>\r\n");
      out.write("               <select  name=\"txtEstado\" id=\"EstadoEmpresaProveedora\" class=\"form-control\">\r\n");
      out.write("                        <option value=\"1\" disabled>Seleccionar una opción disponible</option>\r\n");
      out.write("                        <option value=\"2\">Activo</option>\r\n");
      out.write("                        <option value=\"3\">Inactivo</option>\r\n");
      out.write("                    </select> \r\n");
      out.write("                   \r\n");
      out.write("                </div>\r\n");
      out.write("                <br>\r\n");
      out.write("                </tr>\r\n");
      out.write("                  </table><br>\r\n");
      out.write("                 \r\n");
      out.write("        </form>\r\n");
      out.write("                     <div>\r\n");
      out.write("                                         <input type=\"hidden\" value=\"1\" name=\"opcion\">\r\n");
      out.write("                                         <button type=\"submit\" class=\"btn btn-success btn-lg mb-1\" onclick=\"return confirm('¿Estas seguro de registrar este proveedor?')\"  > Registrar Proveedor</button>\r\n");
      out.write("                                         <button type=\"submit\" class=\"btn btn-primary btn-lg\" style=\"margin-bottom: 4px;\"><a href=\"ConsultarProveedor.jsp\" style=\"color: #FFFFFF; text-decoration: none;\">Ver proveedores registrados</a></button>\r\n");
      out.write("                                         \r\n");
      out.write("                                        \r\n");
      out.write("                                        \r\n");
      out.write("                                        </div>\r\n");
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
      out.write("      <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8\" crossorigin=\"anonymous\"></script>\r\n");
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
