<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloVO.ProductoVO"%>
<%@page import="ModeloDAO.ProductoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
    rs = smt.executeQuery("select * from producto limit 10");
%>

<!DOCTYPE html>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">

<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">

<!------ Include the above in your HEAD tag ---------->

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <!--Made with love by Mutiullah Samim -->

        <!--Bootsrap 4 CDN-->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

        <!--Fontawesome CDN-->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">

        <!--Custom styles-->
        <link href="Estilos/estilos2.css" rel="stylesheet" type="text/css"/>

    </head>

    <body>

    <center>
        <div>

            <h1>Consultar Producto</h1>


            <div class="busqueda">
                <form method="post" action="Producto">


                    <th class="letra">Codigo de Barras <br>
                        <input type="text" name="txtcodigoB">
                        <button>Consultar</button>
                        <input type="hidden" value="4" name="opcion">    

                    </th>

                    <div class="container">               
                        <table class="table table-bordered"  id="tablaDatos">
                            <thead>
                                <tr>
                                    <th class="text-center">Codigos Disponibles</th>
                                    <th class="text-center">Referencia</th>
                                    <th class="text-center">Descripcion</th>
                                    <th class="text-center">Stock disponible</th>
                                    <th class="text-center">Precio por unidad</th>
                                </tr>
                            </thead>
                            <tbody id="tbodys">
                            <br><br><br>

                            <%
                                while (rs.next()) {
                            %>

                            <tr>
                                <td class="text-center"><%= rs.getString("CodigoDeBarrasProducto")%></td>
                                <td class="text-center"><%= rs.getString("ReferenciaProducto")%></td>
                                <td class="text-center"><%= rs.getString("DescripcionProducto")%></td>
                                 <td class="text-center"><%= rs.getString("StockProducto")%></td>
                                  <td class="text-center"><%= rs.getString("PrecioUnitario")%></td>




                            </tr>
                            <%}%>
                        </table>    
                    </div>   


                </form>
            </div>




            <%
                if (request.getAttribute("MensajeError") != null) {%>

            ${MensajeError}
            <% } else { %>
            ${MensajeExito}


            <% }%>



    </center>
</body>
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</html>