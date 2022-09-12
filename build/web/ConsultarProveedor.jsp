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
              <h1>Proveedor</h1>
<form method="post" action="EmpresaProveedora">
  
       <table>
                <tr>
                    <th> Nombre Comercial Proveedor
                        <input type="text" name="txtNombreC" >
                        <button onclick="return confirm('¿Estas seguro de consultar el proveedor?')">Consultar proveeedor</button>
                    </th>
                </tr>
                 
             
            </table><br><br>
            <input type="hidden"value="4"  name="opcion">
            <a href="DatosProveedor.jsp">Consulta General</a>
             <a href="ModalProveedor.jsp">Consulta Nombres Disponibles</a>
        
          
            
            
        </form><br><br>
        <% if (request.getAttribute("MensajeError")  !=null) {%>
         ${MensajeError} 
           <%  }  else {%>
                   ${MensajeExito}
                   <%}%><br><br>
                   
                   <form><center>
                              
                    
    </body>
</html>


 
