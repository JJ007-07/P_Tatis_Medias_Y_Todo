<%-- 
    Document   : ConsultarCliente
    Created on : 16/08/2022, 06:38:46 PM
    Author     : User
--%>

<<%@page import="java.sql.PreparedStatement"%>
<%@page import="Util.ConexionDB"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.ClienteDAO"%>
<%@page import="ModeloVO.ClienteVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="Estilos/estilos2.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            
           <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
           <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.2.0/css/bootstrap.min.css"/>
        <link href="https://cdn.datatables.net/1.12.1/css/dataTables.bootstrap5.min.css"/>
        <title>Consultar</title>
    </head>
  <body>
  <center>   <h1>Cliente</h1></center>
           <%
            //CONECTANOD A LA BASE DE DATOS:
                  
    ConexionDB con = new ConexionDB();
    Statement smt;
    ResultSet rs;
    smt = con.obtenerConexion().createStatement();
    rs = smt.executeQuery("select * from Categoria");
%>
    
  
        <br>
        <div class="container">               
            <!--<a  class="btn btn-success" href="Agregar.jsp">Nuevo Registro</a> Esto es Cuando se Crea un nuevo Archivo Agregar.jsp -->         
             <table class="table table-bordered"  id="tablaDatos">
                    <thead>
                        <tr>
                            <th class="text-center">Id</th>
                            <th class="text-center">Nombre Categoria</th>
                            <th class="text-center">Acciones</th>

                            
                            
                           
                        </tr>
                    </thead>
                    <tbody id="tbodys">
                        <%
                            while (rs.next()) {
                        %>
                        <tr>
                            <td class="text-center"><%= rs.getInt("IdCategoria")%></td>
                             <td class="text-center"><%= rs.getString("NombreCategoria")%></td>
                           
                            <td class="text-center">
                                
                                <!-- <input type="hidden" value="<//%= rs.getInt("Id_Usuario")%>" id="Editar"/>
                                <input type="submit" class="btn btn-warning" data-toggle="modal" data-target="#myModal1" value="Editar"/>  -->
                                <a href="EliminarCategoria.jsp?IdCategoria=<%= rs.getInt("IdCategoria")%> "><img src="IMG/Eliminar.png" width="60px" height="60px"/></a>
                                <a href="ActualizarCategoria.jsp?IdCategoria=<%= rs.getInt("IdCategoria")%>" ><img src="IMG/Actualizar.png" width="60px" height="60px"/></a>
                             
                            </td>
                        </tr>
                        <%}%>
                </table>
                       
        <script src="js/jquery.js" type="text/javascript"></script>             
        <script src="js/bootstrap.min.js" type="text/javascript"></script> 
        <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script src="https://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.12.1/js/dataTables.bootstrap5.min.js"></script> 
<script>
    $(document).ready(function () {
    $('#tablaDatos').DataTable();
});
</script>
                    
    </body>
</html>
