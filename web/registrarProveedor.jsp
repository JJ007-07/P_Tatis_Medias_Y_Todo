<%-- 
    Document   : registrarProducto
    Created on : 3/08/2022, 04:35:47 PM
    Author     : jtgt2
--%>

<%@page import="ModeloVO.EmpresaProveedoraVO"%>
<%@page import="ModeloDAO.EmpresaProveedoraDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Validación Forms - Bootstrap 5</title>
  </head>
  <body>
       <nav>

            <%@include file="Principal.jsp"%>    
        </nav>

    <div class="container">
        <div class="row">
            <div class="col">              
                <div class="shadow-lg p-3 mb-5 mt-4 bg-body rounded">
                     <img src="https://www.emagister.com/blog/wp-content/uploads/2020/01/proveedor-empresa-kraken.jpg "
            class="w-100" style="border-top-left-radius: .3rem; border-top-right-radius: .3rem;"
            alt="Sample photo">
                    <div class="p-3 mb-2 bg-primary bg-gradient fw-bold text-white">Información Registro Proveedor</div>
                    <form class="row g-3 needs-validation" method="post" action="EmpresaProveedora"  novalidate>
                        <center>
                            
                        <div class="col-md-3">
                        <label for="NitEmpresaProveedora"class="form-label">Nit Empresa</label>
                        <input type="number" class="form-control" name="txtNit" id="NitEmpresaProveedora" value="" required></td>
                        <!-- Mensajes para validación   -->
                        <div class="valid-feedback">¡Campo válido!</div>
                        <div class="invalid-feedback">Debe completar los datos
                        
                        </div>
                        <div class="col-md-12">
                        <label for="RazonSocialEmpresaProveedora" class="form-label">Razon social </label>
                        <input type="text" class="form-control" id="RazonSocialEmpresaProveedora" name="txtRazon" value="" required >
                        <!-- Mensajes para validación   -->
                        <div class="valid-feedback">¡Campo válido!</div>
                        <div class="invalid-feedback">Debe completar los datos.</div>
                        
                        <div class="col-md-12">
                        <label for="NombreComercialEmpresaProveedora" class="form-label">Nombre Comercial </label>
                        <input type="text" class="form-control" id="NombreComercialEmpresaProveedora" name="txtNombreC" value="" required >
                        <!-- Mensajes para validación   -->
                        <div class="valid-feedback">¡Campo válido!</div>
                        <div class="invalid-feedback">Debe completar los datos.</div>
                        </div>
                        
                         <div class="col-md-12">
                        <label for="DireccionEmpresaProveedora" class="form-label">Direccion de Empresa </label>
                        <input type="text" class="form-control" id="DireccionEmpresaProveedora" name="txtDireccion" value="" required >
                        <!-- Mensajes para validación   -->
                        <div class="valid-feedback">¡Campo válido!</div>
                        <div class="invalid-feedback">Debe completar los datos.</div>
                        </div>
                        
                         <div class="col-md-12">
                        <label for="TelefonoEmpresaProveedora" class="form-label">Telefono empresa</label>
                        <input type="text" class="form-control" id="TelefonoEmpresaProveedora" name="txtTelefono" value="" required >
                        <!-- Mensajes para validación   -->
                        <div class="valid-feedback">¡Campo válido!</div>
                        <div class="invalid-feedback">Debe completar los datos.</div>
                        </div>
                        
                        <div class="col-md-12">
                        <label for="Numeropago" class="form-label">Numero de pago</label>
                        <input type="text" class="form-control" id="Numeropago" name="txtNumero" value="" required >
                        <!-- Mensajes para validación   -->
                        <div class="valid-feedback">¡Campo válido!</div>
                        <div class="invalid-feedback">Debe completar los datos.</div>
                        </div>
                        
                        
                        <div class="col-md-12">
                        <label for="EstadoEmpresaProveedora" class="form-label">Estado del Proveedor</label>
                        <select name="txtEstado" class="form-select" id="EstadoEmpresaProveedora" required>
                        <option selected disabled value="">Seleccionar una opción disponible</option>
                        <option value="2">Activo</option>
                        <option value="3">Inactivo</option>
                        </select>
                        <!-- Mensajes para validación   -->
                        <div class="valid-feedback">¡Campo válido!</div>
                        <div class="invalid-feedback">Debe completar los datos.</div>
                        </div>    <br>
                        
                       
                                           <input type="hidden" value="1" name="opcion">
                                           <button class="btn btn-primary btn-lg" style="margin-bottom: 4px;" style="color: #FFFFFF; text-decoration: none;" type="submit" onclick="return confirm('¿Estas seguro de registrar este proveedor?')"  >Registrar Proveedor</button>  
                                           
                        </center> </form>
                    <div><center>
                            <button type="submit" class="btn btn-success btn-lg mb-1"><a href="ConsultarProveedor.jsp" style="color: #FFFFFF; text-decoration: none;">Ver proveedores registrados</a></button></center>
                                         
                                        
                                        
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