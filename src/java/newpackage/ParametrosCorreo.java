package newpackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author juanb
 */
@WebServlet(urlPatterns = {"/Parametros"})
public class ParametrosCorreo extends HttpServlet {

   
    
    private String host;
    private String puerto;
    private String usuario;
    private String clave;
    
    public void init(){
        
        ServletContext context = getServletContext();
        
        host = context.getInitParameter("host");
        puerto = context.getInitParameter("puerto");
        usuario = context.getInitParameter("suario");
        clave = context.getInitParameter("clave");
        
    }

    

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String Usu = request.getParameter("textUsuario");
        String Cla = request.getParameter("textClave");
        String Est = request.getParameter("textEstado");
        String resultadoMensaje = "";
        
        try {
            
            EnvioCorreo.envioCorreo(host, puerto, usuario, clave, Usu, Cla, Est);
            resultadoMensaje="El mensaje se envio de forma correcta";
        } catch (Exception e) {
            e.printStackTrace();
            resultadoMensaje="Error al enviar el mensaje "+e.getMessage();
        }finally{
            request.setAttribute("mensaje", resultadoMensaje);
            getServletContext().getRequestDispatcher("/resultado.jsp").forward(request, response);
        }
    }

  
}
