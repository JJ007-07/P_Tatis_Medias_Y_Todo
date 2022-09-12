package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Util.ConexionDB;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;
import java.util.ArrayList;
import ModeloVO.ProductoVO;
import ModeloDAO.ProductoDAO;

public final class ConsultarProducto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("\r\n");
      out.write("<!------ Include the above in your HEAD tag ---------->\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Login Page</title>\r\n");
      out.write("        <!--Made with love by Mutiullah Samim -->\r\n");
      out.write("\r\n");
      out.write("        <!--Bootsrap 4 CDN-->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("        <!--Fontawesome CDN-->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.3.1/css/all.css\" integrity=\"sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("        <!--Custom styles-->\r\n");
      out.write("        <link href=\"Estilos/estilos2.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("    <center>\r\n");
      out.write("        <div>\r\n");
      out.write("\r\n");
      out.write("            <h1>Consultar Producto</h1>\r\n");
      out.write("  ");

    ConexionDB con = new ConexionDB();
    Statement smt;
    ResultSet rs;
    smt = con.obtenerConexion().createStatement();
    rs = smt.executeQuery("select * from producto");

      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("    <center>\r\n");
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
    rs=smt.executeQuery("select* from producto where CodigoDeBarrasProducto LIKE"+"'%"+nombuscar+"%' OR ReferenciaProducto  LIKE"+"'%"+nombuscar+"%' OR DescripcionProducto LIKE"+"'%"+nombuscar+"%' OR StockProducto  LIKE"+"'%"+nombuscar+"%' OR  PrecioUnitario LIKE"+"'%"+nombuscar+"%'");

}else{
    System.err.print("Error");
}
                 
      out.write("\r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("                    <div class=\"container\">               \r\n");
      out.write("                         <a  class=\"btn btn-success\" href=\"registrarProducto.jsp\">Nuevo Registro</a>\r\n");
      out.write("                        <table class=\"table table-bordered\"  id=\"tablaDatos\">\r\n");
      out.write("                            <thead>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <th class=\"text-center\">Codigos Disponibles</th>\r\n");
      out.write("                                    <th class=\"text-center\">Referencia</th>\r\n");
      out.write("                                    <th class=\"text-center\">Descripcion</th>\r\n");
      out.write("                                    <th class=\"text-center\">Stock disponible</th>\r\n");
      out.write("                                    <th class=\"text-center\">Precio por unidad</th>\r\n");
      out.write("                                    <th class=\"text-center\">Acciones</th>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </thead>\r\n");
      out.write("                            <tbody id=\"tbodys\">\r\n");
      out.write("                            <br><br><br>\r\n");
      out.write("\r\n");
      out.write("                            ");

                                while (rs.next()) {
                            
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td class=\"text-center\">");
      out.print( rs.getString("CodigoDeBarrasProducto"));
      out.write("</td>\r\n");
      out.write("                                <td class=\"text-center\">");
      out.print( rs.getString("ReferenciaProducto"));
      out.write("</td>\r\n");
      out.write("                                <td class=\"text-center\">");
      out.print( rs.getString("DescripcionProducto"));
      out.write("</td>\r\n");
      out.write("                                 <td class=\"text-center\">");
      out.print( rs.getString("StockProducto"));
      out.write("</td>\r\n");
      out.write("                                  <td class=\"text-center\">");
      out.print( rs.getString("PrecioUnitario"));
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("                        <td class=\"text-center\">\r\n");
      out.write("                                \r\n");
      out.write("                                <!-- <input type=\"hidden\" value=\"<//%= rs.getInt(\"IdPedido\")%>\" id=\"Editar\"/>\r\n");
      out.write("                                <input type=\"submit\" class=\"btn btn-warning\" data-toggle=\"modal\" data-target=\"#myModal1\" value=\"Editar\"/>  -->\r\n");
      out.write("                                <a href=\"ActuaizarProducto.jsp?IdProducto=");
      out.print( rs.getInt("IdProducto"));
      out.write("\" ><img src=\"IMG/Actualizar.png\" width=\"60px\" height=\"60px\"/></a>\r\n");
      out.write("                                \r\n");
      out.write("                                <a href=\".jsp?IdProducto=");
      out.print( rs.getInt("IdProducto"));
      out.write("\"><img src=\"IMG/Eliminar.png\" width=\"60px\" height=\"60px\"/>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </td>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            ");
}
      out.write("\r\n");
      out.write("                        </table>    \r\n");
      out.write("                    </div>   \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            ");

                if (request.getAttribute("MensajeError") != null) {
      out.write("\r\n");
      out.write("\r\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("            ");
 } else { 
      out.write("\r\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            ");
 }
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </center>\r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
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
