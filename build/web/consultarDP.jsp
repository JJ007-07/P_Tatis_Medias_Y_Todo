<%-- 
    Document   : consultarDP
    Created on : 9/08/2022, 08:29:20 PM
    Author     : Alexis
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="Util.ConexionDB"%>
<%@page import="Util.ConexionDB"%>
<%@page import="ModeloDAO.DetallePDAO"%>
<%@page import="java.util.ArrayList"%>

<%@page import="ModeloVO.DetallePedidoVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link href="Estilos/estilos2.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h1>Detalle Pedido</h1>
        <%
    ConexionDB con = new ConexionDB();
    Statement smt;
    ResultSet rs;
    smt = con.obtenerConexion().createStatement();
    rs = smt.executeQuery("select * from detalle_pedido");
    %>
    
     <div style="padding-left: 800px">    
             <div  class="container buscar">
                 <center>
                 <form class="form" >
                <input type="text" name="txtbuscar">
                <input type="submit" value="Buscar">
                 </form></center></center>
                 <% 
String nombuscar=request.getParameter("txtbuscar");
if(nombuscar!=null){
    smt=con.obtenerConexion().createStatement();
    rs=smt.executeQuery("select* from detalle_pedido where IdPedidoFK LIKE"+"'%"+nombuscar+"%' OR IdProductoFK LIKE"+"'%"+nombuscar+"%' OR PrecioUnitario LIKE"+"'%"+nombuscar+"%' OR Cantidad  LIKE"+"'%"+nombuscar+"%' ");

}else{
    System.err.print("Error");
}
                 %>
        <div class="container">               
            <a  class="btn btn-success" href="registrarDP.jsp">Nuevo Registro</a>         
             <table class="table table-bordered"  id="tablaDatos">
                    <thead>
                        <tr>
                            <th class="text-center">Id Pedido FK </th>
                            <th class="text-center">Id Producto FK</th>
                            <th class="text-center">Precio Unitario</th>
                            <th class="text-center">Cantidad</th>
                              <th class="text-center">Acciones</th>
                        </tr>
                    </thead>
                    <tbody id="tbodys">
                        <%
                            while (rs.next()) {
                        %>
                        <tr>
                            <td class="text-center"><%= rs.getInt("IdPedidoFK")%></td>
                             <td class="text-center"><%= rs.getString("IdProductoFK")%></td>
                             <td class="text-center"><%= rs.getString("PrecioUnitario")%></td>
                            <td class="text-center"><%= rs.getString("Cantidad")%></td>
                  
                            <td class="text-center">
                                
                                <!-- <input type="hidden" value="<//%= rs.getInt("IdPedido")%>" id="Editar"/>
                                <input type="submit" class="btn btn-warning" data-toggle="modal" data-target="#myModal1" value="Editar"/>  -->
                                <a href="ActualizarDP.jsp?IdPedidoFK=<%= rs.getInt("IdPedidoFK")%>" ><img src="IMG/Actualizar.png" width="60px" height="60px"/></a>
                          
                                
                                <a href="eliminarDP.jsp?IdPedidoFK=<%= rs.getInt("IdPedidoFK")%>" ><img src="IMG/Eliminar.png"width="60px" height="60px" /></a>
                               
                            </td>
                        </tr>
                        <%}%>
                </table>
                       
        <script src="js/jquery.js" type="text/javascript"></script>             
        <script src="js/bootstrap.min.js" type="text/javascript"></script>        
                 
             
           
</html>

    </body>
</html>
