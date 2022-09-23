package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.EmpleadoVO;
import ModeloDAO.EmpleadoDAO;

public final class ActualizarEmpleado_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("                <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT\" crossorigin=\"anonymous\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

            if (request.getAttribute("empleadoConsultado") != null) {
                EmpleadoVO empVO = (EmpleadoVO) request.getAttribute("empleadoConsultado");


        
      out.write("\r\n");
      out.write("        <div class=\"contenedor\">    \r\n");
      out.write("         <section class=\"h-100 h-custom\" style=\"background-color: #999999;\">\r\n");
      out.write("  <div class=\"container py-5 h-100\">\r\n");
      out.write("    <div class=\"row d-flex justify-content-center align-items-center h-100\">\r\n");
      out.write("      <div class=\"col-lg-8 col-xl-6\">\r\n");
      out.write("        <div class=\"card rounded-3\">\r\n");
      out.write("          <img src=\"https://www.trecebits.com/wp-content/uploads/2020/09/Catalogos-digitales.jpg\"\r\n");
      out.write("            class=\"w-100\" style=\"border-top-left-radius: .3rem; border-top-right-radius: .3rem;\"\r\n");
      out.write("            alt=\"Sample photo\">\r\n");
      out.write("            <div class=\"card-body p-4 p-md-5\">\r\n");
      out.write("                <h3 class=\"mb-4 pb-2 pb-md-0 mb-md-5 px-md-2\">Actualizar informacion del empleado</h3>\r\n");
      out.write("\r\n");
      out.write("         \r\n");
      out.write("                <form method=\"post\" action=\"Empleado\">\r\n");
      out.write("                    <table>\r\n");
      out.write("\r\n");
      out.write("                        <tr>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-outline mb-4\">\r\n");
      out.write("                        <label class=\"form-label\" for=\"form3Example1q\">Codigo Empleado</label>\r\n");
      out.write("                        <input type=\"text\"  name=\"textId\" value=\"");
      out.print(empVO.getIdEmpleado());
      out.write("\"class=\"form-control\">\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-outline mb-4\">\r\n");
      out.write("                        <label class=\"form-label\" for=\"form3Example1q\">Nombre Empleado</label>\r\n");
      out.write("                        <input type=\"text\"  name=\"textNombre\" value=\"");
      out.print(empVO.getNombreEmpleado());
      out.write("\"class=\"form-control\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                        \r\n");
      out.write("                    <div class=\"form-outline mb-4\">\r\n");
      out.write("                        <label class=\"form-label\" for=\"form3Example1q\">Apellido Empleado</label>\r\n");
      out.write("                        <input type=\"text\" name=\"textApellido\" value=\"");
      out.print(empVO.getApellidoEmpleado());
      out.write("\"class=\"form-control\">\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-outline mb-4\">\r\n");
      out.write("                        <label class=\"form-label\" for=\"form3Example1q\">Tipo Empleado</label>\r\n");
      out.write("                        <input type=\"text\" name=\"textTipo\" value=\"");
      out.print(empVO.getTipoDocEmpleado());
      out.write("\"class=\"form-control\">\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-outline mb-4\">\r\n");
      out.write("                        <label class=\"form-label\" for=\"form3Example1q\">Numero Documento</label>\r\n");
      out.write("                        <input type=\"number\" name=\"textNumDoc\" readonly=\"\" value=\"");
      out.print(empVO.getNumeroDocEmpleado());
      out.write("\"class=\"form-control\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                     \r\n");
      out.write("                   <div class=\"form-outline mb-4\">\r\n");
      out.write("                       <label class=\"form-label\" for=\"form3Example1q\"> Telefono Empleado</label>\r\n");
      out.write("                       <input type=\"number\" name=\"textTelefono\" value=\"");
      out.print(empVO.getTelefonoCelularEmpleado());
      out.write("\"class=\"form-control\">\r\n");
      out.write("                   </div>\r\n");
      out.write("            \r\n");
      out.write("                    <div class=\"form-outline mb-4\">\r\n");
      out.write("                        <label class=\"form-label\" for=\"form3Example1q\">Direccion Empleado</label>\r\n");
      out.write("                        <input type=\"text\" name=\"textDireccion\" value=\"");
      out.print(empVO.getDirecionEmpleado());
      out.write("\"class=\"form-control\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                 \r\n");
      out.write("                    <div class=\"form-outline mb-4\">\r\n");
      out.write("                        <label class=\"form-label\" for=\"form3Example1q\">Correo Empleado</label>\r\n");
      out.write("                        <input type=\"email\" name=\"textCorreo\" value=\"");
      out.print(empVO.getCorreoEmpleado());
      out.write("\"class=\"form-control\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                        \r\n");
      out.write("                    <div class=\"form-outline mb-4\">\r\n");
      out.write("                        <label class=\"form-label\" for=\"form3Example1q\">Estado Empleado</label>\r\n");
      out.write("                        <input type=\"text\" name=\"textEstado\" value=\"");
      out.print(empVO.getEstadoEmpleado());
      out.write("\"class=\"form-control\">\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-outline mb-4\">\r\n");
      out.write("                        <label class=\"form-label\" for=\"form3Example1q\">Id Usuario FK</label>\r\n");
      out.write("                        <input type=\"text\" name=\"textUsuario\" readonly=\"\" value=\"");
      out.print(empVO.getIdUsuarioFK());
      out.write("\"class=\"form-control\">\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                        </tr>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </table><br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-group\">\t\r\n");
      out.write("                        <input type=\"hidden\" value=\"2\" name=\"opcion\" class=\"btn float-right login_btn\">\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-success btn-lg mb-1\" class=\"btn float-right login_btn\"  onclick=\"return confirm('¿Estas seguro de actualizar el empleado')\"> Registrarse</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("\r\n");
      out.write("            </center>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            ");

                                             if (request.getAttribute("mensajeExito") != null) {
      out.write("\r\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("           \r\n");
      out.write("\r\n");
      out.write("            ");
} else {
      out.write("\r\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("  \r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</center>\r\n");
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
