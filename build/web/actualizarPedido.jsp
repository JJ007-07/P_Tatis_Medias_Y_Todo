<%-- 
    Document   : actualizarpedido
    Created on : 6/08/2022, 07:40:21 PM
    Author     : Alexis
--%>

<%@page import="ModeloVO.PedidoVO"%>



<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
        <title>Actualizar</title>
    </head>
    <body>
   <section class="h-100 h-custom" style="background-color: #999999;">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-lg-8 col-xl-6">
        <div class="card rounded-3">
          <img src="https://creatuaplicacion.com/wp-content/uploads/2019/02/ver-pedidos.png"
            class="w-100" style="border-top-left-radius: .3rem; border-top-right-radius: .3rem;"
            alt="Sample photo">
            <div class="card-body p-4 p-md-5">
                <h3 class="mb-4 pb-2 pb-md-0 mb-md-5 px-md-2">Actualizar Información del  Pedido</h3>
        <%
        if(request.getAttribute("PedidoConsultado") != null)
{
    PedidoVO PVO=(PedidoVO)request.getAttribute("PedidoConsultado");
    

%>
   <center>
<form method="post" action="Pedido">
            <table>
                <tr>
                    <th>
                        
                    <div class="form-outline mb-4">
                   <label class="form-label" for="form3Example1q">Id Pedido</label>
                   <input type="number" readonly read name="txtPedido" value="<%= PVO.getIdpedido()%>" class="form-control">
                    </div>
                    
                    <div class="form-outline mb-4">
                    <label class="form-label" for="form3Example1q">No.Factura Pedido</label>
                    <input type="text" readonly read name="txtNumeroFacturaPedido" value="<%= PVO.getNumeroFacturaPedido()%>"class="form-control">
                    </div>
                    
                    <div class="form-outline mb-4">
                     <label class="form-label" for="form3Example1q">Fecha Pedido</label>
                    <input type="date" readonly read name="txtFechaPedido" value="<%= PVO.getFechaPedido()%>"class="form-control">
                    </div>
                    
                    <div class="form-outline mb-4">
                   <label class="form-label" for="form3Example1q">Fecha Recibido</label>
                    <input type="date" readonly read name="txtFechaRecibido" value="<%= PVO.getFechaRecibido()%>"class="form-control">
                    </div>
                    
                    <div class="form-outline mb-4">
                   <label class="form-label" for="form3Example1q">Fecha Vencimiento Pago</label>
                    <input type="date" readonly read name="txtFechaVencimientoPago" value="<%= PVO.getFechaVencimientoPago()%>"class="form-control">
                    </div>
                    
                    <div class="form-outline mb-4">
                    <label class="form-label" for="form3Example1q">Id Empresa Proveedora FK</label>
                      <input type="number" name="txtIdEmpresaProveedora" value="<%= PVO.getIdEmpresaProveedoraFK()%>"class="form-control">
                    </div>
                    
                    <div class="form-outline mb-4">
                    <label class="form-label" for="form3Example1q">Iva</label>
                      <input type="number" name="txtIVA" value="<%= PVO.getIVA()%>"class="form-control">
                    </div>
                    
                    <div class="form-outline mb-4">
                   <label class="form-label" for="form3Example1q">Descuento</label> 
                    <input type="number" name="txtDescuento" value="<%= PVO.getDescuento()%>"class="form-control">
                    </div>
                    
                    <div class="form-outline mb-4">
                        <label class="form-label" for="form3Example1q">Estado Pedido</label>
                    <input type="text" name="txtEstadoPedido" value="<%= PVO.getEstadoPedido()%>" class="form-control">
                    </div>
                    
                    
                
                
                </th>
                </tr>
            </table><br>
             <button  type="submit" class="btn btn-success btn-lg mb-1" class="btn float-right login_btn" onclick="return confirm('¿Estas seguro de  actualizar este pedido')">Actualizar</button>
            <input type="hidden" value="2" name="opcion">
</form><br><br></center>



       <%
         if (request.getAttribute("MensajeError") != null) {%>
                ${MensajeError}
           <% }else{ %>
           ${MensajeExito}
           <%}%>
           
     
        <% } %>
</body>
</html>
