<%-- 
    Document   : ActualizarDP
    Created on : 16/08/2022, 04:48:37 PM
    Author     : Alexis
--%>

<%@page import="ModeloVO.DetallePedidoVO"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
        <title>Actualizar</title>
    </head>
    <body>
     
        <%
        if(request.getAttribute("DetallePedidoConsultado") != null)
{
    DetallePedidoVO DPVO=(DetallePedidoVO)request.getAttribute("DetallePedidoConsultado");
    

%>
   <center>
       <section class="h-100 h-custom" style="background-color: #999999;">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-lg-8 col-xl-6">
        <div class="card rounded-3">
          <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT2bcPo2I5Q_I6bx4wV_v6her42RorJ-30GqA&usqp=CAU"
            class="w-100" style="border-top-left-radius: .3rem; border-top-right-radius: .3rem;"
            alt="Sample photo">
            <div class="card-body p-4 p-md-5">
                <h3 class="mb-4 pb-2 pb-md-0 mb-md-5 px-md-2">Actualizar Información del Detalle Pedido</h3>
<form  class="px-md-2" method="post" action="DetallePedido">
            <table>
                <tr>
                    <th>
                        
                   <div class="form-outline mb-4">
                    <label class="form-label" for="form3Example1q">Id Pedido FK</label>
                    <input type="number" readonly read name="textIdpedidoFK" value="<%= DPVO.getIdPedidoFK()%>"class="form-control"></div>
                    
                   <div class="form-outline mb-4">
                   <label class="form-label" for="form3Example1q">Id Producto FK</label>
                   <input type="number" readonly read name="textIdProductoFK" value="<%= DPVO.getIdProductoFK()%>"class="form-control"></div>
                    
                   <div class="form-outline mb-4">
                   <label class="form-label" for="form3Example1q">Precio Unitario</label>
                  <input type="number" readonly read name="textPrecio" value="<%= DPVO.getPrecioUnitario()%>"class="form-control"></div>
                   
                  <div class="form-outline mb-4">
                <label class="form-label" for="form3Example1q">Cantidad</label>
                    <input type="number"  name="textCantidad" value="<%= DPVO.getCantidad()%>"class="form-control"></div>
                   
                    
                    
                
                
                </th>
                </tr>
            </table><br>
             
            <input type="hidden" value="2" name="opcion">
            <button type="submit" class="btn btn-success btn-lg mb-1" class="btn float-right login_btn" onclick="return confirm('¿Estas seguro de actualizar este detalle pedido?')">Actualizar</button>
</form><br><br></center>



       <%
         if (request.getAttribute("mensajeError") != null) {%>
                ${mensajeError}
           <% }else{ %>
           ${mensajeExito}
           <%}%>
           
     
        <% } %>
</body>
</html>

