<%-- 
    Document   : ActualizarProducto
    Created on : 3/08/2022, 09:26:19 PM
    Author     : jtgt2
--%>

<%@page import="ModeloDAO.ProductoDAO"%>
<%@page import="ModeloVO.ProductoVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!------ Include the above in your HEAD tag ---------->

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
        <title>Actualizar</title>
        

    </head>
    <a href="ConsultarProducto.jsp"> <img src="IMG/backward_arrow_4020.png" alt="" width="50px"/></a>  
       

    <%
        if (request.getAttribute("ProductoConsultado") != null) {
            ProductoVO proVO = (ProductoVO) request.getAttribute("ProductoConsultado");


    %>
    <center>
        <body style="background-color: #999999;">
    <section class="h-100 h-custom">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-lg-8 col-xl-6">
        <div class="card rounded-3">
          <img src="https://www.trecebits.com/wp-content/uploads/2020/09/Catalogos-digitales.jpg"
            class="w-100" style="border-top-left-radius: .3rem; border-top-right-radius: .3rem;"
            alt="Sample photo">
            <form method="post" action="Producto">
                <table>
                    <div class="form-outline mb-4">
                    <label class="form-label"  for="form3Example1q">Id Producto</label>
                    <input  readonly read name="txtid" value="<%=proVO.getIdProducto()%>"class="form-control">
                    </div>

                    <tr>
                    <div class="form-outline mb-4">
                    <label class="form-label" for="form3Example1q">Codigo De Barras</label>
                    <input type="text" readonly read name="txtcodigoB" value="<%=proVO.getCodigoDeBarrasProducto()%>"class="form-control">
                    </div>


                    <div class="form-outline mb-4">
                    <label class="form-label" for="form3Example1q">Referencia</label>
                    <input type="text" name="txtreferencia" value="<%=proVO.getReferenciaProducto()%>"class="form-control">
                    </div>
                    


                   <div class="form-outline mb-4">
                   <label class="form-label" for="form3Example1q">Descripción</label>
                    <input type="text" name="txtdescripcion" value="<%=proVO.getDescripcionProducto()%>"class="form-control">
                   </div>
                    
                    <div class="form-outline mb-4">
                   <label class="form-label" for="form3Example1q">Stock Disponible</label>
                   <input type="number" name="txtstock" value="<%=proVO.getStockProducto()%>"class="form-control"></div>
                    
                    <div class="form-outline mb-4">
                    <label class="form-label" for="form3Example1q">Precio por unidad</label>
                    <input type="number" name="txtprecio" value="<%=proVO.getPrecioUnitario()%>"class="form-control">
                    </div>
                    
                    <div class="form-outline mb-4">
                    <label class="form-label" for="form3Example1q">Estado Producto</label>
                    <input type="text" name="txtestado" value="<%=proVO.getEstadoProducto()%>"class="form-control">
                    </div>

                    </tr>


                </table><br>
                <button type="submit" class="btn btn-success btn-lg mb-1" onclick="return confirm('¿Estas seguro de actualizar este producto?')"> Actualizar Producto</button>
                <input type="hidden" value="2" name="opcion">



            </form>

            <%
           if (request.getAttribute("MensajeError") != null) {%>
            ${MensajeError}
            <% } else { %>
            ${MensajeExito}
            <%}%>


            <% }%>

            </div>
    </center>
</body>
</html>