package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.UsuarioVO;
import ModeloDAO.UsuarioDAO;

public final class registrarEmpleado_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Registrar Empleado</title>\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"js/validarE.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <link href=\"Estilos/2.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("</head>\r\n");
      out.write("  \r\n");
      out.write("<center>\r\n");
      out.write("<body>\r\n");
      out.write(" <section class=    \"h-100 h-custom\" style=\"background-color: #999999;\">\r\n");
      out.write("  <div class=\"container py-5 h-100\">\r\n");
      out.write("  <div class=\"row d-flex justify-content-center align-items-center h-100\">\r\n");
      out.write("  <div class=\"col-lg-8 col-xl-6\">\r\n");
      out.write("  <div class=\"card rounded-3\">\r\n");
      out.write("  <img src=\"https://blog.debmedia.com/wp-content/uploads/2020/02/Atenci%C3%B3n-al-cliente-1.jpg\"\r\n");
      out.write("  class=\"w-100\" style=\"border-top-left-radius: .3rem; border-top-right-radius: .3rem;\"\r\n");
      out.write("   alt=\"Sample photo\">\r\n");
      out.write("   <div class=\"card-body p-4 p-md-5\">\r\n");
      out.write("   <h3 class=\"mb-4 pb-2 pb-md-0 mb-md-5 px-md-2\">Información de Registro</h3>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"contenedor\">      \r\n");
      out.write("\r\n");
      out.write("        <center>\r\n");
      out.write("            \r\n");
      out.write("         <form class=\"px-md-2\"method=\" post\" action=\"Empleado\">\r\n");
      out.write("            <table>\r\n");
      out.write("                \r\n");
      out.write("                <tr>\r\n");
      out.write("                <div class=\"form-outline mb-4\">     \r\n");
      out.write("                 <label class=\"form-label\" for=\"form3Example1q\">Nombre Empleado</label>\r\n");
      out.write("                <input type=\"text\" id=\"NombreEmpleado\" name=\"textNombre\" class=\"form-control\"/>\r\n");
      out.write("               \r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"form-outline mb-4\">\r\n");
      out.write("                    <label class=\"form-label\" for=\"form3Example1q\">Apellido Empleado</label>\r\n");
      out.write("                    <input type=\"text\" id=\"ApellidoEmpleado\" name=\"textApellido\" class=\"form-control\"/>\r\n");
      out.write("                \r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                     <label class=\"form-label\" for=\"form3Examole1q\">Tipo DoC</label>\r\n");
      out.write("                    <select class=\"form-control\" id=\"TipoDocEmpleado\"name=\"textTipo\">\r\n");
      out.write("               <option value=\"1\" disabled>Seleccionar una opción disponible</option>\r\n");
      out.write("                        <option value=\"2\">Seleccione una opción</option>\r\n");
      out.write("                        <option value=\"3\">CC</option>\r\n");
      out.write("                        <option value=\"4\">CE</option>\r\n");
      out.write("                    </select>         \r\n");
      out.write("                   \r\n");
      out.write("                </div>\r\n");
      out.write("                     \r\n");
      out.write("                    <div class=\"form-outline mb-4\"> \r\n");
      out.write("                          <label class=\"form-label\" form=\"form3Example1q\">Numero Documento</label>\r\n");
      out.write("                        <input type=\"number\"id=\"NumeroDocEmpleado\" name=\"textNumDoc\" class=\"form-control\"/>\r\n");
      out.write("                  \r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"form-outline mb-4\"> \r\n");
      out.write("                        <label class=\"form-label\" form=\"form3Example1q\">Telefono Empleado</label>\r\n");
      out.write("                    <input type=\"number\" id=\"TelefonoCelularEmpleado\"name=\"textTelefono\" class=\"form-control\"/>\r\n");
      out.write("                     \r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"form-outline mb-4\">\r\n");
      out.write("                        <label class=\"form-label\" form=\"form3Example1q\">Direccion Empleado</label>\r\n");
      out.write("                     <input type=\"text\" id=\"DireccionEmpleado\"name=\"textDireccion\" class=\"form-control\"/>\r\n");
      out.write("                     \r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"form-outline mb-4\"> \r\n");
      out.write("                         <label class=\"form-label\" form=\"form3Example1q\">Correo Empleado</label>\r\n");
      out.write("                        <input type=\"email\" id=\"CorreoEmpleado\" name=\"textCorreo\" class=\"form-control\"/>\r\n");
      out.write("                     \r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"form-outline mb-4\"> \r\n");
      out.write("                        <label class=\"form-label\" form=\"form3Example1q\">Estado Empleado</label>\r\n");
      out.write("                        <input type=\"text\" id=\"EstadoEmpleado\"name=\"textEstado\" class=\"form-control\"/>\r\n");
      out.write("                      \r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                         <label class=\"form-label\" for=\"form3Examole1q\">Seleccionar Usuario </label>\r\n");
      out.write("                        <select class=\"form-control\" id=\"IdUsuarioFK\" name=\"textUsuario\">\r\n");
      out.write("               <option value=\"1\" disabled>Seleccionar una opción disponible</option>\r\n");
      out.write("                        <option value=\"2\">Seleccione usuario</option>\r\n");
      out.write("                        ");

                        UsuarioDAO usuDAO = new UsuarioDAO();
                        for(UsuarioVO usuVO: usuDAO.listar()){
                    
      out.write(" \r\n");
      out.write("                    <option value=\"");
      out.print(usuVO.getIdUsuario());
      out.write('"');
      out.write('>');
      out.print(usuVO.getNombreUsuario());
      out.write("</option>\r\n");
      out.write("                   ");
}
      out.write("\r\n");
      out.write("                    </select>         \r\n");
      out.write("                   \r\n");
      out.write("                </div>\r\n");
      out.write("                   \r\n");
      out.write("                </tr>\r\n");
      out.write("                \r\n");
      out.write("                 </div>\r\n");
      out.write("                    \r\n");
      out.write("                \r\n");
      out.write("            </table><br>\r\n");
      out.write("           \r\n");
      out.write("      \r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        </form>\r\n");
      out.write("                    <div>\r\n");
      out.write("                     <input type=\"hidden\" value=\"1\" name=\"opcion\">\r\n");
      out.write("        <button type=\"submit\" class=\"btn btn-success btn-lg mb-1\"onclick=\"return confirm('¿Estas seguro de  hacer este registro?')\" > Registrar Empleado</button>\r\n");
      out.write("         <button type=\"submit\" class=\"btn btn-primary btn-lg\" style=\"margin-bottom: 4px;\"><a href=\"ConsultarEmpleado.jsp\" style=\"color: #FFFFFF; text-decoration: none;\">Ver empleados registrados</a></button>\r\n");
      out.write("                    </div>    \r\n");
      out.write("        </center>\r\n");
      out.write("      \r\n");
      out.write("        </div>\r\n");
      out.write("      \r\n");
      out.write("          <div class=\"tres\"> \r\n");
      out.write("                         \r\n");
      out.write("                                         ");
 
                                         if  (request.getAttribute("mensajeError") !=null) {
      out.write("\r\n");
      out.write("                                         ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("           \r\n");
      out.write("               \r\n");
      out.write("                                         ");
}else {
      out.write("\r\n");
      out.write("                                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("  \r\n");
      out.write("                                        ");
}
      out.write("\r\n");
      out.write("                                        \r\n");
      out.write("                    </div>\r\n");
      out.write("    </body>\r\n");
      out.write("    </center>\r\n");
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
