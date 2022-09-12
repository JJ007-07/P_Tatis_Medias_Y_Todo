<%-- 
    Document   : ConsultarUsuario
    Created on : 12/08/2022, 05:26:13 PM
    Author     : User
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="Util.ConexionDB"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page import="ModeloVO.UsuarioVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <link href="Estilos/estilos2.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <title>Consultar</title>
    </head>
  <body>
          <center>
              <h1>Usuario</h1>
<form method="post" action="Usuario">
  
       <table>
                <tr>
                    <th> Id Usuario
                        <input type="number" name="textId" >
                        <button onclick="return confirm('Estas seguro de consultar este usuario')">Consultar Pedido </button>
                    </th>
                </tr>
                 
             
            </table><br><br>
            <input type="hidden"value="4"  name="opcion" >
            <a href="DatosUsuario.jsp">Consulta General</a>
             <a href="ModalUsuario.jsp">Consulta Id Disponibles</a>
        
          
            
            
        </form><br><br>
        <% if (request.getAttribute("MensajeError")  !=null) {%>
         ${MensajeError} 
           <%  }  else {%>
                   ${MensajeExito}
                   <%}%><br><br>
                   
                   <form><center>
                              
                    
    </body>
</html>


 
