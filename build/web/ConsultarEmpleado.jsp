<%-- 
    Document   : consultarEmpleado
    Created on : 15/08/2022, 06:25:15 PM
    Author     : User
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="Util.ConexionDB"%>
<%@page import="Util.ConexionDB"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.EmpleadoDAO"%>
<%@page import="ModeloVO.EmpleadoVO"%>
<%@page import="ModeloVO.UsuarioVO"%> 
<%@page import="ModeloDAO.UsuarioDAO"%> 

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="Estilos/estilos2.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <title>Consultar</title>
    </head>
 
          <center>
        <h1>Empleado</h1>
       
                    
      <form method="post" action="Empleado">
            <table>
                <tr>
                    <th> Numero de documento
                        <input type="number" name="textNumDoc" >
                        <button onclick="return confirm('¿Deseas consultar este empleado?')">Consultar </button>
                        
                    </th>
                </tr>
                 
             
            </table><br><br>
            <input type="hidden" value="3"  name="opcion">
             <a href="DatosEmpleado.jsp">Consulta General</a>
             <a href="ModalEmpleado.jsp">Consulta No.Cedula Disponibles</a>
            
             <% if (request.getAttribute("mensajeError")  !=null) {%>
         ${mensajeError} 
           <%  }  else {%>
                   ${mensajeExito}
                   <%}%><br><br>
                   
            
      </form>  
          </center>
    </body>
</html>
