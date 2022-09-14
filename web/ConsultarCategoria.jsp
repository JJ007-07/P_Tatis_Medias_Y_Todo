<%@page import="Util.ConexionDB"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloVO.CategoriaVO"%>
<%@page import="ModeloDAO.CategoriaDAO"%>
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
    rs = smt.executeQuery("select * from categoria");
%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="es">
    <head>
        <title>Consultar Categorias</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    </head>
    <body style="background-color: #8fc4b7;">
        <section class="h-100 h-custom">
            <div class="container py-5 h-100">
                <div class="row d-flex justify-content-center align-items-center h-100">
                    <div class="col-lg-8 col-xl-6">
                        <div class="card rounded-3">
                            <img src="https://www.lucushost.com/blog/wp-content/uploads/2019/06/a%C3%B1adir-categor%C3%ADas-en-WordPress.png" class="w-100" style="border-top-left-radius: .3rem; border-top-right-radius: .3rem;" alt="Sample photo">
                            <div class="card-body p-4 p-md-5">
                                <h3 class="mb-4 pb-2 pb-md-0 mb-md-5 px-md-2">Consultar Información De Las Categorias</h3>
                                <form method="post" action="Categoria">
                                    <div class="form-outline mb-4">
                                        <input max="100000" type="number" name="txtid" class="form-control" required>
                                        <label class="form-label" for="form3Example1q">Id De La Cateogria</label>
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
                                                                            <th class="text-center">ID DE LA CATEGORÍA</th>
                                                                        </tr>
                                                                    </thead>
                                                                    <tbody id="tbodys">


                                                                        <%
                                                                            while (rs.next()) {
                                                                        %>

                                                                        <tr>
                                                                            <td class="text-center"><%= rs.getString("IdCategoria")%></td>

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
                                          <button type="submit" class="btn btn-primary btn-lg" style="margin-bottom: 4px;"><a href="DatosCategoria.jsp" style="color: #FFFFFF; text-decoration: none;">Ver categorías registrados</a></button>

                                        <button onclick="return confirm('¿Deseas consultar esta Categoria?')" class="btn btn-primary btn-lg">Consultar</button>
                                        <input type="hidden" value="4" name="opcion">
                                        </form>
                                        <%if (request.getAttribute("mensajeError") != null) {%>
                                        ${mensajeError}
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