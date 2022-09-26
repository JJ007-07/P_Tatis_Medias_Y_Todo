package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_005fcajero_005fvendedor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <title>Bienvenido</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://necolas.github.io/normalize.css/8.0.1/normalize.css\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap\" rel=\"stylesheet\"> \r\n");
      out.write("        <link href=\"Estilos/Estilos3.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css\" integrity=\"sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("\r\n");
      out.write("        <script src=\"js/nav.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <link href=\"Estilos/boton.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <script src=\"https://kit.fontawesome.com/b99e675b6e.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"wrapper hover_collapse\">\r\n");
      out.write("            <div class=\"top_navbar\">\r\n");
      out.write("                <a class=\"logo\" href=\"#\">\r\n");
      out.write("\r\n");
      out.write("                    <img src=\"IMG/Log.svg\" width=\"45\" height=\"45\" class=\"d-inline-block align-top\" alt=\"\">\r\n");
      out.write("                    JyK \r\n");
      out.write("                </a>\r\n");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
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
      out.write("                            <a href=\"registrarCliente.jsp\">\r\n");
      out.write("                                <span class=\"icon\"><i class=\"fa fa-user\"></i></span>\r\n");
      out.write("                                <span class=\"text\">Cliente</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                       \r\n");
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
      out.write("                        \r\n");
      out.write("                         <li>\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            //I have determined the constant of some class function\r\n");
      out.write("            var li_items = document.querySelectorAll(\".sidebar ul li \");\r\n");
      out.write("            var hamburger = document.querySelector(\".hamburger\");\r\n");
      out.write("            var wrapper = document.querySelector(\".wrapper\");\r\n");
      out.write("\r\n");
      out.write("            //What will change if you move the mouse over the sidebar\r\n");
      out.write("\r\n");
      out.write("            li_items.forEach((li_item) => {\r\n");
      out.write("                li_item.addEventListener(\"mouseenter\", () => {\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    li_item.closest(\".wrapper\").classList.remove(\"hover_collapse\");\r\n");
      out.write("                    //I have already added style information about hover_collapse\r\n");
      out.write("\r\n");
      out.write("                })\r\n");
      out.write("                //In general, hover_collapse will be applied on the sidebar.\r\n");
      out.write("\r\n");
      out.write("                //Hover_collapse will be removed from the sidebar when the mouse is moved\r\n");
      out.write("            })\r\n");
      out.write("\r\n");
      out.write("            li_items.forEach((li_item) => {\r\n");
      out.write("                li_item.addEventListener(\"mouseleave\", () => {\r\n");
      out.write("\r\n");
      out.write("                    li_item.closest(\".wrapper\").classList.add(\"hover_collapse\");\r\n");
      out.write("                    //Hover Collapse will be applied again when the mouse is removed\r\n");
      out.write("\r\n");
      out.write("                })\r\n");
      out.write("            })\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            //Now I will execute the menu button\r\n");
      out.write("\r\n");
      out.write("            //I have instructed here that hover_collapse will be applied and removed when the menu button is clicked.\r\n");
      out.write("\r\n");
      out.write("            //This means that the first click will be applied and the second click will be removed\r\n");
      out.write("            hamburger.addEventListener(\"click\", () => {\r\n");
      out.write("\r\n");
      out.write("                hamburger.closest(\".wrapper\").classList.toggle(\"hover_collapse\");\r\n");
      out.write("            })\r\n");
      out.write("        </script>\r\n");
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
      out.write("    </div><br><br>\r\n");
      out.write("</body>\r\n");
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
