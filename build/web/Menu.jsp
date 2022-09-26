<%@page import="Controlador.Sesiones"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="ModeloVO.PedidoVO"%>
<%@page import="ModeloDAO.PedidoDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloVO.UsuarioVO"%>
<%@page import="ModeloVO.USUROLVO"%>
<%@page import="ModeloDAO.USUROLDAO"%>
<%@include file='Sesiones.jsp'%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%    Connection con;
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
    rs = smt.executeQuery("select * from producto limit 12");
    rs2 = smt2.executeQuery("select FechaPedido, P.CodigoDeBarrasProducto, P.ReferenciaProducto, NumeroFacturaPedido from pedido inner join producto as P on IdPedido = P.IdProducto");
    rs3 = smt3.executeQuery("select FechaPedido, P.CodigoDeBarrasProducto, P.ReferenciaProducto, NumeroFacturaPedido from pedido inner join producto as P on IdPedido = P.IdProducto");
    rs4 = smt4.executeQuery("select FechaPedido, P.CodigoDeBarrasProducto, P.ReferenciaProducto, NumeroFacturaPedido from pedido inner join producto as P on IdPedido = P.IdProducto");
    rs5 = smt5.executeQuery("select FechaPedido, P.CodigoDeBarrasProducto, P.ReferenciaProducto, NumeroFacturaPedido from pedido inner join producto as P on IdPedido = P.IdProducto");
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
                    <a href="./registrarEmpleado.jsp" class="active">
                        <i class='bx bx-user' ></i>
                        <span class="links_name">Empleados</span>
                    </a>
                </li>
                <li>
                    <a href="./registrarCliente.jsp">
                        <i class='bx bxs-user'></i>
                        <span class="links_name">Clientes</span>
                    </a>
                </li>
                <li>
                    <a href="./registrarProveedor.jsp">
                        <i class=' bx bxs-truck' ></i>
                        <span class="links_name">Proveedores</span>
                    </a>
                </li>
                <li>
                    <a href="./RegistrarCategoria.jsp">
                        <i class=' bx bxs-bookmarks' ></i>
                        <span class="links_name">Categorias</span>
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
                <li>
                    <a href="./registrarProducto.jsp">
                        <i class=' bx bxs-shopping-bags' ></i>
                        <span class="links_name">Productos</span>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <i class='bx bxs-file-blank' ></i>
                        <span class="links_name">Reportes</span>
                    </a>
                </li>
                <li>
                    <a href="Registroasig">
                        <i class=' bx bxs-user-check' ></i>
                        <span class="links_name">Roles</span>
                    </a>
                </li>

<<<<<<< HEAD
                <li class="log_out">
                    <a href="">
                        <i class='bx bx-log-out'></i>
                        <form method="post" action="Sesiones">
                            <button style="cursor: pointer; text-decoration: none; all: unset;"><span class="links_name">Cerrar Sesion</span></button>
                        </form>
                    </a>
                </li>
            </ul>
=======
            <div class="sidebar">

                <div class="sidebar_inner">

                    <ul>    


                        <li>
                            <a href="registrarEmpleado.jsp">
                                <span class="icon"><i class="fa-solid fa-users"></i></i></span>


                                <span class="text">Empleado</span>
                            </a>
                        </li>
                        <li>
                            <a href="registrarCliente.jsp">
                                <span class="icon"><i class="fa fa-user"></i></span>
                                <span class="text">Cliente</span>
                            </a>
                        </li>
                        <li>
                            <a href="registrarProveedor.jsp">
                                <span class="icon"><i class="fa-solid fa-truck-field"></i></i></span>
                                <span class="text">Proveedor</span>
                            </a>
                        </li>
                        <li>
                            <a href="RegistrarCategoria.jsp">
                                <span class="icon"><i class="fa-solid fa-list"></i></i></span>
                                <span class="text">Categoria</span>
                            </a>
                        </li>
                        <li>
                            <a href="RegistrarVenta.jsp">
                                <span class="icon"><i class="fa-solid fa-receipt"></i></span>
                                <span class="text">Ventas</span>
                            </a>
                        </li>
                        <li>
                            <a href="registrarPedido.jsp">
                                <span class="icon"><i class="fa-solid fa-box"></i></span>
                                <span class="text">Pedido</span>
                            </a>
                        </li>
                        <li>
                            <a href="registrarProducto.jsp">
                                <span class="icon"><i class="fa-solid fa-bag-shopping"></i></span>
                                <span class="text">Producto</span>
                            </a>
                        </li>
                        <li>
                            
                        
                                
                                    <a href="Reportes/RPT1.jsp">
                                <span class="icon"><i class="fa-solid fa-file"></i></span>
                                <span class="text">Reportes</span>
                            </a>
                        </li>
                         <li>
                            <a href="Registroasig.jsp">
                                <span class="icon"><i class="fa-user-plus"></i></span>
                                <span class="text">Asignar rol</span>
                            </a>
                        </li>
                        <li>
                            
                                  <form method="post" action="Sesiones">
                                
                                      <a href="">    
                                <span class="icon"><i class="fa fa-sign-out"></i></span>
                                <span class="text"> 
                                      <button >Cerrar</button></span>
                                    </a>
                               </form>
       
                        </li>
                             

                    </ul>
                </div>
            </div>



>>>>>>> origin/Jessika
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
                            <div class="box-topic">Productos Disponible</div>
                            <div class="number">120</div>
                            <div class="indicator">
                                <i class='bx bx-up-arrow-alt'></i>
                                <span class="text">A partir de hoy</span>
                            </div>
                        </div>
                        <i class='bx bxs-shopping-bags cart three' ></i>
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
                        <div class="title">Información Actual De Los Pedidos</div>
                        <div class="sales-details">
                            <ul class="details">
                                <li class="topic">Fecha Del Pedido</li>
                                    <%
                                        while (rs2.next()) {
                                    %>
                                <li class="topic"><%= rs2.getString("FechaPedido")%></li>
                                    <%}%>
                            </ul>
                            <ul class="details">
                                <li class="topic">Codigo De Barras Del Producto</li>
                                    <%
                                        while (rs3.next()) {
                                    %>
                                <li class="topic"><%= rs3.getString("CodigoDeBarrasProducto")%></li>
                                    <%}%>
                            </ul>
                            <ul class="details">
                                <li class="topic">Referencia Del Producto</li>
                                    <%
                                        while (rs4.next()) {
                                    %>
                                <li class="topic"><%= rs4.getString("ReferenciaProducto")%></li>
                                    <%}%>
                            </ul>
                            <ul class="details">
                                <li class="topic">Número De Factura Del Pedido</li>
                                    <%
                                        while (rs5.next()) {
                                    %>
                                <li class="topic"><%= rs5.getString("NumeroFacturaPedido")%></li>
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
                                    <th>Precio</th>
                                </tr>
                            </thead>
                            <tbody id="tbodys">


                                <%
                                    while (rs.next()) {
                                %>

                                <tr>
                                    <td class="text-center"><%= rs.getString("DescripcionProducto")%></td>
                                    <td class="text-center"><%= rs.getString("PrecioUnitario")%></td>
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