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
    <center>  <h1> consultar detalle Pedido</h1></center>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
        <title>Detalle Pedido consultar</title>
        <body>
   <form method="post" action="DetallePedido">
  
       <table>
                <tr>
                    <th> Id detalle pedido FK
                        <input type="number" name="textIdPedidoFK" >
                        <button onclick="return confirm('¿Estas seguro de  consultar el detalle pedido ?')">Consultar Detalle Pedido</button>
                    </th>
                </tr>
                 
             
            </table><br><br>
            <input type="hidden"value="4"  name="opcion">
            <a href="DatosDP.jsp">Consulta General</a>
             <a href="ModalDP.jsp">Consulta Id Disponibles</a>
        
          
            
            
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