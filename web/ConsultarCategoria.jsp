<%-- 
    Document   : ConsultarUsuario
    Created on : 12/08/2022, 05:26:13 PM
    Author     : User
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="Util.ConexionDB"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.CategoriaDAO"%>
<%@page import="ModeloVO.CategoriaVO"%>
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
              <h1>Consultar categoria</h1>
<form method="post" action="Categoria">
  
       <table>
                <tr>
                    <th> Consultar Id Categoria
                        <input type="number" name="txtid" >
                        <button onclick="return confirm('¿Deseas consultar esta categoria?')">Consultar Categoria</button>
                    </th>
                </tr>
                 
             
            </table><br><br>
            <input type="hidden"value="4"  name="opcion">
            <a href="DatosCategoria.jsp">Consulta General</a>
             <a href="ModalCategoria.jsp">Consultar Id Disponibles</a>
        
          
            
            
        </form><br><br>
        <% if (request.getAttribute("MensajeError")  !=null) {%>
         ${MensajeError} 
           <%  }  else {%>
                   ${MensajeExito}
                   <%}%><br><br>
                   
                   <form><center>
                              
                    
    </body>
</html>