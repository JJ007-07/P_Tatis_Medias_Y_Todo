/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.USUROLDAO;
import ModeloVO.USUROLVO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author User
 */
@WebServlet(name = "UsuRolControlador", urlPatterns = {"/UsuRol"})
public class UsuRolControlador extends HttpServlet {

    
   /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //1. Recibir datos de las vistas
        String IdUsuario = request.getParameter("IdUsuario");
        String IdRol = request.getParameter("IdRol");
      
        
        int opcion = Integer.parseInt(request.getParameter("opcion"));

        //2. ¿Quién tiene los datos de forma segura? VO
        USUROLVO urVO = new USUROLVO(IdUsuario,IdRol);

        //3. ¿Quién hace las operaciones? DAO
        USUROLDAO urDAO = new USUROLDAO(urVO);

        //4. Administrar  Operaciones
        switch (opcion) {

            case 1: //Agregar Registro
                if (urDAO.agregarRegistro()) {

                    request.setAttribute("mensajeExito", "<center><h2>El rol fue asignado</h2></center>");

                } else {
                    request.setAttribute("mensajeError", "<center><h2>El rol no fue asignado</h2></center>");

                }
                request.getRequestDispatcher("Registroasig.jsp").forward(request, response);
                break;
                
            case 2:  //Actualizar REgistro
                if (urDAO.actualizarRegistro()) {

                    request.setAttribute("mensajeExito", "<center><h2>El usuario se actualizo correctamente</center></h2>");

                } else {
                    request.setAttribute("mensajeError", "<center><h2>El usuario NO se actualizo correctamente</center></h2>");

                }
                request.getRequestDispatcher("ConsultarUsuario.jsp").forward(request, response);
                break;

 

}
    }
}
