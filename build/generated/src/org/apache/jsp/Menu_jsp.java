package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Controlador.Sesiones;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import ModeloVO.PedidoVO;
import ModeloDAO.PedidoDAO;
import java.util.ArrayList;
import ModeloVO.UsuarioVO;
import ModeloVO.USUROLVO;
import ModeloDAO.USUROLDAO;
import ModeloVO.UsuarioVO;

public final class Menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap\" rel=\"stylesheet\"> \r\n");
      out.write("        <link href=\"Estilos/Estilos3.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css\" integrity=\"sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("\r\n");
      out.write("        <script src=\"js/nav.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <link href=\"Estilos/boton.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <script src=\"https://kit.fontawesome.com/b99e675b6e.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
<<<<<<< HEAD
      out.write("    ");

        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-control", "no-cache, no-store,must-revalidate");
        response.setDateHeader("Expires", 0);
       
        
        
=======
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"sidebar\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"sidebar_inner\">\r\n");
      out.write("\r\n");
      out.write("                    <ul>    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"registrarEmpleado.jsp\">\r\n");
      out.write("                                <span class=\"icon\"><i class=\"fa-solid fa-users\"></i></i></span>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                <span class=\"text\">Empleado</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"registrarCliente.jsp\">\r\n");
      out.write("                                <span class=\"icon\"><i class=\"fa fa-user\"></i></span>\r\n");
      out.write("                                <span class=\"text\">Cliente</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"registrarProveedor.jsp\">\r\n");
      out.write("                                <span class=\"icon\"><i class=\"fa-solid fa-truck-field\"></i></i></span>\r\n");
      out.write("                                <span class=\"text\">Proveedor</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"RegistrarCategoria.jsp\">\r\n");
      out.write("                                <span class=\"icon\"><i class=\"fa-solid fa-list\"></i></i></span>\r\n");
      out.write("                                <span class=\"text\">Categoria</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"RegistrarVenta.jsp\">\r\n");
      out.write("                                <span class=\"icon\"><i class=\"fa-solid fa-receipt\"></i></span>\r\n");
      out.write("                                <span class=\"text\">Ventas</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"registrarPedido.jsp\">\r\n");
      out.write("                                <span class=\"icon\"><i class=\"fa-solid fa-box\"></i></span>\r\n");
      out.write("                                <span class=\"text\">Pedido</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"registrarProducto.jsp\">\r\n");
      out.write("                                <span class=\"icon\"><i class=\"fa-solid fa-bag-shopping\"></i></span>\r\n");
      out.write("                                <span class=\"text\">Producto</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            \r\n");
      out.write("                        \r\n");
      out.write("                                \r\n");
      out.write("                                    <a href=\"Reportes/RPT1.jsp\">\r\n");
      out.write("                                <span class=\"icon\"><i class=\"fa-solid fa-file\"></i></span>\r\n");
      out.write("                                <span class=\"text\">Reportes</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                         <li>\r\n");
      out.write("                            <a href=\"Registroasig.jsp\">\r\n");
      out.write("                                <span class=\"icon\"><i class=\"fa-user-plus\"></i></span>\r\n");
      out.write("                                <span class=\"text\">Asignar rol</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            \r\n");
      out.write("                                  <form method=\"post\" action=\"Sesiones\">\r\n");
      out.write("                                \r\n");
      out.write("                                      <a href=\"\">    \r\n");
      out.write("                                <span class=\"icon\"><i class=\"fa fa-sign-out\"></i></span>\r\n");
      out.write("                                <span class=\"text\"> \r\n");
      out.write("                                      <button >Cerrar</button></span>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                               </form>\r\n");
      out.write("       \r\n");
      out.write("                        </li>\r\n");
      out.write("                             \r\n");
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
>>>>>>> origin/Jessika
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
      out.write("        </div>\r\n");
      out.write("      \r\n");
      out.write("        </div><br><br>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
    Connection con;
    String url = "jdbc:mysql://localhost:3306/tatis_media_y_todo";
    String Driver = "com.mysql.jdbc.Driver";
    String user = "root";
    String clave = "";
    Class.forName(Driver);
    con = DriverManager.getConnection(url, user, clave);
    Statement smt;
    Statement smt2;
    Statement smt3;
    Statement smt4;
    Statement smt5;
    ResultSet rs;
    ResultSet rs2;
    ResultSet rs3;
    ResultSet rs4;
    ResultSet rs5;
    smt = con.createStatement();
    smt2 = con.createStatement();
    smt3 = con.createStatement();
    smt4 = con.createStatement();
    smt5 = con.createStatement();
    rs = smt.executeQuery("select * from producto limit 12");
    rs2 = smt2.executeQuery("select FechaPedido, P.CodigoDeBarrasProducto, P.ReferenciaProducto, NumeroFacturaPedido from pedido inner join producto as P on IdPedido = P.IdProducto");
    rs3 = smt3.executeQuery("select FechaPedido, P.CodigoDeBarrasProducto, P.ReferenciaProducto, NumeroFacturaPedido from pedido inner join producto as P on IdPedido = P.IdProducto");
    rs4 = smt4.executeQuery("select FechaPedido, P.CodigoDeBarrasProducto, P.ReferenciaProducto, NumeroFacturaPedido from pedido inner join producto as P on IdPedido = P.IdProducto");
    rs5 = smt5.executeQuery("select FechaPedido, P.CodigoDeBarrasProducto, P.ReferenciaProducto, NumeroFacturaPedido from pedido inner join producto as P on IdPedido = P.IdProducto");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./Estilos/StyleMenu.css\">\r\n");
      out.write("        <link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css' rel='stylesheet'>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <title>Menu Principal</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"sidebar\">\r\n");
      out.write("            <div class=\"logo-details\">\r\n");
      out.write("                <i class=' bx bx-cog'></i>\r\n");
      out.write("                <span class=\"logo_name\">J&K</span>\r\n");
      out.write("            </div>\r\n");
      out.write("            <ul class=\"nav-links\">\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"./registrarEmpleado.jsp\" class=\"active\">\r\n");
      out.write("                        <i class='bx bx-user' ></i>\r\n");
      out.write("                        <span class=\"links_name\">Empleados</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"./registrarCliente.jsp\">\r\n");
      out.write("                        <i class='bx bxs-user'></i>\r\n");
      out.write("                        <span class=\"links_name\">Clientes</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"./registrarProveedor.jsp\">\r\n");
      out.write("                        <i class=' bx bxs-truck' ></i>\r\n");
      out.write("                        <span class=\"links_name\">Proveedores</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"./RegistrarCategoria.jsp\">\r\n");
      out.write("                        <i class=' bx bxs-bookmarks' ></i>\r\n");
      out.write("                        <span class=\"links_name\">Categorias</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"./RegistrarVenta.jsp\">\r\n");
      out.write("                        <i class=' bx bxs-cart'></i>\r\n");
      out.write("                        <span class=\"links_name\">Ventas</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"./registrarPedido.jsp\">\r\n");
      out.write("                        <i class=' bx bxs-calendar-week' ></i>\r\n");
      out.write("                        <span class=\"links_name\">Pedidos</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"./registrarProducto.jsp\">\r\n");
      out.write("                        <i class=' bx bxs-shopping-bags' ></i>\r\n");
      out.write("                        <span class=\"links_name\">Productos</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\">\r\n");
      out.write("                        <i class='bx bxs-file-blank' ></i>\r\n");
      out.write("                        <span class=\"links_name\">Reportes</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"Registroasig\">\r\n");
      out.write("                        <i class=' bx bxs-user-check' ></i>\r\n");
      out.write("                        <span class=\"links_name\">Roles</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <li class=\"log_out\">\r\n");
      out.write("                    <a href=\"\">\r\n");
      out.write("                        <i class='bx bx-log-out'></i>\r\n");
      out.write("                        <form method=\"post\" action=\"Sesiones\">\r\n");
      out.write("                            <button style=\"cursor: pointer; text-decoration: none; all: unset;\"><span class=\"links_name\">Cerrar Sesion</span></button>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <section class=\"home-section\">\r\n");
      out.write("            <nav>\r\n");
      out.write("                <div class=\"sidebar-button\">\r\n");
      out.write("                    <i class='bx bx-menu sidebarBtn' style=\"cursor: pointer;\"></i>\r\n");
      out.write("                    <span class=\"dashboard\">Menu</span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"profile-details\">\r\n");
      out.write("                    <span class=\"admin_name\">");
      out.print(Usuario);
      out.write("</span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"home-content\">\r\n");
      out.write("                <div class=\"overview-boxes\">\r\n");
      out.write("                    <div class=\"box\">\r\n");
      out.write("                        <div class=\"right-side\">\r\n");
      out.write("                            <div class=\"box-topic\">Total De Pedidos</div>\r\n");
      out.write("                            <div class=\"number\">10</div>\r\n");
      out.write("                            <div class=\"indicator\">\r\n");
      out.write("                                <i class='bx bx-up-arrow-alt'></i>\r\n");
      out.write("                                <span class=\"text\">A partir de hoy</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <i class='bx bx-cart-alt cart'></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"box\">\r\n");
      out.write("                        <div class=\"right-side\">\r\n");
      out.write("                            <div class=\"box-topic\">Total De Ventas</div>\r\n");
      out.write("                            <div class=\"number\">5</div>\r\n");
      out.write("                            <div class=\"indicator\">\r\n");
      out.write("                                <i class='bx bx-up-arrow-alt'></i>\r\n");
      out.write("                                <span class=\"text\">A partir de hoy</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <i class='bx bxs-cart-add cart two' ></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"box\">\r\n");
      out.write("                        <div class=\"right-side\">\r\n");
      out.write("                            <div class=\"box-topic\">Productos Disponible</div>\r\n");
      out.write("                            <div class=\"number\">120</div>\r\n");
      out.write("                            <div class=\"indicator\">\r\n");
      out.write("                                <i class='bx bx-up-arrow-alt'></i>\r\n");
      out.write("                                <span class=\"text\">A partir de hoy</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <i class='bx bxs-shopping-bags cart three' ></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"box\">\r\n");
      out.write("                        <div class=\"right-side\">\r\n");
      out.write("                            <div class=\"box-topic\">Clientes Recientes</div>\r\n");
      out.write("                            <div class=\"number\">12</div>\r\n");
      out.write("                            <div class=\"indicator\">\r\n");
      out.write("                                <i class='bx bx-up-arrow-alt'></i>\r\n");
      out.write("                                <span class=\"text\">A partir de hoy</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <i class=' bx bx-user-plus cart four'></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"sales-boxes\">\r\n");
      out.write("                    <div class=\"recent-sales box\">\r\n");
      out.write("                        <div class=\"title\">Información Actual De Los Pedidos</div>\r\n");
      out.write("                        <div class=\"sales-details\">\r\n");
      out.write("                            <ul class=\"details\">\r\n");
      out.write("                                <li class=\"topic\">Fecha Del Pedido</li>\r\n");
      out.write("                                    ");

                                        while (rs2.next()) {
                                    
      out.write("\r\n");
      out.write("                                <li class=\"topic\">");
      out.print( rs2.getString("FechaPedido"));
      out.write("</li>\r\n");
      out.write("                                    ");
}
      out.write("\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <ul class=\"details\">\r\n");
      out.write("                                <li class=\"topic\">Codigo De Barras Del Producto</li>\r\n");
      out.write("                                    ");

                                        while (rs3.next()) {
                                    
      out.write("\r\n");
      out.write("                                <li class=\"topic\">");
      out.print( rs3.getString("CodigoDeBarrasProducto"));
      out.write("</li>\r\n");
      out.write("                                    ");
}
      out.write("\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <ul class=\"details\">\r\n");
      out.write("                                <li class=\"topic\">Referencia Del Producto</li>\r\n");
      out.write("                                    ");

                                        while (rs4.next()) {
                                    
      out.write("\r\n");
      out.write("                                <li class=\"topic\">");
      out.print( rs4.getString("ReferenciaProducto"));
      out.write("</li>\r\n");
      out.write("                                    ");
}
      out.write("\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <ul class=\"details\">\r\n");
      out.write("                                <li class=\"topic\">Número De Factura Del Pedido</li>\r\n");
      out.write("                                    ");

                                        while (rs5.next()) {
                                    
      out.write("\r\n");
      out.write("                                <li class=\"topic\">");
      out.print( rs5.getString("NumeroFacturaPedido"));
      out.write("</li>\r\n");
      out.write("                                    ");
}
      out.write("\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"top-sales box\">\r\n");
      out.write("                        <div class=\"title\">Productos Más Vendidos</div>\r\n");
      out.write("                        <table class=\"table table-bordered\"  id=\"tablaDatos\">\r\n");
      out.write("                            <thead>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <th>Producto</th>\r\n");
      out.write("                                    <th>Precio</th>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </thead>\r\n");
      out.write("                            <tbody id=\"tbodys\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                ");

                                    while (rs.next()) {
                                
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <td class=\"text-center\">");
      out.print( rs.getString("DescripcionProducto"));
      out.write("</td>\r\n");
      out.write("                                    <td class=\"text-center\">");
      out.print( rs.getString("PrecioUnitario"));
      out.write("</td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                ");
}
      out.write("\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <script>\r\n");
      out.write("            let sidebar = document.querySelector(\".sidebar\");\r\n");
      out.write("            let sidebarBtn = document.querySelector(\".sidebarBtn\");\r\n");
      out.write("            sidebarBtn.onclick = function () {\r\n");
      out.write("                sidebar.classList.toggle(\"active\");\r\n");
      out.write("                if (sidebar.classList.contains(\"active\")) {\r\n");
      out.write("                    sidebarBtn.classList.replace(\"bx-menu\", \"bx-menu-alt-right\");\r\n");
      out.write("                } else\r\n");
      out.write("                    sidebarBtn.classList.replace(\"bx-menu-alt-right\", \"bx-menu\");\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
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
