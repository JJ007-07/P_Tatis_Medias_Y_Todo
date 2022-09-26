<%@page import="ModeloVO.EmpresaProveedoraVO"%>
<%@page import="ModeloDAO.EmpresaProveedoraDAO"%>
<%@page import="ModeloVO.CategoriaVO"%>
<%@page import="ModeloDAO.CategoriaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Estilos/2.css" rel="stylesheet" type="text/css"/>
        <title>Productos</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
        <script src="js/validarP.js" type="text/javascript"></script>
    </head>

    <body>

        <section class="h-100 h-custom" style="background-color: #999999;">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-lg-8 col-xl-6">
        <div class="card rounded-3">
          <img src="https://www.trecebits.com/wp-content/uploads/2020/09/Catalogos-digitales.jpg"
            class="w-100" style="border-top-left-radius: .3rem; border-top-right-radius: .3rem;"
            alt="Sample photo">
            <div class="card-body p-4 p-md-5">
                <h3 class="mb-4 pb-2 pb-md-0 mb-md-5 px-md-2">Información de Registro Productos</h3>

        <form class="px-md-2" method="post" action="Producto" onsubmit="return validarP();">

            <div class="form-outline mb-4">
                <label class="form-label" for="form3Example1q">CodigoDeBarras</label>
                <input type="text" id="CodigoDeBarrasProducto" name="txtcodigoB" class="form-control" />
                
            </div>

            <div class="form-outline mb-4">
                <label class="form-label" for="form3Example1q">Referencia</label>
                <input maxlength="15" type="text" id="ReferenciaProducto" name="txtreferencia" class="form-control" />
                
            </div>

            <div class="form-outline mb-4">
                <label class="form-label" for="form3Example1q">Descripción</label>
                <input maxlength="80" type="text" id="DescripcionProducto" name="txtdescripcion" class="form-control" />
                
            </div>

            <div class="form-outline mb-4">
                <label class="form-label" for="form3Example1q">Stock Disponible</label>
                <input max="200" type="number" id="StockProducto" name="txtstock" class="form-control" />
                
            </div>

            <div class="form-outline mb-4">
                <label class="form-label" for="form3Example1q">Precio Unitario Producto</label>
                <input  type="number" id="PrecioUnitario" name="txtprecio" class="form-control" />
                
            </div>

            <div class="form-outline mb-4">
                 <label class="form-label" for="form3Example1q">Estado del producto</label>
                <input maxlength="20" type="text" id="EstadoProducto" name="txtestado" class="form-control" />
               
            </div>

            <div class="form-group">
                   <label class="form-label" for="form3Example1q">Categoria</label>
                <select class="form-control" name="txtcategoria" id="IdCategoriaFK">
                  <option value="1" disabled>Seleccionar una opción disponible</option>
                  <option value="2">Selecciona una opción</option>
                  <%
                    CategoriaDAO catDAO = new CategoriaDAO();
                    for (CategoriaVO catVO : catDAO.Listar()) {
                  %>
                  <option value="<%=catVO.getIdCategoria()%>"><%=catVO.getNombreCategoria()%></option>
                   <%}%>  
                </select>
             
            </div>
            <br>
            <div class="form-group">
                <label class="form-label" for="form3Example1q">Empresa</label>
                <select class="form-control" name="txtempresa" id="IdEmpresaProveedoraFK">
                  <option value="1" disabled>Seleccionar una opción disponible</option>
                  <option value="2">Selecciona una opción</option>
                <%
                    EmpresaProveedoraDAO epDAO = new EmpresaProveedoraDAO();
                    for (EmpresaProveedoraVO epVO : epDAO.Listar()) {
                %>
                <option value="<%=epVO.getIdEmpresaProveedora()%>"><%=epVO.getRazonSocialEmpresaProveedora()%></option>
                <%}%> 
                </select>
                
            </div>  
            <br>
            

        </form><br>
                <div>   
                <input type="hidden" value="1" name="opcion">

                
                <button type="submit" class="btn btn-success btn-lg mb-1" onclick="return confirm('¿Estas seguro de  registrar el producto?')" >Registrar Producto</button>
              <button type="submit" class="btn btn-primary btn-lg" style="margin-bottom: 4px;"><a href="ConsultarProducto.jsp" style="color: #FFFFFF; text-decoration: none;">Consultar Producto</a></button>



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