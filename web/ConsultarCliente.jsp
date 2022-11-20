<%@page import="Util.ConexionDB"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloVO.ClienteVO"%>
<%@page import="ModeloDAO.ClienteDAO"%>
<%
    Connection con;
    String url = "jdbc:mysql://localhost:3306/tatis_media_y_todo";
    String Driver = "com.mysql.jdbc.Driver";
    String user = "root";
    String clave = "";
    Class.forName(Driver);
    con = DriverManager.getConnection(url, user, clave);
    Statement smt;
    ResultSet rs;
    smt = con.createStatement();
    rs = smt.executeQuery("select * from cliente");
%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="es">
    <head>
        <title>Consultar Clientes</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="Estilos/2.css" rel="stylesheet" type="text/css"/>
    </head>
    <body style="background-color: #999999;">
        <section class="h-100 h-custom">
            <div class="container py-5 h-100">
                <div class="row d-flex justify-content-center align-items-center h-100">
                    <div class="col-lg-8 col-xl-6">
                        <div class="card rounded-3">
                            <img src="https://www.microtech.es/hubfs/Fotos%20blog/retener_clientes.jpg" class="w-100" style="border-top-left-radius: .3rem; border-top-right-radius: .3rem;" alt="Sample photo">
                            <div class="card-body p-4 p-md-5">
                                <h3 class="mb-4 pb-2 pb-md-0 mb-md-5 px-md-2">Consultar Información De Los Clientes</h3>
                                <form class="px-md-2" method="post" action="Cliente">
                                    <div class="form-outline mb-4">
                                        <label class="form-label" for="form3Example1q">Número De Documento </label>
                                        <input  type="number" name="TextNumDoc" class="form-control" required>
                                        
                                    </div>
                                    <div>   
                                        <div class="form-outline mb-4">

                                            <!-- Button trigger modal -->
                                            <button type="button" class="btn btn-secondary" data-toggle="modal" data-target="#exampleModal">
                                                Ver Datos
                                            </button>

                                            <!-- Modal -->
                                            <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                                <div class="modal-dialog" role="document">
                                                    <div class="modal-content">
                                                        <div class="modal-header">
                                                            <h5 class="modal-title" id="exampleModalLabel">Información Disponible</h5>
                                                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                                <span aria-hidden="true">&times;</span>
                                                            </button>
                                                        </div>
                                                        <div class="modal-body">
                                                            <div class="container">               
                                                                <table class="table table-bordered"  id="tablaDatos">
                                                                    <thead>
                                                                        <tr>
                                                                            <th class="text-center">DOCUMENTO DE CLIENTES</th>
                                                                        </tr>
                                                                    </thead>
                                                                    <tbody id="tbodys">


                                                                        <%
                                                                            while (rs.next()) {
                                                                        %>

                                                                        <tr>
                                                                            <td class="text-center"><%= rs.getString("NumeroDocCliente")%></td>

                                                                        </tr>
                                                                        <%}%>
                                                                </table>    
                                                            </div>  
                                                        </div>
                                                        <div class="modal-footer">
                                                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                        </form>
                                                                 <button type="submit" class="btn btn-primary btn-lg" style="margin-bottom: 4px;"><a href="DatosCliente.jsp" style="color: #FFFFFF; text-decoration: none;">Ver usuarios registrados</a></button>

                                        <button onclick="return confirm('¿Deseas consultar este Cliente?')" class="btn btn-primary btn-lg">Consultar</button>
                                        <input type="hidden" value="3" name="opcion">
                                        <%if (request.getAttribute("mensajeError") != null) {%>
                                        ${MensajeError}
                                        <% } else {%>
                                        ${mensajeExito}
                                        <%}%>        
                                    </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    </body>
</html>