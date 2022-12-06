<%-- 
    Document   : registrarProducto
    Created on : 3/08/2022, 04:35:47 PM
    Author     : jtgt2
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>



<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Clientes</title>
  </head>
  <body>
       <nav>

            <%@include file="Principal.jsp"%>    
        </nav>

    <div class="container">
        <div class="row">
            <div class="col">              
                <div class="shadow-lg p-3 mb-5 mt-4 bg-body rounded">
                <img src="https://www.microtech.es/hubfs/Fotos%20blog/retener_clientes.jpg"
                class="w-100" style="border-top-left-radius: .3rem; border-top-right-radius: .3rem;"
                alt="Sample photo">


                    <div class="p-3 mb-2 bg-primary bg-gradient fw-bold text-white">Información Registro Clientes</div>
                    <form class="row g-3 needs-validation" method="post" action="Cliente"  novalidate>
                        <center>
                            
                        <div class="col-md-3">
                        <label class="form-label" for="form3Example1q">Nombres</label>
                        <input type="text" id="Nombrecliente" name="TextNombre" class="form-control" value="" required></td>
                        <!-- Mensajes para validación   -->
                        <div class="valid-feedback">¡Campo válido!</div>
                        <div class="invalid-feedback">Debe completar los datos
                        
                        </div>
                        <div class="col-md-12">
                        <label class="form-label" for="form3Example1q">Apellidos</label>
                        <input type="text" id="ApellidoCliente" name="TextApellido" class="form-control" value="" required >
                        <!-- Mensajes para validación   -->
                        <div class="valid-feedback">¡Campo válido!</div>
                        <div class="invalid-feedback">Debe completar los datos.</div>
                        </div>
                        
                        <div class="col-md-12">
                        <label for="form3Examole1q" class="form-label">Tipo Doc</label>
                        <select  class="form-select" name="TextTipo" id="TipoDocCliente" required>
                        <option selected disabled value="">Seleccionar una opción disponible</option>
                        <option value=>CC</option>
                        <option value=>CE</option>
                        </select>
                        <!-- Mensajes para validación   -->
                        <div class="valid-feedback">¡Campo válido!</div>
                        <div class="invalid-feedback">Debe completar los datos.</div>
                        </div> 
                        
                         <div class="col-md-12">
                        <label class="form-label" form="form3Example1q">Numero Documento</label>
                        <input type="number"id="NumeroDocEmpleado" name="TextNumDoc" class="form-control" value="" required >
                        <!-- Mensajes para validación   -->
                        <div class="valid-feedback">¡Campo válido!</div>
                        <div class="invalid-feedback">Debe completar los datos.</div>
                        </div>
                      
                        
                        <div class="col-md-12">
                        <label class="form-label" for="form3Example1q">Telefono</label>
                        <input type="number" id="TelefonoCliente" name="TextTelefono" class="form-control" value="" required >
                        <!-- Mensajes para validación   -->
                        <div class="valid-feedback">¡Campo válido!</div>
                        <div class="invalid-feedback">Debe completar los datos.</div>
                        </div>
                        
                        <div class="col-md-12">
                        <label class="form-label" for="form3Example1q">Direccion </label>
                        <input type="text" id="Direccioncliente" name="TextDir" class="form-control"  value="" required >
                        <!-- Mensajes para validación   -->
                        <div class="valid-feedback">¡Campo válido!</div>
                        <div class="invalid-feedback">Debe completar los datos.</div>
                        </div>
                        
                        <div class="col-md-12">
                        <label class="form-label" for="form3Example1q">Correo Electronico </label>
                        <input type="email" id="CorreoCliente" name="TextCorreo" class="form-control"  value="" required="">

                        <!-- Mensajes para validación   -->
                        <div class="valid-feedback">¡Campo válido!</div>
                        <div class="invalid-feedback">Debe completar los datos.</div>
                        </div> 
                        
                        <div class="col-md-12">
                        <label class="form-label" for="form3Example1q">Estado Cliente </label>
                        <input type="text" id="EstadoCliente" name="TextEstado" class="form-control" value="" required="">

                        <!-- Mensajes para validación   -->
                        <div class="valid-feedback">¡Campo válido!</div>
                        <div class="invalid-feedback">Debe completar los datos.</div>
                        </div>
                        
                      
                        
                        
                       
                                           <input type="hidden" value="1" name="opcion">
                                           <button class="btn btn-primary btn-lg" style="margin-bottom: 4px;" style="color: #FFFFFF; text-decoration: none;" type="submit" onclick="return confirm('¿Estas seguro de registrar este proveedor?')"  >Registrar Cliente</button>  
                                           
                        </center> </form>
                    <div><center>
                            <button type="submit" class="btn btn-success btn-lg mb-1"><a href="ConsultarCliente.jsp" style="color: #FFFFFF; text-decoration: none;">Ver clientes registrados</a></button></center>
                                         
                                        
                                        
                                        </div>
                         
                                         <% 
                                         if(request.getAttribute("mensajeError") !=null) {%>
                                         ${MensajeError}           
               
                                         <%}else {%>
                                        ${mensajeExito}  
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