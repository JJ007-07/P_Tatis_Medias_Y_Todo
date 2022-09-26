<%-- 
    Document   : registrarPedido
    Created on : 6/08/2022, 06:41:53 PM
    Author     : Alexis
--%>

<%@page import="ModeloVO.EmpresaProveedoraVO"%>
<%@page import="ModeloDAO.EmpresaProveedoraDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pedidos</title>
       <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
        <script src="js/validar.js" type="text/javascript"></script>
        <link href="Estilos/2.css" rel="stylesheet" type="text/css"/>
    </head>

    <body>

        <section class="h-100 h-custom" style="background-color: #999999;">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-lg-8 col-xl-6">
        <div class="card rounded-3">
          <img src="https://img.freepik.com/vector-gratis/recepcion-pedidos-telefono-centro-contacto-tienda-atencion-al-cliente-pedido-facil-entrega-rapida-servicio-comercial-personaje-dibujos-animados-operador-centro-llamadas_335657-2564.jpg?w=2000"
            class="w-100" style="border-top-left-radius: .3rem; border-top-right-radius: .3rem;"
            alt="Sample photo">
            <div class="card-body p-4 p-md-5">
                <h3 class="mb-4 pb-2 pb-md-0 mb-md-5 px-md-2">Información de Registro Pedidos</h3>

        <form class="px-md-2" method="post" id="Formulario" action="Pedido" onsubmit="return validar();">

            <div class="form-outline mb-4">
                <label class="form-label" for="form3Example1q">No.Factura</label>
                <input class="form-control"  type="text"  id="NumeroFacturaPedido" name="txtNumeroFacturaPedido" >
                
            </div>

            <div class="form-outline mb-4">
                <label class="form-label" for="form3Example1q">Fecha Pedido</label>
                <input class="form-control"  type="date"  id="FechaPedido" name="txtFechaPedido"><br>
                
            </div>

            <div class="form-outline mb-4">
                <label class="form-label" for="form3Example1q">Fecha Recibido</label>
                <input class="form-control"  type="date" id="FechaRecibido" name="txtFechaRecibido">
                
            </div>

            <div class="form-outline mb-4">
                 <label class="form-label" for="form3Example1q">Fecha Vencimiento de Pago</label>
                <input class="form-control"  type="date" id="FechaVencimientoPago" name="txtFechaVencimientoPago">
               
            </div>

            
            <div class="form-group">
                <label class="form-label" for="form3Example1q">Empresa Proveedora</label>
               <select class="form-control"  name="txtIdEmpresaProveedora" id="IdEmpresaProveedoraFK">
                    <option>Seleccione una opción</option>
                    <%
                        EmpresaProveedoraDAO epDAO = new EmpresaProveedoraDAO();
                        for (EmpresaProveedoraVO epVO : epDAO.Listar()) {
                    %>
                    <option value="<%=epVO.getIdEmpresaProveedora()%>"><%=epVO.getRazonSocialEmpresaProveedora()%></option>


                    <%}%>       </select>
                
            </div>
            
            <div class="form-outline mb-4">
                 <label class="form-label" for="form3Example1q">IVA</label>
                <input class="form-control"  type="number" id="IVA" name="txtIVA">
               
            </div>
             <div class="form-outline mb-4">
                 <label class="form-label" for="form3Example1q">Descuento</label>
                <input class="form-control"  type="number" Id="Descuento" name="txtDescuento">
                
            </div>   
                <div class="form-group">
                    <label class="form-label" for="form3Example1q">Estado Pedido</label>
               <select class="form-control"  Id="EstadoPedido" class="form-control"  name="txtEstadoPedido" >
                        <option>Seleccione una opción</option>

                        <option>Entregado</option>
                        <option>Pago</option>
                    </select>       
                
            </div>
                
            <br>
          

        </form>  
                    <div>   
                <input type="hidden" value="1" name="opcion">

                
              <button type="submit" class="btn btn-success btn-lg mb-1" onclick="return confirm('¿Estas seguro de  registrar el pedido?')" >Registrar Pedido</button>
                <button type="submit" class="btn btn-primary btn-lg" style="margin-bottom: 4px;"><a href="ConsultarPedido.jsp" style="color: #FFFFFF; text-decoration: none;">Consultar Pedido</a></button>
                <button type="submit" class="btn btn-primary btn-lg" style="margin-bottom: 4px;"><a href="registrarDP.jsp" style="color: #FFFFFF; text-decoration: none;">registrar productos</a></button>

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