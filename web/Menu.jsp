<%-- 
    Document   : Menu
    Created on : 9/08/2022, 07:01:38 PM
    Author     : jtgt2
--%>

<%@page import="ModeloVO.UsuarioVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Usuario</title>
        <link rel="stylesheet" href="https://necolas.github.io/normalize.css/8.0.1/normalize.css">
        <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap" rel="stylesheet"> 
        <link href="Estilos/Estilos3.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
       
        <script src="js/nav.js" type="text/javascript"></script>
        <link href="Estilos/boton.css" rel="stylesheet" type="text/css"/>
        <script src="https://kit.fontawesome.com/b99e675b6e.js"></script>

    </head>

    <body>

        <div class="wrapper hover_collapse">
           
            <div class="top_navbar">
                 
                <a class="logo" href="#">

                    <img src="IMG/Log.svg" width="45" height="45" class="d-inline-block align-top" alt="">
                    JyK 
                </a>

            <div class="menu">
                   <div class="hamburger">
                      <%--<i class="fas fa-bars"></i>--%>
                    </div>
            
                   
        
    
                </div>
            </div>

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
                            
                            <a href="../src/java/Reportes/Ventas.jrxml">
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



        </div>
        <script type="text/javascript">
            //I have determined the constant of some class function
            var li_items = document.querySelectorAll(".sidebar ul li ");
            var hamburger = document.querySelector(".hamburger");
            var wrapper = document.querySelector(".wrapper");

            //What will change if you move the mouse over the sidebar

            li_items.forEach((li_item) => {
                li_item.addEventListener("mouseenter", () => {


                    li_item.closest(".wrapper").classList.remove("hover_collapse");
                    //I have already added style information about hover_collapse

                })
                //In general, hover_collapse will be applied on the sidebar.

                //Hover_collapse will be removed from the sidebar when the mouse is moved
            })

            li_items.forEach((li_item) => {
                li_item.addEventListener("mouseleave", () => {

                    li_item.closest(".wrapper").classList.add("hover_collapse");
                    //Hover Collapse will be applied again when the mouse is removed

                })
            })


            //Now I will execute the menu button

            //I have instructed here that hover_collapse will be applied and removed when the menu button is clicked.

            //This means that the first click will be applied and the second click will be removed
            hamburger.addEventListener("click", () => {

                hamburger.closest(".wrapper").classList.toggle("hover_collapse");
            })
        </script>












    </div><br><br>
</body>
</html>