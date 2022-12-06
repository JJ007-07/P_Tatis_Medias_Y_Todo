<%-- 
    Document   : Principal
    Created on : 15/11/2022, 08:29:30 PM
    Author     : jtgt2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                <span class="logo_name">SISTEMATIC</span>
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
                    <a href="./RegistrarVentas.jsp">
                        <i class=' bx bxs-cart'></i>
                        <span class="links_name">Ventas</span>
                    </a>
                </li>
                <li>
                    <a href="./IngresarPedidos.jsp">
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
                    <a href="Reportes.jsp">
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


                <li class="log_out">
                    <a href="">
                        <i class='bx bx-log-out'></i>
                        <form method="post" action="Sesiones">
                            <button style="cursor: pointer; text-decoration: none; all: unset;"><span class="links_name">Cerrar Sesion</span></button>
                        </form>
                    </a>
                </li>
            </ul>
        </body>
</html>