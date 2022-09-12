<%-- 
    Document   : ConsultarPedido
    Created on : 6/08/2022, 07:02:53 PM
    Author     : Alexis
--%>

<%@page import="Util.ConexionDB"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloVO.PedidoVO"%>
<%@page import="ModeloDAO.PedidoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
    <center>  <h1>Pedido consultar</h1></center>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
        <title>Pedido consultar</title>
        <body>
   <form method="post" action="Pedido">
  
       <table>
                <tr>
                    <th> Id Pedido
                        <input type="number" name="txtPedido" >
                        <button onclick="return confirm('¿Deseas consultar este pedido?')">Consultar Pedido</button>
                    </th>
                </tr>
                 
             
            </table><br><br>
            <input type="hidden"value="4"  name="opcion">
            <a href="DatosPedido.jsp">Consulta General</a>
             <a href="ModalPedido.jsp">Consulta Id Disponibles</a>
        
          
            
            
        </form><br><br>
        <% if (request.getAttribute("MensajeError")  !=null) {%>
         ${MensajeError} 
           <%  }  else {%>
                   ${MensajeExito}
                   <%}%><br><br>
                   
                   <form><center>
                       
             
</head>
</body>
</html>