package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import Util.ConexionDB;
import Util.ConexionDB;
import java.util.ArrayList;
import ModeloDAO.EmpleadoDAO;
import ModeloVO.EmpleadoVO;
import ModeloVO.UsuarioVO;
import ModeloDAO.UsuarioDAO;

public final class ConsultarEmpleado_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <link href=\"Estilos/estilos2.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <title>Consultar</title>\r\n");
      out.write("    </head>\r\n");
      out.write(" \r\n");
      out.write("          <center>\r\n");
      out.write("        <h1>Empleado</h1>\r\n");
      out.write("         ");

    ConexionDB con = new ConexionDB();
    Statement smt;
    ResultSet rs;
    smt = con.obtenerConexion().createStatement();
    rs = smt.executeQuery("select * from Empleado");

      out.write("\r\n");
      out.write("   <body>\r\n");
      out.write("        <center>\r\n");
      out.write("         \r\n");
      out.write("            <div style=\"padding-left: 800px\">    \r\n");
      out.write("             <div  class=\"container buscar\">\r\n");
      out.write("                 <center>\r\n");
      out.write("                 <form class=\"form\">\r\n");
      out.write("                <input type=\"text\" name=\"txtbuscar\">\r\n");
      out.write("                <input type=\"submit\" value=\"Buscar\">\r\n");
      out.write("                 </form></center></center>\r\n");
      out.write("                 ");
 
String nombuscar=request.getParameter("txtbuscar");
if(nombuscar!=null){
    smt=con.obtenerConexion().createStatement();
    rs=smt.executeQuery("select* from empleado where NombreEmpleado LIKE"+"'%"+nombuscar+"%' OR ApellidoEmpleado LIKE"+"'%"+nombuscar+"%' OR TipoDocEmpleado LIKE"+"'%"+nombuscar+"%' OR NumeroDocEmpleado LIKE"+"'%"+nombuscar+"%' OR TelefonoCelularEmpleado LIKE"+"'%"+nombuscar+"%' OR DirrecionEmpleado LIKE"+"'%"+nombuscar+"%' OR CorreoEmpleado LIKE"+"'%"+nombuscar+"%' OR EstadoEmpleado LIKE"+"'%"+nombuscar+"%'");

}else{
    System.err.print("Error");
}
                 
      out.write("\r\n");
      out.write("                     \r\n");
      out.write("        </div>\r\n");
      out.write("                  <div class=\"container\">               \r\n");
      out.write("            <a  class=\"btn btn-success\" href=\"registrarEmpleado.jsp\">Nuevo Registro</a>         \r\n");
      out.write("             <table class=\"table table-bordered\"  id=\"tablaDatos\">\r\n");
      out.write("                    <thead>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th class=\"text-center\">IdEmpleado</th>\r\n");
      out.write("                            <th class=\"text-center\">NombreEmpleado</th>\r\n");
      out.write("                            <th class=\"text-center\">ApellidoEmpleado</th>\r\n");
      out.write("                            <th class=\"text-center\">TipoDocumento</th>\r\n");
      out.write("                            <th class=\"text-center\">NumeroDocumento</th>\r\n");
      out.write("                            <th class=\"text-center\">Telefono</th>\r\n");
      out.write("                            <th class=\"text-center\">Direccion</th>\r\n");
      out.write("                            <th class=\"text-center\">Correo Electronico</th>\r\n");
      out.write("                            <th class=\"text-center\">Estado</th>\r\n");
      out.write("                            <th class=\"text-center\">IdUsuarioFK</th>\r\n");
      out.write("                            <th class=\"text-center\">Acciones</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody id=\"tbodys\">\r\n");
      out.write("                        ");

                            while (rs.next()) {
                        
      out.write("\r\n");
      out.write("                        <tr>\r\n");
      out.write("                             \r\n");
      out.write("                             <td class=\"text-center\">");
      out.print( rs.getInt("IdEmpleado"));
      out.write("</td>\r\n");
      out.write("                             <td class=\"text-center\">");
      out.print( rs.getString("NombreEmpleado"));
      out.write("</td>\r\n");
      out.write("                             <td class=\"text-center\">");
      out.print( rs.getString("ApellidoEmpleado"));
      out.write("</td>\r\n");
      out.write("                             <td>");
      out.print( rs.getString("TipoDocEmpleado"));
      out.write("</td>\r\n");
      out.write("                             <td class=\"text-center\">");
      out.print( rs.getString("NumeroDocEmpleado"));
      out.write("</td>\r\n");
      out.write("                             <td>");
      out.print( rs.getString("TelefonoCelularEmpleado"));
      out.write("</td>\r\n");
      out.write("                             <td>");
      out.print( rs.getString("DireccionEmpleado"));
      out.write("</td>\r\n");
      out.write("                             <td>");
      out.print( rs.getString("CorreoEmpleado"));
      out.write("</td>\r\n");
      out.write("                             <td>");
      out.print( rs.getString("EstadoEmpleado"));
      out.write("</td>\r\n");
      out.write("                             <td>");
      out.print( rs.getString("IdUsuarioFK"));
      out.write("</td>\r\n");
      out.write("                            <td class=\"text-center\">\r\n");
      out.write("                                \r\n");
      out.write("                                <!-- <input type=\"hidden\" value=\"<//%= rs.getInt(\"IdPedido\")%>\" id=\"Editar\"/>\r\n");
      out.write("                                <input type=\"submit\" class=\"btn btn-warning\" data-toggle=\"modal\" data-target=\"#myModal1\" value=\"Editar\"/>  -->\r\n");
      out.write("                                <a href=\"ActualizarEmpleado.jsp?IdEmpleado=");
      out.print( rs.getInt("IdEmpleado"));
      out.write("\" class=\"btn btn-primary\">Editar</a>\r\n");
      out.write("                                <a href=\"EliminarEmpleado.jsp?IdEmpleado=");
      out.print( rs.getInt("IdEmpleado"));
      out.write("\" class=\"btn btn-danger\">Delete</a>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        ");
}
      out.write("\r\n");
      out.write("                </table>\r\n");
      out.write("                       \r\n");
      out.write("        <script src=\"js/jquery.js\" type=\"text/javascript\"></script>             \r\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>        \r\n");
      out.write("                    \r\n");
      out.write("      ");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("        \r\n");
      out.write("          </center>\r\n");
      out.write("    </body>\r\n");
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
