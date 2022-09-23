package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloDAO.RolDAO;
import ModeloVO.RolVO;

public final class registrarUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT\" crossorigin=\"anonymous\">\r\n");
      out.write("    <script src=\"js/CheckPassword.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <link href=\"Estilos/estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    <link href=\"Estilos/CheckPassword.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("      \r\n");
      out.write("    <title>Registrarse</title>\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("    <section class=\"vh-100\" style=\"background-color: #eee;\">\r\n");
      out.write("  <div class=\"container h-100\">\r\n");
      out.write("    <div class=\"row d-flex justify-content-center align-items-center h-100\">\r\n");
      out.write("      <div class=\"col-lg-12 col-xl-11\">\r\n");
      out.write("        <div class=\"card text-black\" style=\"border-radius: 25px;\">\r\n");
      out.write("          <div class=\"card-body p-md-5\">\r\n");
      out.write("            <div class=\"row justify-content-center\">\r\n");
      out.write("              <div class=\"col-md-10 col-lg-6 col-xl-5 order-2 order-lg-1\">\r\n");
      out.write("\r\n");
      out.write("                <p class=\"text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4\">Registrarme</p>\r\n");
      out.write("\r\n");
      out.write("                <form class=\"mx-1 mx-md-4\" method=\"post\" action=\"Usuario\">\r\n");
      out.write("\r\n");
      out.write("                  <div class=\"d-flex flex-row align-items-center mb-4\">\r\n");
      out.write("                    <div class=\"form-outline flex-fill mb-0\">\r\n");
      out.write("                      <label class=\"form-label\" for=\"form3Example3c\" >Tú Correo Electronico</label>\r\n");
      out.write("                      <input type=\"email\" name=\"textUsuario\" id=\"mail\" class=\"form-control\" required>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("\r\n");
      out.write("                  <div class=\"d-flex flex-row align-items-center mb-4\">\r\n");
      out.write("                    <div class=\"form-outline flex-fill mb-0\">\r\n");
      out.write("                      <label class=\"form-label\" for=\"form3Example4c\">Tú Contraseña</label>\r\n");
      out.write("                      <input type=\"password\" name=\"textClave\" id=\"txtPassword\" class=\"form-control password1\" required>\r\n");
      out.write("                      <span class=\"fa fa-fw fa-eye password-icon show-password\"></span>\r\n");
      out.write("                      <div id=\"strengthMessage\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("\r\n");
      out.write("                  <input type=\"hidden\" readonly read value=\"Activo\" name=\"textEstado\">\r\n");
      out.write("\r\n");
      out.write("                  <div class=\"form-check d-flex justify-content-center mb-5\">\r\n");
      out.write("                    <input class=\"form-check-input me-2\" type=\"checkbox\" value=\"\" id=\"form2Example3c\" />\r\n");
      out.write("                    <label class=\"form-check-label\" for=\"form2Example3\">\r\n");
      out.write("                      Estoy De Acuerdo Con Los <a href=\"#!\">Terminos Y Condiciones</a>\r\n");
      out.write("                    </label>\r\n");
      out.write("                  </div>\r\n");
      out.write("\r\n");
      out.write("                  <div class=\"d-flex justify-content-center mx-4 mb-3 mb-lg-4\">\r\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary btn-lg\" onclick=\"return confirm('¿Estas seguro de registrar el usuario?')\" >Registrarme</button>\r\n");
      out.write("                  <input type=\"hidden\" value=\"1\" name=\"opcion\" >\r\n");
      out.write("\r\n");
      out.write("                  </div>\r\n");
      out.write("\r\n");
      out.write("                </form>\r\n");
      out.write("\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-md-10 col-lg-6 col-xl-7 d-flex align-items-center order-1 order-lg-2\">\r\n");
      out.write("\r\n");
      out.write("                <img src=\"./IMG/Log.svg\" style=\"padding-left: 25%; padding-right: 25%;\" class=\"img-fluid\" alt=\"Logo\">\r\n");
      out.write("\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</section>\r\n");
      out.write("<script src=\"https://kit.fontawesome.com/2c36e9b7b1.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    \r\n");
      out.write("                  <script>\r\n");
      out.write("  window.addEventListener(\"load\", function() {\r\n");
      out.write(" \r\n");
      out.write("    // icono para poder interaccionar con el elemento\r\n");
      out.write("    showPassword = document.querySelector('.show-password');\r\n");
      out.write("    showPassword.addEventListener('click', () => {\r\n");
      out.write(" \r\n");
      out.write("      // elementos input de tipo password\r\n");
      out.write("      password1 = document.querySelector('.password1');\r\n");
      out.write("  \r\n");
      out.write(" \r\n");
      out.write("      if ( password1.type === \"text\" ) {\r\n");
      out.write("        password1.type = \"password\"\r\n");
      out.write("        \r\n");
      out.write("        showPassword.classList.remove('fa-eye-slash');\r\n");
      out.write("      } else {\r\n");
      out.write("        password1.type = \"text\"\r\n");
      out.write("       \r\n");
      out.write("        showPassword.classList.toggle(\"fa-eye-slash\");\r\n");
      out.write("      }\r\n");
      out.write("  })\r\n");
      out.write("});\r\n");
      out.write("</script> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <script>\r\n");
      out.write("                    function checkPassword(valor) {\r\n");
      out.write("                        var myregex = /^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}$/;\r\n");
      out.write("                        if (myregex.test(valor)) {\r\n");
      out.write("                            alert(valor + \" es valido :-) !\");\r\n");
      out.write("                            return true;\r\n");
      out.write("                        } else {\r\n");
      out.write("                            alert(valor + \" NO es valido!\");\r\n");
      out.write("                            return false;\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                    function checkForm(form) {\r\n");
      out.write("                        if (form.textClave.length == 0) {\r\n");
      out.write("                            if (!checkPassword(form.textClave.value)) {\r\n");
      out.write("                                alert(\"La contraseña no es valida!\");\r\n");
      out.write("                                form.textClave.focus();\r\n");
      out.write("                                return false;\r\n");
      out.write("                            }\r\n");
      out.write("                        }\r\n");
      out.write("                        return true;\r\n");
      out.write("                    }\r\n");
      out.write("                </script>\r\n");
      out.write("               \r\n");
      out.write("<script src=\"https://kit.fontawesome.com/2c36e9b7b1.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("                        function validarfor() {\r\n");
      out.write("\r\n");
      out.write("                            var correo = document.getElementById(\"mail\").value;\r\n");
      out.write("\r\n");
      out.write("                            var expr = /^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$/;\r\n");
      out.write("\r\n");
      out.write("                            if (!expr.test(correo)) {                                                            //COMPRUEBA MAIL\r\n");
      out.write("                                alert(\"Error: La dirección de correo \" + correo + \" es incorrecta.\");\r\n");
      out.write("                                return false;\r\n");
      out.write("                            }\r\n");
      out.write("                        }\r\n");
      out.write("                        function validar() {\r\n");
      out.write("                            //obteniendo el valor que se puso en campo text del formulario\r\n");
      out.write("                            correo = document.getElementById(\"mail\").value;\r\n");
      out.write("\r\n");
      out.write("                            //la condición\r\n");
      out.write("                            if (correo.length == 0) {\r\n");
      out.write("                                return false;\r\n");
      out.write("                            }\r\n");
      out.write("\r\n");
      out.write("                            if (correo.length == 0 || /^\\s+$/.test(correo)) {\r\n");
      out.write("                                alert('El Correo esta vacio!');\r\n");
      out.write("                                return false;\r\n");
      out.write("                            }\r\n");
      out.write("\r\n");
      out.write("                            return true;\r\n");
      out.write("                        }\r\n");
      out.write("\r\n");
      out.write("</script>  \r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct\" crossorigin=\"anonymous\"></script>\r\n");
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
