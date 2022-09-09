<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Sesiones.jsp"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bienvenido</title>
    <link href="Estilos/css4.css" rel="stylesheet" type="text/css"/>
    <link href="Estilos/Estilos3.css" rel="stylesheet" type="text/css"/>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/css/all.min.css" rel="stylesheet">
</head>
<body>
 <div class="wrapper hover_collapse">
	<div class="top_navbar">
		<div class="logo">SICDIGC</div>
                
		<div class="menu">
			<div class="hamburger">
				<i class="fas fa-bars"></i>
			</div>

		</div>
	</div>

	<div class="sidebar">
            
		<div class="sidebar_inner">
                    
		<ul>
			<li>
				<a href="#">
					<span class="icon"><i class="fa fa-user"></i></span>
					<span class="text">Venta</span>
				</a>
			</li>
			<li>
				<a href="ConsultarCliente.jsp">
					<span class="icon"><i class="fa fa-user"></i></span>
					<span class="text">Cliente</span>
				</a>
			</li>
			<li>
				<a href="ConsultarPedido.jsp">
					<span class="icon"><i class="fa fa-eye"></i></span>
					<span class="text">Pedido</span>
				</a>
			</li>
			
      <li>
			

		</ul>
		</div>
	</div>



</div>
<script type="text/javascript">
//I have determined the constant of some class function
 var li_items = document.querySelectorAll(".sidebar ul li");
var hamburger = document.querySelector(".hamburger");
var wrapper = document.querySelector(".wrapper");

//What will change if you move the mouse over the sidebar

li_items.forEach((li_item)=>{
	li_item.addEventListener("mouseenter", ()=>{


			li_item.closest(".wrapper").classList.remove("hover_collapse");
      //I have already added style information about hover_collapse

	})
  //In general, hover_collapse will be applied on the sidebar.

//Hover_collapse will be removed from the sidebar when the mouse is moved
})

li_items.forEach((li_item)=>{
	li_item.addEventListener("mouseleave", ()=>{

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

</body>
</html>