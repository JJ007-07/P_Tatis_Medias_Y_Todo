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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\t<title>Usuario</title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://necolas.github.io/normalize.css/8.0.1/normalize.css\">\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap\" rel=\"stylesheet\"> \n");
      out.write("        <link href=\"Estilos/estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("        <link href=\"css/default.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/CheckPassword.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"Estilos/CheckPassword.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <main>\n");
      out.write("\t\t <h1 class=\"titulo\">Registrar Usuario</h1>\n");
      out.write("                 \n");
      out.write("                \n");
      out.write("           <form class=\"formulario\" id=\"formulario\" name=\"fmrUsuarios\" method=\"post\" action=\"Usuario\" onSubmit=\"return validarfor(); checkForm(this); return false;\"   >\n");
      out.write("            \n");
      out.write("            <!-- Grupo: Correo Electronico -->\n");
      out.write("\t\t\t<div class=\"formulario__grupo\" id=\"grupo__correo\">\n");
      out.write("\t\t\t\t<label for=\"correo\" class=\"formulario__label\">Usuario</label>\n");
      out.write("\t\t\t\t<div class=\"formulario__grupo-input\">\n");
      out.write("\t\t\t\t\t<input type=\"email\" class=\"formulario__input\" name=\"textUsuario\" id=\"mail\" placeholder=\"correo@correo.com\">\n");
      out.write("\t\t\t\t\t<i class=\"formulario__validacion-estado fas fa-times-circle\"></i>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<!-- Grupo: Contraseña -->\n");
      out.write("                        \n");
      out.write("\t\t\t<div class=\"formulario__grupo\" id=\"grupo__password\" Onkeypress=\"enterEnviar(event);\">\n");
      out.write("\t\t\t\t<label for=\"password\" class=\"formulario__label\">Contraseña</label>\n");
      out.write("\t\t\t\t<div class=\"formulario__grupo-input\">\n");
      out.write("                                     <input type=\"password\" class=\"formulario__input password1\"  name=\"textClave\" id=\"txtPassword\" placeholder=\"\"/>\n");
      out.write("\t\t\t\t\t\n");
      out.write("                                        <span class=\"fa fa-fw fa-eye password-icon show-password\"></span>\n");
      out.write("                                        <div id=\"strengthMessage\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t \n");
      out.write("                                       \n");
      out.write("\t\t\t</div>\n");
      out.write("                        <script>\n");
      out.write("  window.addEventListener(\"load\", function() {\n");
      out.write(" \n");
      out.write("    // icono para poder interaccionar con el elemento\n");
      out.write("    showPassword = document.querySelector('.show-password');\n");
      out.write("    showPassword.addEventListener('click', () => {\n");
      out.write(" \n");
      out.write("      // elementos input de tipo password\n");
      out.write("      password1 = document.querySelector('.password1');\n");
      out.write("  \n");
      out.write(" \n");
      out.write("      if ( password1.type === \"text\" ) {\n");
      out.write("        password1.type = \"password\"\n");
      out.write("        \n");
      out.write("        showPassword.classList.remove('fa-eye-slash');\n");
      out.write("      } else {\n");
      out.write("        password1.type = \"text\"\n");
      out.write("       \n");
      out.write("        showPassword.classList.toggle(\"fa-eye-slash\");\n");
      out.write("      }\n");
      out.write("  })\n");
      out.write("});\n");
      out.write("</script> \n");
      out.write("<script> \n");
      out.write("function checkPassword(valor){\n");
      out.write("    var myregex = /^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}$/; \n");
      out.write("   if(myregex.test(valor)){\n");
      out.write("       alert(valor+\" es valido :-) !\");\n");
      out.write("       return true;        \n");
      out.write("   }else{\n");
      out.write("      alert(valor+\" NO es valido!\");\n");
      out.write("       return false;        \n");
      out.write("   }   \n");
      out.write("}\n");
      out.write("function checkForm(form){\n");
      out.write("if(form.textClave.length == 0 ) {\n");
      out.write("      if(!checkPassword(form.textClave.value)) {\n");
      out.write("        alert(\"La contraseña no es valida!\");\n");
      out.write("        form.textClave.focus();\n");
      out.write("        return false;\n");
      out.write("      }\n");
      out.write("    } \n");
      out.write("    return true;\n");
      out.write("  }\n");
      out.write("</script>\n");
      out.write("</script>\n");
      out.write("                        <!-- Grupo: Estado oculto -->\n");
      out.write("                         <input type=\"hidden\" readonly read value=\"Activo\" name=\"textEstado\"><br><br>\n");
      out.write("                         \n");
      out.write("\n");
      out.write("                \n");
      out.write("\t\t<!-- Grupo: Terminos y Condiciones -->\n");
      out.write("\t\t\t<div class=\"formulario__grupo\" id=\"grupo__terminos\">\n");
      out.write("\t\t\t\t<label class=\"formulario__label\">\n");
      out.write("\t\t\t\t\t<input class=\"formulario__checkbox\" type=\"checkbox\" name=\"terminos\" id=\"terminos\">\n");
      out.write("\t\t\t\t\tAcepto los Terminos y Condiciones\n");
      out.write("\t\t\t\t</label>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"formulario__mensaje\" id=\"formulario__mensaje\">\n");
      out.write("\t\t\t\t<p><i class=\"fas fa-exclamation-triangle\"></i> <b>Error:</b> Por favor rellena el formulario correctamente. </p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"formulario__grupo formulario__grupo-btn-enviar\">\n");
      out.write("                              <input type=\"hidden\" value=\"1\" name=\"opcion\" class=\"btn float-right login_btn\">\n");
      out.write("                  \t\t<button type=\"submit\" class=\"formulario__btn\"onclick=\"validarContraseña()\" >Registrar</button>\n");
      out.write("                                <p class=\"formulario__mensaje-exito\" id=\"formulario__mensaje-exito\">Formulario enviado exitosamente!</p>\n");
      out.write("                \t</div>\n");
      out.write("\t\t\n");
      out.write(" </main>\n");
      out.write("    </form>\n");
      out.write("     \n");
      out.write("      \n");
      out.write("        </div>\n");
      out.write("      \n");
      out.write("          <div class=\"tres\"> \n");
      out.write("                         \n");
      out.write("                                         ");
 
                                         if(request.getAttribute("MensajeError") !=null) {
      out.write("\n");
      out.write("                                         ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("           \n");
      out.write("               \n");
      out.write("                                         ");
}else {
      out.write("\n");
      out.write("                                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("  \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        \n");
      out.write("     </div>\n");
      out.write("                                        \n");
      out.write("\n");
      out.write("     <script src=\"https://kit.fontawesome.com/2c36e9b7b1.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script>\n");
      out.write("    function validarfor(){\n");
      out.write("\n");
      out.write("var correo = document.getElementById(\"mail\").value; \n");
      out.write("\n");
      out.write("var expr = /^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$/;\n");
      out.write("\n");
      out.write("if ( !expr.test(correo) ){                                                            //COMPRUEBA MAIL\n");
      out.write("    alert(\"Error: La dirección de correo \" + correo + \" es incorrecta.\");\n");
      out.write("    return false;\n");
      out.write("}\n");
      out.write("    }\n");
      out.write("    function validar() {\n");
      out.write("        //obteniendo el valor que se puso en campo text del formulario\n");
      out.write("        correo = document.getElementById(\"mail\").value;\n");
      out.write("       \n");
      out.write("        //la condición\n");
      out.write("        if (correo.length == 0) {\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("         if (correo.length == 0 || /^\\s+$/.test(correo)) {\n");
      out.write("     alert('El Correo esta vacio!');\n");
      out.write("     return false;\n");
      out.write(" }\n");
      out.write(" \n");
      out.write("        return true;\n");
      out.write("    }\n");
      out.write(" \n");
      out.write("    </script>                            \n");
      out.write("    </body>\n");
      out.write("    </center>\n");
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
