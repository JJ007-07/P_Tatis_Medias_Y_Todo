package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.UsuarioVO;
import ModeloDAO.UsuarioDAO;
import ModeloVO.UsuarioVO;

public final class registrarEmpleado_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Sesiones.jsp");
  }

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
      out.write("    ");

        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-control", "no-cache, no-store,must-revalidate");
        response.setDateHeader("Expires", 0);
       
        
        
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("     ");
 
     HttpSession sesion =(HttpSession)request.getSession();
     String Usuario="";
    if (sesion.getAttribute("datosUsuario")==null) {
         request.getRequestDispatcher("Login.jsp").forward(request, response);
            
        }else{
        
        UsuarioVO usuVO= (UsuarioVO)sesion.getAttribute("datosUsuario");
        Usuario = usuVO.getNombreUsuario();
        
    
    
    }
        
        
        
        
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"card-header\">\r\n");
      out.write("            \r\n");
      out.write("        <h1>Bienvenido: ");
      out.print(Usuario);
      out.write("</h1>\r\n");
      out.write("        <form method=\"post\" action=\"Sesiones\">\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("           <div class=\"botones\">                       \r\n");
      out.write("            <input type=\"submit\" value=\"Cerrar Sesion\">  \r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("        </form>\r\n");
      out.write("        \r\n");
      out.write("        </div><br><br>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("    <!--Bootsrap 4 CDN-->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\r\n");
      out.write("    \r\n");
      out.write("    <!--Fontawesome CDN-->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.3.1/css/all.css\" integrity=\"sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("\t<!--Custom styles-->\r\n");
      out.write("      \r\n");
      out.write("      <link href=\"Estilos/estilos2.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("      <script src=\"js/validarE.js\" type=\"text/javascript\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("  \r\n");
      out.write("<center>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"contenedor\">      \r\n");
      out.write("\r\n");
      out.write("        <center>\r\n");
      out.write("            <h1 class=\"titulo\">Registrar Empleado</h1>\r\n");
      out.write("            <form method=\"post\" action=\"Empleado\" onsubmit=\"return validarE(); \">\r\n");
      out.write("            <table>\r\n");
      out.write("                \r\n");
      out.write("                <tr>\r\n");
      out.write("                   \r\n");
      out.write("                <div class=\"campos\">Nombre Empleado</div>\r\n");
      out.write("                <input type=\"text\" id=\"NombreEmpleado\" name=\"textNombre\"><br><br>\r\n");
      out.write("                        \r\n");
      out.write("                    <div class=\"campos\"> Apellido Empleado </div>\r\n");
      out.write("                    <input type=\"text\"  id=\"ApellidoEmpleado\" name=\"textApellido\"><br><br>\r\n");
      out.write("                  \r\n");
      out.write("                     <div class=\"campos\">  Tipo Documento</div>\r\n");
      out.write("                     <select name=\"textTipo\"  id=\"TipoDocEmpleado\">\r\n");
      out.write("                        <option>Seleccione una opción</option>\r\n");
      out.write("                       <option>CC</option>\r\n");
      out.write("                       <option>CE</option>\r\n");
      out.write("                    </select> <br> <br>\r\n");
      out.write("                    \r\n");
      out.write("                      <div class=\"campos\">  Numero Documento</div>\r\n");
      out.write("                      <input type=\"number\"  id=\"NumeroDocEmpleado\" name=\"textNumDoc\"><br><br>\r\n");
      out.write("                  \r\n");
      out.write("                     <div class=\"campos\">  Telefono Empleado</div>\r\n");
      out.write("                     <input type=\"number\" id=\"TelefonoCelularEmpleado\" name=\"textTelefono\"><br><br>\r\n");
      out.write("                    \r\n");
      out.write("                     <div class=\"campos\"> Direccion Empleado</div>\r\n");
      out.write("                     <input type=\"text\" id=\"DireccionEmpleado\" name=\"textDireccion\"><br><br>\r\n");
      out.write("                    \r\n");
      out.write("                      <div class=\"campos\">  Correo Empleado</div>\r\n");
      out.write("                      <input type=\"email\" id=\"CorreoEmpleado\" name=\"textCorreo\"><br><br>\r\n");
      out.write("                    \r\n");
      out.write("                      <div class=\"campos\">  Estado Empleado</div>\r\n");
      out.write("                      <input type=\"text\" id=\"EstadoEmpleado\" name=\"textEstado\"><br><br>\r\n");
      out.write("                    \r\n");
      out.write("                      <select name=\"textUsuario\" id=\"IdUsuarioFK\">\r\n");
      out.write("                    <option>Seleccione Usuario</option>\r\n");
      out.write("                    ");

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
      out.write("                    </select><br><br>\r\n");
      out.write("                </tr>\r\n");
      out.write("                \r\n");
      out.write("                 </div>\r\n");
      out.write("                    \r\n");
      out.write("                \r\n");
      out.write("            </table><br>\r\n");
      out.write("           \r\n");
      out.write("      \r\n");
      out.write("        <div class=\"form-group\">\t\r\n");
      out.write("        <input type=\"hidden\" value=\"1\" name=\"opcion\" class=\"btn float-right login_btn\">\r\n");
      out.write("        <button type=\"submit\" class=\"btn float-right login_btn\" > Registrarse</button>\r\n");
      out.write("        </div>\r\n");
      out.write("        </form>\r\n");
      out.write("                   \r\n");
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
