<%-- 
    Document   : registrarProducto
    Created on : 3/08/2022, 04:35:47 PM
    Author     : jtgt2
--%>

<%@page import="ModeloVO.ProductoVO"%>
<%@page import="ModeloDAO.ProductoDAO"%>
<%@page import="ModeloVO.EmpresaProveedoraVO"%>
<%@page import="ModeloDAO.EmpresaProveedoraDAO"%>
<%@page import="ModeloVO.CategoriaVO"%>
<%@page import="ModeloDAO.CategoriaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Registrar Producto</title>
  </head>
  <body>
       <nav>

            <%@include file="Principal.jsp"%>    
        </nav>

    <div class="container">
        <div class="row">
            <div class="col">              
                <div class="shadow-lg p-3 mb-5 mt-4 bg-body rounded">
             <img src="https://www.trecebits.com/wp-content/uploads/2020/09/Catalogos-digitales.jpg"
            class="w-100" style="border-top-left-radius: .3rem; border-top-right-radius: .3rem;"
            alt="Sample photo">
                     <center> <div class="p-3 mb-2 bg-primary bg-gradient fw-bold text-white">Información Registro Producto</div></center>
                   

                    <form class="row g-3 needs-validation" method="post" action="Producto"  novalidate>
                        <center>
                            
                        <div class="col-md-3">
                        <label for="form3Example1q" class="form-label">CodigoDeBarrasProducto</label>
                        <input type="number" class="form-control" name="txtcodigoB" id="CodigoDeBarrasProducto" value="" required>
                        
                        <!-- Mensajes para validación   -->
                        <div class="valid-feedback">¡Campo válido!</div>
                        <div class="invalid-feedback">Debe completar los datos</div>
      
                        <div class="col-md-12">
                        <label class="form-label" for="form3Example1q">Referencia</label>
                        <input type="text" id="ReferenciaProducto" name="txtreferencia" class="form-control" value="" required>
                        
                        <!-- Mensajes para validación   -->
                        <div class="valid-feedback">¡Campo válido!</div>
                        <div class="invalid-feedback">Debe completar los datos</div>
                        </div>
                        
                       <div class="col-md-12">
                       <label class="form-label" for="form3Example1q">Descripción</label>
                       <input  type="text" id="DescripcionProducto" name="txtdescripcion" class="form-control" value="" required>
                
                        <!-- Mensajes para validación   -->
                        <div class="valid-feedback">¡Campo válido!</div>
                        <div class="invalid-feedback">Debe completar los datos.</div>
                       </div>
                        
                       <div class="col-md-12">
                       <label class="form-label" for="form3Example1q">Stock Disponible</label>
                       <input type="number" id="StockProducto" name="txtstock" class="form-control"  value="" required>
                        
                        <!-- Mensajes para validación   -->
                        <div class="valid-feedback">¡Campo válido!</div>
                        <div class="invalid-feedback">Debe completar los datos</div>

                        </div>
                       
                          <div class="col-md-12">
                       <label class="form-label" for="form3Example1q">Precio Costo</label>
                       <input type="number" id="StockProducto" name="txtcosto" class="form-control"  value="" required>
                        
                        <!-- Mensajes para validación   -->
                        <div class="valid-feedback">¡Campo válido!</div>
                        <div class="invalid-feedback">Debe completar los datos</div>

                        </div>
                       
                        
                         <div class="form-outline mb-4">
                        <label class="form-label" for="form3Example1q">Precio Unitario Producto</label>
                        <input  type="number" id="PrecioUnitario" name="txtprecio" class="form-control" value="" required>
                        
                        <!-- Mensajes para validación   -->
                        <div class="valid-feedback">¡Campo válido!</div>
                        <div class="invalid-feedback">Debe completar los datos.</div>
                        </div>
                        
                        <div class="col-md-12">
                        <label class="form-label" for="form3Example1q">Estado del producto</label>
                       <input maxlength="20" type="text" id="EstadoProducto" name="txtestado" class="form-control" value="" required >
                        <!-- Mensajes para validación   -->
                        <div class="valid-feedback">¡Campo válido!</div>
                        <div class="invalid-feedback">Debe completar los datos.</div>
                        </div>
                        
                        <div class="col-md-12">
                        <label for="form3Example1qa" class="form-label">Categoria</label>
                        <select name="txtcategoria" class="form-select" id="IdCategoriaFK" required>
                        <option selected disabled value="">Seleccionar una opción disponible</option>
                        <%
                        CategoriaDAO catDAO = new CategoriaDAO();
                        for (CategoriaVO catVO : catDAO.Listar()) {
                        %>
                       <option value="<%=catVO.getIdCategoria()%>"><%=catVO.getNombreCategoria()%></option>
                       <%}%>  
                        </select>
                        <!-- Mensajes para validación   -->
                        <div class="valid-feedback">¡Campo válido!</div>
                        <div class="invalid-feedback">Debe completar los datos.</div>
                        </div> 
                        
                     
                        <div class="col-md-12">
                        <label for="EstadoEmpresaProveedora" class="form-label">Estado del Proveedor</label>
                        <select name="txtempresa" class="form-select" id="EstadoEmpresaProveedora" required>
                        <option selected disabled value="">Seleccionar una opción disponible</option>
                        <%
                        EmpresaProveedoraDAO epDAO= new EmpresaProveedoraDAO();
                        for (EmpresaProveedoraVO epVO : epDAO.Listar()) {
                        %>
                       <option value="<%=epVO.getIdEmpresaProveedora()%>"><%=epVO.getNombreComercialEmpresaProveedora()%></option>
                       <%}%>  
                        </select>
                        <!-- Mensajes para validación   -->
                        <div class="valid-feedback">¡Campo válido!</div>
                        <div class="invalid-feedback">Debe completar los datos.</div>
                        </div> <br>
                        
                       
                                           <input type="hidden" value="1" name="opcion">
                                           <button class="btn btn-primary btn-lg" style="margin-bottom: 4px;" style="color: #FFFFFF; text-decoration: none;" type="submit" onclick="return confirm('¿Estas seguro de registrar este proveedor?')"  >Registrar Producto</button>  
                                           
                        </div>    </center> </form>
                    <div><center>
                            <button type="submit" class="btn btn-success btn-lg mb-1"><a href="ConsultarProducto.jsp" style="color: #FFFFFF; text-decoration: none;">Ver Productos registrados</a></button></center>
                                         
                                        
                                        
                                        </div>
                         
                                         <% 
                                         if  (request.getAttribute("MensajeError") !=null) {%>
                                         ${MensajeError}           
               
                                         <%}else {%>
                                        ${MensajeExito}  
                                        <%}%>
                                        
                    </div>
                </tr>
                </div>
            </div>
        </div>
    </div>
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <script>      
    (function () {
      'use strict'
      // Obtener todos los formularios a los que queremos aplicar estilos de validación de Bootstrap personalizados
      var forms = document.querySelectorAll('.needs-validation')
      //Recorremos los forms y evitamos en envío sin validacion
      Array.prototype.slice.call(forms)
        .forEach(function (form) {
          form.addEventListener('submit', function (event) {            
            if (!form.checkValidity()) {
              event.preventDefault()
              event.stopPropagation()
            }else{
              alert('FORM VALIDADO')
            }
            form.classList.add('was-validated')
          }, false)
        })
    })()
    </script>    
  </body>
</html>