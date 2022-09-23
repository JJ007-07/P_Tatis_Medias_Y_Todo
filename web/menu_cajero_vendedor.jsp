<%@page import="Controlador.Sesiones"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloVO.ClienteVO"%>
<%@page import="ModeloDAO.ClienteDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloVO.UsuarioVO"%>
<%@page import="ModeloVO.USUROLVO"%>
<%@page import="ModeloDAO.USUROLDAO"%>
<%@include file='Sesiones.jsp'%>
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
    Statement smt2;
    Statement smt3;
    Statement smt4;
    Statement smt5;
    ResultSet rs;
    ResultSet rs2;
    ResultSet rs3;
    ResultSet rs4;
    ResultSet rs5;
    smt = con.createStatement();
    smt2 = con.createStatement();
    smt3 = con.createStatement();
    smt4 = con.createStatement();
    smt5 = con.createStatement();
    rs = smt.executeQuery("select DescripcionProducto, C.NombreCategoria from producto inner join categoria as C on IdCategoriaFK = C.IdCategoria limit 12");
    rs2 = smt2.executeQuery("select FechaventaMostrador, FormaventaMostrador, C.NombreCliente, C.ApellidoCliente from ventamostrador inner join cliente as C on IdClienteFK = C.IdCliente");
    rs3 = smt3.executeQuery("select FechaventaMostrador, FormaventaMostrador, C.NombreCliente, C.ApellidoCliente from ventamostrador inner join cliente as C on IdClienteFK = C.IdCliente");
    rs4 = smt4.executeQuery("select FechaventaMostrador, FormaventaMostrador, C.NombreCliente, C.ApellidoCliente from ventamostrador inner join cliente as C on IdClienteFK = C.IdCliente");
    rs5 = smt5.executeQuery("select FechaventaMostrador, FormaventaMostrador, C.NombreCliente, C.ApellidoCliente from ventamostrador inner join cliente as C on IdClienteFK = C.IdCliente");
%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <link rel="stylesheet" href="./Estilos/StyleMenu.css">
        <link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css' rel='stylesheet'>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Menu Principal</title>
    </head>
    <body>
        <div class="sidebar">
            <div class="logo-details">
                <i class=' bx bx-cog'></i>
                <span class="logo_name">J&K</span>
            </div>
            <ul class="nav-links">
                <li>
                    <a href="./registrarCliente.jsp">
                        <i class='bx bxs-user'></i>
                        <span class="links_name">Clientes</span>
                    </a>
                </li>
                <li>
                    <a href="./RegistrarVenta.jsp">
                        <i class=' bx bxs-cart'></i>
                        <span class="links_name">Ventas</span>
                    </a>
                </li>
                <li>
                    <a href="./registrarPedido.jsp">
                        <i class=' bx bxs-calendar-week' ></i>
                        <span class="links_name">Pedidos</span>
                    </a>
                </li>
                <li class="log_out">
                    <a href="">
                        <i class='bx bx-log-out'></i>
                        <form method="post" action="Sesiones">
                            <button style="cursor: pointer; text-decoration: none; all: unset;"><span class="links_name">Cerrar Sesion</span></button>
                        </form>
                    </a>
                </li>
            </ul>
        </div>
        <section class="home-section">
            <nav>
                <div class="sidebar-button">
                    <i class='bx bx-menu sidebarBtn' style="cursor: pointer;"></i>
                    <span class="dashboard">Menu</span>
                </div>
                <div class="profile-details">
                    <span class="admin_name"><%=Usuario%></span>
                </div>
            </nav>

            <div class="home-content">
                <div class="overview-boxes">
                    <div class="box">
                        <div class="right-side">
                            <div class="box-topic">Total De Pedidos</div>
                            <div class="number">10</div>
                            <div class="indicator">
                                <i class='bx bx-up-arrow-alt'></i>
                                <span class="text">A partir de hoy</span>
                            </div>
                        </div>
                        <i class='bx bx-cart-alt cart'></i>
                    </div>
                    <div class="box">
                        <div class="right-side">
                            <div class="box-topic">Total De Ventas</div>
                            <div class="number">5</div>
                            <div class="indicator">
                                <i class='bx bx-up-arrow-alt'></i>
                                <span class="text">A partir de hoy</span>
                            </div>
                        </div>
                        <i class='bx bxs-cart-add cart two' ></i>
                    </div>
                    <div class="box">
                        <div class="right-side">
                            <div class="box-topic">Clientes Recientes</div>
                            <div class="number">12</div>
                            <div class="indicator">
                                <i class='bx bx-up-arrow-alt'></i>
                                <span class="text">A partir de hoy</span>
                            </div>
                        </div>
                        <i class=' bx bx-user-plus cart four'></i>
                    </div>
                </div>

                <div class="sales-boxes">
                    <div class="recent-sales box">
                        <div class="title">Información Actual De Las Ventas</div>
                        <div class="sales-details">
                            <ul class="details">
                                <li class="topic">Fecha De La Venta</li>
                                    <%
                                        while (rs2.next()) {
                                    %>
                                <li class="topic"><%= rs2.getString("FechaventaMostrador")%></li>
                                    <%}%>
                            </ul>
                            <ul class="details">
                                <li class="topic">Forma De Pago De La Venta</li>
                                    <%
                                        while (rs3.next()) {
                                    %>
                                <li class="topic"><%= rs3.getString("FormaventaMostrador")%></li>
                                    <%}%>
                            </ul>
                            <ul class="details">
                                <li class="topic">Nombre Del Cliente</li>
                                    <%
                                        while (rs4.next()) {
                                    %>
                                <li class="topic"><%= rs4.getString("NombreCliente")%></li>
                                    <%}%>
                            </ul>
                            <ul class="details">
                                <li class="topic">Apellido Del Cliente</li>
                                    <%
                                        while (rs5.next()) {
                                    %>
                                <li class="topic"><%= rs5.getString("ApellidoCliente")%></li>
                                    <%}%>
                            </ul>
                        </div>
                    </div>
                    <div class="top-sales box">
                        <div class="title">Productos Más Vendidos</div>
                        <table class="table table-bordered"  id="tablaDatos">
                            <thead>
                                <tr>
                                    <th>Producto</th>
                                    <th>Categoria</th>
                                </tr>
                            </thead>
                            <tbody id="tbodys">


                                <%
                                    while (rs.next()) {
                                %>

                                <tr>
                                    <td class="text-center"><%= rs.getString("DescripcionProducto")%></td>
                                    <td class="text-center"><%= rs.getString("NombreCategoria")%></td>
                                </tr>
                                <%}%>


                        </table>
                    </div>
                </div>
            </div>
        </section>
        <script>
            let sidebar = document.querySelector(".sidebar");
            let sidebarBtn = document.querySelector(".sidebarBtn");
            sidebarBtn.onclick = function () {
                sidebar.classList.toggle("active");
                if (sidebar.classList.contains("active")) {
                    sidebarBtn.classList.replace("bx-menu", "bx-menu-alt-right");
                } else
                    sidebarBtn.classList.replace("bx-menu-alt-right", "bx-menu");
            }
        </script>
    </body>
</html>