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
              <h1>Consultar cliente</h1>
<form method="post" action="Cliente">
  
       <table>
                <tr>
                    <th> No. Documento Cliente
                        <input type="number" name="TextNumDoc" >
                        <button onclick="return confirm('¿Deseas consultar este cliente?')">Consultar Cliente</button>
                    </th>
                </tr>
                 
             
            </table><br><br>
            <input type="hidden"value="3"  name="opcion">
            <a href="DatosCliente.jsp">Consulta General</a>
             <a href="ModalCliente.jsp">Consulta No.Documento Disponibles</a>
        
          
            
            
        </form><br><br>
        <% if (request.getAttribute("MensajeError")  !=null) {%>
         ${MensajeError} 
           <%  }  else {%>
                   ${MensajeExito}
                   <%}%><br><br>
                   
                   <form><center>
                              
                    
    </body>
</html>
