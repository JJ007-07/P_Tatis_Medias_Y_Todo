<%-- 
    Document   : registrarDP
    Created on : 9/08/2022, 07:51:28 PM
    Author     : Alexis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detalle Pedido</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
        <script src="js/validarDP.js"></script>
        <link href="Estilos/2.css" rel="stylesheet" type="text/css"/>
    </head>

    <body>

        <section class="h-100 h-custom" style="background-color: #999999;">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-lg-8 col-xl-6">
        <div class="card rounded-3">
          <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT2bcPo2I5Q_I6bx4wV_v6her42RorJ-30GqA&usqp=CAU"
            class="w-100" style="border-top-left-radius: .3rem; border-top-right-radius: .3rem;"
            alt="Sample photo">
            <div class="card-body p-4 p-md-5">
                <h3 class="mb-4 pb-2 pb-md-0 mb-md-5 px-md-2">Información de Registro Productos</h3>

        <form class="px-md-2" method="post" action="DetallePedido" onsubmit="return validarDP();">

            <div class="form-outline mb-4">
                <label class="form-label" for="form3Example1q">IdPedidoFK</label>
                 <input type="number" id="IdPedidoFK" name="textIdPedidoFK" class="form-control" />

            </div>

            <div class="form-outline mb-4">
                  <label class="form-label" for="form3Example1q">IdProductoFK</label>
               <input type="number" id="IdProductoFK" name="textIdProductoFK" class="form-control" />
              
            </div>

            <div class="form-outline mb-4">
                 <label class="form-label" for="form3Example1q">Precio Unitario</label>
                <input type="number" id="PrecioUnitario" name="textPrecio" class="form-control" />
               
            </div>

            <div class="form-outline mb-4">
                  <label class="form-label" for="form3Example1q">Cantidad</label>
                <input type="number" id="Cantidad"  name="textCantidad" class="form-control" />
              
            </div>

            <br>
            

        </form>
                <div>   
                <input type="hidden" value="1" name="opcion">

     
                 <button  type="submit" class="btn btn-success btn-lg mb-1" onclick="return confirm('¿Estas seguro de  registrar este pedido')">Registrar detalle pedido</button>

                <button type="submit" class="btn btn-primary btn-lg" style="margin-bottom: 4px;"><a href="consultarDP.jsp" style="color: #FFFFFF; text-decoration: none;">Ver Detalles registrados</a></button>

            </div>
            </div>
        </div>
      </div>
    </div>
  </div>
<%
            if (request.getAttribute("MensajeError") != null) {%>
        ${MensajeError}           

        <%} else {%>
        ${MensajeExito}  
        <%}%>
</section>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8" crossorigin="anonymous"></script>
    </body>
</html>